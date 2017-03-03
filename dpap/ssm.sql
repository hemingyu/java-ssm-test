-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.6.24-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 education_ssm 的数据库结构
CREATE DATABASE IF NOT EXISTS `education_ssm` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;
USE `education_ssm`;


-- 导出  表 education_ssm.rc_system_department 结构
CREATE TABLE IF NOT EXISTS `rc_system_department` (
  `id` varchar(36) NOT NULL COMMENT '主键id',
  `dept_name` varchar(127) NOT NULL COMMENT '部门名称',
  `sort` int(11) NOT NULL COMMENT '排序',
  `status` varchar(8) NOT NULL COMMENT '状态(0:可用,1:禁用)',
  `creater` varchar(50) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `editor` varchar(50) DEFAULT NULL COMMENT '修改人',
  `edit_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门信息';

-- 正在导出表  education_ssm.rc_system_department 的数据：~2 rows (大约)
DELETE FROM `rc_system_department`;
/*!40000 ALTER TABLE `rc_system_department` DISABLE KEYS */;
INSERT INTO `rc_system_department` (`id`, `dept_name`, `sort`, `status`, `creater`, `create_time`, `editor`, `edit_time`) VALUES
	('1', '信息部', 2, '1', 'admin', '2016-12-30 17:42:22', NULL, NULL),
	('2', 'aaaa', 2, '1', 'test', '2016-11-06 19:55:19', 'aaaaa', '2016-11-21 17:10:14');
/*!40000 ALTER TABLE `rc_system_department` ENABLE KEYS */;


-- 导出  表 education_ssm.rc_system_employee 结构
CREATE TABLE IF NOT EXISTS `rc_system_employee` (
  `id` varchar(36) NOT NULL COMMENT '主键id',
  `role_id` varchar(36) NOT NULL COMMENT '角色id',
  `dept_id` varchar(36) NOT NULL COMMENT '部门id',
  `card_id` varchar(36) NOT NULL COMMENT '身份证id',
  `emp_no` varchar(20) NOT NULL COMMENT '员工账号（唯一，长度最少3个字符，最大不超过20个字符）',
  `emp_name` varchar(50) NOT NULL COMMENT '员工姓名（长度不超过50字符）',
  `emp_pwd` varchar(50) NOT NULL COMMENT '密码（MD5加密存储）',
  `gender` varchar(5) NOT NULL COMMENT '性别（0:男，1:女）',
  `phone` varchar(15) NOT NULL COMMENT '手机号码',
  `email` varchar(50) NOT NULL COMMENT '员工邮箱',
  `login_time` datetime DEFAULT NULL COMMENT '登录时间',
  `login_ip` varchar(50) DEFAULT NULL COMMENT '登录IP',
  `sort` int(11) NOT NULL COMMENT '排序',
  `status` varchar(8) NOT NULL COMMENT '帐号状态（0:可用，1:禁用，2:删除）',
  `creater` varchar(50) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `editor` varchar(50) DEFAULT NULL COMMENT '修改人',
  `edit_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='员工信息';

-- 正在导出表  education_ssm.rc_system_employee 的数据：~0 rows (大约)
DELETE FROM `rc_system_employee`;
/*!40000 ALTER TABLE `rc_system_employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `rc_system_employee` ENABLE KEYS */;


-- 导出  表 education_ssm.rc_system_group 结构
CREATE TABLE IF NOT EXISTS `rc_system_group` (
  `id` varchar(36) NOT NULL COMMENT '主键id',
  `group_code` varchar(127) NOT NULL COMMENT '权限组编码',
  `group_name` varchar(127) NOT NULL COMMENT '权限组名',
  `sort` int(11) NOT NULL COMMENT '排序',
  `status` varchar(8) NOT NULL COMMENT '状态',
  `creater` varchar(127) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `editor` varchar(127) DEFAULT NULL COMMENT '创建人',
  `edit_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统权限组';

-- 正在导出表  education_ssm.rc_system_group 的数据：~0 rows (大约)
DELETE FROM `rc_system_group`;
/*!40000 ALTER TABLE `rc_system_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `rc_system_group` ENABLE KEYS */;


-- 导出  表 education_ssm.rc_system_idcard 结构
CREATE TABLE IF NOT EXISTS `rc_system_idcard` (
  `id` varchar(36) NOT NULL COMMENT '身份证id',
  `card_no` varchar(32) NOT NULL COMMENT '身份证号码',
  `birthday` datetime NOT NULL COMMENT '出生日期',
  `address` varchar(255) NOT NULL COMMENT '联系地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='身份证信息';

-- 正在导出表  education_ssm.rc_system_idcard 的数据：~0 rows (大约)
DELETE FROM `rc_system_idcard`;
/*!40000 ALTER TABLE `rc_system_idcard` DISABLE KEYS */;
/*!40000 ALTER TABLE `rc_system_idcard` ENABLE KEYS */;


-- 导出  表 education_ssm.rc_system_log 结构
CREATE TABLE IF NOT EXISTS `rc_system_log` (
  `id` varchar(36) NOT NULL COMMENT '主键id',
  `opt_no` varchar(36) NOT NULL COMMENT '操作人帐号',
  `opt_name` varchar(127) NOT NULL COMMENT '操作人姓名',
  `model` varchar(255) NOT NULL COMMENT '操作模块',
  `model_desc` varchar(255) NOT NULL COMMENT '操作模块描述',
  `opt_time` datetime NOT NULL COMMENT '操作时间',
  `opt_ip` varchar(64) NOT NULL COMMENT 'ip地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统操作日志';

-- 正在导出表  education_ssm.rc_system_log 的数据：~0 rows (大约)
DELETE FROM `rc_system_log`;
/*!40000 ALTER TABLE `rc_system_log` DISABLE KEYS */;
/*!40000 ALTER TABLE `rc_system_log` ENABLE KEYS */;


-- 导出  表 education_ssm.rc_system_privilege 结构
CREATE TABLE IF NOT EXISTS `rc_system_privilege` (
  `id` varchar(36) NOT NULL COMMENT '主键id',
  `group_code` varchar(127) NOT NULL COMMENT '权限组编码',
  `privilege` varchar(127) NOT NULL COMMENT '权限',
  `pvlg_name` varchar(127) NOT NULL COMMENT '权限名称',
  `sort` int(11) NOT NULL COMMENT '排序',
  `status` varchar(8) NOT NULL COMMENT '状态',
  `creater` varchar(127) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `editor` varchar(127) DEFAULT NULL COMMENT '修改人',
  `edit_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统权限';

-- 正在导出表  education_ssm.rc_system_privilege 的数据：~0 rows (大约)
DELETE FROM `rc_system_privilege`;
/*!40000 ALTER TABLE `rc_system_privilege` DISABLE KEYS */;
/*!40000 ALTER TABLE `rc_system_privilege` ENABLE KEYS */;


-- 导出  表 education_ssm.rc_system_role 结构
CREATE TABLE IF NOT EXISTS `rc_system_role` (
  `id` varchar(36) NOT NULL COMMENT '主键id',
  `role_name` varchar(127) NOT NULL COMMENT '角色名',
  `sort` int(11) NOT NULL COMMENT '排序',
  `status` varchar(8) NOT NULL COMMENT '状态',
  `creater` varchar(127) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `editor` varchar(127) DEFAULT NULL COMMENT '创建人',
  `edit_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色信息';

-- 正在导出表  education_ssm.rc_system_role 的数据：~0 rows (大约)
DELETE FROM `rc_system_role`;
/*!40000 ALTER TABLE `rc_system_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `rc_system_role` ENABLE KEYS */;


-- 导出  表 education_ssm.rc_system_rolepvlg_ref 结构
CREATE TABLE IF NOT EXISTS `rc_system_rolepvlg_ref` (
  `role_id` varchar(36) NOT NULL COMMENT '角色id',
  `group_code` varchar(127) NOT NULL COMMENT '权限组编码',
  `privilege` varchar(127) NOT NULL COMMENT '权限',
  PRIMARY KEY (`role_id`,`group_code`,`privilege`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色与权限关联';

-- 正在导出表  education_ssm.rc_system_rolepvlg_ref 的数据：~0 rows (大约)
DELETE FROM `rc_system_rolepvlg_ref`;
/*!40000 ALTER TABLE `rc_system_rolepvlg_ref` DISABLE KEYS */;
/*!40000 ALTER TABLE `rc_system_rolepvlg_ref` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
