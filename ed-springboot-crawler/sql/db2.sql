/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50555
Source Host           : localhost:3306
Source Database       : db2

Target Server Type    : MYSQL
Target Server Version : 50555
File Encoding         : 65001

Date: 2018-03-17 17:40:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `piaohua_detailurl`
-- ----------------------------
DROP TABLE IF EXISTS `piaohua_detailurl`;
CREATE TABLE `piaohua_detailurl` (
  `id` int(11) NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of piaohua_detailurl
-- ----------------------------

-- ----------------------------
-- Table structure for `stu`
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu` (
  `age` int(11) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu
-- ----------------------------

-- ----------------------------
-- Table structure for `table_teacher`
-- ----------------------------
DROP TABLE IF EXISTS `table_teacher`;
CREATE TABLE `table_teacher` (
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of table_teacher
-- ----------------------------
INSERT INTO `table_teacher` VALUES ('xiaoming', '22');
INSERT INTO `table_teacher` VALUES ('an', '22');

-- ----------------------------
-- Table structure for `tb_city`
-- ----------------------------
DROP TABLE IF EXISTS `tb_city`;
CREATE TABLE `tb_city` (
  `name` varchar(255) DEFAULT NULL,
  `number` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_city
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_piaohuavideo`
-- ----------------------------
DROP TABLE IF EXISTS `tb_piaohuavideo`;
CREATE TABLE `tb_piaohuavideo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `dyurl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=529 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_piaohuavideo
-- ----------------------------
INSERT INTO `tb_piaohuavideo` VALUES ('58', '夕阳特工', 'ftp://h:h@piaohua668.com:12311/夕阳特工BD中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('59', '布拉文', 'ftp://h:h@piaohua668.com:12311/布拉文BD中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('60', '热血街区电影版2：天', 'magnet:?xt=urn:btih:QQ4N5YBHVLX27R4EXCKCNA2A4T3OQLIP');
INSERT INTO `tb_piaohuavideo` VALUES ('61', '英雄本色2018HD 周凯（王凯 饰）参与走私，被身为缉毒警察的弟弟周超（马天宇 饰）逮捕入狱。三年后，周凯出狱，改过自新。曾经...更新时间：03-03 点击下载:', '—- 支持边播边下载,需安装独孤高清盒,高清高速更新快');
INSERT INTO `tb_piaohuavideo` VALUES ('62', '中国推销员', 'magnet:?xt=urn:btih:CWJJPZZNLWIJ6HFDIMGRG2TPELSTPOCL');
INSERT INTO `tb_piaohuavideo` VALUES ('63', '英雄本色2018', 'ftp://t:t@piaohua888.com:21211/英雄本色2018HD高清国语中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('64', '谜巢BD中英双字 生物科技公司研究员卢克·李（吴尊 饰）深入一座古墓随即失去音讯，剧毒生物学博士嘉·李（李冰冰 饰）得知弟弟...更新时间：02-27 点击下载:', '—- 支持边播边下载,需安装独孤高清盒,高清高速更新快');
INSERT INTO `tb_piaohuavideo` VALUES ('65', '钢之炼金术师真人版', 'ftp://h:h@piaohua668.com:12311/钢之炼金术师真人版HD日语中字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('66', '机器之血', 'ftp://h:h@piaohua668.com:12311/机器之血HD高清国语中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('67', '焦土作战', 'ftp://h:h@piaohua668.com:12311/焦土作战BD中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('68', '意外杀手', 'ftp://h:h@piaohua668.com:12311/意外杀手BD中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('69', '24小时：末路重生', 'ftp://h:h@piaohua668.com:12311/24小时：mo路重生BD中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('70', '心理罪之城市之光', 'ftp://h:h@piaohua668.com:12311/心理罪之城市之光HD高清国语中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('71', '越狱', 'ftp://h:h@piaohua668.com:12311/越狱HD中字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('72', '追龙', 'ftp://t:t@piaohua888.com:21211/追龙HD高清国语中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('73', '搏击之王:反击', 'ftp://h:h@piaohua668.com:12311/搏击之王：反击BD中字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('74', '维京：王者之战', 'ftp://h:h@piaohua668.com:12311/维京：王者之战HD高清中字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('75', '逆谋：叛乱的时代', 'ftp://h:h@piaohua668.com:12311/逆谋：叛乱的时代HD韩语中字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('76', '绅士特工', 'ftp://h:h@piaohua668.com:12311/绅士特工BD中字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('77', '龙之战', 'ftp://h:h@piaohua668.com:12311/龙之战HD高清国语中字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('78', '绣春刀2：修罗战场', 'ftp://t:t@piaohua888.com:12311/绣春刀2：修罗战场HD高清国语中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('79', '攻壳机动队真人版', 'ftp://h:h@piaohua668.com:12311/攻壳机动队真人版BD国英双语中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('80', '速度与激情8', 'ftp://h:h@piaohua668.com:12311/速度与激情8BD中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('81', '神奇女侠', 'ftp://h:h@piaohua668.com:12311/神奇女侠BD国英双语中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('82', '加勒比海盗5：死无对', 'ftp://h:h@piaohua668.com:12311/加勒比海盗5：死无对证BD国英中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('83', '武曲', 'ftp://h:h@piaohua668.com:12311/武曲BD日语中字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('84', '英伦对决', 'ftp://t:t@piaohua888.com:21211/英伦对决HD高清中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('85', '光灵', 'ftp://h:h@piaohua668.com:12311/光灵HD中字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('86', '女子搏击俱乐部', 'ftp://h:h@piaohua668.com:12311/女子搏击俱乐部HD高清中字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('87', '密战', 'ftp://t:t@piaohua888.com:21211/密战HD高清国语中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('88', '杀破狼·贪狼', 'ftp://t:t@piaohua888.com:21211/杀破狼·贪狼BD高清国语中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('89', '黑帮之地', 'ftp://h:h@piaohua668.com:12311/黑帮之地BD中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('90', '战狼2', 'ftp://t:t@piaohua888.com:21211/战狼2HD高清国语中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('91', '王牌特工2：黄金圈', 'ftp://h:h@piaohua668.com:12311/王牌特工2：黄金圈BD中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('92', '空天猎', 'ftp://t:t@piaohua888.com:21211/空天猎HD高清国语中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('93', '人类办事处', 'ftp://h:h@piaohua668.com:12311/人类办事处BD中字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('94', '犯罪都市', 'ftp://t:t@piaohua888.com:21211/犯罪都市BD韩语中字修正[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('95', '龙之诞生', 'ftp://h:h@piaohua668.com:12311/龙之诞生BD中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('96', '神偷联盟', 'ftp://h:h@piaohua668.com:12311/神偷联盟BD中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('97', '无限之住人', 'ftp://h:h@piaohua668.com:12311/无限之住人BD日语中字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('98', '大骚乱', 'ftp://h:h@piaohua668.com:12311/大骚乱BD中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('99', '功守道', 'ftp://t:t@piaohua888.com:21211/攻守道HD国语中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('100', '悟空传', 'ftp://t:t@piaohua888.com:12311/悟空传HD高清国语中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('101', '复仇行动', 'ftp://h:h@piaohua668.com:12311/复仇行动BD中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('102', '恶女', 'ftp://h:h@piaohua668.com:12311/恶女BD韩语中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('103', '摇滚救妻', 'ftp://h:h@piaohua668.com:12311/摇滚救妻BD中英双字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('104', '极寒之城', 'ftp://t:t@piaohua888.com:21211/极寒之城HD韩版中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('105', '99号牢房内的博弈', 'ftp://t:t@piaohua888.com:21211/99号牢房内的博弈BD中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('106', '超速驾驶', 'ftp://t:t@piaohua888.com:21211/超速驾驶BD中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('107', '不汗党', 'ftp://t:t@piaohua888.com:21211/不汗党HD韩语中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('108', '侠盗联盟', 'ftp://t:t@piaohua888.com:21211/侠盗联盟HD高清国粤双语中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('109', '刺杀盖世太保', 'ftp://h:h@piaohua668.com:12311/刺杀盖世太保BD中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('110', '隐隐惊马槽之决战女僵', 'ftp://t:t@piaohua888.com:21211/隐隐惊马槽HD高清国语中国字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('111', '狙击精英：巅峰对决', 'ftp://h:h@piaohua668.com:12311/狙击精英：巅峰对决BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('112', '破局', 'ftp://t:t@piaohua888.com:21211/破局HD高清国语中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('113', '黑白迷宫', 'ftp://t:t@piaohua888.com:21211/黑白迷宫HD高清国粤双语中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('114', '游戏规则', 'ftp://p:p@piaohua668.com:31225/游戏规则HD高清国语中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('115', '杀死冈瑟', 'ftp://h:h@piaohua668.com:12311/杀死冈瑟BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('116', '绑架/绑架大追捕', 'ftp://h:h@piaohua668.com:15132/绑架BD中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('117', '勇士之门', 'ftp://e:e@piaohua668.com:1213/Y士zhi门HD英语中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('118', '侠探西蒙', 'ftp://h:h@piaohua668.com:15132/侠探西蒙BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('119', '荡寇风云', 'ftp://t:t@piaohua888.com:12311/荡寇风云BD国粤双语中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('120', '血战墓碑镇2', 'ftp://h:h@piaohua668.com:15132/血战墓碑镇2BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('121', '缉枪', 'ftp://t:t@piaohua888.com:12311/缉枪HD高清国语中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('122', '王牌保镖', 'ftp://t:t@piaohua888.com:12311/王牌保镖HD高清中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('123', '惊天解密', 'ftp://h:h@piaohua668.com:15132/惊天解密BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('124', '名侦探洪吉童:消失的', 'ftp://h:h@piaohua668.com:15132/名侦探洪吉童：消失的村庄BD韩语中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('125', '王牌保安', 'ftp://h:h@piaohua668.com:15132/王牌保安BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('126', '末路恐慌', 'ftp://h:h@piaohua668.com:15132/末路恐慌BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('127', '黑蝴蝶', 'ftp://h:h@piaohua668.com:15132/黑蝴蝶BD中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('128', '叛狱无间/监狱', 'ftp://h:h@piaohua668.com:15132/叛狱无间BD韩语中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('129', '师父/师傅', 'ftp://www:piaohua.com@dy126.piaohua.com:36749/飘花电影piaohua.com师傅HD1280高清国语中英双字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('130', '亚瑟王：斗兽争霸', 'ftp://t:t@piaohua888.com:12311/亚瑟王：斗兽争霸HD高清韩版中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('131', '无罪之城', 'ftp://t:t@piaohua888.com:12311/无罪之城HD高清中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('132', '首杀', 'ftp://h:h@piaohua668.com:15132/首杀BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('133', '叛狱无间', 'ftp://h:h@piaohua668.com:15132/叛狱无间HD韩语中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('134', '毒诫', 'ftp://t:t@piaohua888.com:12311/毒诫HD国粤双语中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('135', '金融决战/偷天对决', 'ftp://h:h@piaohua668.com:15132/金融决战BD韩语中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('136', '勒索风云', 'ftp://h:h@piaohua668.com:15132/勒索风云BD中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('137', '迷失Z城', 'ftp://h:h@piaohua668.com:15132/迷失Z城BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('138', '被操纵的城市', 'ftp://h:h@piaohua668.com:15132/被操纵的城市BD韩语中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('139', '非凡任务/猎鹰', 'ftp://h:h@piaohua668.com:15132/非凡任务HD高清国语中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('140', '逆路', 'ftp://t:t@piaohua888.com:12311/不期而遇HD国语中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('141', '本·霍尔传奇', 'ftp://h:h@piaohua668.com:15132/本·霍尔传奇BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('142', '血狼犬', 'ftp://t:t@piaohua888.com:12311/血狼犬BD国语中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('143', '贝尔科实验', 'ftp://h:h@piaohua668.com:15132/贝尔科实验BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('144', '阿修罗', 'ftp://h:h@piaohua668.com:15132/a修罗BD韩语中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('145', '斗牛犬之女', 'ftp://h:h@piaohua668.com:15132/斗牛犬之女BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('146', '金刚狼3：殊死一战', 'ftp://p:p@piaohua668.com:31225/金刚狼3：殊死一战HD高清韩版中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('147', '疾速特攻', 'ftp://h:h@piaohua668.com:15132/x疾速特攻BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('148', '武力2', 'ftp://h:h@piaohua668.com:15132/武力2BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('149', '绑架者', 'ftp://t:t@piaohua888.com:12311/绑架者HD高清国语中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('150', '杀手的祷告', 'ftp://h:h@piaohua668.com:15132/杀手的祷告BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('151', '极限特工3：终极回归', 'ftp://ph:ph@piaohua668.com:1312/极限特工3HD高清韩版中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('152', '守护者：世纪战元', 'ftp://h:h@piaohua668.com:15132/守护者：世纪战元BD中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('153', '海军陆战队员5：杀戮', 'ftp://h:h@piaohua668.com:15132/海军陆战队员5：杀戮战场BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('154', '别杀它', 'ftp://p:p@piaohua668.com:31225/别杀它BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('155', '密探', 'ftp://p:p@piaohua668.com:31225/密探BD韩语中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('156', '终极斗士4', 'ftp://ph:ph@piaohua668.com:1312/终极斗士4BD中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('157', '不眠夜/限时救援', 'ftp://h:h@piaohua888.com:3125/不眠夜BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('158', '生化危机6：终章', 'ftp://h:h@piaohua888.com:3125/生化危机6：终章HD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('159', '真田十勇士', 'ftp://h:h@piaohua888.com:3125/真田十勇士BD日语中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('160', '杀戮都市：O', 'ftp://h:h@piaohua888.com:3125/杀戮都市：OBD日语中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('161', '刺客信条', 'ftp://ph:ph@piaohua668.com:1312/刺客信条HD高清中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('162', '美国暴力', 'ftp://h:h@piaohua888.com:3125/美国暴力BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('163', '爆头', 'ftp://h:h@piaohua888.com:3125/爆头BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('164', '杀人合约', 'ftp://ph:ph@piaohua668.com:1312/杀人合约BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('165', '检查站', 'ftp://ph:ph@piaohua668.com:1312/检查站BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('166', '间谍同盟', 'ftp://e:e@piaohua888.com:3521/间谍同盟BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('167', '空尖弹', 'ftp://e:e@piaohua888.com:3521/空尖弹BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('168', '热血街区电影版', 'ftp://e:e@piaohua888.com:3521/热血jiequ电影版BD日语中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('169', '三少爷的剑', 'ftp://e:e@piaohua668.com:1213/三少爷djHD高清国语中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('170', '血浓于罪/得罪我们', 'ftp://e:e@piaohua888.com:3521/血浓于罪BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('171', '侠探杰克：永不回头', 'ftp://e:e@piaohua888.com:3521/xiatanjiekeybhtHD韩版中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('172', '日本最坏的家伙们/极', 'ftp://e:e@piaohua668.com:1121/rb最坏的家伙们BD日语中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('173', '死亡飞车2050', 'ftp://e:e@piaohua888.com:3521/死亡飞车2050BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('174', '湄公河行动', 'ftp://c:c@piaohua668.com:81/湄公河行动HD国语中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('175', '终结武器', 'ftp://e:e@piaohua888.com:3521/终结wuqiBD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('176', '极速之巅', 'ftp://e:e@piaohua888.com:3521/jisu之巅BD中英双字.rmvb[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('177', '会计刺客', 'ftp://c:c@piaohua668.com:81/会计刺客HD韩版高清中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('178', '暴力山谷', 'ftp://e:e@piaohua888.com:3521/暴力山谷BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('179', '釜山行/尸速列车', 'ftp://c:c@piaohua888.com:21/釜山行HD高清韩语中字[飘花www.piaohua.com].mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('180', '幽冥', 'ftp://c:c@piaohua888.com:2112/幽灵BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('181', '亡命徒与天使', 'ftp://c:c@piaohua888.com:2112/亡命徒与天使BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('182', '惊心破', 'ftp://c:c@piaohua688.com:81/惊天破BD国粤双语中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('183', '危城', 'ftp://c:c@piaohua888.com:21/危城HD高清国语中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('184', '豪勇七蛟龙', 'ftp://c:c@piaohua888.com:2112/豪勇七蛟龙BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('185', '命悬一线/命悬生死线', 'ftp://c:c@piaohua888.com:2112/命悬一线BD中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('186', '谍影重重5', 'ftp://c:c@piaohua888.com:21/谍影重重5HD高清韩版中英双字修正[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('187', '机械师2:复活', 'ftp://c:c@piaohua888.com:2112/机械师2：复活修正BD中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('188', '英雄迷的生活', 'ftp://c:c@piaohua888.com:2112/英雄迷的生活BD日语中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('189', '赴汤蹈火', 'ftp://c:c@piaohua888.com:2112/赴汤蹈火BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('190', '爵迹', 'ftp://c:c@piaohua688.com:81/爵迹HD国语中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('191', '速度与激情5BD高清中英', '电影下载');
INSERT INTO `tb_piaohuavideo` VALUES ('192', '使徒行者电影版', 'ftp://c:c@piaohua888.com:21/使徒行者电影版BD国语中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('193', '寒战2', 'ftp://c:c@piaohua888.com:21/寒战2HD高清国粤双语中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('194', '绝地逃亡', 'ftp://c:c@piaohua888.com:21/绝地逃亡HD高清国语中英双字[飘花www.piaohua.com].mk');
INSERT INTO `tb_piaohuavideo` VALUES ('195', '雅多维尔围城战', 'ftp://c:c@piaohua888.com:21/雅多维尔围城战-BD中法双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('196', '最后的王', 'ftp://c:c@piaohua888.com:21/最后的王BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('197', '人类清除计划3', 'ftp://c:c@piaohua888.com:21/人类清除计划3HD高清中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('198', '死囚大逃杀2', 'ftp://c:c@piaohua888.com:21/死囚大逃杀2BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('199', '终极硬汉', 'ftp://c:c@piaohua888.com:21/终极硬汉HD高清中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('200', '泰山归来险战丛林', 'ftp://c:c@piaohua888.com:21/泰山归来险战丛林HD韩版中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('201', '三人行', 'ftp://c:c@piaohua888.com:21/三人行HD国粤双语中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('202', '魔兽', 'ftp://c:c@piaohua888.com:21/魔兽HD高清韩版中字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('203', '搏击之王', 'ftp://c:c@piaohua888.com:21/搏击之王BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('204', '超级保镖', 'ftp://c:c@piaohua888.com:21/超级保镖HD高清国语中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('205', '终极标靶2', 'ftp://c:c@piaohua888.com:21/终极标靶2BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('206', '寒战2DVD', 'ftp://c:c@piaohua888.com:21/寒战2DVD国语中英双字[飘花www.piaohua.com].mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('207', '惊天魔盗团2', 'ftp://c:c@piaohua888.com:21/惊天魔盗团2BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('208', '狙击手：幽灵射手', 'ftp://c:c@piaohua888.com:21/狙击手幽灵射手BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('209', '水手服与机关枪：毕业', 'ftp://c:c@piaohua888.com:21/水手服与机关枪：毕业BD日语中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('210', '我的特工爷爷', 'ftp://www:piaohua.com@piaohua.fkx888.com:36939/飘花电影piaohua.com我的特工爷爷HD国粤双语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('211', '黑白', 'ftp://c:c@piaohua888.com:21/黑白BD国语中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('212', '硬核亨利/爆机特攻', 'ftp://c:c@piaohua888.com:21/硬核亨利BD中英双字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('213', '钢刀', 'ftp://c:c@piaohua888.com:21/钢刀HD高清国语中英双字[飘花www.piaohua.com]修正.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('214', '太秦灯光下', 'ftp://c:c@piaohua888.com:21/太秦灯光下BD日语中字[飘花www.piaohua.com].rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('215', '伦敦陷落/白宫沦陷2', 'ftp://www:piaohua.com@ph.fkx888.com:39921/飘花电影piaohua.com伦敦陷落BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('216', '危机13小时', 'ftp://www:piaohua.com@ph8.fkx888.com:39956/飘花电影piaohua.com危机13小时BD1280高清中英双字.mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('217', '神战：权力之眼', 'ftp://www:piaohua.com@ph8.fkx888.com:39927/飘花电影piaohua.com神战：权力之眼BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('218', '撤离科威特/空运', 'ftp://www:piaohua.com@ph.fkx888.com:39923/飘花电影piaohua.com撤离科威特BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('219', '七号男孩', 'ftp://www:piaohua.com@ph.fkx888.com:39920/飘花电影piaohua.com七号少年BD1280高清中英双字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('220', '傲慢与偏见与僵尸', 'ftp://www:piaohua.com@ph.fkx888.com:39919/飘花电影piaohua.com傲慢与偏见与僵尸BD中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('221', '冰河追凶HD1280高清 导演: 徐伟 编剧: 徐伟 / 平辉 / 仆惟 / 田博 主演: 梁家辉 / 佟大为 / 周冬雨 / 邓家佳 / 魏晨 / 更多... 类型: 动作 / 悬疑...更新时间：05-10 点击下载:', 'ftp://www:piaohua.com@ph.fkx888.com:39914/飘花电影piaohua.com冰河追凶HD1280高清国语中英双.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('222', '复活/复活战士', 'ftp://www:piaohua.com@ph.fkx888.com:39609/飘花电影piaohua.com复活BD中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('223', '摩天大楼/高楼大厦', 'ftp://www:piaohua.com@piaohua.fkx888.com:36938/飘花电影piaohua.com摩天大楼BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('224', '箭士柳白猿', 'ftp://www:piaohua.com@dy125.piaohua.com:30507/飘花电影piaohua.com箭士柳白猿.HD1280超清国语中英双字.mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('225', '信任', 'ftp://www:piaohua.com@dy126.piaohua.com:36972/飘花电影piaohua.com信任2016BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('226', '死侍', 'ftp://www:piaohua.com@dy126.piaohua.com:36970/飘花电影piaohua.com死侍BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('227', '病毒入侵', 'ftp://www:piaohua.com@dy126.piaohua.com:36969/飘花电影piaohua.com病毒入侵BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('228', '珍宝大战', 'ftp://www:piaohua.com@dy126.piaohua.com:36967/飘花电影piaohua.com珍宝大战BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('229', '我怒了/怒火是我', 'ftp://www:piaohua.com@dy126.piaohua.com:36953/飘花电影piaohua.com我怒了BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('230', 'S-最后的警官电影版', 'ftp://www:piaohua.com@dy126.piaohua.com:36939/飘花电影piaohua.comS-最后的警官电影版BD日语中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('231', '卧虎藏龙：青冥宝剑', 'ftp://www:piaohua.com@dy126.piaohua.com:36931/飘花电影piaohua.com卧虎藏龙2：青冥宝剑BD1280高清国粤双语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('232', '血光光五人帮 传说', 'ftp://www:piaohua.com@dy126.piaohua.com:36926/飘花电影piaohua.com血光光五人帮传说BD日语中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('233', '拿起枪的简/简有把枪', 'ftp://www:piaohua.com@dy125.piaohua.com:30505/飘花电影piaohua.com拿起枪的简BD中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('234', '倒数追击', 'ftp://www:piaohua.com@dy126.piaohua.com:36918/飘花电影piaohua.com倒数追击bd1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('235', '消失的凶手/消失的子', 'ftp://www:piaohua.com@dy126.piaohua.com:36677/飘花电影piaohua.com消失的凶手HD1280高清国语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('236', '图书馆战争2：最后的', 'ftp://www:piaohua.com@dy126.piaohua.com:36911/飘花电影piaohua.com图书馆战争2：最后的任务BD中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('237', '极盗者', 'ftp://www:piaohua.com@dy126.piaohua.com:36877/飘花电影piaohua.com极盗者BD中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('238', '道士下山', 'ftp://www:piaohua.com@dy126.piaohua.com:30401/飘花电影piaohua.com道士下山HD1280高清国语中英双字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('239', '饥饿游戏3：嘲笑鸟(下', 'ftp://www:piaohua.com@dy126.piaohua.com:36871/飘花电影piaohua.com饥饿游戏.嘲笑鸟(下)BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('240', '海洋深处/海洋之心', 'ftp://www:piaohua.com@dy126.piaohua.com:36842/飘花电影piaohua.com海洋深处BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('241', '锅盖头3：绝地反击', 'ftp://www:piaohua.com@dy126.piaohua.com:36816/飘花电影piaohua.com锅盖头3：绝地反击BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('242', '鬼吹灯之寻龙诀', 'ftp://www:piaohua.com@dy126.piaohua.com:36805/飘花电影piaohua.com寻龙决HD1280高清国语中英双字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('243', '炸掉银行经理', 'ftp://www:piaohua.com@dy125.piaohua.com:30486/飘花电影piaohua.com炸掉银行经理BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('244', '搏击迷城 /五行攻略', 'ftp://www:piaohua.com@dy126.piaohua.com:30345/飘花电影piaohua.com搏击迷城HD1280高清国语中英双字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('245', '阿纳克莱托：秘密特工', 'ftp://www:piaohua.com@dy126.piaohua.com:36765/飘花电影piaohua.com阿纳克莱托：秘密特工BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('246', '007：幽灵党/007：鬼影', 'ftp://www:piaohua.com@dy126.piaohua.com:36754/飘花电影piaohua.com007：幽灵党BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('247', '暗黑杀神', 'ftp://www:piaohua.com@dy126.piaohua.com:36750/飘花电影piaohua.com暗夜杀神BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('248', '最后的巫师猎人', 'ftp://www:piaohua.com@dy126.piaohua.com:36742/飘花电影piaohua.com最后的巫师猎人BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('249', '通灵神探/安慰', 'ftp://www:piaohua.com@dy126.piaohua.com:36741/飘花电影piaohua.com通灵神探BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('250', '土耳其枪手/土耳其射', 'ftp://www:piaohua.com@dy125.piaohua.com:30465/飘花电影piaohua.com土耳其射击BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('251', '嗜血灰熊', 'ftp://www:piaohua.com@dy126.piaohua.com:36657/飘花电影piaohua.com嗜血灰熊BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('252', '面具之下', 'ftp://www:piaohua.com@dy126.piaohua.com:36655/飘花电影piaohua.com面具之下BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('253', '丧尸大战僵尸', 'ftp://www:piaohua.com@dy126.piaohua.com:36652/飘花电影piaohua.com丧尸大战僵尸HD国语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('254', '幻影', 'ftp://www:piaohua.com@dy125.piaohua.com:30446/飘花电影piaohua.com幻影BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('255', '丧尸大战僵尸', 'ftp://www:piaohua.com@dy126.piaohua.com:36645/飘花电影piaohua.com丧尸大战僵尸HD1280高清国语中英双字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('256', '近距离', 'ftp://www:piaohua.com@dy126.piaohua.com:36643/飘花电影piaohua.com近距离BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('257', '次世代机动警察：首都', 'ftp://www:piaohua.com@dy126.piaohua.com:36637/飘花电影piaohua.com次世代机动警察：首都决战BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('258', '玩命速递：重启之战', 'ftp://www:piaohua.com@dy126.piaohua.com:36634/飘花电影piaohua.com玩命速递：重启之战BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('259', '抢劫/657号公共汽车', 'ftp://www:piaohua.com@dy126.piaohua.com:36625/飘花电影piaohua.com抢劫BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('260', '代号47/杀手:代号47', 'ftp://www:piaohua.com@dy126.piaohua.com:36622/飘花电影piaohuacom代号47BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('261', '对决/铁胆威龙', 'ftp://www:piaohua.com@dy125.piaohua.com:30432/飘花电影piaohua.com对决BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('262', '流浪者年代记', 'ftp://www:piaohua.com@dy126.piaohua.com:36613/飘花电影piaohua.com流浪者年代记BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('263', '心跳戈壁', 'ftp://www:piaohua.com@dy125.piaohua.com:30428/飘花电影piaohua.com心T戈壁HD1280高清国语中英双字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('264', '烈日迷踪BD中英双字', 'ftp://www:piaohua.com@dy125.piaohua.com:30427/飘花电影piaohua.com烈日迷踪BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('265', '极道大战争', 'ftp://www:piaohua.com@dy126.piaohua.com:36604/飘花电影piaohua.com极道大战争BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('266', '无处可逃', 'ftp://www:piaohua.com@dy126.piaohua.com:30597/飘花电影piaohua.com无处可逃BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('267', '别有动机', 'http://www.imdb.com/title/tt4898598/');
INSERT INTO `tb_piaohuavideo` VALUES ('268', '秘密特工/绅士密令', 'ftp://www:piaohua.com@dy126.piaohua.com:30594/飘花电影piaohua.com秘密特工BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('269', '法国缉毒风云', 'http://www.imdb.com/title/tt2935564/');
INSERT INTO `tb_piaohuavideo` VALUES ('270', '碟中谍5：神秘国度', 'ftp://www:piaohua.com@dy126.piaohua.com:30590//飘花电影piaohua.com碟中谍5BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('271', 'Z岛', 'ftp://www:piaohua.com@dy126.piaohua.com:30581/飘花电影piaohua.comZ岛BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('272', '小萝莉的猴神大叔', 'ftp://www:piaohua.com@dy126.piaohua.com:30578/飘花电影piaohua.com小萝莉的猴神大叔BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('273', '动力/绝命盗窃', 'ftp://www:piaohua.com@dy126.piaohua.com:30566/飘花电影piaohua.com动力BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('274', '谜城/迷城', 'ftp://www:piaohua.com@dy126.piaohua.com:30565/飘花电影piaohua.com迷城BD1280高清国粤双语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('275', '狭路', 'ftp://www:piaohua.com@dy126.piaohua.com:30564/飘花电影piaohua.com狭路BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('276', '狂野飞车', 'ftp://www:piaohua.com@dy125.piaohua.com:20411/飘花电影piaohua.com狂野飞车HD1280高清国语中英双字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('277', '异形魔怪5：血脉', 'ftp://www:piaohua.com@dy125.piaohua.com:20409/飘花电影piaohua.com异形魔怪5BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('278', '老手/辣手警探', 'ftp://www:piaohua.com@dy126.piaohua.com:30553/飘花电影piaohua.com老手HD1280高清韩语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('279', '巴霍巴利王(上)', 'ftp://www:piaohua.com@dy126.piaohua.com:30536/飘花电影piaohua.com巴霍巴利王特效精校中英字幕.mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('280', '机甲女神之究极神兵', 'ftp://www:piaohua.com@dy125.piaohua.com:20403/飘花电影piaohua.com机甲女神之究极神兵BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('281', '大毒会/亡灵之城', 'ftp://www:piaohua.com@dy126.piaohua.com:30531/飘花电影piaohua.com大毒会BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('282', '情剑/浣花洗剑录电影', 'ftp://www:piaohua.com@dy126.piaohua.com:30525/飘花电影piaohua.com情剑HD1280高清国语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('283', '军情五处：利益之争', 'ftp://www:piaohua.com@dy126.piaohua.com:30511/飘花电影piaohua.com军情五处电影版BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('284', '12回合3:致命禁闭', 'ftp://www:piaohua.com@dy126.piaohua.com:30488/飘花电影piaohua.com12回合3致命禁闭BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('285', '疯狂的麦克斯：狂暴之', 'ftp://www:piaohua.com@dy126.piaohua.com:30437/飘花电影piaohua.com疯狂的麦克斯4BD1280高清特效中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('286', '6种死亡方式', 'ftp://www:piaohua.com@dy126.piaohua.com:30434/飘花电影piaohua.com6种死亡方式BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('287', '战猪', 'ftp://www:piaohua.com@dy126.piaohua.com:30429/飘花电影piaohua.com战猪BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('288', '鬼牌游戏/小丑游戏', 'ftp://www:piaohua.com@dy126.piaohua.com:30427/飘花电影piaohua.com鬼牌游戏BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('289', '哭泣的男人', 'ftp://www:piaohua.com@dy126.piaohua.com:30398/飘花电影piaohua.com哭泣的男人BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('290', '钟馗伏魔：雪妖魔灵BD1280高清 扈都——盛世唐朝西部的边境之城。为保护百姓不受妖魔的侵害，钟馗（陈坤 饰）在张道仙的指引下成为斩妖士，深...更新时间：07-30 点击下载:', 'ftp://www:piaohua.com@dy125.piaohua.com:20384/飘花电影piaohua.com钟馗伏魔BD1280高请国语中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('291', '速度与激情7', 'ftp://www:piaohua.com@dy126.piaohua.com:30375/飘花电影piaohua.com速度与激情7BD1280高清加长版中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('292', '无敌双环枪', 'ftp://www:piaohua.com@dy126.piaohua.com:30373/飘花电影paiohua.com无敌双环枪BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('293', '我的亲密敌人', 'ftp://www:piaohua.com@dy126.piaohua.com:30357/飘花电影piaohua.com我的亲密敌人HD1280高清韩语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('294', '分歧者2:绝地反击', 'ftp://www:piaohua.com@dy125.piaohua.com:20376/飘花电影piaohua.com分歧者2绝地反击HD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('295', '江南1970', 'ftp://www:piaohua.com@dy126.piaohua.com:30343/飘花电影piaohua.com江南1970BD1280高清中字未删减版.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('296', '石榴坡的复仇/末代刺', 'ftp://www:piaohua.com@dy126.piaohua.com:30340/飘花电影piaohua.com石榴坡的复仇BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('297', '奇异之旅', 'ftp://www:piaohua.com@dy126.piaohua.com:30333/飘花电影paiohua.com奇异之旅BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('298', '杀了我三次', 'ftp://www:piaohua.com@dy126.piaohua.com:30229/飘花电影piaohua.com杀了我三次BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('299', '罪恶的编年史720p.HD中字 讲述的是马上就要升级的重案组刑警某一天突然...更新时间：06-22 点击下载:', '罪恶的编年史.720p.HD中字.mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('300', '嗜血灰熊', 'http://www.imdb.com/title/tt1694021');
INSERT INTO `tb_piaohuavideo` VALUES ('301', '战狼/特种兵之战狼', 'http://www.imdb.com/title/tt3540136/');
INSERT INTO `tb_piaohuavideo` VALUES ('302', '冰峰游戏', 'ftp://www:piaohua.com@dy125.piaohua.com:20358/飘花电影piaohua.com冰峰游戏HD1280高清中英双字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('303', '西部慢调', 'http://www.imdb.com/title/tt3205376');
INSERT INTO `tb_piaohuavideo` VALUES ('304', '悬战720p.HD国语中字 　洗黑钱组织的一号人物李鸿声（林津锋 饰）一笔500万的黑钱被骷髅蒙面人抢劫，大为恼火，“先生”要求他务必尽...更新时间：06-12 点击下载:', '悬战.720p.HD国语中字.mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('305', '天将雄师720p.BD国语中字 西汉汉元帝年间，西域都护府大都护霍安（成龙 饰）遭奸人陷害，沦为奴役，被刺配至雁门关修城。恰在此时，罗马...更新时间：06-12 点击下载:', '天将雄师.清晰TC国语中字.mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('306', '冲锋车', 'ftp://www:piaohua.com@dy126.piaohua.com:20999/飘花电影piaohua.com冲锋车BD1280高清国粤双语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('307', '海上毒战BD中西双字1024高清 直布罗陀海峡，分隔西班牙与摩洛哥，每年透过海路的毒品交易达天文数字，是海关与毒梟的必争之地。驾驶快艇高...更新时间：06-08 点击下载:', '海上毒战.El.Niño.2014.BDRip.x264.中西字幕-深影字幕组.mp4 (781.49 MB)');
INSERT INTO `tb_piaohuavideo` VALUES ('308', '暗夜逐仇/一夜狂逃', 'http://www.imdb.com/title/tt2199571');
INSERT INTO `tb_piaohuavideo` VALUES ('309', '幸存者/生存者', 'http://www.imdb.com/title/tt3247714/');
INSERT INTO `tb_piaohuavideo` VALUES ('310', '风云雄霸天下1280超清 天下会帮主雄霸笃信泥菩萨批命金麟岂是池中物，一遇风云便化龙。为成天下霸业，遂收步惊云、聂风为徒...更新时间：06-02 点击下载:', '风云雄霸天下.BD1280超清国粤双语中字.mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('311', '刺客学妹', 'http://www.imdb.com/title/tt1731701/');
INSERT INTO `tb_piaohuavideo` VALUES ('312', '人皮交易', 'http://www.imdb.com/title/tt1641841');
INSERT INTO `tb_piaohuavideo` VALUES ('313', '飓风营救3720p.国英双语.BD中英双字 连姆·尼森再次扮演退休特工布莱恩·米尔斯，在这部续集中布莱恩期待已久的与前妻的破镜重圆因为前妻被残忍的杀...更新时间：05-27 点击下载:', 'http://www.imdb.com/title/tt2446042/');
INSERT INTO `tb_piaohuavideo` VALUES ('314', '复仇之剑BD中英双字1280高清 创造者的“众神之锤”,主演斯坦利·韦伯(博尔吉亚)和安娜贝拉沃利斯(安娜贝拉),受试者无情的暴君压迫的发现一个不...更新时间：05-24 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8809/飘花电影piaohua.com复仇之剑.HD中字.1280高清.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('315', '宝贝BD中字1280高清 　印度ZF为了反恐打击暴力，成立了一个秘密地下行动组织，开展了五年测试项目，命名为“宝贝计划”。费罗兹（丹...更新时间：05-13 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8821/飘花电影piaohua.com宝贝BD中字1280高清.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('316', '贵族大盗BD1280超清中英双字 表面看来，查理（约翰尼·德普 Johnny Depp 饰）是一位事业有成，春风得意的艺术品商人，家中有娇妻乔安娜（格温妮...更新时间：05-09 点击下载:', '贵族大盗.BD1280超清中英双字.mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('317', '暗夜逐仇720p.HD中字 故事讲述布鲁克林黑帮成员，相当成功的杀手吉米·康伦（连姆·尼森 Liam Neeson 饰），如今55岁，本已准备退休。却...更新时间：05-09 点击下载:', '暗夜逐仇.720p.HD中字.mp4 ');
INSERT INTO `tb_piaohuavideo` VALUES ('318', '杀手5：赦免', 'http://www.imdb.com/title/tt3503840/');
INSERT INTO `tb_piaohuavideo` VALUES ('319', '狼警BD中字1280高清 卢(李奥菲法德饰)是一个平凡的小镇警察，有一天他梦到自己被不明的生物袭击，没想到这个梦在他身上真-的带来了...更新时间：05-03 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8817/飘花电影piaohua.com狼警BD中字1280高清.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('320', '伪造者', 'ftp://www:piaohua.com@dy126.piaohua.com:20475/飘花电影piaohua.com伪造者BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('321', '美国狙击手', 'ftp://www:piaohua.com@dy125.piaohua.com:20315/飘花电影piaohua.com美国狙击手BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('322', '陷入麻烦的女孩HD中字1280高清 和一个神秘的女人过夜后,在他的运气DJ发现谋杀的证据涉及危险的毒品贩子和一个亿万富翁...更新时间：04-14 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8807/飘花电影piaohua.com陷入麻烦的女孩.HD中字.1280高清.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('323', '骇客交锋', 'http://imdb.com/title/tt2717822/');
INSERT INTO `tb_piaohuavideo` VALUES ('324', '死亡之地', 'ftp://www:piaohua.com@dy126.piaohua.com:20447/飘花电影piaohua.com死亡之地BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('325', '杀手复仇记/刺客复仇', 'http://www.imdb.com/title/tt4117094');
INSERT INTO `tb_piaohuavideo` VALUES ('326', '陡岸凶杀案', 'ftp://www:piaohua.com@dy126.piaohua.com:20444/飘花电影piaohua.com陡岸凶杀案BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('327', '铁拳2/铁拳汉子', 'ftp://www:piaohua.com@dy126.piaohua.com:20442/飘花电影piaohua.com铁拳2BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('328', '朋友2', 'http://www.imdb.com/title/tt3264494/');
INSERT INTO `tb_piaohuavideo` VALUES ('329', '杀了我三次', 'ftp://www:piaohua.com@dy126.piaohua.com:20428/飘花电影piaohua.com杀了我三次BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('330', '追债大乱斗', 'http://www.imdb.com/title/tt2494280/');
INSERT INTO `tb_piaohuavideo` VALUES ('331', '复仇少女BD中字1280高清 凭借“绯闻女孩”崭露头角的索菲亚·布莱克·迪莉娅的银幕处女作，讲述美丽少女刺客复仇之战。牛津大学女学生米...更新时间：03-24 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8797/飘花电影piaohua.com复仇少女BD中字1280高清.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('332', '致命追踪/轨迹', 'http://www.imdb.com/title/tt2401097/');
INSERT INTO `tb_piaohuavideo` VALUES ('333', '失踪顺序BD中英双字1280高清 　故事发生在挪威的冬季。勤奋内向的尼尔斯驾驶着除雪车，为他生活地区出行不便的人们清理出道路。当他得知儿...更新时间：03-22 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8795/飘花电影piaohua.com失踪顺序BD中英双字1280高清.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('334', '技术者们', 'ftp://www:piaohua.com@dy126.piaohua.com:20416/飘花电影piaohua.com技术者们BD1280高清韩语中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('335', '光晕：夜幕720p.BD中英双字 美剧《光晕：夜幕降临》剧情是紧接《Halo4》和《Halo5》，其中游戏人物Jameson Locke(Mike Colter饰演)将继续扮演核心角色...更新时间：03-09 点击下载:', '光晕：夜幕.720p.BD中英双字.mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('336', '迷失1971', 'http://www.imdb.com/title/tt2614684');
INSERT INTO `tb_piaohuavideo` VALUES ('337', '幻影杀戮HD国语中字1280高清 故事的开始,也是故事的终结。建国活在欺骗与背叛的世界里,他狂躁的掠夺别人的安全感；老刀丢失了自己的性与爱...更新时间：03-07 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8788/飘花电影piaohua.com幻影杀戮HD国语中字1280高清.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('338', '法老与众神', 'ftp://www:piaohua.com@dy126.piaohua.com:20390/飘花电影piaohua.com法老与众神BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('339', '诺曼人:维京传奇', 'http://www.imdb.com/title/tt2290553');
INSERT INTO `tb_piaohuavideo` VALUES ('340', '黄飞鸿之英雄有梦', 'ftp://www:piaohua.com@dy126.piaohua.com:20217/飘花电影piaohua.com黄飞鸿之英雄有梦BD1280高清国语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('341', '迷失1971HD中英双字 1971年，北爱尔兰冲突升级，一场内战似乎就在眼前。年轻的英国新兵加里被调到贝尔法斯特执行任务。那里的局势令...更新时间：02-17 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8777/飘花电影piaohua.com迷失1971.HD中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('342', '地球防卫遗孀720p.HD中字 据台湾媒体报道，有一部坛蜜主演的科幻片《地球防卫未亡人》，将于2014年2月8日在日本上映，预告片最近曝光，结...更新时间：02-12 点击下载:', '地球防卫遗孀.720p.HD中字.mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('343', '时光大战720p.HD国语中字 立志当特警的高二学生童凡（康恩赫 饰）因父母忙于工作忽略了自己，便整日沉迷于网络游戏，学习成绩一落千丈。...更新时间：02-08 点击下载:', '时光大战.720p.HD国语中字.mp4 ');
INSERT INTO `tb_piaohuavideo` VALUES ('344', '光逝', 'ftp://www:piaohua.com@dy126.piaohua.com:20356/飘花电影piaohua.com光逝BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('345', '致胜王牌/燥热', 'http://www.imdb.com/title/tt2231253/');
INSERT INTO `tb_piaohuavideo` VALUES ('346', '至高侵袭/最高权力', 'http://www.imdb.com/title/tt2245151/');
INSERT INTO `tb_piaohuavideo` VALUES ('347', '潜龙风云', 'ftp://www:piaohua.com@dy126.piaohua.com:20189/飘花电影piaohua.com潜龙风云HD1280高清国语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('348', '密道追踪之阴兵虎符', 'ftp://www:piaohua.com@dy126.piaohua.com:20312/飘花电影piaohua.com密道追踪之阴兵虎符HD国语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('349', '艾芙莉/波霸杀神HD中英双字1280高清 个怯懦的女人奋起与黑帮势力枪战对决。 ...更新时间：01-26 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8762/飘花电影piaohua.com艾芙莉HD中英双字1280高清.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('350', '扑克之夜', 'ftp://www:piaohua.com@dy126.piaohua.com:20297/飘花电影piaohua.com扑克之夜BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('351', '至暴之年DVDscr中字 电影《至暴之年》影片讲述在20世纪80年代的纽约，一名野心勃勃的商人被迫与一家腐败的商业机构打交道的故事。...更新时间：01-21 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8756/飘花电影piaohua.com至暴之年DVDscr中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('352', '幻世追踪/启动机械码', 'ftp://www:piaohua.com@dy126.piaohua.com:20289/飘花电影piaohua.com幻世追踪BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('353', '无惧神明/唯神能晓', 'ftp://www:piaohua.com@dy126.piaohua.com:20288/飘花电影piaohua.com无惧神明BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('354', '海盗/海盗:奔向大海的', 'ftp://www:piaohua.com@dy126.piaohua.com:20272/飘花电影piaohua.com海盗BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('355', '蝎子王4：争权夺利', 'ftp://www:piaohua.com@dy126.piaohua.com:20270/飘花电影piaohua.com蝎子王BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('356', '白幽灵传奇之绝命逃亡', 'ftp://www:piaohua.com@dy126.piaohua.com:20231/飘花电影piaohua.com白幽灵传奇之绝命逃亡BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('357', '末日天启战1080p.HD中字 因为一场战役，死亡开始正在这蔓延，直到30个部落只剩下5个。聪明的人知道怎么可以让他们自己活下来，于是他们...更新时间：12-31 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8717/飘花电影piaohua.com末日天启战1080p.HD中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('358', '不速之客BD1280高清中英', 'http://www.imdb.com/title/tt2980592/');
INSERT INTO `tb_piaohuavideo` VALUES ('359', '危险藏匿/落格风暴', 'ftp://www:piaohua.com@dy126.piaohua.com:20222/飘花电影piaohua.com危险藏匿BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('360', '电脑奇侠重启', 'ftp://www:piaohua.com@dy126.piaohua.com:20218/飘花电影piaohua.com电脑奇侠重启BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('361', '赌局风云之诈和720p.HD国语中字 白富美唐海伦（钱怡饰）继承其父的巨额遗产后不务正业，沉沦欢场、花天酒地，被其助理麦永发（黄永佳饰）骗光...更新时间：12-18 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8703/飘花电影piaohua.com赌局风云之诈和720p.HD国语中字.mp4');
INSERT INTO `tb_piaohuavideo` VALUES ('362', '伸冤人/叛谍裁判', 'ftp://www:piaohua.com@dy126.piaohua.com:20203/飘花电影piaohua.com伸冤人BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('363', '女子战队', 'ftp://www:piaohua.com@dy126.piaohua.com:20168/飘花电影piaohua.com女子战队BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('364', '末日迷踪', 'ftp://www:piaohua.com@dy126.piaohua.com:20133/飘花电影piaohua.com末日迷踪BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('365', '四大名捕大结局/四大', 'ftp://www:piaohua.com@dy126.piaohua.com:20081/飘花电影piaohua.com四大名捕3HD1280高清国语中英双字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('366', '雄狮归来1080p.HD中字 雄狮回来了！这次他遇到拥有强大政治及宗教力量的对手，他会如何铲奸除恶，又会有什么罗曼史发生在他身上呢？...更新时间：11-06 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8647/飘花电影piaohua.com雄狮归来1080p.HD中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('367', '酷热/赌城绝杀/罪恶劫', 'http://www.imdb.com/title/tt2112277');
INSERT INTO `tb_piaohuavideo` VALUES ('368', '敢死队3', 'http://www.imdb.com/title/tt2333784');
INSERT INTO `tb_piaohuavideo` VALUES ('369', '白发魔女传之明月天国', 'http://www.imdb.com/title/tt3465456/');
INSERT INTO `tb_piaohuavideo` VALUES ('370', '宙斯之子: 赫拉克勒斯', 'http://www.imdb.com/title/tt1267297/');
INSERT INTO `tb_piaohuavideo` VALUES ('371', '刺激1080p.HD中字 华沙的火车旅行途中，精神病学家夏娜会见希曼舒，希曼舒是位来自印度的警官，前来商讨论他们的预期婚礼。两人...更新时间：10-17 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8619/飘花电影piaohua.com刺激.1080p.HD中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('372', '罪恶之城2', 'ftp://www:piaohua.com@dy44.piaohua.com:8602/飘花电影www.piaohua.com罪恶之城2BD1280高清.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('373', '神之一手HD中字1024高清 落入凡间的围棋选手在人间东山再起的故...更新时间：09-27 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8587/飘花电影piaohua.com神之一手.HD中字1024高清.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('374', '群盗：民乱的时代', 'http://www.imdb.com/title/tt2972482/');
INSERT INTO `tb_piaohuavideo` VALUES ('375', '鼹鼠之歌/卧底威龙', 'ftp://www:piaohua.com@dy126.piaohua.com:11620/飘花电影piaohua.com鼹鼠之歌BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('376', '王子', 'http://www.imdb.com/title/tt1085492/');
INSERT INTO `tb_piaohuavideo` VALUES ('377', '迷情杀机720P.HD中字 每个爱情故事都有一个男主角，一个女主角，还有一个大坏蛋，而这部是一个大坏蛋的爱情故事。爱莎是个热爱生活...更新时间：08-31 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8543/飘花电影piaohua.com迷情杀机.720P.HD中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('378', '性感女特工2', 'http://www.imdb.com/title/tt3461828');
INSERT INTO `tb_piaohuavideo` VALUES ('379', '暴力街区/公寓追凶', 'http://www.imdb.com/title/tt1430612/');
INSERT INTO `tb_piaohuavideo` VALUES ('380', '铁甲衣2：浴血奋战', 'ftp://www:piaohua.com@dy126.piaohua.com:11576/飘花电影piaohua.com铁甲衣2：浴血奋战BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('381', '我是谁/变脸', 'ftp://www:piaohua.com@dy125.piaohua.com:11352/飘花电影piaohua.com变脸BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('382', '锅盖头2: 雷霆救援', 'http://www.imdb.com/title/tt3699508/');
INSERT INTO `tb_piaohuavideo` VALUES ('383', '忍者启示录', 'ftp://www:piaohua.com@dy125.piaohua.com:11339/飘花电影piaohua.com忍者启示录BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('384', '标靶HD中字1024高清 蒙冤的有勋（柳承龙 饰）因交通事故被送进医院，其主治医生泰俊（李镇旭 饰）随后遭到不明袭击。为了救出被绑架...更新时间：07-26 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8452/飘花电影www.piaohua.com标靶HD中字1024高清.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('385', '分歧者:异类觉醒', 'ftp://www:piaohua.com@dy125.piaohua.com:11338/飘花电影piaohua.com分歧者BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('386', '极品飞车', 'ftp://www:piaohua.com@dy126.piaohua.com:11521/飘花电影piaohua.com极品飞车BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('387', '突袭2：暴徒', 'ftp://www:piaohua.com@dy126.piaohua.com:11501/飘花电影piaohua.com突袭2BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('388', '绝命航班', 'ftp://www:piaohua.com@dy44.piaohua.com:8074/飘花电影piaohua.com绝命航班DVDScr国语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('389', '舍身技HD720P 跆拳道俱乐部创始人赵郁民的得意弟子韩旭峰在一场非法比黄圣依剧照赛中身亡，跆拳道馆也开始日渐没落。一天，...更新时间：06-15 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:7379/飘花电影piaohua.com舍身技DVD中字版.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('390', '魔警/逆警', 'http://www.imdb.com/title/tt3511542/');
INSERT INTO `tb_piaohuavideo` VALUES ('391', '抢劫暴徒720p.BD中英双字幕 纽约皇后区一对正在热恋中的年轻人抢劫了几个黑社会据点，就在得手的不长时间后预想不到的事情使得他们惊恐万...更新时间：06-10 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8285/飘花电影www.piaohua.com抢劫暴徒.BD.720p.中英双字幕.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('392', '街头霸王:暗杀拳', 'ftp://www:piaohua.com@dy125.piaohua.com:11311/飘花电影piaohua.com街头霸王：暗杀拳BD1280高清中英双字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('393', '国宝疑云1080p.HD国语中字 　1914年，军阀混战、列强环绕，昭陵双骏离奇失踪，在那个黑暗的年代，历史上最肮脏的夜晚，陕西昭陵李世民陵墓...更新时间：06-07 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8277/飘花电影piaohua.com国宝疑云1080p.HD国语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('394', '武僧传奇之决战程子沟HD国语中字 隋朝末年，中原大旱。唯有洛河附近的程子沟村因水得福，秋庄稼长势喜人。正当村民们暗自高兴之时，不料，山贼...更新时间：06-07 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8274/飘花电影piaohua.com武僧传奇之决战程子沟HD国语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('395', '夺樽720p.HD国语中字 神垕镇制瓷大师郝茂庭一家因一件祖传的钧瓷珍品——宋代红釉双耳将军樽而惨遭日本军官片山冈一血洗，仅有大小...更新时间：06-07 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8273/飘花电影piaohua.com夺樽.720p.HD国语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('396', '300勇士：帝国崛起', 'ftp://www:piaohua.com@dy126.piaohua.com:11387/飘花电影piaohua.com300勇士：帝国崛起BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('397', '澳门风云', 'http://www.imdb.com/title/tt3444184/');
INSERT INTO `tb_piaohuavideo` VALUES ('398', '匹夫', 'http://www.piaohua.com/movie/17414.htm');
INSERT INTO `tb_piaohuavideo` VALUES ('399', '飞机VS火山720p.BD中英双字幕 　当一架客机困在一堆喷发的火山中时，乘客和机组人员必须设法求生——在不降落的情况下。但在岩浆和火山灰的...更新时间：05-27 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8253/飘花电影piaohua.com飞机VS火山.BD.720p.中英双字幕.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('400', '急速天劫', 'ftp://www:piaohua.com@dy126.piaohua.com:11373/飘花电影piaohua.com急速天劫BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('401', '救火英雄/特种救援英', 'ftp://www:piaohua.com@dy125.piaohua.com:11280/飘花电影piaohua.com救火英雄HD1280高清国语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('402', '极北之战720p中英双字 2045年，两极冰川融化，地球上仅存的石油和天然气在加拿大北部被人们发现了。剧中的Borealis镇是一个靠近北极的小...更新时间：05-15 点击下载:', 'http://www.imdb.com/title/tt2106350');
INSERT INTO `tb_piaohuavideo` VALUES ('403', '诺亚方舟：创世之旅TC中字 未来社会的人类被分为五个派系，人们必须加入符合自己特征的派系，而翠丝却惊讶地发现她是“分歧者”，不属于...更新时间：05-11 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8208/飘花电影piaohua.com诺亚方舟：创世之旅TC中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('404', '三日刺杀/特务杀很大720p.BRRip中字加长版 在被诊断出有绝症之后，身为安全局特工的Runner（凯文·科斯特纳饰），毅然地决定隐退决心与已经被疏远的曾经心...更新时间：05-09 点击下载:', 'http://www.imdb.com/title/tt2172934/');
INSERT INTO `tb_piaohuavideo` VALUES ('405', '三日刺杀/3日限杀令', 'http://www.imdb.com/title/tt2172934/');
INSERT INTO `tb_piaohuavideo` VALUES ('406', '新机械战警', 'ftp://www:piaohua.com@dy44.piaohua.com:8159/飘花电影piaohua.com机械战警4HD英语中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('407', '盟军夺宝队/古迹卫士', 'http://www.imdb.com/title/tt2177771/');
INSERT INTO `tb_piaohuavideo` VALUES ('408', '庞贝末日', 'http://www.imdb.com/title/tt1921064/');
INSERT INTO `tb_piaohuavideo` VALUES ('409', '祖鲁', 'ftp://www:piaohua.com@dy126.piaohua.com:11339/飘花电影paiohua.com祖鲁BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('410', '神勇不敌女枪手', 'ftp://www:piaohua.com@dy126.piaohua.com:11337/飘花电影paiohua.com神勇不敌女枪BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('411', '勇者必胜', 'http://www.imdb.com/title/tt2740538');
INSERT INTO `tb_piaohuavideo` VALUES ('412', '拼命三郎石秀HD国语中字1280高清 建康府发生孟氏家族灭门大案，朝廷派郭世明出任建康府总捕头，协助知府大人全力调查。郭世明怀疑孟氏家族灭门...更新时间：04-22 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8116/飘花电影piaohua.com拼命三郎石秀HD国语中字1280高清.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('413', '二龙湖浩哥之风云再起720p.HD国语中字 继四平青年后姊妹篇，乡村杀马特最炫屌丝风滚滚来袭！ ...更新时间：04-19 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8104/飘花电影www.piaohua.com二龙湖浩哥之风云再起.720p.HD国语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('414', '警察故事2013', 'http://www.imdb.com/title/tt2599716/');
INSERT INTO `tb_piaohuavideo` VALUES ('415', '血域燃烧', 'ftp://www:piaohua.com@dy126.piaohua.com:11308/飘花电影paiohua.com血域燃烧BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('416', '局外人2014', 'ftp://www:piaohua.com@dy126.piaohua.com:11303/飘花电影paiohua.com局外人2014BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('417', '血缘/血缘关系', 'ftp://www:piaohua.com@dy126.piaohua.com:11301/飘花电影paiohua.com血缘关系BD1280高中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('418', '红色天空/歼灭天际线', 'http://www.imdb.com/title/tt1946381/');
INSERT INTO `tb_piaohuavideo` VALUES ('419', '捕食者的崛起720p.BD中英双字 与能源研究实验室失去联系之后，大佬就雇佣了一只秘密精英部队，让他们去营救困在研究室的教授，此教授正在研...更新时间：04-06 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8059/飘花电影piaohua.com捕食者的崛起.720p.BD中英双字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('420', '恶Zhan/惡戰/上海滩马永720p中文 自幼身怀绝技的马永贞（伍允龙 饰），从乡下来到上海滩的十里洋场谋生路。在这里，他结识了新晋崛起的上海滩...更新时间：04-06 点击下载:', 'http://www.imdb.com/title/tt2290567');
INSERT INTO `tb_piaohuavideo` VALUES ('421', '功夫侠720p.Rip中英 陈平（陈虎 饰）是在边陲小镇打工的普通青年，他身怀高超的中国功夫，但是与生俱来的恐高症让他对自己失去了信...更新时间：04-04 点击下载:', 'http://www.imdb.com/title/tt1534449/');
INSERT INTO `tb_piaohuavideo` VALUES ('422', '嫌疑人/嫌疑犯', 'http://www.imdb.com/title/tt3404158/');
INSERT INTO `tb_piaohuavideo` VALUES ('423', '雪国列车/最后的列车', 'http://www.imdb.com/title/tt1706620');
INSERT INTO `tb_piaohuavideo` VALUES ('424', '永不停歇TC中字 连姆·尼森饰演一位名叫比尔·马科斯（Bill Marks）的老兵，奉命去一架航班飞机上执行任务。期间，他收到一系列神秘...更新时间：03-23 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:8012/飘花电影www.piaohua.com300永不停歇TC中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('425', '四十七浪人/四十七人', 'http://www.imdb.com/title/tt1335975');
INSERT INTO `tb_piaohuavideo` VALUES ('426', '合理怀疑720p.BD中英双字幕 当执法者深陷犯罪的谜团时，他是否想过自己将要面对的是怎样的境遇，当自己还是一个懵懂无知的嫌疑犯时，其实...更新时间：03-12 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:7969/飘花电影piaohua.com合理怀疑.BD.720p.中英双字幕.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('427', '黑帮追缉令', 'ftp://www:piaohua.com@dy125.piaohua.com:11239/飘花电影paiohua.com黑帮追缉令BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('428', '刺客720p.中英 公元前360年， 魏王（梁家仁 饰）出兵大举攻楚，楚国不支，楚王（姜超饰）不知所措、慌不择路，欲行偷梁换柱之...更新时间：03-06 点击下载:', 'High@L3.1');
INSERT INTO `tb_piaohuavideo` VALUES ('429', '风暴', 'http://www.imdb.com/title/tt3341072/');
INSERT INTO `tb_piaohuavideo` VALUES ('430', '神秘仙境', 'http://www.imdb.com/title/tt2363213');
INSERT INTO `tb_piaohuavideo` VALUES ('431', '制服', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('432', '印度超人3', 'ftp://www:piaohua.com@dy126.piaohua.com:11196/飘花电影piaohua.com印度超人3BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('433', '庞贝末日', 'ftp://www:piaohua.com@dy125.piaohua.com:11220/飘花电影piaohua.com庞贝末日BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('434', '控制', 'http://www.imdb.com/title/tt2550112/');
INSERT INTO `tb_piaohuavideo` VALUES ('435', '子弹', 'http://www.imdb.com/title/tt2544734/');
INSERT INTO `tb_piaohuavideo` VALUES ('436', '机关枪女人头BRRip 一个代号为\"机关枪女人\"性感女杀手，受雇追杀智利的一名黑帮头领。而黑帮老大则开出高额赏金悬赏机关枪女人的头...更新时间：02-21 点击下载:', 'ftp://www:piaohua.com@dy44.piaohua.com:7442/飘花电影piaohua.com机关枪女人头DVD中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('437', '帝国秘符720p 普通汽修工人成晰（潘粤明 饰）的女儿突然被人绑架，幕后的操纵者是国际文物犯罪集团的头目大卫，因为成晰父亲...更新时间：02-21 点击下载:', '下载地址');
INSERT INTO `tb_piaohuavideo` VALUES ('438', '功夫战斗机', 'ftp://www:piaohua.com@dy126.piaohua.com:11190/飘花电影piaohua.com功夫战斗机HD1280高清国语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('439', '杀手职场', 'ftp://www:piaohua.com@dy125.piaohua.com:11213/飘花电影piaohua.com杀手职场BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('440', '老男孩/原罪犯', 'http://www.imdb.com/title/tt1321511/');
INSERT INTO `tb_piaohuavideo` VALUES ('441', '地牢围攻3', 'ftp://www:piaohua.com@dy126.piaohua.com:11188/飘花电影piaohua.com地牢围攻3BD1280高清中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('442', '一枝花与铁臂膊720p中字 　电影《一枝花与铁臂膀》着重讲述了蔡庆与蔡福两兄弟为了救助富甲一方的卢俊义而展开的一系列故事。实力派演...更新时间：02-12 点击下载:', 'High@L3.1');
INSERT INTO `tb_piaohuavideo` VALUES ('443', '雷神2：黑暗世界', 'http://www.imdb.com/title/tt1981115');
INSERT INTO `tb_piaohuavideo` VALUES ('444', '佐州自救兄弟/执勤/巡 720p中文 影片主角为一个不按常理出牌的铁腕的警察，他企图恶整他妹妹的男友，一个刚刚收到警校录取通知的保安。 ...更新时间：02-05 点击下载:', 'http://www.imdb.com/title/tt1408253/');
INSERT INTO `tb_piaohuavideo` VALUES ('445', '冲锋战警BD1280高清国粤双语 临近退休年龄的警署运输车辆警长林国权（任达华 饰）负责管理警队车辆、司机日常出勤及维修事物，在他与好朋...更新时间：01-31 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('446', '饥饿游戏2：星火燎原', 'ftp://www:piaohua.com@dy125.piaohua.com:11176/飘花电影piaohua.com饥饿游戏2星火燎原BD1280高清中英双字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('447', '同窗生/校友', 'http://www.hwhy.co.kr/');
INSERT INTO `tb_piaohuavideo` VALUES ('448', '冬荫功2', 'http://www.imdb.com/title/tt1925518/');
INSERT INTO `tb_piaohuavideo` VALUES ('449', '弯刀杀戮', 'http://www.imdb.com/title/tt2002718');
INSERT INTO `tb_piaohuavideo` VALUES ('450', '目标战HD国语中字1280高清 　面对中国周边日益严峻的国土安全形势，我们的百万雄狮厉兵秣马，严阵以待。本片描述的就是百万雄狮中的一支...更新时间：01-10 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('451', '金蝉脱壳', 'http://www.imdb.com/title/tt1211956/');
INSERT INTO `tb_piaohuavideo` VALUES ('452', '独臂刀三部曲', 'http://www.imdb.com/title/tt0061597');
INSERT INTO `tb_piaohuavideo` VALUES ('453', '维京王国BD中英双字1280高清 该片讲述一个史诗般的魔幻故事。在那些海盗传奇和一些松散的史诗中，曾经记录着一个神奇的充满幻想的国度“V...更新时间：12-25 点击下载:', 'http://www.piaohua.com/index.htm');
INSERT INTO `tb_piaohuavideo` VALUES ('454', '死区时间1080p中文 女儿的失踪让父亲陷入了对犯罪者的极度罪恶感，他的厌恶情绪影响了他的生活，同时另一方面，女儿自己也不知...更新时间：12-22 点击下载:', 'High@L5.0');
INSERT INTO `tb_piaohuavideo` VALUES ('455', '龙狼血战1080p中文 2013年泰国奇幻动作电影!讲述弥漫着暴力和堕落的魔鬼之城，使得整个社会沉浸于寡恩薄义与冷酷无情之中。素有“最...更新时间：12-21 点击下载:', 'http://www.imdb.com/title/tt2164468/');
INSERT INTO `tb_piaohuavideo` VALUES ('456', '全民目击1080p中英双字 　富豪林泰（孙红雷饰）婚期将至，准新娘却惨死地下停车场，林泰的富二代女儿林萌萌成为最大嫌疑人，林泰不惜...更新时间：12-21 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('457', '狄仁杰之神都龙王/狄', 'http://www.imdb.com/title/tt2992146/');
INSERT INTO `tb_piaohuavideo` VALUES ('458', '金刚王：死亡救赎', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('459', '左轮女煞星1080p中文字幕 在她新婚之夜，玉醒来牵着她死去的husbandafter她勉强幸存下来的犯罪家族shefled从几周前企图谋杀。在典当她的结婚戒...更新时间：12-14 点击下载:', 'http://www.imdb.com/title/tt2506748');
INSERT INTO `tb_piaohuavideo` VALUES ('460', '激战', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('461', '暴力执法', 'http://www.imdb.com/title/tt2611626/');
INSERT INTO `tb_piaohuavideo` VALUES ('462', '饥饿游戏2：星火燎原DVDscr国英双语中字 　故事紧随前作，第74四届饥饿游戏已经结束，凯特尼斯出人意料地活了下来，她和“恋人”皮塔将会过上安定闲适的...更新时间：12-05 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('463', '黑帮家族/黑帮追杀令', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('464', '铁血娇娃1080p.HD国语中字高清 白雪（余男 饰）等五个来自中国大都市的女子背包族和朋友老鹰（邹兆龙 饰），在东南亚偶遇英俊帅气的当地旅游...更新时间：12-01 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('465', '谋杀论文BD中西双字1024高清 法律教授贝木德在一次上课过程中遇到了一起手段极其残忍的奸杀案。贝木德和学生一起讨论和研究着案件。随着调...更新时间：11-28 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('466', '神秘博士五十周年特别HD高清中字版 BBC的核心美国医生50周年的庆祝活动将特殊周年事件,医生,首映周六,11月23日。...更新时间：11-26 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('467', '新雌雄大盗DVD英语中字版 帕克在美国大萧条时期,邦妮和克莱德在一杯ofhotchocolate,并一见钟情。他们暴力courtshiptook themthrough抢劫银行、监狱和一...更新时间：11-26 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('468', '毒警追踪/警探卡尼克HD1280版 吸毒成瘾的警探麦克康尼誓要抓住刚出狱的罪犯西蒙，一天时间之内，他步步逼近西蒙，他不懈的追踪后到底隐藏着...更新时间：11-26 点击下载:', 'http://www.imdb.com/title/tt2295564');
INSERT INTO `tb_piaohuavideo` VALUES ('469', '太极侠', 'http://www.imdb.com/title/tt2016940/');
INSERT INTO `tb_piaohuavideo` VALUES ('470', '天台爱情', 'http://www.imdb.com/title/tt2901548/');
INSERT INTO `tb_piaohuavideo` VALUES ('471', '逃脱/死路十条BD中英双字1280高清 　影片讲述了伊桑霍克饰演的前赛车手必须遵守一个神秘男人的指示，才能拯救他被绑架的妻子，霍克抢了赛琳娜的...更新时间：11-16 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('472', '赤焰战场2', 'http://www.imdb.com/title/tt1821694/');
INSERT INTO `tb_piaohuavideo` VALUES ('473', '波西·杰克逊与魔兽之', 'www.percyjacksonthemovie.com');
INSERT INTO `tb_piaohuavideo` VALUES ('474', '金刚狼2', 'http://www.imdb.com/title/tt1430132/');
INSERT INTO `tb_piaohuavideo` VALUES ('475', '两枪毙命/双龙出手', 'http://www.piaohua.com/index.htm');
INSERT INTO `tb_piaohuavideo` VALUES ('476', '霹雳神鹰HD国语1280高清 黄飞是深圳特警，他灵敏果断，武功超群。刚刚胜利完成了追捕一伙抢劫银行匪徒的任务后，他又接受了协助港方培...更新时间：11-06 点击下载:', 'http://www.piaohua.com/index.htm');
INSERT INTO `tb_piaohuavideo` VALUES ('477', '唐卡迷踪HD国语中字1280高清 【09年最新合拍动作片DVD中字】前美军特种兵兰森被美国人张伯伦雇用，带领一支由张伯伦、张伯伦的养女阿妮卡、大...更新时间：11-01 点击下载:', '3e');
INSERT INTO `tb_piaohuavideo` VALUES ('478', '背水一战', 'http://www.imdb.com/title/tt1549920/');
INSERT INTO `tb_piaohuavideo` VALUES ('479', '战·无双/战无双HD国语1280高清 【09年蒋路霞 李灿森 张兆辉动作大片DVD国语中字】成长于武术世家的少女聂依依(蒋璐霞饰)，于广东任职武术教练。...更新时间：10-29 点击下载:', 'ftp://3e:3e@ftp.eee4.com:527/[3E电影站www.370kk.com]战无双DVD.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('480', '玉战士HD国语中字1280高清 ◎译 名 玉战士 ◎片 名 Jade Warrior ◎年 代 2006 ◎国 家 中国/荷兰/芬兰/爱沙尼亚 ◎类 别 冒险/幻想/动作 ◎语 言 芬兰...更新时间：10-29 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('481', '蜀山传', 'ftp://dy125:piaohua@dy125.piaohua.com:6081/飘花电影piaohua.com蜀山传HD国语中字1280高清.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('482', '图书馆战争真人版', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('483', '冥界警局', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('484', '海扁王2：全力以赴', 'http://www.imdb.com/title/tt1650554/');
INSERT INTO `tb_piaohuavideo` VALUES ('485', '中国超人BD国语1280高清 70 年代中期，日本超人片集掀起热潮，导演华山乘其气势，将武侠情节，加上科幻特技，拍出一个富中国特色的“中...更新时间：10-18 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('486', '惊天危机', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('487', '独行侠/游侠传奇/孤独', 'http://www.imdb.com/title/tt1210819');
INSERT INTO `tb_piaohuavideo` VALUES ('488', '龙城正月HD国语中字1280高清 该片是由吴倩莲参演的大陆电影，张艺谋担任监制，他的副导演杨凤良升格执导，男主角是阳刚味十足的大陆小生尤...更新时间：10-06 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('489', '艳遇丽江1080p.HD国语中字高清 厌倦了都市里尔虞我诈争权夺利的生活，厌倦了四壁高磊水泥石砌的高楼大厦，厌倦了那段明知道没有结局的感情。...更新时间：10-02 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('490', '白头神探', 'http://www.imdb.com/title/tt0095705/');
INSERT INTO `tb_piaohuavideo` VALUES ('491', '血战墓碑镇', 'http://www.imdb.com/title/tt2268419/');
INSERT INTO `tb_piaohuavideo` VALUES ('492', '御前侍卫HD国语中字1280高清 乾隆中期，大清河发大水，胜芳县令李满仓贪污腐败，致使灾情愈加严重。为查看民情，乾隆微服巡游霸州境内号称...更新时间：09-28 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('493', '惊唇劫/桃色追捕令BD中英双字1280高清 【1997年美国经典犯罪惊怵动作片DVD中字】警官兼心理学家亚历克斯为侄女无缘无故失踪而远赴北卡罗来纳州一个小镇...更新时间：09-23 点击下载:', '3e');
INSERT INTO `tb_piaohuavideo` VALUES ('494', '复仇死循环', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('495', '突然死亡BD中英双字1280高清 彼得•海姆斯1995年执导的动作片，尚格•云顿主演。讲述达伦与孩子前往欣赏冰上曲棍球比赛，女儿却突然走失。在...更新时间：09-10 点击下载:', '手机电影下载：');
INSERT INTO `tb_piaohuavideo` VALUES ('496', '约翰·福尔克：代号丽HD1280高清中字版 瑞典某市国王路公寓发生一起入室凶案，弗兰克.瓦格纳出于自卫错手杀死持枪入室的歹徒，瞬间被推向舆论的风口浪...更新时间：09-05 点击下载:', 'http://www.imdb.com/title/tt2279786/');
INSERT INTO `tb_piaohuavideo` VALUES ('497', '西部世界BD中字1280高清 　在遥远的未来,一座巨型高科技成人乐园Delos建成,其中有西部世界,罗马世界,中世纪世界三大主题版块的机器人世界...更新时间：09-03 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('498', '监视/监视者们', 'http://www.imdb.com/title/tt2969656/');
INSERT INTO `tb_piaohuavideo` VALUES ('499', '致命诡计', 'http://www.imdb.com/title/tt2179226');
INSERT INTO `tb_piaohuavideo` VALUES ('500', '帝国BD中英双字1280高清 影片根据1982年发生的真实事件改编，讲述两个童年时的玩伴计划抢劫事件，且涉及装甲车。硬汉道恩•强森出演纽约...更新时间：08-24 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('501', '皇家赌场720p.国英双语.BD中英双字高清 【美国票房过亿超火暴冒险动作大片DVD中英双字幕】这是丹尼尔·克雷格担当第六任007后的第一部影片。《皇家夜总会...更新时间：08-24 点击下载:', '电影下载');
INSERT INTO `tb_piaohuavideo` VALUES ('502', '007:择日再死/谁与争锋720p.国英双语.BD中英双字高清 【精彩美国动作大片《007:择日再死/改天再死/谁与争锋/不日杀机/择日而亡》DVD中英双字1024x556高清版】...更新时间：08-24 点击下载:', 'ftp://d32:d32@dm.eee4.com:1205/[3E电影站www.370kk.com]007择日再死CD1.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('503', '惊天魔盗团', 'http://www.imdb.com/title/tt1670345/');
INSERT INTO `tb_piaohuavideo` VALUES ('504', '天机·富春山居图', 'http://www.imdb.com/title/tt2460488');
INSERT INTO `tb_piaohuavideo` VALUES ('505', '史前巨鳄：最终章DVD中字 传奇恐怖电影明星Robert Englund将主演《史前巨鳄》系列电影的最新篇章，扮演偷猎者Jim Bickerman，企图从黑湖的稀有鳄...更新时间：08-14 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('506', '南北少林BD国语中字1024/1280高清 1982年李连杰主演《少林寺》一举成名，在观从心中树立了正直、勇敢的武僧形象，此片是他饰演武僧的又一力作...更新时间：08-12 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('507', '东邪西毒：终极版720P.国粤双语.BD中字高清 【08修复版BD国语中字[880分辨率] （附粤语版本）】根据金庸小说《射雕英雄传》部分章节改编。...更新时间：08-07 点击下载:', 'ftp://e41:e41@xl2.eee4.com:9024/[3E电影站www.370kk.com]东邪西毒：终极版粤语中字.rmvb');
INSERT INTO `tb_piaohuavideo` VALUES ('508', '镖行天下前传11部720p.国语.HD中字高清 ◎译 名 镖行天下前传之至尊国宝 ◎片 名 Biao Xing Tian Xia Qian Zhuan Zi Zhi Zun Guo Bao ◎年 代 2010 ◎国 家 中国 ◎类 别 动...更新时间：08-05 点击下载:', 'ftp://dy171:piaohua@dy171.piaohua.com:1061/飘花电影piaohua.com镖行天下前传之至尊国宝HDTV国语中字.mkv');
INSERT INTO `tb_piaohuavideo` VALUES ('509', '僵尸猎手', 'http://www.imdb.com/title/tt0829176/');
INSERT INTO `tb_piaohuavideo` VALUES ('510', '猎杀U-571BD中英双字1024/1280高清 【2000年欧美票房过亿战争动作DVD中英双字800分辨率＋1024x576高清版】...更新时间：08-03 点击下载:', '迅雷电影下载');
INSERT INTO `tb_piaohuavideo` VALUES ('511', '魔鬼的细节BD中英双字1280高清 剧情介绍:再过七分钟，住在诺加利斯,亚利桑那州的托马斯.康纳德的生活就会因为卷入一场墨西哥大企业间富有诗意...更新时间：08-01 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('512', '少林寺', 'http://www.imdb.com/title/tt0079891/');
INSERT INTO `tb_piaohuavideo` VALUES ('513', '维京传奇：最黑暗的一', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('514', '冷血悍将/浪人720P.国英双语.BD中英双字 【1998年欧美精彩惊悚犯罪动作大片BD中英双字1024x576高清版】...更新时间：07-28 点击下载:', '3e');
INSERT INTO `tb_piaohuavideo` VALUES ('515', '血仍未冷720P.BD中英双字高清 【周润发1998年美国火爆犯罪动作大片BD中英双字1024x576高清版】...更新时间：07-28 点击下载:', '电影下载');
INSERT INTO `tb_piaohuavideo` VALUES ('516', '银翼杀手720P.国英双语.BD中英双字 【1982年美国经典超高分惊悚科幻动作片BD中英双字1024x576高清版】...更新时间：07-28 点击下载:', '电影下载');
INSERT INTO `tb_piaohuavideo` VALUES ('517', '莫逆家族', 'http://www.imdb.com/title/tt1817093/');
INSERT INTO `tb_piaohuavideo` VALUES ('518', '诸神之战/泰坦之战/超720p.国英双语.BD中英双字 【2010年美国最新票房冠军神话历险动作大片BD中英双字1024x576+1280x720高清版+DVD中字】...更新时间：07-26 点击下载:', '电影下载');
INSERT INTO `tb_piaohuavideo` VALUES ('519', '少数派力量BD中英双字1280高清 Religious conspiracy collides with urban crime in astory told from multiple perspectives. ...更新时间：07-25 点击下载:', 'http://www.xiaobajiew.com/dongzuopian/30559/');
INSERT INTO `tb_piaohuavideo` VALUES ('520', '柏林/柏林档案BD中字1024/1280高清 一直在柏林追查朝鲜秘密账户的韩国要员郑镇秀（韩石圭饰）在监视一起非法军火交易的现场发现了以假身份作为掩...更新时间：07-25 点击下载:', 'http://www.xiaozhuyy.com/movie/30418.html');
INSERT INTO `tb_piaohuavideo` VALUES ('521', '火速搭档/贪恋与背叛BD720p中英双字幕 讲述了两个不良少年情侣到一个南方小镇，谎称是某个死去的人的朋友，并企图继承他的家产…… ...更新时间：07-21 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('522', '赤色风暴/核艇风暴/红BD中英双字1024/1280高清 【丹泽尔·华盛顿经典大片DVD中英双字1024x560高清版＋国语配音版】...更新时间：07-21 点击下载:', 'gvod');
INSERT INTO `tb_piaohuavideo` VALUES ('523', '特种部队2/特种部队：', 'http://www.imdb.com/title/tt1583421');
INSERT INTO `tb_piaohuavideo` VALUES ('524', '叶问：终极一战', 'http://www.imdb.com/title/tt2495118');
INSERT INTO `tb_piaohuavideo` VALUES ('525', '隐墙BD中德双字1024/1280高清 影片的主人公是一位并没有给出姓名的女人(马蒂娜·戈黛特《他人的生活》饰演)。她和两位朋友以及她们养的狗一起...更新时间：07-18 点击下载:', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('526', '杀戮季节/复仇人猎人', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('527', '街头之王', 'http://www.8edy.com');
INSERT INTO `tb_piaohuavideo` VALUES ('528', '蜂鸟BD中英双字1024/1280高清 本片讲述了杰森·斯坦森扮演的前特种部队士兵乔伊在阿富汗执行任务时发生意外，为了逃避军事法庭的制裁，他抛弃...更新时间：07-07 点击下载:', 'http://www.8edy.com');
