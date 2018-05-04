-- -----------
-- jcx
-- 2018/05/04
-- 同学们的表
-- -----------
DROP TABLE IF EXISTS 'ysu_colleague';
CREATE TABLE 'ysu_colleague'(
  'id' int(11) PRIMARY KEY AUTO_INCREMENT COMMENT 'ID',
  'name' varchar(20) COMMENT '你的名字',
  'nickname' varchar(20) COMMENT '外号',
  'password' VARCHAR(50) COMMENT '登录密码',
  'gender' bit(1) COMMENT '你的性别',
  'dorm' varchar(20) COMMENT '宿舍信息',
  'home_address' varchar(100) COMMENT '家庭住址',
  'now_address' varchar(100) COMMENT '现在何方',
  'is_login' bit(1) COMMENT '是否登录过',
  'phone' char(11) COMMENT '手机号',
  'qq' varchar(20) COMMENT 'QQ号',
  'email' varchar(50) COMMENT '邮箱号',
  'phone_backup' varchar(20) COMMENT '备用手机号',
  'description' VARCHAR(255) COMMENT '备注',
  'login_time' DATE COMMENT '最近一次登录时间',
  'login_ip' varchar(30) COMMENT '最近一次登录IP',
  'login_addr' VARCHAR(30) COMMENT '最近一次登录地址'
)