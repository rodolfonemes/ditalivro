-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: ditalivros
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `livros`
--

DROP TABLE IF EXISTS `livros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `livros` (
  `livro_isbn` decimal(60,0) NOT NULL,
  `livro_titulo` varchar(60) DEFAULT NULL,
  `livro_autor` varchar(60) DEFAULT NULL,
  `livro_editora` varchar(60) DEFAULT NULL,
  `livro_ano` decimal(6,0) DEFAULT NULL,
  `livro_tipo` varchar(9) DEFAULT NULL,
  `livro_estante` varchar(30) DEFAULT NULL,
  `livro_descricao` varchar(145) DEFAULT NULL,
  `livro_quantidade` decimal(3,0) DEFAULT NULL,
  `livro_VALOR` decimal(5,0) DEFAULT NULL,
  PRIMARY KEY (`livro_isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `livros`
--

LOCK TABLES `livros` WRITE;
/*!40000 ALTER TABLE `livros` DISABLE KEYS */;
INSERT INTO `livros` VALUES (1,'teste','rodolfo','szd',2018,'terror','terror','teste tetetetetetetete',5,15),(2,'22','2','2',2,'2','2','2',2,2),(3,'3a','3','3',3,'3','3','3',3,3),(4,'4','4','4',4,'4','4','4',4,4),(5,'','0','',0,'','','',0,0),(6,'','0','',0,'','','',0,0),(7,'','','',0,'','','',0,0),(8,'','','',0,'','','',0,0),(9,'','','',0,'','','',0,0),(10,'','0','',0,'','','',0,0),(11,'','','',0,'','','',0,0),(12,'','','',0,'','','',0,0),(13,'','','',0,'','','',0,0),(14,'','','',0,'','','',0,0),(15,'','','',0,'','','',0,0),(16,'','','',0,'','','',0,0),(17,'','','',0,'','','',0,0),(18,'','','',0,'','','',0,0),(19,'','','',0,'','','',0,0),(20,'','','',0,'','','',0,0);
/*!40000 ALTER TABLE `livros` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-03 14:48:06
