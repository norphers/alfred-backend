-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-08-2020 a las 12:52:37
-- Versión del servidor: 10.4.13-MariaDB
-- Versión de PHP: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `alfreddb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `finance_accounts`
--

CREATE TABLE `finance_accounts` (
  `id` bigint(20) NOT NULL,
  `bank` varchar(255) DEFAULT NULL,
  `currency` int(11) DEFAULT NULL,
  `current_balance` int(11) NOT NULL,
  `iban` varchar(255) DEFAULT NULL,
  `initial_balance` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `finance_accounts`
--

INSERT INTO `finance_accounts` (`id`, `bank`, `currency`, `current_balance`, `iban`, `initial_balance`, `name`) VALUES
(1, 'bank 1', 0, 0, 'ES99 9999 9999 9999 9999 9999', 15000, 'demo 1'),
(2, 'bank 1', 0, 0, 'ES99 9999 9999 9999 9999 9000', 5000, 'demo 2'),
(3, 'bank 2', 0, 0, 'ES99 9999 9999 9999 9999 9009', 1000, 'demo 3');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `finance_accounts`
--
ALTER TABLE `finance_accounts`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `finance_accounts`
--
ALTER TABLE `finance_accounts`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
