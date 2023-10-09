/*
 Navicat Premium Data Transfer

 Source Server         : ghost
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : rm-2zeyoxjy4n606sm1l4o.mysql.rds.aliyuncs.com:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : 65001

 Date: 17/04/2021 11:57:28
*/

SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS user;
CREATE TABLE `user`
(
    `id`          bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `name`        varchar(30) DEFAULT NULL COMMENT '姓名',
    `age`         int(11) DEFAULT NULL COMMENT '年龄',
    `email`       varchar(50) DEFAULT NULL COMMENT '邮箱',
    `manager_id`  bigint(20) DEFAULT NULL COMMENT '直属上级id',
    `create_time` datetime    DEFAULT NULL COMMENT '创建时间',
    `update_time` datetime    DEFAULT NULL COMMENT '修改时间',
    `version`     int(11) DEFAULT '1' COMMENT '版本',
    `deleted`     int(1) DEFAULT '0' COMMENT '逻辑删除标识,0-未删除,1-已删除',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 10
  DEFAULT CHARSET = utf8;

INSERT INTO user(id, name, age, email, manager_id, create_time)
VALUES (1, '老板', 40, 'boss@baomidou.com', NULL, '2021-03-28 13:12:40'),
       (2, '王狗蛋', 40, 'gd@baomidou.com', 1, '2021-03-28 13:12:40'),
       (3, '王鸡蛋', 40, 'jd@baomidou.com', 2, '2021-03-28 13:12:40'),
       (4, '王鸭蛋', 40, 'yd@baomidou.com', 2, '2021-03-28 13:12:40'),
       (5, '王猪蛋', 40, 'zd@baomidou.com', 2, '2021-03-28 13:12:40'),
       (6, '王软蛋', 40, 'rd@baomidou.com', 2, '2021-03-28 13:12:40'),
       (7, '王铁蛋', 40, 'td@baomidou.com', 2, '2021-03-28 13:12:40')
