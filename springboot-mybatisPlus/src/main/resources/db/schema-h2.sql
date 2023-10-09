DROP TABLE IF EXISTS sys_user;

CREATE TABLE sys_user
(
    id    BIGINT NOT NULL COMMENT '主键ID',
    name  VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
    age   INT NULL DEFAULT NULL COMMENT '年龄',
    email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键id',
    name        VARCHAR(30) DEFAULT NULL COMMENT '姓名',
    age         INT         DEFAULT NULL COMMENT '年龄',
    email       VARCHAR(50) DEFAULT NULL COMMENT '邮箱',
    manager_id  BIGINT      DEFAULT NULL COMMENT '直属上级id',
    create_time DATETIME    DEFAULT NULL COMMENT '创建时间',
    update_time DATETIME    DEFAULT NULL COMMENT '修改时间',
    version     INT         DEFAULT '1' COMMENT '版本',
    deleted     INT         DEFAULT '0' COMMENT '逻辑删除标识,0-未删除,1-已删除'
);
