/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : guitar

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2017-05-22 22:07:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for guitar
-- ----------------------------
DROP TABLE IF EXISTS `guitar`;
CREATE TABLE `guitar` (
  `id` varchar(50) NOT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `back_wood` varchar(45) DEFAULT NULL,
  `top_wood` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `builder` varchar(45) DEFAULT NULL,
  `model` varchar(45) DEFAULT NULL,
  `num_strings` tinyint(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of guitar
-- ----------------------------
INSERT INTO `guitar` VALUES ('10', '30.20', 'BRICH', 'KOREANPINE', 'UNSPECIFIED', 'SHANGHAI', 'XLL', '5');
INSERT INTO `guitar` VALUES ('2', '15.20', 'BRICH', 'BRICH', 'ACOUSTIC', 'SHANGHAI', 'XL', '4');
INSERT INTO `guitar` VALUES ('3', '20.20', 'KOREANPINE', 'KOREANPINE', 'ELECTRIC', 'SHANDONG', 'M', '2');
INSERT INTO `guitar` VALUES ('4', '25.20', 'CAMPHOR', 'BRICH', 'ELECTRIC', 'JIANGSU', 'ML', '1');
INSERT INTO `guitar` VALUES ('473a89dcdbfe486faaf408aa2e9737aa', '1.00', 'CAMPHOR', 'CAMPHOR', 'ACOUSTIC', 'JIANGSU', '123213', '1');
INSERT INTO `guitar` VALUES ('5', '30.20', 'BRICH', 'KOREANPINE', 'UNSPECIFIED', 'SHANGHAI', 'XLL', '5');
INSERT INTO `guitar` VALUES ('6', '10.20', 'CAMPHOR', 'CAMPHOR', 'ACOUSTIC', 'JIANGSU', 'X', '3');
INSERT INTO `guitar` VALUES ('7', '15.20', 'BRICH', 'BRICH', 'ACOUSTIC', 'SHANGHAI', 'XL', '4');
INSERT INTO `guitar` VALUES ('8', '20.20', 'KOREANPINE', 'KOREANPINE', 'ELECTRIC', 'SHANDONG', 'M', '2');
INSERT INTO `guitar` VALUES ('9', '25.20', 'CAMPHOR', 'BRICH', 'ELECTRIC', 'JIANGSU', 'ML', '1');
