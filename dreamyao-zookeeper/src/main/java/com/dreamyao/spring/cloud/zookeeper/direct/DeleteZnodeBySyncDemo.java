package com.dreamyao.spring.cloud.zookeeper.direct;

import org.apache.zookeeper.*;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * 同步删除永久节点
 *
 * @author BruceLong
 * @version 1.0.0
 * @date 2018/1/28
 */
public class DeleteZnodeBySyncDemo implements Watcher {

    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {
        ZooKeeper zk = new ZooKeeper("127.0.0.1:2181",
                5000,
                new DeleteZnodeBySyncDemo());
        countDownLatch.await();
        String path = "/zk-book";
        zk.delete(path, 0);
        System.out.println("Success delete znode:" + path);
    }

    @Override
    public void process(WatchedEvent event) {
        if (Event.KeeperState.SyncConnected == event.getState()) {
            countDownLatch.countDown();
        }
    }
}
