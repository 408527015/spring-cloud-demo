package com.dreamyao.spring.cloud.zookeeper.direct;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * 异步获取子节点列表
 *
 * @author BruceLong
 * @version 1.0.0
 * @date 2018/1/28
 */
public class GetChildrenZnodeByAsyncDemo implements Watcher {
    private static CountDownLatch countDownLatch = new CountDownLatch(1);
    private static ZooKeeper zk = null;

    public static void main(String[] args) throws IOException, InterruptedException, KeeperException {
        String path = "/zk-book";
        zk = new ZooKeeper("127.0.0.1:2181",
                5000,
                new GetChildrenZnodeByAsyncDemo());
        countDownLatch.await();
        try {
            zk.create(path,
                    "".getBytes(),
                    ZooDefs.Ids.OPEN_ACL_UNSAFE,
                    CreateMode.PERSISTENT);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        zk.create(path + "/c1",
                "".getBytes(),
                ZooDefs.Ids.OPEN_ACL_UNSAFE,
                CreateMode.EPHEMERAL);
        //async
        zk.getChildren(path, true, new IChildren2Callback(), null);

        zk.create(path + "/c2",
                "".getBytes(),
                ZooDefs.Ids.OPEN_ACL_UNSAFE,
                CreateMode.EPHEMERAL);
        Thread.sleep(Integer.MAX_VALUE);
    }

    @Override
    public void process(WatchedEvent event) {
        if (Event.KeeperState.SyncConnected == event.getState()) {
            if (Event.EventType.None == event.getType() && null == event.getPath()) {
                countDownLatch.countDown();
            } else if (event.getType() == Event.EventType.NodeChildrenChanged) {
                try {
                    System.out.println("ReGet Child : " + zk.getChildren(event.getPath(), true));
                } catch (KeeperException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class IChildren2Callback implements AsyncCallback.Children2Callback {

    @Override
    public void processResult(int rc, String path, Object ctx, List<String> children, Stat stat) {
        System.out.println(String.format("Get Chileren znode result:[\nresponse code:%s,\nparam path:%s,\nctx:%s,\nchildren list:%s,\nstat:%s\n]", rc, path, ctx, children, stat));
    }
}