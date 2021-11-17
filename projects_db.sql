-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 17, 2021 at 08:18 AM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projects_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(10);

-- --------------------------------------------------------

--
-- Table structure for table `projects`
--

CREATE TABLE `projects` (
  `projectid` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `enddate` varchar(255) DEFAULT NULL,
  `owner` varchar(255) DEFAULT NULL,
  `startdate` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `projects`
--

INSERT INTO `projects` (`projectid`, `description`, `enddate`, `owner`, `startdate`, `status`, `title`) VALUES
(2, 'Neque porro quisquam est ', '2021-10-28T18:30:00.000Z', 'Sam', '2021-09-30T18:30:00.000Z', 'Inprogress', 'Project X12'),
(3, 'Neque porro quisquam est qui dolorem ipsum quia', '2021-10-22T18:30:00.000Z', 'Good and Evil', '2021-09-30T18:30:00.000Z', 'Research', 'Project XXX'),
(4, 'Neque porro quisquam est qui dolorem ipsum quia', '2021-10-22T18:30:00.000Z', 'Good and Evil', '2021-09-30T18:30:00.000Z', 'Inprogress', 'Project XXX'),
(5, 'Neque porro quisquam est qui dolorem ipsum quia', '2021/10/23', 'Good and Evil', '2021/10/01', 'Todo', 'Project XXX'),
(7, 'Testing', '2022-01-20T18:30:00.000Z', 'Sample', '2021-11-16T08:55:15.227Z', 'completed', 'Sample'),
(8, 'Neque porro quisquam est qui dolorem ipsum quia', '2021/10/23', 'Good and Evil', '2021/10/01', 'Todo', 'Project XXX'),
(9, 'Test', '2021-11-16T11:43:11.562Z', 'Admin', '2021-11-16T11:43:11.562Z', 'Review', 'PML 12');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `projects`
--
ALTER TABLE `projects`
  ADD PRIMARY KEY (`projectid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
