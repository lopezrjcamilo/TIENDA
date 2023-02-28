-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: tiendagenerica
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `cedula_cliente` bigint NOT NULL,
  `direccion_cliente` varchar(100) DEFAULT NULL,
  `email_cliente` varchar(50) NOT NULL,
  `nombre_cliente` varchar(50) NOT NULL,
  `telefono_cliente` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`cedula_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (121212,'calle 21 # 5-35','jsoe@gmail.com','Jose','3103521478'),(123456,'calle 3 # 3-23','vivi@gmail.com','viviana','3123842741'),(789456,'cra 15 # 23-33','juana@gmail.com','Juana','3213854741');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_ventas`
--

DROP TABLE IF EXISTS `detalle_ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle_ventas` (
  `codigo_detalle` int NOT NULL AUTO_INCREMENT,
  `cantidad_producto` int NOT NULL,
  `codigo_producto` int DEFAULT NULL,
  `codigo_venta` int DEFAULT NULL,
  `valor_venta` double DEFAULT NULL,
  `valor_iva` double DEFAULT NULL,
  `valor_total` double DEFAULT NULL,
  PRIMARY KEY (`codigo_detalle`),
  KEY `codigo_producto` (`codigo_producto`),
  KEY `codigo_venta` (`codigo_venta`),
  CONSTRAINT `detalle_ventas_ibfk_1` FOREIGN KEY (`codigo_producto`) REFERENCES `productos` (`codigo_producto`),
  CONSTRAINT `detalle_ventas_ibfk_2` FOREIGN KEY (`codigo_venta`) REFERENCES `ventas` (`codigo_venta`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_ventas`
--

LOCK TABLES `detalle_ventas` WRITE;
/*!40000 ALTER TABLE `detalle_ventas` DISABLE KEYS */;
INSERT INTO `detalle_ventas` VALUES (1,2,1,1,4000,400,4400),(2,1,2,1,1000,160,1160),(3,10,4,2,60000,6000,66000),(4,1,3,2,1000,160,1160),(5,2,2,2,3000,480,3480),(6,2,1,3,5000,500,5500),(7,1,4,3,6000,600,6600),(8,3,1,3,7500,750,8250),(9,2,1,4,1000,1000,1000),(10,2,2,4,1000,1000,1000),(11,2,3,4,1000,1000,1000);
/*!40000 ALTER TABLE `detalle_ventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `codigo_producto` int NOT NULL AUTO_INCREMENT,
  `iva_compra` double NOT NULL,
  `nit_proveedor` varchar(100) DEFAULT NULL,
  `nombre_producto` varchar(100) DEFAULT NULL,
  `precio_compra` double NOT NULL,
  `precio_venta` double NOT NULL,
  PRIMARY KEY (`codigo_producto`),
  KEY `nit_proveedor` (`nit_proveedor`),
  CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`nit_proveedor`) REFERENCES `proveedores` (`nit_proveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,10,'123456','Producto1',2000,2500),(2,19,'456789','Pintura unoA',1500,2000),(3,16,'123456','Producto3',500,1000),(4,10,'123456','Producto4',5000,6000),(5,16,'222222','Producto5',5000,6600),(6,19,'456789','Arbol de Navidad',100000,150000),(7,16,'456789','Luces Navideñas',80000,95000),(8,16,'456789','Adorno Navideño',45000,65000),(9,16,'123456','Soporte TV',150000,180000);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedores` (
  `nit_proveedor` varchar(100) NOT NULL,
  `ciudad_proveedor` varchar(50) DEFAULT NULL,
  `nombre_proveedor` varchar(100) DEFAULT NULL,
  `telefono_proveedor` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`nit_proveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores`
--

LOCK TABLES `proveedores` WRITE;
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
INSERT INTO `proveedores` VALUES ('123456','Bogota','Industrias el Rey','320154789'),('222222','Medellin','Distribuidora XYZ','312385214'),('456789','Cali','Productos la14','3123852698');
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `cedula_usuario` bigint NOT NULL,
  `email_usuario` varchar(50) NOT NULL,
  `nombre_usuario` varchar(50) NOT NULL,
  `password_usuario` varchar(20) DEFAULT NULL,
  `usuario` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cedula_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (101,'prueba@gmail.com','Prueba285','Prueba285','Prueba285'),(102,'prueba@gmail.com','Prueba285','Prueba285','Prueba285'),(103,'prueba@gmail.com','Prueba285','Prueba285','Prueba285'),(104,'prueba@gmail.com','Prueba285','Prueba285','Prueba285'),(105,'prueba@gmail.com','Prueba285','Prueba285','Prueba285'),(121212,'juan@gmail.com','Juan Celis','juan123','juancho'),(989898,'mauro@gmail.com','Mauricio Gomez','mauro123','mauro123'),(10284978,'mat@gmail.com','Mateo','127','mate123'),(11206366,'Juan','juan@gmail.com','159','juanpis'),(35353113,'Viviana','vivis@gmail','123','vivisfore15'),(98741523,'sandra@gmail.com','sandra','101','san123');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventas` (
  `codigo_venta` int NOT NULL AUTO_INCREMENT,
  `cedula_cliente` bigint DEFAULT NULL,
  `cedula_usuario` bigint DEFAULT NULL,
  `iva_venta` double DEFAULT NULL,
  `total_venta` double DEFAULT NULL,
  `valor_venta` double DEFAULT NULL,
  PRIMARY KEY (`codigo_venta`),
  KEY `FK_uno` (`cedula_cliente`),
  KEY `FK_dos` (`cedula_usuario`),
  CONSTRAINT `FK_dos` FOREIGN KEY (`cedula_usuario`) REFERENCES `usuarios` (`cedula_usuario`),
  CONSTRAINT `FK_uno` FOREIGN KEY (`cedula_cliente`) REFERENCES `clientes` (`cedula_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (1,121212,NULL,560,5560,5000),(2,123456,NULL,6640,68540,64000),(3,123456,NULL,1850,20350,18500),(4,121212,NULL,2000,22000,20000);
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-16 20:03:41
