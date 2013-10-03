/*
SQLyog Community Edition- MySQL GUI v5.27
Host - 5.5.27 : Database - learninghibernate
*********************************************************************
Server version : 5.5.27
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

USE `learninghibernate`;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

/*Table structure for table `events` */

CREATE TABLE `events` (
  `event_id` int(5) NOT NULL,
  `event_date` datetime DEFAULT NULL,
  `title` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`event_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `events` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
