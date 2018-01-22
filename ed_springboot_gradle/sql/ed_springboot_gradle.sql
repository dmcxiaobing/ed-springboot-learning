/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50555
Source Host           : localhost:3306
Source Database       : ed_springboot_gradle

Target Server Type    : MYSQL
Target Server Version : 50555
File Encoding         : 65001

Date: 2018-01-22 16:55:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `authorities`
-- ----------------------------
DROP TABLE IF EXISTS `authorities`;
CREATE TABLE `authorities` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `authority` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of authorities
-- ----------------------------
INSERT INTO `authorities` VALUES ('1', 'admin', 'ROLE_USER');
INSERT INTO `authorities` VALUES ('2', 'admin', 'ROLE_ADMIN');
INSERT INTO `authorities` VALUES ('3', 'root', 'ROLE_USER');

-- ----------------------------
-- Table structure for `news`
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `content` varchar(255) NOT NULL,
  `img` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('1', 'womend ', 'fsd', null);
INSERT INTO `news` VALUES ('3', 'sdf', 'safdfsd', '');
INSERT INTO `news` VALUES ('4', 'string', 'string', 'string');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `image` varchar(255) DEFAULT NULL,
  `enabled` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'admin', '$2a$10$xOXicDtmPHeK/S2N6RvQtu3WyL6IlSePPOYS7aPSU.1xbEx3kfrFa', '', '1');
INSERT INTO `users` VALUES ('2', 'root', '$2a$10$HiLBeOc/KuBIxCxtV6izeuxPO8cUGf/spV1aO26OZljdu/.118yxa', null, '1');
