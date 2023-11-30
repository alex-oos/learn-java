create
database  if not exists  demodb;
use
demodb;
DROP TABLE IF EXISTS user;
CREATE TABLE user
(
    id          BIGINT(20) PRIMARY KEY NOT NULL COMMENT '主键id',
    username    VARCHAR(30) DEFAULT NULL COMMENT '用户名',
    age         INT(11) DEFAULT NULL COMMENT '年龄',
    email       VARCHAR(50) DEFAULT NULL COMMENT '邮箱',
    manager_id  BIGINT(20) DEFAULT NULL COMMENT '直属上级id',
    create_time DATETIME    DEFAULT NULL COMMENT '创建时间',
    update_time DATETIME    DEFAULT NULL COMMENT '修改时间',
    password    VARCHAR(20) COMMENT '密码',
    version     INT(11) DEFAULT '1' COMMENT '版本',
    deleted     INT(1) DEFAULT '0' COMMENT '逻辑删除标识,0-未删除,1-已删除'
) ENGINE = INNODB CHARSET=UTF8;

INSERT INTO user(id, username, age, email, manager_id, create_time)
VALUES (1, '老板', 40, 'boss@baomidou.com', NULL, '2021-03-28 13:12:40'),
       (2, '王狗蛋', 40, 'gd@baomidou.com', 1, '2021-03-28 13:12:40'),
       (3, '王鸡蛋', 40, 'jd@baomidou.com', 2, '2021-03-28 13:12:40'),
       (4, '王鸭蛋', 40, 'yd@baomidou.com', 2, '2021-03-28 13:12:40'),
       (5, '王猪蛋', 40, 'zd@baomidou.com', 2, '2021-03-28 13:12:40'),
       (6, '王软蛋', 40, 'rd@baomidou.com', 2, '2021-03-28 13:12:40'),
       (7, '王铁蛋', 40, 'td@baomidou.com', 2, '2021-03-28 13:12:40')
