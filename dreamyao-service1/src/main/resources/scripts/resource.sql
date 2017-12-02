-- ----------------------------
-- Table structure for `DREAM_RESOURCE_T`
-- ----------------------------
DROP TABLE IF EXISTS `DREAM_RESOURCE_T`;
CREATE TABLE `DREAM_RESOURCE_T` (
  `id` varchar(32) NOT NULL COMMENT 'ResourceID',
  `name` varchar(100) DEFAULT NULL COMMENT '资源名',
  `code` varchar(50) DEFAULT NULL COMMENT 'code',
  `parent_id` varchar(32) DEFAULT NULL COMMENT '父ResourceID',
  `level` int(3) DEFAULT '2' COMMENT '级别:0,root;1,directory;2,resource;',
  `order_num` int(3) DEFAULT '1' COMMENT '顺序',
  `enable_flag` char(1) DEFAULT '0' COMMENT '有效标记:0,有效;1,无效;',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `created_by` varchar(32) NOT NULL COMMENT '创建人',
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_updated_by` varchar(32) NOT NULL COMMENT '更新人',
  `last_updated_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资源表';

-- ----------------------------
-- Records of DREAM_RESOURCE_T
-- ----------------------------
INSERT INTO `DREAM_RESOURCE_T` VALUES ('f985daaf50be44e98db6eb8e656e923c', '根节点', 'root', 'f985daaf50be44e98db6eb8e656e923c', '0', '1', '0', '根节点，父节点ID为自己ID', 'system', '2017-12-02 21:27:04', 'system', '2017-12-02 21:27:04');
