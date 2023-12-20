-- DROP TABLE IF EXISTS sys_user;

CREATE TABLE IF NOT EXISTS sys_user
(
    id
        INTEGER
        PRIMARY
            KEY,
    name
        TEXT,
    age
        INTEGER,
    email
        TEXT
);

-- DROP TABLE IF EXISTS "user";

CREATE TABLE IF NOT EXISTS "user"
(
    id
        INTEGER
        PRIMARY
            KEY
        AUTOINCREMENT,
    name
        TEXT,
    age
        INTEGER,
    email
        TEXT,
    manager_id
        INTEGER,
    create_time
        TEXT,
    update_time
        TEXT,
    version
        INTEGER
        DEFAULT
            '1',
    deleted
        INTEGER
        DEFAULT
            '0'
);
DELETE
FROM sys_user;

INSERT INTO sys_user (id, name, age, email)
VALUES (1, 'Jone', 18, 'test1@baomidou.com'),
       (2, 'Jack', 20, 'test2@baomidou.com'),
       (3, 'Tom', 28, 'test3@baomidou.com'),
       (4, 'Sandy', 21, 'test4@baomidou.com'),
       (5, 'Billie', 24, 'test5@baomidou.com');

DELETE
FROM "user";
INSERT INTO "user" (id, name, age, email, manager_id, create_time)
VALUES (1, '老板', 40, 'boss@baomidou.com', NULL, '2021-03-28 13:12:40'),
       (2, '王狗蛋', 40, 'gd@baomidou.com', 1, '2021-03-28 13:12:40'),
       (3, '王鸡蛋', 40, 'jd@baomidou.com', 2, '2021-03-28 13:12:40'),
       (4, '王鸭蛋', 40, 'yd@baomidou.com', 2, '2021-03-28 13:12:40'),
       (5, '王猪蛋', 40, 'zd@baomidou.com', 2, '2021-03-28 13:12:40'),
       (6, '王软蛋', 40, 'rd@baomidou.com', 2, '2021-03-28 13:12:40'),
       (7, '王铁蛋', 40, 'td@baomidou.com', 2, '2021-03-28 13:12:40');
