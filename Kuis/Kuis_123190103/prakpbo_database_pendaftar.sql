-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 14, 2021 at 06:17 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.2.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `prakpbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `prakpbo_database_pendaftar`
--

CREATE TABLE `prakpbo_database_pendaftar` (
  `email` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `namal` varchar(100) NOT NULL,
  `ttl` varchar(10) NOT NULL,
  `jk` varchar(20) NOT NULL,
  `alamat` varchar(1000) NOT NULL,
  `deskripsi` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `prakpbo_database_pendaftar`
--

INSERT INTO `prakpbo_database_pendaftar` (`email`, `username`, `password`, `namal`, `ttl`, `jk`, `alamat`, `deskripsi`) VALUES
('rezaaa@mail.com', 'reza113', '[r, e, z, a, -, 1, 2]', 'reza', '1231', 'Laki-laki', 'sdc', 'dad');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
