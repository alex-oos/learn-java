DELETE
FROM `user`;
INSERT INTO `user`(id, name, age, email, manager_id, create_time)
VALUES (1, '老板', 40, 'boss@baomidou.com', null, TIMESTAMP '2021-03-28 13:12:40'),
       (2, '王狗蛋', 40, 'gd@baomidou.com', 1, TIMESTAMP '2021-03-28 13:12:40'),
       (3, '王鸡蛋', 40, 'jd@baomidou.com', 2, TIMESTAMP '2021-03-28 13:12:40'),
       (4, '王鸭蛋', 40, 'yd@baomidou.com', 2, TIMESTAMP '2021-03-28 13:12:40'),
       (5, '王猪蛋', 40, 'zd@baomidou.com', 2, TIMESTAMP '2021-03-28 13:12:40'),
       (6, '王软蛋', 40, 'rd@baomidou.com', 2, TIMESTAMP '2021-03-28 13:12:40'),
       (7, '王铁蛋', 40, 'td@baomidou.com', 2, TIMESTAMP '2021-03-28 13:12:40');
