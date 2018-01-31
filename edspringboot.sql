/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50555
Source Host           : localhost:3306
Source Database       : edspringboot

Target Server Type    : MYSQL
Target Server Version : 50555
File Encoding         : 65001

Date: 2017-12-21 14:43:36
*/

SET FOREIGN_KEY_CHECKS=0;

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
INSERT INTO `restful_user` VALUES ('5', '223', 'qq986945193'); INSERT INTO `restful_user` VALUES ('6', '120', 'qq986945193');
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
