-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-01-2021 a las 19:22:53
-- Versión del servidor: 10.4.16-MariaDB
-- Versión de PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `login_bd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `campos`
--

CREATE TABLE `campos` (
  `id` int(5) NOT NULL,
  `nc` varchar(20) NOT NULL,
  `ndc` varchar(20) NOT NULL,
  `ac` varchar(20) NOT NULL,
  `nomcre` varchar(20) NOT NULL,
  `catcaja` varchar(20) NOT NULL,
  `tipocre` varchar(20) NOT NULL,
  `tipocar` varchar(20) NOT NULL,
  `montomi` varchar(20) NOT NULL,
  `numcontra` varchar(20) NOT NULL,
  `montoauto` varchar(20) NOT NULL,
  `montoeje` varchar(20) NOT NULL,
  `catinv` varchar(20) NOT NULL,
  `stascon` varchar(20) NOT NULL,
  `catsta` varchar(20) NOT NULL,
  `montootor` varchar(20) NOT NULL,
  `carte` varchar(20) NOT NULL,
  `castiga` varchar(20) NOT NULL,
  `pequepro` varchar(20) NOT NULL,
  `ca1` varchar(20) NOT NULL,
  `ca2` varchar(20) NOT NULL,
  `ca3` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `campos`
--

INSERT INTO `campos` (`id`, `nc`, `ndc`, `ac`, `nomcre`, `catcaja`, `tipocre`, `tipocar`, `montomi`, `numcontra`, `montoauto`, `montoeje`, `catinv`, `stascon`, `catsta`, `montootor`, `carte`, `castiga`, `pequepro`, `ca1`, `ca2`, `ca3`) VALUES
(1, 'jose de jesus ', '12345', 'quimica', '123', '1231', 'REFACCIONARIO', 'BA', '123', '123', '123', '123', '123', 'B', '123', '123', '123', 'S(SI)', 'S(SI)', '20/01/2021', '20/01/2021', '20/01/2021'),
(2, 'maria carlota', '123456', 'contabilidad', '123', '1231', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '20/01/2021', '20/01/2021', '20/01/2021'),
(8, 'tulio', '4567', 'alquimia', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123123', '123', '123', '123', '123', '123', '20/01/2021', '20/01/2021', '20/01/2021'),
(11, 'corona', '890', 'asdkljsa', '12312', '123', '12312', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '20/01/2021', '20/01/2021', '20/01/2021'),
(12, 'uouoew', '1234444', 'asda', '1w3', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '20/01/2021', '20/01/2021', '20/01/2021'),
(13, 'gerardo', '456', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '20/01/2021', '20/01/2021', '20/01/2021'),
(14, 'jose de jesus', '456', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '123', '20/01/2021', '20/01/2021', '20/01/2021'),
(15, 'hector luis', '1234', 'fisica', '320700001560000013', '123', '123', '123', '123123', '123', '123', '123', '123', '123', '123', '12312', '123', '123', '123', '20/01/2021', '20/01/2021', '20/01/2021'),
(16, 'carlos alberto1', '1231', 'fiscal', '10909090', '1231', 'REFACCIONARIO', 'BA', '1231', '12312', '1231123', '1231', '1231', 'B', '1231123', '1231', 'TRADICIONAL', 'S(SI)', 'S(SI)', '21/01/2021', '21/01/2021', '21/01/2021'),
(17, 'raul santiago', '123', 'jojo', '000000001', 'fiscal', 'CREDITO SIMPLE', 'BA', '1231', '123', '123', '1231', '1231', 'B', '123', '123', 'TRADICIONAL', 'S(SI)', 'S(SI)', '21/01/2021', '21/01/2021', '21/01/2021'),
(25, 'corona', 'cliente', 'ased', '657', 'asda', 'PRENDARIO', 'AA', '1231', '1231', '1231', '1231', '1231', 'A', '123123', '1231', 'TRADICIONAL', 'S(SI)', 'N(NO)', '21/01/2021', '21/01/2021', '21/01/2021'),
(26, '123', '123', '123', '6661', '123', 'SIMPLE', 'AA', '123', '123', '123123', '123', '123', 'A', '123', '123', 'TRADICIONAL', 'N(NO)', 'N(NO)', '22/01/2021', '22/01/2021', '22/01/2021'),
(27, 'carol', '45', 'nose', '567777', '45', 'CUENTA CORRIENTE', 'BA', '4564', '456', '456', '456', '4564', 'B', '4564', '4564', 'TRADICIONAL', 'S(SI)', 'S(SI)', '22/01/2021', '22/01/2021', '22/01/2021');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `nombre` varchar(20) NOT NULL,
  `apellidos` varchar(20) NOT NULL,
  `puesto` varchar(20) NOT NULL,
  `correo` varchar(20) NOT NULL,
  `contraseña` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`nombre`, `apellidos`, `puesto`, `correo`, `contraseña`) VALUES
('jose', 'corona', 'finanzas', 'rey@hotmail.com', '1234');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `campos`
--
ALTER TABLE `campos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `campos`
--
ALTER TABLE `campos`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
