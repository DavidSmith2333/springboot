/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.19 : Database - springbootweb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`springbootweb` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `springbootweb`;

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `id` int(11) NOT NULL,
  `dname` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `department` */

insert  into `department`(`id`,`dname`) values (101,'a'),(102,'b'),(103,'c'),(104,'d'),(105,'e');

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ename` varchar(50) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `did` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `employee` */

insert  into `employee`(`id`,`ename`,`email`,`gender`,`birthday`,`did`) values (13,'zhangsan','123456@qq.com',1,'2024-12-11 00:00:00',101),(14,'11','123456@qq.com',1,'2024-12-11 00:00:00',101);

/*Table structure for table `integratedanalytics` */

DROP TABLE IF EXISTS `integratedanalytics`;

CREATE TABLE `integratedanalytics` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `companyName` varchar(24) NOT NULL,
  `companyBluePrint` varchar(200) NOT NULL,
  `companyWelfare` varchar(100) NOT NULL,
  `companyRecentDecisions` varchar(100) NOT NULL,
  `companyAnnouncement` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

/*Data for the table `integratedanalytics` */

insert  into `integratedanalytics`(`id`,`companyName`,`companyBluePrint`,`companyWelfare`,`companyRecentDecisions`,`companyAnnouncement`) values (1,'抖音','2025年抢占短视频市场份额20%','三餐双休','抖音商城优化','元旦放假公告'),(2,'华为','盘古AI大模型','三餐餐补单休补助','加速智能汽车生产','元旦放假通知'),(4,'阿里巴巴','AI大模型','三餐双休','算法','元旦放假公告');

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orderName` varchar(50) NOT NULL,
  `orderPrice` float NOT NULL,
  `orderPayTime` datetime DEFAULT NULL,
  `orderUrl` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `order` */

insert  into `order`(`id`,`orderName`,`orderPrice`,`orderPayTime`,`orderUrl`) values (1,'日用品',1.99,'2024-12-11 00:00:00','products'),(3,'五金类',20,'2024-12-16 15:45:08','reports');

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `productName` varchar(20) NOT NULL,
  `productConcessionary` float NOT NULL,
  `productPrice` float NOT NULL,
  `productActualPayment` float NOT NULL,
  `dateOfManufacture` datetime DEFAULT NULL,
  `productINFO` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;

/*Data for the table `product` */

insert  into `product`(`id`,`productName`,`productConcessionary`,`productPrice`,`productActualPayment`,`dateOfManufacture`,`productINFO`) values (1,'绿豆糕',-2.99,19.99,17,'2024-12-11 18:19:17','美味好吃的绿豆糕打折促销'),(2,'螺丝刀',-3.99,22.99,19.99,'2024-12-11 18:19:20','合金螺丝刀'),(3,'螺丝刀',-1.99,19.99,18,'2024-12-11 18:19:22','螺丝刀'),(4,'白象大骨面',-1.99,19.99,18,'2024-12-12 20:38:00','白象无添加剂'),(6,'蛋糕',-1.99,19.99,18,'2024-12-12 20:38:00','美味蛋糕'),(7,'鸡蛋500g',-1.99,19.99,18,'2024-12-12 20:38:00','原始鸡蛋'),(8,'土豆1kg',-1.99,4.99,3,'2024-12-12 20:38:00','西伯利亚大土豆'),(9,'牙刷',-1.99,4.99,3,'2024-12-12 20:38:00','毛绒牙刷'),(10,'中华牙膏',-1.99,4.99,3,'2024-12-12 20:38:00','国产牙膏');

/*Table structure for table `report` */

DROP TABLE IF EXISTS `report`;

CREATE TABLE `report` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `reportType` varchar(24) NOT NULL,
  `reportTitle` varchar(24) NOT NULL,
  `reportDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `report` */

insert  into `report`(`id`,`reportType`,`reportTitle`,`reportDate`) values (1,'螺丝刀','9','2024-12-11 21:06:37'),(2,'改锥','8','2024-12-11 21:06:59'),(3,'五金器具','4','2024-12-11 00:00:00');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `pwd` varchar(30) DEFAULT NULL,
  `perms` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`pwd`,`perms`) values (1,'张三','631062568',NULL),(2,'李四','631062568',NULL),(3,'王五','631062568',NULL),(4,'小刘','631062568',NULL),(5,'xiaoliu','123456',NULL),(8,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
