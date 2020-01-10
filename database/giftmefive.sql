CREATE DATABASE  IF NOT EXISTS `gift_me_five` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_bin */;
USE `gift_me_five`;
CREATE USER 'greg'@'localhost' IDENTIFIED BY 'Greg.321';
GRANT ALL PRIVILEGES ON gift_me_five.* TO 'greg'@'localhost';
-- MySQL dump 10.13  Distrib 5.7.28, for Linux (x86_64)
--
-- Host: localhost    Database: gift_me_five
-- ------------------------------------------------------
-- Server version	5.7.28-0ubuntu0.18.04.4

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `gift`
--

DROP TABLE IF EXISTS `gift`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gift` (
  `id_gift` int(11) NOT NULL AUTO_INCREMENT,
  `gift_name` varchar(80) COLLATE latin1_bin NOT NULL,
  `description` text COLLATE latin1_bin NOT NULL,
  `price` float DEFAULT NULL,
  `preference` int(11) NOT NULL,
  `url_image` text COLLATE latin1_bin,
  `url_website` text COLLATE latin1_bin,
  `id_list` int(11) NOT NULL,
  `id_friend` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_gift`),
  KEY `gift_list_FK` (`id_list`),
  KEY `gift_user0_FK` (`id_friend`),
  CONSTRAINT `gift_list_FK` FOREIGN KEY (`id_list`) REFERENCES `list` (`id_list`),
  CONSTRAINT `gift_user0_FK` FOREIGN KEY (`id_friend`) REFERENCES `user` (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1 COLLATE=latin1_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gift`
--

LOCK TABLES `gift` WRITE;
/*!40000 ALTER TABLE `gift` DISABLE KEYS */;
INSERT INTO `gift` VALUES (1,'Play-Doh Pate A Modeler Pizzeria, E4576EU4, Multicolour','TOUTES SORTES DE PIZZAS À IMAGINER : Les petits chefs s\'amusent à concocter une création après l\'autre avec cet ensemble à pizza Play-Doh pour les enfants à partir de 3 ans. Idéal pour un cadeau ou pour toute activité créative',15.18,3,'https://images-na.ssl-images-amazon.com/images/I/71zl2mb6F5L._SL1021_.jpg','https://www.amazon.fr/Play-Doh-Stamp-Pizza-E4576EU4-Multicolour/dp/B07KQRB2N8/ref=sr_1_1?pf_rd_i=14312518031&pf_rd_m=A1X6FK5RDHNB96&pf_rd_p=e188f974-9f87-4e73-941c-63ec850d480b&pf_rd_r=CN0HBVD651B3Y1QVC1YX&pf_rd_s=merchandised-search-8&pf_rd_t=101&qid=1572959896&refinements=p_n_age_range%3A304554031&s=toys&sr=1-1',1,NULL),(2,'Barbie Dreamtopia ','Barbie Dreamtopia poupée sirène lumière et danse aquatique à plonger dans l\'eau, avec mouvements de nageoire, jouet pour enfant, GFL82',19.8,3,'https://images-na.ssl-images-amazon.com/images/I/71xmRrC5cAL._SL1500_.jpg','https://www.amazon.fr/Barbie-Dreamtopia-aquatique-mouvements-GFL82/dp/B07GL9RGQK/ref=sr_1_4?pf_rd_i=14312518031&pf_rd_m=A1X6FK5RDHNB96&pf_rd_p=e188f974-9f87-4e73-941c-63ec850d480b&pf_rd_r=CN0HBVD651B3Y1QVC1YX&pf_rd_s=merchandised-search-8&pf_rd_t=101&qid=1572962426&refinements=p_n_age_range%3A304554031&s=toys&sr=1-4',1,NULL),(3,'Barbie Dreamtopia ','Barbie Dreamtopia poupée sirène lumière et danse aquatique à plonger dans l\'eau, avec mouvements de nageoire, jouet pour enfant, GFL82',19.8,3,'https://images-na.ssl-images-amazon.com/images/I/71xmRrC5cAL._SL1500_.jpg','https://www.amazon.fr/Barbie-Dreamtopia-aquatique-mouvements-GFL82/dp/B07GL9RGQK/ref=sr_1_4?pf_rd_i=14312518031&pf_rd_m=A1X6FK5RDHNB96&pf_rd_p=e188f974-9f87-4e73-941c-63ec850d480b&pf_rd_r=CN0HBVD651B3Y1QVC1YX&pf_rd_s=merchandised-search-8&pf_rd_t=101&qid=1572962426&refinements=p_n_age_range%3A304554031&s=toys&sr=1-4',1,NULL),(4,'Dujardin Jeux - Burger Quiz','Pour jouer, il vous faut : - Des gens (Vous, Famille, Amis ou d\'autres Gens que vous ne connaissez pas ça marche aussi). - Cette Boite de Jeu. ET C\'EST TOUT !',18.9,3,'https://images-na.ssl-images-amazon.com/images/I/71uty%2BS6S8L._SL1002_.jpg','https://www.amazon.fr/Dujardin-Jeux-soci%C3%A9t%C3%A9-Burger-01095/dp/B07DHYJ7V6/ref=sr_1_2?pf_rd_i=14312518031&pf_rd_m=A1X6FK5RDHNB96&pf_rd_p=e188f974-9f87-4e73-941c-63ec850d480b&pf_rd_r=CN0HBVD651B3Y1QVC1YX&pf_rd_s=merchandised-search-8&pf_rd_t=101&qid=1572963107&refinements=p_n_age_range%3A304558031&s=toys&sr=1-2',2,NULL),(5,'Goliath - Shit Happens - Jeu d\'ambiance','Comme on dit, dans la vie « Shit Happens ',14.9,3,'https://images-na.ssl-images-amazon.com/images/I/61ubiWlYOSL._SL1500_.jpg','https://www.amazon.fr/Goliath-Jeu-Cartes-Shit-Happens/dp/B06XDLXJDX/ref=sxbs_sxwds-stvp?pd_rd_i=B06XDLXJDX&pd_rd_r=b367b440-7679-41c2-b3ea-7599c510e54c&pd_rd_w=nZykg&pd_rd_wg=q45kr&pf_rd_i=14312518031&pf_rd_m=A1X6FK5RDHNB96&pf_rd_p=b5ee69d3-6381-4897-8a23-e5b0b965bfb9&pf_rd_r=SGRNTY8M7TG301CVNXEY&pf_rd_s=merchandised-search-8&pf_rd_t=101&qid=1572963248&refinements=p_n_age_range%3A304558031&s=toys',2,NULL),(6,'Homcom Moto électrique','MOTO ÉLECTRIQUE ENFANTS : Moto électrique chopper de police pour enfants à partir de 3 ans',66.8,3,'https://images-na.ssl-images-amazon.com/images/I/61ubiWlYOSL._SL1500_.jpg','https://www.amazon.fr/Homcom-%C3%A9lectrique-Enfants-Chopper-Lumineux/dp/B07ZJCK4TJ?ref_=Oct_NReleaseC_363713031_4&pf_rd_r=NYJYS7ZSETC4ZDD7YKEM&pf_rd_p=84f357c6-80b8-5ec2-a7ac-733fb674cc4c&pf_rd_s=merchandised-search-10&pf_rd_t=101&pf_rd_i=363713031&pf_rd_m=A1X6FK5RDHNB96',2,NULL);
/*!40000 ALTER TABLE `gift` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `list`
--

DROP TABLE IF EXISTS `list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `list` (
  `id_list` int(11) NOT NULL AUTO_INCREMENT,
  `list_name` varchar(255) COLLATE latin1_bin NOT NULL,
  `description` text COLLATE latin1_bin NOT NULL,
  `url_image` varchar(255) COLLATE latin1_bin DEFAULT NULL,
  `url_share` varchar(255) COLLATE latin1_bin NOT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`id_list`),
  KEY `list_user_FK` (`id_user`),
  CONSTRAINT `list_user_FK` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COLLATE=latin1_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `list`
--

LOCK TABLES `list` WRITE;
/*!40000 ALTER TABLE `list` DISABLE KEYS */;
INSERT INTO `list` VALUES (1,'Noel','Mes cadeaux de reve','http://via.placeholder.com/540x260','',1),(2,'Anniversaire','Mes super cadeaux pour mon Aniv','http://via.placeholder.com/540x260','',1);
/*!40000 ALTER TABLE `list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(80) COLLATE latin1_bin NOT NULL,
  `password` varchar(255) COLLATE latin1_bin NOT NULL,
  `email` varchar(255) COLLATE latin1_bin NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COLLATE=latin1_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Simone31','95bced95361e0af9a4131af4fb6b890b857c02c57008b76c82e4cce12ad889c2','simonedejean@gmail.com'),(2,'bastienwcs','39b16a67f41b402a6b6f2895a7afb55714796939e91b19d002a0066137d953c4','bastien@wildcodeschool.fr');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-09 14:25:38
