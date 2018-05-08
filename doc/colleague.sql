-- -----------
-- AaronJiang
-- 2018/05/04
-- 同学们的表
-- -----------
DROP TABLE IF EXISTS 'ysu_colleague';
CREATE TABLE `ysu_colleague`(
  `id` int(11) PRIMARY KEY AUTO_INCREMENT COMMENT 'ID',
  `icon` varchar(255) COMMENT '头像',
  `name` varchar(20) COMMENT '你的名字',
  `nickname` varchar(20) COMMENT '外号',
  `password` VARCHAR(50) COMMENT '登录密码',
  `gender` bit(1) COMMENT '你的性别',
  `birthday` DATE COMMENT '生日',
  `dorm` varchar(20) COMMENT '宿舍信息',
  `home_address` varchar(100) COMMENT '家庭住址',
  `now_address` varchar(100) COMMENT '现在何方',
  `is_login` bit(1) COMMENT '是否登录过',
  `phone` char(11) COMMENT '手机号',
  `qq` varchar(20) COMMENT 'QQ号',
  `email` varchar(50) COMMENT '邮箱号',
  `phone_backup` varchar(20) COMMENT '备用手机号',
  `description` VARCHAR(255) COMMENT '备注',
  `login_time` DATE COMMENT '最近一次登录时间',
  `login_ip` varchar(30) COMMENT '最近一次登录IP',
  `login_addr` VARCHAR(30) COMMENT '最近一次登录地址',
  `modify_time` DATE COMMENT '最近更新资料时间'
)ENGINE=InnoDB DEFAULT CHARSET="utf8mb4" COMMENT '同学们的表';

ALTER TABLE ysu_colleague add birthday DATE COMMENT '生日',add modify_time DATE COMMENT '最近修改资料时间';
DESC ysu_colleague;
-- -----------
-- AaronJiang
-- 2018/05/05
-- 图片
-- -----------
DROP TABLE IF EXISTS 'ysu_image';
CREATE TABLE 'ysu_image'(
  'id' int(11) PRIMARY KEY AUTO_INCREMENT COMMENT 'ID',
  'path' varchar(255) COMMENT '图片地址',
  'wishes' varchar(50) COMMENT '寄语',
  'description' varchar(255) COMMENT '图片描述',
  'upload_by' int(11) COMMENT '上传者',
  'upload_time' DATE COMMENT '上传时间',
  'modify_time' DATE COMMENT '修改时间'
)ENGINE=InnoDB DEFAULT CHARSET="utf8mb4" COMMENT '图片墙';

-- -----------
-- AaronJiang
-- 2018/05/05
-- 图片
-- -----------