-- MySQL dump 10.13  Distrib 8.0.27, for Linux (x86_64)
--
-- Host: localhost    Database: Its2020
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `popolazione_italiana_regione`
--

DROP TABLE IF EXISTS `popolazione_italiana_regione`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `popolazione_italiana_regione` (
  `id` int NOT NULL AUTO_INCREMENT,
  `regione` varchar(35) DEFAULT NULL,
  `comune` varchar(35) DEFAULT NULL,
  `maschi` varchar(9) DEFAULT NULL,
  `femmine` varchar(9) DEFAULT NULL,
  `totale` varchar(9) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8mb3;
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `popolazione_italiana_regione`
--

LOCK TABLES `popolazione_italiana_regione` WRITE;
/*!40000 ALTER TABLE `popolazione_italiana_regione` DISABLE KEYS */;
INSERT INTO `popolazione_italiana_regione` VALUES (2,'Piemonte','Torino','1089634','1162745','2252379'),(3,'Piemonte','Vercelli','82790','87506','170296'),(4,'Piemonte','Novara','179129','188911','368040'),(5,'Piemonte','Cuneo','289461','297107','586568'),(6,'Piemonte','Asti','104470','108746','213216'),(7,'Piemonte','Alessandria','203589','215448','419037'),(8,'Piemonte','Biella','83895','90489','174384'),(9,'Piemonte','Verbano-Cusio-Ossola','76346','81109','157455'),(10,'Valle d\'Aosta','Aosta','61325','64176','125501'),(11,'Liguria','Imperia','103277','110642','213919'),(12,'Liguria','Savona','131512','142671','274183'),(13,'Liguria','Genova','398202','437627','835829'),(14,'Liguria','La Spezia','106030','113166','219196'),(15,'Lombardia','Varese','434601','457931','892532'),(16,'Lombardia','Como','296745','307083','603828'),(17,'Lombardia','Sondrio','88923','92018','180941'),(18,'Lombardia','Milano','1592926','1687018','3279944'),(19,'Lombardia','Bergamo','553936','562448','1116384'),(20,'Lombardia','Brescia','626110','642345','1268455'),(21,'Lombardia','Pavia','267318','279197','546515'),(22,'Lombardia','Cremona','176743','181604','358347'),(23,'Lombardia','Mantova','202127','208935','411062'),(24,'Lombardia','Lecco','166269','170818','337087'),(25,'Lombardia','Lodi','113877','116730','230607'),(26,'Lombardia','Monza e della Brianza','430195','448072','878267'),(27,'Trentino Alto Adige','Bolzano','263258','268822','532080'),(28,'Trentino Alto Adige','Trento','266566','276173','542739'),(29,'Veneto','Verona','456445','473894','930339'),(30,'Veneto','Vicenza','425413','436950','862363'),(31,'Veneto','Belluno','98168','103804','201972'),(32,'Veneto','Treviso','437155','451154','888309'),(33,'Veneto','Venezia','413709','437954','851663'),(34,'Veneto','Padova','458805','480867','939672'),(35,'Veneto','Rovigo','113665','119721','233386'),(36,'Friuli-Venezia Giulia','Udine','255237','271019','526256'),(37,'Friuli-Venezia Giulia','Gorizia','68354','70852','139206'),(38,'Friuli-Venezia Giulia','Trieste','111954','121322','233276'),(39,'Friuli-Venezia Giulia','Pordenone','153670','158949','312619'),(40,'Emilia-Romagna','Piacenza','140793','146443','287236'),(41,'Emilia-Romagna','Parma','222062','231868','453930'),(42,'Emilia-Romagna','Reggio nell\'Emilia','261741','270010','531751'),(43,'Emilia-Romagna','Modena','346686','360606','707292'),(44,'Emilia-Romagna','Bologna','491179','526627','1017806'),(45,'Emilia-Romagna','Ferrara','166031','178809','344840'),(46,'Emilia-Romagna','Ravenna','189505','200129','389634'),(47,'Emilia-Romagna','Forlì-Cesena','192398','202435','394833'),(48,'Emilia-Romagna','Rimini','164204','175592','339796'),(49,'Toscana','Massa-Carrara','93826','100108','193934'),(50,'Toscana','Lucca','187769','200909','388678'),(51,'Toscana','Pistoia','141488','151571','293059'),(52,'Toscana','Firenze','481426','522872','1004298'),(53,'Toscana','Livorno','160720','172789','333509'),(54,'Toscana','Pisa','205646','216664','422310'),(55,'Toscana','Arezzo','166644','175122','341766'),(56,'Toscana','Siena','128140','138098','266238'),(57,'Toscana','Grosseto','106785','114000','220785'),(58,'Toscana','Prato','125835','132317','258152'),(59,'Umbria','Perugia','316722','338681','655403'),(60,'Umbria','Terni','107870','117012','224882'),(61,'Marche','Pesaro e Urbino','174470','182667','357137'),(62,'Marche','Ancona','227538','242212','469750'),(63,'Marche','Macerata','151692','160454','312146'),(64,'Marche','Ascoli Piceno','100056','106307','206363'),(65,'Marche','Fermo','84503','88501','173004'),(66,'Lazio','Viterbo','155028','161114','316142'),(67,'Lazio','Rieti','76311','77921','154232'),(68,'Lazio','Roma','2077238','2256036','4333274'),(69,'Lazio','Latina','285153','291502','576655'),(70,'Lazio','Frosinone','238594','246647','485241'),(71,'Abruzzo','L\'Aquila','146546','149945','296491'),(72,'Abruzzo','Teramo','150398','157014','307412'),(73,'Abruzzo','Pescara','153673','165005','318678'),(74,'Abruzzo','Chieti','186771','196418','383189'),(75,'Molise','Campobasso','107378','111301','218679'),(76,'Molise','Isernia','41386','42200','83586'),(77,'Campania','Caserta','451690','470481','922171'),(78,'Campania','Benevento','134259','139821','274080'),(79,'Campania','Napoli','1496544','1586361','3082905'),(80,'Campania','Avellino','203138','210788','413926'),(81,'Campania','Salerno','534924','557855','1092779'),(82,'Puglia','Foggia','302600','313710','616310'),(83,'Puglia','Bari','609372','639874','1249246'),(84,'Puglia','Taranto','277801','294971','572772'),(85,'Puglia','Brindisi','188777','201679','390456'),(86,'Puglia','Lecce','379797','411325','791122'),(87,'Puglia','Barletta-Andria-Trani','191909','196481','388390'),(88,'Potenza','Potenza','177478','183458','360936'),(89,'Matera','Matera','96463','99535','195998'),(90,'Calabria','Cosenza','342952','357433','700385'),(91,'Calabria','Catanzaro','172923','181928','354851'),(92,'Calabria','Reggio di Calabria','263851','277427','541278'),(93,'Calabria','Crotone','85037','85681','170718'),(94,'Calabria','Vibo Valentia','77881','79588','157469'),(95,'Sicilia','Trapani','210324','218053','428377'),(96,'Sicilia','Palermo','601106','642222','1243328'),(97,'Sicilia','Messina','299601','321120','620721'),(98,'Sicilia','Agrigento','208996','220615','429611'),(99,'Sicilia','Caltanissetta','126208','134571','260779'),(100,'Sicilia','Enna','78581','83787','162368'),(101,'Sicilia','Catania','536407','568567','1104974'),(102,'Sicilia','Ragusa','159416','161799','321215'),(103,'Sicilia','Siracusa','195594','201443','397037'),(104,'Sardegna','Sassari','241180','248454','489634'),(105,'Sardegna','Nuoro','101924','104919','206843'),(106,'Sardegna','Cagliari','208785','222129','430914'),(107,'Sardegna','Oristano','76854','79224','156078'),(108,'Sardegna','Sud Sardegna','172159','174846','347005');
/*!40000 ALTER TABLE `popolazione_italiana_regione` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-29 16:40:36
