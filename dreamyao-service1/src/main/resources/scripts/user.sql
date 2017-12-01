-- ----------------------------
-- Table structure for `DREAM_USER_T`
-- ----------------------------
DROP TABLE IF EXISTS `DREAM_USER_T`;
CREATE TABLE `DREAM_USER_T` (
  `id` varchar(64) NOT NULL COMMENT 'UserID',
  `cn_name` varchar(100) DEFAULT NULL COMMENT '中文名',
  `en_name` varchar(100) DEFAULT NULL COMMENT '英文名',
  `age` tinyint(3) DEFAULT NULL COMMENT '年龄',
  `sex` char(1) DEFAULT NULL COMMENT '性别:0,男;1,女;',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱地址',
  `mobile` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `country` varchar(30) DEFAULT NULL COMMENT '国家',
  `province` varchar(30) DEFAULT NULL COMMENT '省份',
  `city` varchar(30) DEFAULT NULL COMMENT '城市',
  `address` varchar(300) DEFAULT NULL COMMENT '地址',
  `enable_flag` char(1) DEFAULT '0' COMMENT '有效标记:0,有效;1,无效;',
  `created_by` varchar(255) NOT NULL COMMENT '创建人',
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_updated_by` varchar(255) NOT NULL COMMENT '更新人',
  `last_updated_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of DREAM_USER_T
-- ----------------------------
INSERT INTO `DREAM_USER_T` (`id`, `cn_name`, `en_name`, `age`, `sex`, `email`, `mobile`, `country`, `province`, `city`, `address`, `enable_flag`, `created_by`, `created_date`, `last_updated_by`, `last_updated_date`) VALUES ('b532cba8141b4888b824261e94c723d9', '吹个球', 'cuigeqiu', 18, '0', 'cuigeqiu@qq.com', '18912341234', 'china', 'guangdong', 'shenzhen', '哈哈花园1栋1A', '0', 'b532cba8141b4888b824261e94c723d9', '2017-11-29 23:30:48', 'b532cba8141b4888b824261e94c723d9', '2017-11-29 23:30:53');
INSERT INTO `DREAM_USER_T` (`id`, `cn_name`, `en_name`, `age`, `sex`, `email`, `mobile`, `country`, `province`, `city`, `address`, `enable_flag`, `created_by`, `created_date`, `last_updated_by`, `last_updated_date`) VALUES ('9f1fc8ad8ece4009b2798754201ca5c3', '去玩儿', 'quwaner', 18, '0', 'quwaner@qq.com', '18922223333', 'china', 'guangdong', 'shenzhen', '哈哈花园1栋1B', '1', 'b532cba8141b4888b824261e94c723d9', '2017-11-29 23:42:38', 'b532cba8141b4888b824261e94c723d9', '2017-11-29 23:42:38');

