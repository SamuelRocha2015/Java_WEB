/*
SQLyog Community v12.16 (64 bit)
MySQL - 5.6.21 : Database - agenda
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`agenda` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `agenda`;

/*Table structure for table `contato` */

DROP TABLE IF EXISTS `contato`;

CREATE TABLE `contato` (
  `contato_id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(70) DEFAULT NULL,
  `email` varchar(80) DEFAULT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  PRIMARY KEY (`contato_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

/*Data for the table `contato` */

insert  into `contato`(`contato_id`,`nome`,`email`,`endereco`,`data_nascimento`) values 
(1,'Roberto Carlos','roberto.carlos@gmail.com','R.Sete de Sembro, 48, Recife - PE.','1990-06-12'),
(2,'Ana Maria','ana.maria@yahoo.com.br','R. 16 de Agosto, 344, João Pessoa - PB.','1991-05-22'),
(3,'Joana Cecilia','joana.c@hotmail.com','Av. Conde Pereira Carneiro, 18 - Sucupira - Jaboat','1992-06-06'),
(4,'Samuel','samuelrodriguessr@hotmail.com','r. egito','1991-11-28'),
(5,'Antonio Carlos','antonio.carlos@gmail.com','R. Joao F. Vieira, 560.','1990-03-22'),
(6,'Karla','karla19@ig.com.br','R. 27 de MarÃ§o - SP.','1989-01-19'),
(7,'Karla','karla19@ig.com.br','R. 27 de MarÃ§o - SP.','1989-01-19'),
(8,'Joao Silva','joaos@gmail.com','R. Afranio Pessoa - RJ, RJ.','1992-03-22'),
(9,'Karla','karla19@ig.com.br','R. 27 de MarÃ§o - SP.','1989-01-19'),
(10,'Mario Jorge','marioj@gmail.com','Av. Con. Boa Vista - Recife','1994-11-24'),
(11,'Josefa','josefa2011@yahoo.com','R. 15 de Abril - Manaus - AM.','1980-01-04'),
(15,'Jose Santos','josesantos@gmail.com','R. D. Fonseca Filho','1994-03-10'),
(16,'Bryan Pedro','bryan_p@live.com','Quadra QI 5 ','1994-02-17'),
(17,'Yasmin Kamilly','yasmin85@ig.com.br','R. P. JoÃ£o Pessoa 110','1989-08-20'),
(18,'Saulo Candido','saulo.candido@ig.com.br','Av. Con. Boa Vista - Recife','1991-11-28');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
