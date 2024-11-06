-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-11-2024 a las 19:34:06
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `almacen`
--
CREATE DATABASE IF NOT EXISTS `almacen` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `almacen`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id` int(5) NOT NULL,
  `identificacion` int(20) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id`, `identificacion`, `nombre`, `direccion`, `telefono`) VALUES
(42, 1103764613, 'Arianna Guzman Jaraba', 'calle 38a# 28 - 46', '3043258561'),
(44, 1102847598, 'Alvaro Guzman', 'calle 39 # 28-11', '3043258561'),
(45, 1102847598, 'Liz Cathry Jaraba Martinez', 'licajama74@gmail.com', '3014341901');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `idfactura` int(20) NOT NULL,
  `identificacion_cliente` int(50) NOT NULL,
  `nombre_cliente` varchar(50) DEFAULT NULL,
  `fecha_factura` varchar(20) DEFAULT NULL,
  `telefono_cliente` varchar(10) DEFAULT NULL,
  `direccion_cliente` varchar(50) DEFAULT NULL,
  `total_factura` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`idfactura`, `identificacion_cliente`, `nombre_cliente`, `fecha_factura`, `telefono_cliente`, `direccion_cliente`, `total_factura`) VALUES
(1, 1102847598, 'Alvaro  Javier  Guzman Martinez', '24/1/2024', '3043258561', 'alvaro@gmail.com', 2300),
(2, 1102847598, 'Alvaro  Javier  Guzman Martinez', '24/1/2024', '3043258561', 'alvaro@gmail.com', 6800),
(3, 1102847598, 'Alvaro  Javier  Guzman Martinez', '24/1/2024', '3043258561', 'alvaro@gmail.com', 2300),
(4, 1102847598, 'Alvaro  Javier  Guzman Martinez', '24/1/2024', '3043258561', 'alvaro@gmail.com', 2300),
(5, 1102847598, 'Alvaro  Javier  Guzman Martinez', '31/1/2024', '3043258561', 'alvaro@gmail.com', 6800),
(6, 1102847598, 'Alvaro  Javier  Guzman Martinez', '31/1/2024', '3043258561', 'alvaro@gmail.com', 6800),
(7, 1102847598, 'Alvaro  Javier  Guzman Martinez', '1/2/2024', '3043258561', 'alvaro@gmail.com', 2300),
(8, 1102847598, 'Alvaro Guzman', '24/6/2024', '3043258561', 'calle 39 # 28-11', 11500);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `idproducto` int(5) NOT NULL,
  `nombreproducto` varchar(20) NOT NULL,
  `precioproducto` double NOT NULL,
  `stockproducto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`idproducto`, `nombreproducto`, `precioproducto`, `stockproducto`) VALUES
(6, 'cafe de 500 gr', 4500, 49),
(8, 'avena 500 gr', 2300, 21);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(5) NOT NULL,
  `USUARIO` varchar(50) NOT NULL,
  `CONTRASEÑA` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `USUARIO`, `CONTRASEÑA`) VALUES
(1, 'ADMIN', '12345');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`idfactura`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`idproducto`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `idproducto` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
