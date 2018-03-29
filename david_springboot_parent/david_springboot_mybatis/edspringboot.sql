/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50555
Source Host           : localhost:3306
Source Database       : edspringboot

Target Server Type    : MYSQL
Target Server Version : 50555
File Encoding         : 65001

Date: 2018-03-29 11:02:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `ID` int(50) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `NICK_NAME` varchar(50) DEFAULT NULL COMMENT '昵称',
  `IP` varchar(50) DEFAULT NULL COMMENT 'IP',
  `INSERT_TIME` datetime DEFAULT NULL COMMENT '提交时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', 'zhangsan', '192.168.1.1', '1983-11-23 00:00:00');
INSERT INTO `message` VALUES ('2', 'zhangsan', '192.168.1.1', '1983-11-23 00:00:00');
INSERT INTO `message` VALUES ('3', 'zhangsan', '192.168.1.1', '1983-11-23 00:00:00');
INSERT INTO `message` VALUES ('4', 'zhangsan', '192.168.1.1', '1983-11-23 00:00:00');
INSERT INTO `message` VALUES ('5', 'zhangsan', '192.168.1.1', '1983-11-23 00:00:00');
INSERT INTO `message` VALUES ('6', 'zhangsan', '192.168.1.1', '1983-11-23 00:00:00');
INSERT INTO `message` VALUES ('7', 'zhangsan', '192.168.1.1', '1983-11-23 00:00:00');
INSERT INTO `message` VALUES ('8', 'zhangsan', '192.168.1.1', '1983-11-23 00:00:00');
INSERT INTO `message` VALUES ('9', 'zhangsan', '192.168.1.1', '1983-11-23 00:00:00');
INSERT INTO `message` VALUES ('10', 'zhangsan', '192.168.1.1', '1983-11-23 00:00:00');
INSERT INTO `message` VALUES ('11', 'zhangsan', '192.168.1.1', '1983-11-23 00:00:00');
INSERT INTO `message` VALUES ('12', 'zhangsan', '192.168.1.1', '1983-11-23 00:00:00');
INSERT INTO `message` VALUES ('13', 'zhangsan', '192.168.1.1', '1983-11-23 00:00:00');
INSERT INTO `message` VALUES ('14', 'zhangsan', '192.168.1.1', '1983-11-23 00:00:00');

-- ----------------------------
-- Table structure for `restful_user`
-- ----------------------------
DROP TABLE IF EXISTS `restful_user`;
CREATE TABLE `restful_user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of restful_user
-- ----------------------------
INSERT INTO `restful_user` VALUES ('1', '30', 'david');
INSERT INTO `restful_user` VALUES ('3', '345', 'xiaobing');
INSERT INTO `restful_user` VALUES ('4', '345', 'xiaobing');
INSERT INTO `restful_user` VALUES ('5', '223', 'qq986945193');
INSERT INTO `restful_user` VALUES ('6', '120', 'qq986945193');
INSERT INTO `restful_user` VALUES ('7', '111', 'http://weibo.com/mcxiaobing');
INSERT INTO `restful_user` VALUES ('8', null, 'http://weibo.com/mcxiaobing');
INSERT INTO `restful_user` VALUES ('12', '22', 'xiaobing');
INSERT INTO `restful_user` VALUES ('22', '22', 'xiaobing');
INSERT INTO `restful_user` VALUES ('23', '22', 'xiaobing');
INSERT INTO `restful_user` VALUES ('52', '22', 'xiaobing');
INSERT INTO `restful_user` VALUES ('67', '22', 'xiaobing');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '30', 'david');
INSERT INTO `user` VALUES ('3', '345', 'xiaobing');
INSERT INTO `user` VALUES ('4', '345', 'xiaobing');
INSERT INTO `user` VALUES ('5', '223', 'qq986945193');
INSERT INTO `user` VALUES ('6', '120', 'qq986945193');
INSERT INTO `user` VALUES ('7', '111', 'http://weibo.com/mcxiaobing');
INSERT INTO `user` VALUES ('8', null, 'http://weibo.com/mcxiaobing');
INSERT INTO `user` VALUES ('12', '22', 'xiaobing');
INSERT INTO `user` VALUES ('22', '22', 'xiaobing');
INSERT INTO `user` VALUES ('23', '22', 'xiaobing');
INSERT INTO `user` VALUES ('52', '22', 'xiaobing');
INSERT INTO `user` VALUES ('67', '22', 'xiaobing');
INSERT INTO `user` VALUES ('68', '22', 'xiaobing');

-- ----------------------------
-- Procedure structure for `autoInsert`
-- ----------------------------
DROP PROCEDURE IF EXISTS `autoInsert`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `autoInsert`()
BEGIN
	DECLARE
		i INT DEFAULT 0 ; -- 开始 
	SET autocommit = 0 ; -- 结束 
	WHILE (i < 1000) DO
		REPLACE INTO message (
			`ID`,
			`NICK_NAME`,
			`IP`,
			`INSERT_TIME`
		)
	VALUE
		(
			i,
			'flyat.cc',
			'127.0.0.1',
			NOW()
		) ;
	SET i = i + 1 ;
	END
	WHILE ;
	SET autocommit = 1 ; COMMIT ;
	END
;;
DELIMITER ;
