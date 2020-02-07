/*
SQLyog Professional v12.08 (64 bit)
MySQL - 5.6.44-log : Database - groovy
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`groovy` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `groovy`;

/*Table structure for table `groovy_content` */

DROP TABLE IF EXISTS `groovy_content`;

CREATE TABLE `groovy_content` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `groovy_content` mediumtext COMMENT '规则内容',
  `create_time` bigint(13) DEFAULT NULL COMMENT '创建时间',
  `use_time` bigint(13) DEFAULT NULL COMMENT '使用时间',
  `groovy_type` char(10) DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `groovy_content` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
