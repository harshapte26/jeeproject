-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Sep 29, 2018 at 03:49 PM
-- Server version: 5.5.58
-- PHP Version: 7.0.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `testseries`
--

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

CREATE TABLE `question` (
  `id` int(11) NOT NULL,
  `subjectcode` varchar(255) NOT NULL,
  `topiccode` int(11) NOT NULL,
  `questionno` int(11) NOT NULL,
  `question` varchar(255) NOT NULL,
  `qimage` varchar(255) DEFAULT NULL,
  `op1` varchar(255) NOT NULL,
  `op2` varchar(255) NOT NULL,
  `op3` varchar(255) NOT NULL,
  `op4` varchar(255) NOT NULL,
  `optimage` varchar(255) DEFAULT NULL,
  `ca` varchar(255) NOT NULL,
  `solution` varchar(255) NOT NULL,
  `solimage` varchar(255) DEFAULT NULL,
  `checkq` int(11) NOT NULL DEFAULT '0',
  `qcolor` varchar(255) DEFAULT 'B'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `question`
--

INSERT INTO `question` (`id`, `subjectcode`, `topiccode`, `questionno`, `question`, `qimage`, `op1`, `op2`, `op3`, `op4`, `optimage`, `ca`, `solution`, `solimage`, `checkq`, `qcolor`) VALUES
(1, 'C', 2, 23, 'What is ch 20', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(2, 'C', 2, 21, 'What is ch 18', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(3, 'C', 2, 7, 'What is ch 4', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(4, 'C', 2, 26, 'What is ch 23', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(5, 'C', 2, 28, 'What is ch 25', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(6, 'C', 2, 9, 'What is ch 6', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(7, 'C', 2, 12, 'What is ch 9', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(8, 'C', 2, 2, 'Who discarded the theory of spontaneous generation forever? ', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(9, 'C', 2, 24, 'What is ch 21', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(10, 'C', 2, 10, 'What is ch 7', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(11, 'C', 2, 31, 'What is ch 28', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(12, 'C', 2, 11, 'What is ch 8', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(13, 'C', 2, 1, 'Which theory arguments that life on earth came from outer space?', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(14, 'C', 2, 15, 'What is ch 12', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(15, 'C', 2, 6, 'What is ch 3', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(16, 'C', 2, 22, 'What is ch 19', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(17, 'C', 2, 25, 'What is ch 22', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(18, 'C', 2, 5, 'What is ch 2', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(19, 'C', 2, 20, 'What is ch 17', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(20, 'C', 2, 27, 'What is ch 24', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(21, 'C', 2, 16, 'What is ch 13', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(22, 'C', 2, 8, 'What is ch 5', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(23, 'C', 2, 29, 'What is ch 26', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(24, 'C', 2, 19, 'What is ch 16', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(25, 'C', 2, 3, 'What is ch', 'NO', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(26, 'C', 2, 4, 'What is ch 1', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(27, 'C', 2, 14, 'What is ch 11', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(28, 'C', 2, 30, 'What is ch 27', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(29, 'C', 2, 32, 'What is ch 29', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(30, 'C', 2, 13, 'What is ch 10', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(31, 'C', 2, 17, 'What is ch 14', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(32, 'C', 2, 18, 'What is ch 15', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(33, 'M', 5, 19, 'math q 19', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(34, 'M', 5, 25, 'math q 25', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(35, 'M', 5, 17, 'math q 17', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(36, 'M', 5, 24, 'math q 24', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(37, 'M', 5, 11, 'math q 11', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(38, 'M', 5, 28, 'math q 28', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(39, 'M', 5, 3, 'math q 3', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(40, 'M', 5, 35, 'math q 35', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(41, 'M', 5, 4, 'math q 4', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(42, 'M', 5, 36, 'math q 36', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(43, 'M', 5, 16, 'math q 16', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(44, 'M', 5, 34, 'math q 34', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(45, 'M', 5, 32, 'math q 32', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(46, 'M', 5, 27, 'math q 27', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(47, 'M', 5, 21, 'math q 21', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(48, 'M', 5, 12, 'math q 12', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(49, 'M', 5, 29, 'math q 29', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(50, 'M', 5, 10, 'math q 10', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(51, 'M', 5, 13, 'math q 13', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(52, 'M', 5, 6, 'math q 6', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(53, 'M', 5, 8, 'math q 8', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(54, 'M', 5, 2, 'math q 2', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(55, 'M', 5, 20, 'math q 20', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(56, 'M', 5, 31, 'math q 31', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(57, 'M', 5, 18, 'math q 18', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(58, 'M', 5, 30, 'math q 30', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(59, 'M', 5, 22, 'math q 22', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(60, 'M', 5, 33, 'math q 33', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(61, 'M', 5, 1, 'math q 1', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(62, 'M', 5, 15, 'math q 15', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(63, 'M', 5, 23, 'math q 23', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(64, 'M', 5, 26, 'math q 26', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(65, 'M', 5, 14, 'math q 14', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(66, 'M', 5, 37, 'math q 37', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(67, 'M', 5, 7, 'math q 7', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(68, 'M', 5, 5, 'math q 5', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(69, 'M', 5, 9, 'math q 9', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(70, 'M', 13, 1, '1', 'M_13_1q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_1o.JPG', 'c', '', 'M_13_1s.JPG', 0, 'R'),
(71, 'M', 13, 2, '2', 'M_13_2q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_2o.JPG', 'b', '', 'M_13_2s.JPG', 0, 'R'),
(72, 'M', 13, 3, '3', 'M_13_3q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_3o.JPG', 'b', '', 'M_13_3s.JPG', 0, 'B'),
(73, 'M', 13, 4, '4', 'M_13_4q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_4o.JPG', 'b', '', 'M_13_4s.JPG', 0, 'B'),
(74, 'M', 13, 5, '5', 'M_13_5q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_5o.JPG', 'b', '', 'M_13_5s.JPG', 0, 'B'),
(75, 'M', 13, 6, '6', 'M_13_6q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_6o.JPG', 'a', '', 'M_13_6s.JPG', 0, 'B'),
(76, 'M', 13, 7, '7', 'M_13_7q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_7o.JPG', 'd', '', 'M_13_7s.JPG', 0, 'B'),
(77, 'M', 13, 8, '8', 'M_13_8q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_8o.JPG', 'a', '', 'M_13_8s.JPG', 0, 'B'),
(78, 'M', 13, 9, '9', 'M_13_9q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_9o.JPG', 'd', '', 'M_13_9s.JPG', 0, 'B'),
(79, 'M', 13, 10, '10', 'M_13_10q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_10o.JPG', 'b', '', 'M_13_10s.JPG', 0, 'B'),
(80, 'M', 13, 11, '11', 'M_13_11q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_11o.JPG', 'c', '', 'M_13_11s.JPG', 0, 'B'),
(81, 'M', 13, 12, '12', 'M_13_12q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_12o.JPG', 'd', '', 'M_13_12s.JPG', 0, 'B'),
(82, 'M', 13, 13, '13', 'M_13_13q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_13o.JPG', 'b', '', 'NULL', 0, 'B'),
(83, 'M', 13, 14, '14', 'M_13_14q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_14o.JPG', 'c', '', 'M_13_14s.JPG', 0, 'B'),
(84, 'M', 13, 15, '15', 'M_13_15q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_15o.JPG', 'a', '', 'M_13_15s.JPG', 0, 'B'),
(85, 'M', 13, 16, '1', 'M_13_16q.JPG', ' a', ' b', ' c ', ' d', 'M_13_16o.JPG', 'd', '', 'M_13_16s.JPG', 0, 'B'),
(86, 'M', 13, 17, '2', 'M_13_17q.JPG', ' a', ' b', ' c ', ' d', 'M_13_17o.JPG', 'c', '', 'NULL', 0, 'B'),
(87, 'M', 13, 18, '3', 'M_13_18q.JPG', ' a', ' b', ' c ', ' d', 'M_13_18o.JPG', 'b', '', 'NULL', 0, 'B'),
(88, 'M', 13, 19, '4', 'M_13_19q.JPG', ' a', ' b', ' c ', ' d', 'M_13_19o.JPG', 'a', '', 'M_13_19s.JPG', 0, 'B'),
(89, 'M', 13, 20, '5', 'M_13_20q.JPG', ' a', ' b', ' c ', ' d', 'M_13_20o.JPG', 'b', '', 'M_13_20s.JPG', 0, 'B'),
(90, 'M', 13, 21, '6', 'M_13_21q.JPG', ' a', ' b', ' c ', ' d', 'M_13_21o.JPG', 'd', '', 'NULL', 0, 'B'),
(91, 'M', 13, 22, '7', 'M_13_22q.JPG', ' a', ' b', ' c ', ' d', 'M_13_22o.JPG', 'd', '', 'M_13_22s.JPG', 0, 'B'),
(92, 'M', 13, 23, '8', 'M_13_23q.JPG', ' a', ' b', ' c ', ' d', 'M_13_23o.JPG', 'c', '', 'NULL', 0, 'B'),
(93, 'M', 13, 24, '9', 'M_13_24q.JPG', ' a', ' b', ' c ', ' d', 'M_13_24o.JPG', 'a', '', 'M_13_24s.JPG', 0, 'B'),
(94, 'M', 13, 25, '10', 'M_13_25q.JPG', ' a', ' b', ' c ', ' d', 'M_13_25o.JPG', 'c', '', 'NULL', 0, 'B'),
(95, 'M', 13, 26, '11', 'M_13_26q.JPG', ' a', ' b', ' c ', ' d', 'M_13_26o.JPG', 'a', '', 'NULL', 0, 'B'),
(96, 'M', 13, 27, '12', 'M_13_27q.JPG', ' a', ' b', ' c ', ' d', 'M_13_27o.JPG', 'd', '', 'M_13_27s.JPG', 0, 'B'),
(97, 'M', 13, 28, '13', 'M_13_28q.JPG', ' a', ' b', ' c ', ' d', 'M_13_28o.JPG', 'c', '', 'NULL', 0, 'B'),
(98, 'M', 13, 29, '14', 'M_13_29q.JPG', ' a', ' b', ' c ', ' d', 'M_13_29o.JPG', 'a', '', 'NULL', 0, 'B'),
(99, 'M', 13, 30, '15', 'M_13_30q.JPG', ' a', ' b', ' c ', ' d', 'M_13_30o.JPG', 'b', 'Rationalising', 'NULL', 0, 'B'),
(100, 'M', 13, 31, '16', 'M_13_31q.JPG', ' a', ' b', ' c ', ' d', 'M_13_31o.JPG', 'd', '', 'NULL', 0, 'B'),
(101, 'M', 13, 32, '17', 'M_13_32q.JPG', ' a', ' b', ' c ', ' d', 'M_13_32o.JPG', 'a', '', 'NULL', 0, 'B'),
(102, 'M', 13, 33, '18', 'M_13_33q.JPG', ' a', ' b', ' c ', ' d', 'M_13_33o.JPG', 'a', '', 'NULL', 0, 'B'),
(103, 'M', 13, 34, '19', 'M_13_34q.JPG', ' a', ' b', ' c ', ' d', 'M_13_34o.JPG', 'b', '', 'NULL', 0, 'B'),
(104, 'M', 13, 35, '20', 'M_13_35q.JPG', ' a', ' b', ' c ', ' d', 'M_13_35o.JPG', 'd', '', 'NULL', 0, 'B'),
(105, 'M', 13, 36, '21', 'M_13_36q.JPG', ' a', ' b', ' c ', ' d', 'M_13_36o.JPG', 'd', 'Use actual division', 'NULL', 0, 'B'),
(106, 'M', 13, 37, '22', 'M_13_37q.JPG', ' a', ' b', ' c ', ' d', 'M_13_37o.JPG', 'a', 'Directly introduce denominator to numerator', 'NULL', 0, 'B'),
(107, 'M', 13, 38, '23', 'M_13_38q.JPG', ' a', ' b', ' c ', ' d', 'M_13_38o.JPG', 'd', '', 'NULL', 0, 'B'),
(108, 'M', 13, 39, '24', 'M_13_39q.JPG', ' a', ' b', ' c ', ' d', 'M_13_39o.JPG', 'b', '', 'NULL', 0, 'B'),
(109, 'M', 13, 40, '25', 'M_13_40q.JPG', ' a', ' b', ' c ', ' d', 'M_13_40o.JPG', 'b', '', 'NULL', 0, 'B'),
(110, 'P', 1, 2, 'Which of the following disease is not transmitted through contaminated water?', 'NULL', ' Typhoid ', 'Diphtheria', 'Hepatitis A', 'Amoebiasis ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(112, 'P', 1, 5, 'Which of the following diseases is not caused by virus?', 'NULL', ' AIDS', 'Rabies ', 'Mumps', 'Tuberculosis ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(113, 'P', 1, 21, 'phy q 1', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(114, 'P', 1, 9, ' Infection of Ascaris occurs by', 'NULL', ' tse tse fly ', 'mosquito bite', 'imperfectly cooked pork ', ' contaminated food and water', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(115, 'P', 1, 10, 'Adenoma refers to cancer of', 'NULL', ' glands', 'blood ', 'muscles', 'lymph nodes ', 'NULL', 'B', 'pol', 'NULL', 0, 'B'),
(116, 'P', 1, 4, 'Mantoux test is for', 'NULL', ' scarlet fever', 'diphtheria ', 'rheumatoid fever ', 'tuberculosis ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(117, 'P', 1, 19, 'Common cold is not cured by antibiotics because it is', 'NULL', ' caused by a virus', 'caused by a Gram-positive bacterium ', 'caused by Gram-negative bacterium ', 'Not an infectious disease', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(118, 'P', 1, 16, 'The effect of alcohol on the CNS is as a', 'NULL', 'stimulant', 'promoter ', 'depressant ', 'transmitter ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(119, 'P', 1, 7, 'Which of the following diseases is not transmitted by houseflies?', 'NULL', ' Cholera', 'Typhoid', 'Dysentery', 'Yellow fever', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(120, 'P', 1, 22, 'phy q 2', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(121, 'P', 1, 6, 'Which of the following occurs only in humans?', 'NULL', 'Rabies', 'Malaria ', 'Anthrax ', ' Mumps', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(122, 'P', 1, 20, 'Minamata disease is caused by due to contamination of', 'NULL', 'fish with mercury', 'mustard oil with argemone oil', ' fish with DDT ', 'none of these', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(123, 'P', 1, 15, 'Which organ in the body is most affected by excessive intake of alcohol?', 'NULL', 'Liver ', 'Intestines', 'Lungs ', 'Spleen', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(124, 'P', 1, 3, 'BCG stands for', 'NULL', ' Bacterio-chemical gangrene ', 'Bacteria culture growth', 'Bacillus Calmette Gurein ', ' Bacterial cell genome ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(125, 'P', 1, 17, 'Ringworm in humans is caused by', 'NULL', 'Viruses', 'Bacteria ', 'Fungi', 'Nematodes ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(126, 'P', 1, 24, 'phy q 4', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(127, 'P', 1, 28, 'phy q 8', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(128, 'P', 1, 26, 'phy q 6', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(129, 'P', 1, 11, 'Blood cancer is called', 'NULL', ' thrombosis', 'leukaemia', 'haemolysis', 'haemophilia', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(130, 'P', 1, 13, ' Which of the following diseases is associated with smoking? ', 'NULL', ' Bronchitis', 'Emphysema ', 'Lung cancer ', 'All of these ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(132, 'P', 1, 18, 'Which one of the following statements is correct with respect to AIDS?', 'NULL', 'The causative HIV retrovirus enters helper T-lymphocytes thus reducing their numbers', 'The HIV can be transmitted through eating food together with an infected person', 'Drug addicts are least susceptible to HIV infection.', 'AIDS patients are being fully cured cent per cent with proper care and nutrition.', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(133, 'P', 1, 27, 'phy q 7', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(134, 'P', 1, 25, 'phy q 5', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(135, 'P', 1, 8, 'AIDS virus has', 'NULL', ' single stranded DNA ', 'single stranded RNA', 'double stranded DNA ', 'double stranded RNA ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(136, 'P', 1, 1, 'What is H20?', 'NULL', 'water', 'kerosene', 'phenopthalein', 'None of the above', 'P11a.jpg', 'A', 'H20 stands for water', 'P11s.jpg', 0, 'B'),
(137, 'P', 1, 12, 'The spread of cancerous cells to distant sites is termed ', 'NULL', ' metastasis ', 'metachrosis ', 'metagenesis ', 'metamorphosis', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(138, 'P', 1, 14, 'The substance that causes addiction to tobacco is', 'NULL', ' nicotine ', 'cocaine', 'caffeine', 'none of these', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(139, 'P', 1, 23, 'phy q 3', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B');

-- --------------------------------------------------------

--
-- Table structure for table `question_full`
--

CREATE TABLE `question_full` (
  `id` int(11) NOT NULL,
  `subjectcode` varchar(255) NOT NULL,
  `topiccode` int(11) NOT NULL,
  `questionno` int(11) NOT NULL,
  `question` varchar(255) NOT NULL,
  `qimage` varchar(255) DEFAULT NULL,
  `op1` varchar(255) NOT NULL,
  `op2` varchar(255) NOT NULL,
  `op3` varchar(255) NOT NULL,
  `op4` varchar(255) NOT NULL,
  `optimage` varchar(255) DEFAULT NULL,
  `ca` varchar(255) NOT NULL,
  `solution` varchar(255) NOT NULL,
  `solimage` varchar(255) DEFAULT NULL,
  `checkq` int(11) NOT NULL DEFAULT '0',
  `qcolor` varchar(255) DEFAULT 'B'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `question_full`
--

INSERT INTO `question_full` (`id`, `subjectcode`, `topiccode`, `questionno`, `question`, `qimage`, `op1`, `op2`, `op3`, `op4`, `optimage`, `ca`, `solution`, `solimage`, `checkq`, `qcolor`) VALUES
(1, 'C', 2, 23, 'What is ch 20', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(2, 'C', 2, 21, 'What is ch 18', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(3, 'C', 2, 7, 'What is ch 4', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(4, 'C', 2, 26, 'What is ch 23', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(5, 'C', 2, 28, 'What is ch 25', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(6, 'C', 2, 9, 'What is ch 6', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(7, 'C', 2, 12, 'What is ch 9', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(8, 'C', 2, 2, 'Who discarded the theory of spontaneous generation forever? ', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(9, 'C', 2, 24, 'What is ch 21', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(10, 'C', 2, 10, 'What is ch 7', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(11, 'C', 2, 31, 'What is ch 28', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(12, 'C', 2, 11, 'What is ch 8', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(13, 'C', 2, 1, 'Which theory arguments that life on earth came from outer space?', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(14, 'C', 2, 15, 'What is ch 12', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(15, 'C', 2, 6, 'What is ch 3', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(16, 'C', 2, 22, 'What is ch 19', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(17, 'C', 2, 25, 'What is ch 22', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(18, 'C', 2, 5, 'What is ch 2', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(19, 'C', 2, 20, 'What is ch 17', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(20, 'C', 2, 27, 'What is ch 24', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(21, 'C', 2, 16, 'What is ch 13', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(22, 'C', 2, 8, 'What is ch 5', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(23, 'C', 2, 29, 'What is ch 26', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(24, 'C', 2, 19, 'What is ch 16', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(25, 'C', 2, 3, 'What is ch', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(26, 'C', 2, 4, 'What is ch 1', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(27, 'C', 2, 14, 'What is ch 11', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(28, 'C', 2, 30, 'What is ch 27', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(29, 'C', 2, 32, 'What is ch 29', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(30, 'C', 2, 13, 'What is ch 10', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(31, 'C', 2, 17, 'What is ch 14', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(32, 'C', 2, 18, 'What is ch 15', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(33, 'M', 5, 19, 'math q 19', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(34, 'M', 5, 25, 'math q 25', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(35, 'M', 5, 17, 'math q 17', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(36, 'M', 5, 24, 'math q 24', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(37, 'M', 5, 11, 'math q 11', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(38, 'M', 5, 28, 'math q 28', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(39, 'M', 5, 3, 'math q 3', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(40, 'M', 5, 35, 'math q 35', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(41, 'M', 5, 4, 'math q 4', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(42, 'M', 5, 36, 'math q 36', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(43, 'M', 5, 16, 'math q 16', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(44, 'M', 5, 34, 'math q 34', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(45, 'M', 5, 32, 'math q 32', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(46, 'M', 5, 27, 'math q 27', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(47, 'M', 5, 21, 'math q 21', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(48, 'M', 5, 12, 'math q 12', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(49, 'M', 5, 29, 'math q 29', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(50, 'M', 5, 10, 'math q 10', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(51, 'M', 5, 13, 'math q 13', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(52, 'M', 5, 6, 'math q 6', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(53, 'M', 5, 8, 'math q 8', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(54, 'M', 5, 2, 'math q 2', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(55, 'M', 5, 20, 'math q 20', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(56, 'M', 5, 31, 'math q 31', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(57, 'M', 5, 18, 'math q 18', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(58, 'M', 5, 30, 'math q 30', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(59, 'M', 5, 22, 'math q 22', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(60, 'M', 5, 33, 'math q 33', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(61, 'M', 5, 1, 'math q 1', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(62, 'M', 5, 15, 'math q 15', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(63, 'M', 5, 23, 'math q 23', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(64, 'M', 5, 26, 'math q 26', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(65, 'M', 5, 14, 'math q 14', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(66, 'M', 5, 37, 'math q 37', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(67, 'M', 5, 7, 'math q 7', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(68, 'M', 5, 5, 'math q 5', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(69, 'M', 5, 9, 'math q 9', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(70, 'M', 13, 1, 'Refer Image Below', 'M_13_1q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_1o.JPG', 'c', '', 'M_13_1s.JPG', 0, 'B'),
(71, 'M', 13, 2, 'Refer Image Below', 'M_13_2q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_2o.JPG', 'b', '', 'M_13_2s.JPG', 0, 'B'),
(72, 'M', 13, 3, 'Refer Image Below', 'M_13_3q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_3o.JPG', 'b', '', 'M_13_3s.JPG', 0, 'B'),
(73, 'M', 13, 4, 'Refer Image Below', 'M_13_4q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_4o.JPG', 'b', '', 'M_13_4s.JPG', 0, 'B'),
(74, 'M', 13, 5, 'Refer Image Below', 'M_13_5q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_5o.JPG', 'b', '', 'M_13_5s.JPG', 0, 'B'),
(75, 'M', 13, 6, 'Refer Image Below', 'M_13_6q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_6o.JPG', 'a', '', 'M_13_6s.JPG', 0, 'B'),
(76, 'M', 13, 7, 'Refer Image Below', 'M_13_7q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_7o.JPG', 'd', '', 'M_13_7s.JPG', 0, 'B'),
(77, 'M', 13, 8, 'Refer Image Below', 'M_13_8q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_8o.JPG', 'a', '', 'M_13_8s.JPG', 0, 'B'),
(78, 'M', 13, 9, 'Refer Image Below', 'M_13_9q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_9o.JPG', 'd', '', 'M_13_9s.JPG', 0, 'B'),
(79, 'M', 13, 10, 'Refer Image Below', 'M_13_10q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_10o.JPG', 'b', '', 'M_13_10s.JPG', 0, 'B'),
(80, 'M', 13, 11, 'Refer Image Below', 'M_13_11q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_11o.JPG', 'c', '', 'M_13_11s.JPG', 0, 'B'),
(81, 'M', 13, 12, 'Refer Image Below', 'M_13_12q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_12o.JPG', 'd', '', 'M_13_12s.JPG', 0, 'B'),
(82, 'M', 13, 13, 'Refer Image Below', 'M_13_13q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_13o.JPG', 'b', '', 'NULL', 0, 'B'),
(83, 'M', 13, 14, 'Refer Image Below', 'M_13_14q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_14o.JPG', 'c', '', 'M_13_14s.JPG', 0, 'B'),
(84, 'M', 13, 15, 'Refer Image Below', 'M_13_15q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_15o.JPG', 'a', '', 'M_13_15s.JPG', 0, 'B'),
(85, 'M', 13, 16, 'Refer Image Below', 'M_13_16q.JPG', ' a', ' b', ' c ', ' d', 'M_13_16o.JPG', 'd', '', 'M_13_16s.JPG', 0, 'B'),
(86, 'M', 13, 17, 'Refer Image Below', 'M_13_17q.JPG', ' a', ' b', ' c ', ' d', 'M_13_17o.JPG', 'c', '', 'NULL', 0, 'B'),
(87, 'M', 13, 18, 'Refer Image Below', 'M_13_18q.JPG', ' a', ' b', ' c ', ' d', 'M_13_18o.JPG', 'b', '', 'NULL', 0, 'B'),
(88, 'M', 13, 19, 'Refer Image Below', 'M_13_19q.JPG', ' a', ' b', ' c ', ' d', 'M_13_19o.JPG', 'a', '', 'M_13_19s.JPG', 0, 'B'),
(89, 'M', 13, 20, 'Refer Image Below', 'M_13_20q.JPG', ' a', ' b', ' c ', ' d', 'M_13_20o.JPG', 'b', '', 'M_13_20s.JPG', 0, 'B'),
(90, 'M', 13, 21, 'Refer Image Below', 'M_13_21q.JPG', ' a', ' b', ' c ', ' d', 'M_13_21o.JPG', 'd', '', 'NULL', 0, 'B'),
(91, 'M', 13, 22, 'Refer Image Below', 'M_13_22q.JPG', ' a', ' b', ' c ', ' d', 'M_13_22o.JPG', 'd', '', 'M_13_22s.JPG', 0, 'B'),
(92, 'M', 13, 23, 'Refer Image Below', 'M_13_23q.JPG', ' a', ' b', ' c ', ' d', 'M_13_23o.JPG', 'c', '', 'NULL', 0, 'B'),
(93, 'M', 13, 24, 'Refer Image Below', 'M_13_24q.JPG', ' a', ' b', ' c ', ' d', 'M_13_24o.JPG', 'a', '', 'M_13_24s.JPG', 0, 'B'),
(94, 'M', 13, 25, 'Refer Image Below', 'M_13_25q.JPG', ' a', ' b', ' c ', ' d', 'M_13_25o.JPG', 'c', '', 'NULL', 0, 'B'),
(95, 'M', 13, 26, 'Refer Image Below', 'M_13_26q.JPG', ' a', ' b', ' c ', ' d', 'M_13_26o.JPG', 'a', '', 'NULL', 0, 'B'),
(96, 'M', 13, 27, 'Refer Image Below', 'M_13_27q.JPG', ' a', ' b', ' c ', ' d', 'M_13_27o.JPG', 'd', '', 'M_13_27s.JPG', 0, 'B'),
(97, 'M', 13, 28, 'Refer Image Below', 'M_13_28q.JPG', ' a', ' b', ' c ', ' d', 'M_13_28o.JPG', 'c', '', 'NULL', 0, 'B'),
(98, 'M', 13, 29, 'Refer Image Below', 'M_13_29q.JPG', ' a', ' b', ' c ', ' d', 'M_13_29o.JPG', 'a', '', 'NULL', 1, 'G'),
(99, 'M', 13, 30, 'Refer Image Below', 'M_13_30q.JPG', ' a', ' b', ' c ', ' d', 'M_13_30o.JPG', 'b', 'Rationalising', 'NULL', 0, 'B'),
(100, 'M', 13, 31, 'Refer Image Below', 'M_13_31q.JPG', ' a', ' b', ' c ', ' d', 'M_13_31o.JPG', 'd', '', 'NULL', 0, 'B'),
(101, 'M', 13, 32, 'Refer Image Below', 'M_13_32q.JPG', ' a', ' b', ' c ', ' d', 'M_13_32o.JPG', 'a', '', 'NULL', 0, 'B'),
(102, 'M', 13, 33, 'Refer Image Below', 'M_13_33q.JPG', ' a', ' b', ' c ', ' d', 'M_13_33o.JPG', 'a', '', 'NULL', 0, 'B'),
(103, 'M', 13, 34, 'Refer Image Below', 'M_13_34q.JPG', ' a', ' b', ' c ', ' d', 'M_13_34o.JPG', 'b', '', 'NULL', 0, 'B'),
(104, 'M', 13, 35, 'Refer Image Below', 'M_13_35q.JPG', ' a', ' b', ' c ', ' d', 'M_13_35o.JPG', 'd', '', 'NULL', 0, 'B'),
(105, 'M', 13, 36, 'Refer Image Below', 'M_13_36q.JPG', ' a', ' b', ' c ', ' d', 'M_13_36o.JPG', 'd', 'Use actual division', 'NULL', 0, 'B'),
(106, 'M', 13, 37, 'Refer Image Below', 'M_13_37q.JPG', ' a', ' b', ' c ', ' d', 'M_13_37o.JPG', 'a', 'Directly introduce denominator to numerator', 'NULL', 0, 'B'),
(107, 'M', 13, 38, 'Refer Image Below', 'M_13_38q.JPG', ' a', ' b', ' c ', ' d', 'M_13_38o.JPG', 'd', '', 'NULL', 0, 'B'),
(108, 'M', 13, 39, 'Refer Image Below', 'M_13_39q.JPG', ' a', ' b', ' c ', ' d', 'M_13_39o.JPG', 'b', '', 'NULL', 0, 'B'),
(109, 'M', 13, 40, 'Refer Image Below', 'M_13_40q.JPG', ' a', ' b', ' c ', ' d', 'M_13_40o.JPG', 'b', '', 'NULL', 0, 'B'),
(110, 'P', 1, 2, 'Which of the following disease is not transmitted through contaminated water?', 'NULL', ' Typhoid ', 'Diphtheria', 'Hepatitis A', 'Amoebiasis ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(112, 'P', 1, 5, 'Which of the following diseases is not caused by virus?', 'NULL', ' AIDS', 'Rabies ', 'Mumps', 'Tuberculosis ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(113, 'P', 1, 21, 'phy q 1', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(114, 'P', 1, 9, ' Infection of Ascaris occurs by', 'NULL', ' tse tse fly ', 'mosquito bite', 'imperfectly cooked pork ', ' contaminated food and water', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(115, 'P', 1, 10, 'Adenoma refers to cancer of', 'NULL', ' glands', 'blood ', 'muscles', 'lymph nodes ', 'NULL', 'B', 'pol', 'NULL', 0, 'B'),
(116, 'P', 1, 4, 'Mantoux test is for', 'NULL', ' scarlet fever', 'diphtheria ', 'rheumatoid fever ', 'tuberculosis ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(117, 'P', 1, 19, 'Common cold is not cured by antibiotics because it is', 'NULL', ' caused by a virus', 'caused by a Gram-positive bacterium ', 'caused by Gram-negative bacterium ', 'Not an infectious disease', 'NULL', 'A', 'pol', 'NULL', 1, 'G'),
(118, 'P', 1, 16, 'The effect of alcohol on the CNS is as a', 'NULL', 'stimulant', 'promoter ', 'depressant ', 'transmitter ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(119, 'P', 1, 7, 'Which of the following diseases is not transmitted by houseflies?', 'NULL', ' Cholera', 'Typhoid', 'Dysentery', 'Yellow fever', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(120, 'P', 1, 22, 'phy q 2', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(121, 'P', 1, 6, 'Which of the following occurs only in humans?', 'NULL', 'Rabies', 'Malaria ', 'Anthrax ', ' Mumps', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(122, 'P', 1, 20, 'Minamata disease is caused by due to contamination of', 'NULL', 'fish with mercury', 'mustard oil with argemone oil', ' fish with DDT ', 'none of these', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(123, 'P', 1, 15, 'Which organ in the body is most affected by excessive intake of alcohol?', 'NULL', 'Liver ', 'Intestines', 'Lungs ', 'Spleen', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(124, 'P', 1, 3, 'BCG stands for', 'NULL', ' Bacterio-chemical gangrene ', 'Bacteria culture growth', 'Bacillus Calmette Gurein ', ' Bacterial cell genome ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(125, 'P', 1, 17, 'Ringworm in humans is caused by', 'NULL', 'Viruses', 'Bacteria ', 'Fungi', 'Nematodes ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(126, 'P', 1, 24, 'phy q 4', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(127, 'P', 1, 28, 'phy q 8', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(128, 'P', 1, 26, 'phy q 6', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(129, 'P', 1, 11, 'Blood cancer is called', 'NULL', ' thrombosis', 'leukaemia', 'haemolysis', 'haemophilia', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(130, 'P', 1, 13, ' Which of the following diseases is associated with smoking? ', 'NULL', ' Bronchitis', 'Emphysema ', 'Lung cancer ', 'All of these ', 'NULL', 'A', 'pol', 'NULL', 1, 'G'),
(132, 'P', 1, 18, 'Which one of the following statements is correct with respect to AIDS?', 'NULL', 'The causative HIV retrovirus enters helper T-lymphocytes thus reducing their numbers', 'The HIV can be transmitted through eating food together with an infected person', 'Drug addicts are least susceptible to HIV infection.', 'AIDS patients are being fully cured cent per cent with proper care and nutrition.', 'NULL', 'A', 'pol', 'NULL', 1, 'G'),
(133, 'P', 1, 27, 'phy q 7', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 1, 'G'),
(134, 'P', 1, 25, 'phy q 5', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 1, 'G'),
(135, 'P', 1, 8, 'AIDS virus has', 'NULL', ' single stranded DNA ', 'single stranded RNA', 'double stranded DNA ', 'double stranded RNA ', 'NULL', 'A', 'pol', 'NULL', 1, 'G'),
(136, 'P', 1, 1, 'What is H20?', 'NULL', 'water', 'kerosene', 'phenopthalein', 'None of the above', 'P11a.jpg', 'A', 'H20 stands for water', 'P11s.jpg', 0, 'B'),
(137, 'P', 1, 12, 'The spread of cancerous cells to distant sites is termed ', 'NULL', ' metastasis ', 'metachrosis ', 'metagenesis ', 'metamorphosis', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(138, 'P', 1, 14, 'The substance that causes addiction to tobacco is', 'NULL', ' nicotine ', 'cocaine', 'caffeine', 'none of these', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(139, 'P', 1, 23, 'phy q 3', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B');

-- --------------------------------------------------------

--
-- Table structure for table `question_sub`
--

CREATE TABLE `question_sub` (
  `id` int(11) NOT NULL,
  `subjectcode` varchar(255) NOT NULL,
  `topiccode` int(11) NOT NULL,
  `questionno` int(11) NOT NULL,
  `question` varchar(255) NOT NULL,
  `qimage` varchar(255) DEFAULT NULL,
  `op1` varchar(255) NOT NULL,
  `op2` varchar(255) NOT NULL,
  `op3` varchar(255) NOT NULL,
  `op4` varchar(255) NOT NULL,
  `optimage` varchar(255) DEFAULT NULL,
  `ca` varchar(255) NOT NULL,
  `solution` varchar(255) NOT NULL,
  `solimage` varchar(255) DEFAULT NULL,
  `checkq` int(11) NOT NULL DEFAULT '0',
  `qcolor` varchar(255) DEFAULT 'B'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `question_sub`
--

INSERT INTO `question_sub` (`id`, `subjectcode`, `topiccode`, `questionno`, `question`, `qimage`, `op1`, `op2`, `op3`, `op4`, `optimage`, `ca`, `solution`, `solimage`, `checkq`, `qcolor`) VALUES
(1, 'C', 2, 23, 'What is ch 20', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(2, 'C', 2, 21, 'What is ch 18', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(3, 'C', 2, 7, 'What is ch 4', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(4, 'C', 2, 26, 'What is ch 23', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(5, 'C', 2, 28, 'What is ch 25', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(6, 'C', 2, 9, 'What is ch 6', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(7, 'C', 2, 12, 'What is ch 9', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(8, 'C', 2, 2, 'Who discarded the theory of spontaneous generation forever? ', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(9, 'C', 2, 24, 'What is ch 21', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(10, 'C', 2, 10, 'What is ch 7', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(11, 'C', 2, 31, 'What is ch 28', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(12, 'C', 2, 11, 'What is ch 8', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(13, 'C', 2, 1, 'Which theory arguments that life on earth came from outer space?', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(14, 'C', 2, 15, 'What is ch 12', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(15, 'C', 2, 6, 'What is ch 3', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(16, 'C', 2, 22, 'What is ch 19', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(17, 'C', 2, 25, 'What is ch 22', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(18, 'C', 2, 5, 'What is ch 2', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(19, 'C', 2, 20, 'What is ch 17', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(20, 'C', 2, 27, 'What is ch 24', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(21, 'C', 2, 16, 'What is ch 13', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(22, 'C', 2, 8, 'What is ch 5', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(23, 'C', 2, 29, 'What is ch 26', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(24, 'C', 2, 19, 'What is ch 16', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(25, 'C', 2, 3, 'What is ch', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(26, 'C', 2, 4, 'What is ch 1', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(27, 'C', 2, 14, 'What is ch 11', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(28, 'C', 2, 30, 'What is ch 27', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(29, 'C', 2, 32, 'What is ch 29', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(30, 'C', 2, 13, 'What is ch 10', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(31, 'C', 2, 17, 'What is ch 14', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(32, 'C', 2, 18, 'What is ch 15', 'NULL', 'ch', 'ch1', 'ch2', 'cg', 'NULL', 'A', 'sa', 'NULL', 0, 'B'),
(33, 'M', 5, 19, 'math q 19', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(34, 'M', 5, 25, 'math q 25', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(35, 'M', 5, 17, 'math q 17', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(36, 'M', 5, 24, 'math q 24', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(37, 'M', 5, 11, 'math q 11', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 1, 'G'),
(38, 'M', 5, 28, 'math q 28', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(39, 'M', 5, 3, 'math q 3', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(40, 'M', 5, 35, 'math q 35', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(41, 'M', 5, 4, 'math q 4', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(42, 'M', 5, 36, 'math q 36', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(43, 'M', 5, 16, 'math q 16', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 1, 'G'),
(44, 'M', 5, 34, 'math q 34', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 1, 'G'),
(45, 'M', 5, 32, 'math q 32', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(46, 'M', 5, 27, 'math q 27', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(47, 'M', 5, 21, 'math q 21', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(48, 'M', 5, 12, 'math q 12', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(49, 'M', 5, 29, 'math q 29', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(50, 'M', 5, 10, 'math q 10', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(51, 'M', 5, 13, 'math q 13', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 1, 'G'),
(52, 'M', 5, 6, 'math q 6', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(53, 'M', 5, 8, 'math q 8', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(54, 'M', 5, 2, 'math q 2', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(55, 'M', 5, 20, 'math q 20', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(56, 'M', 5, 31, 'math q 31', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(57, 'M', 5, 18, 'math q 18', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(58, 'M', 5, 30, 'math q 30', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(59, 'M', 5, 22, 'math q 22', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(60, 'M', 5, 33, 'math q 33', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(61, 'M', 5, 1, 'math q 1', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(62, 'M', 5, 15, 'math q 15', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(63, 'M', 5, 23, 'math q 23', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(64, 'M', 5, 26, 'math q 26', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(65, 'M', 5, 14, 'math q 14', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(66, 'M', 5, 37, 'math q 37', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(67, 'M', 5, 7, 'math q 7', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(68, 'M', 5, 5, 'math q 5', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(69, 'M', 5, 9, 'math q 9', 'NULL', 'm1', 'm2', 'm3', 'm4', 'NULL', 'A', 'maths', 'NULL', 0, 'B'),
(70, 'M', 13, 1, '1', 'M_13_1q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_1o.JPG', 'c', '', 'M_13_1s.JPG', 0, 'R'),
(71, 'M', 13, 2, '2', 'M_13_2q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_2o.JPG', 'b', '', 'M_13_2s.JPG', 0, 'R'),
(72, 'M', 13, 3, '3', 'M_13_3q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_3o.JPG', 'b', '', 'M_13_3s.JPG', 0, 'B'),
(73, 'M', 13, 4, '4', 'M_13_4q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_4o.JPG', 'b', '', 'M_13_4s.JPG', 0, 'B'),
(74, 'M', 13, 5, '5', 'M_13_5q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_5o.JPG', 'b', '', 'M_13_5s.JPG', 0, 'B'),
(75, 'M', 13, 6, '6', 'M_13_6q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_6o.JPG', 'a', '', 'M_13_6s.JPG', 0, 'B'),
(76, 'M', 13, 7, '7', 'M_13_7q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_7o.JPG', 'd', '', 'M_13_7s.JPG', 1, 'G'),
(77, 'M', 13, 8, '8', 'M_13_8q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_8o.JPG', 'a', '', 'M_13_8s.JPG', 0, 'B'),
(78, 'M', 13, 9, '9', 'M_13_9q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_9o.JPG', 'd', '', 'M_13_9s.JPG', 0, 'B'),
(79, 'M', 13, 10, '10', 'M_13_10q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_10o.JPG', 'b', '', 'M_13_10s.JPG', 0, 'B'),
(80, 'M', 13, 11, '11', 'M_13_11q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_11o.JPG', 'c', '', 'M_13_11s.JPG', 0, 'B'),
(81, 'M', 13, 12, '12', 'M_13_12q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_12o.JPG', 'd', '', 'M_13_12s.JPG', 0, 'B'),
(82, 'M', 13, 13, '13', 'M_13_13q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_13o.JPG', 'b', '', 'NULL', 0, 'B'),
(83, 'M', 13, 14, '14', 'M_13_14q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_14o.JPG', 'c', '', 'M_13_14s.JPG', 0, 'B'),
(84, 'M', 13, 15, '15', 'M_13_15q.JPG', ' a ', 'b', 'c ', 'd', 'M_13_15o.JPG', 'a', '', 'M_13_15s.JPG', 0, 'B'),
(85, 'M', 13, 16, '1', 'M_13_16q.JPG', ' a', ' b', ' c ', ' d', 'M_13_16o.JPG', 'd', '', 'M_13_16s.JPG', 0, 'B'),
(86, 'M', 13, 17, '2', 'M_13_17q.JPG', ' a', ' b', ' c ', ' d', 'M_13_17o.JPG', 'c', '', 'NULL', 0, 'B'),
(87, 'M', 13, 18, '3', 'M_13_18q.JPG', ' a', ' b', ' c ', ' d', 'M_13_18o.JPG', 'b', '', 'NULL', 0, 'B'),
(88, 'M', 13, 19, '4', 'M_13_19q.JPG', ' a', ' b', ' c ', ' d', 'M_13_19o.JPG', 'a', '', 'M_13_19s.JPG', 0, 'B'),
(89, 'M', 13, 20, '5', 'M_13_20q.JPG', ' a', ' b', ' c ', ' d', 'M_13_20o.JPG', 'b', '', 'M_13_20s.JPG', 0, 'B'),
(90, 'M', 13, 21, '6', 'M_13_21q.JPG', ' a', ' b', ' c ', ' d', 'M_13_21o.JPG', 'd', '', 'NULL', 0, 'B'),
(91, 'M', 13, 22, '7', 'M_13_22q.JPG', ' a', ' b', ' c ', ' d', 'M_13_22o.JPG', 'd', '', 'M_13_22s.JPG', 0, 'B'),
(92, 'M', 13, 23, '8', 'M_13_23q.JPG', ' a', ' b', ' c ', ' d', 'M_13_23o.JPG', 'c', '', 'NULL', 0, 'B'),
(93, 'M', 13, 24, '9', 'M_13_24q.JPG', ' a', ' b', ' c ', ' d', 'M_13_24o.JPG', 'a', '', 'M_13_24s.JPG', 0, 'B'),
(94, 'M', 13, 25, '10', 'M_13_25q.JPG', ' a', ' b', ' c ', ' d', 'M_13_25o.JPG', 'c', '', 'NULL', 0, 'B'),
(95, 'M', 13, 26, '11', 'M_13_26q.JPG', ' a', ' b', ' c ', ' d', 'M_13_26o.JPG', 'a', '', 'NULL', 0, 'B'),
(96, 'M', 13, 27, '12', 'M_13_27q.JPG', ' a', ' b', ' c ', ' d', 'M_13_27o.JPG', 'd', '', 'M_13_27s.JPG', 0, 'B'),
(97, 'M', 13, 28, '13', 'M_13_28q.JPG', ' a', ' b', ' c ', ' d', 'M_13_28o.JPG', 'c', '', 'NULL', 0, 'B'),
(98, 'M', 13, 29, '14', 'M_13_29q.JPG', ' a', ' b', ' c ', ' d', 'M_13_29o.JPG', 'a', '', 'NULL', 0, 'B'),
(99, 'M', 13, 30, '15', 'M_13_30q.JPG', ' a', ' b', ' c ', ' d', 'M_13_30o.JPG', 'b', 'Rationalising', 'NULL', 0, 'B'),
(100, 'M', 13, 31, '16', 'M_13_31q.JPG', ' a', ' b', ' c ', ' d', 'M_13_31o.JPG', 'd', '', 'NULL', 0, 'B'),
(101, 'M', 13, 32, '17', 'M_13_32q.JPG', ' a', ' b', ' c ', ' d', 'M_13_32o.JPG', 'a', '', 'NULL', 0, 'B'),
(102, 'M', 13, 33, '18', 'M_13_33q.JPG', ' a', ' b', ' c ', ' d', 'M_13_33o.JPG', 'a', '', 'NULL', 0, 'B'),
(103, 'M', 13, 34, '19', 'M_13_34q.JPG', ' a', ' b', ' c ', ' d', 'M_13_34o.JPG', 'b', '', 'NULL', 0, 'B'),
(104, 'M', 13, 35, '20', 'M_13_35q.JPG', ' a', ' b', ' c ', ' d', 'M_13_35o.JPG', 'd', '', 'NULL', 0, 'B'),
(105, 'M', 13, 36, '21', 'M_13_36q.JPG', ' a', ' b', ' c ', ' d', 'M_13_36o.JPG', 'd', 'Use actual division', 'NULL', 0, 'B'),
(106, 'M', 13, 37, '22', 'M_13_37q.JPG', ' a', ' b', ' c ', ' d', 'M_13_37o.JPG', 'a', 'Directly introduce denominator to numerator', 'NULL', 0, 'B'),
(107, 'M', 13, 38, '23', 'M_13_38q.JPG', ' a', ' b', ' c ', ' d', 'M_13_38o.JPG', 'd', '', 'NULL', 0, 'B'),
(108, 'M', 13, 39, '24', 'M_13_39q.JPG', ' a', ' b', ' c ', ' d', 'M_13_39o.JPG', 'b', '', 'NULL', 0, 'B'),
(109, 'M', 13, 40, '25', 'M_13_40q.JPG', ' a', ' b', ' c ', ' d', 'M_13_40o.JPG', 'b', '', 'NULL', 0, 'B'),
(110, 'P', 1, 2, 'Which of the following disease is not transmitted through contaminated water?', 'NULL', ' Typhoid ', 'Diphtheria', 'Hepatitis A', 'Amoebiasis ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(111, 'P', 1, 3, 'something1', 'NULL', '\\\\sqrt', 'pol', 'pol', 'pol', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(112, 'P', 1, 5, 'Which of the following diseases is not caused by virus?', 'NULL', ' AIDS', 'Rabies ', 'Mumps', 'Tuberculosis ', 'NULL', 'A', 'pol', 'NULL', 1, 'G'),
(113, 'P', 1, 21, 'phy q 1', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(114, 'P', 1, 9, ' Infection of Ascaris occurs by', 'NULL', ' tse tse fly ', 'mosquito bite', 'imperfectly cooked pork ', ' contaminated food and water', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(115, 'P', 1, 10, 'Adenoma refers to cancer of', 'NULL', ' glands', 'blood ', 'muscles', 'lymph nodes ', 'NULL', 'B', 'pol', 'NULL', 0, 'B'),
(116, 'P', 1, 4, 'Mantoux test is for', 'NULL', ' scarlet fever', 'diphtheria ', 'rheumatoid fever ', 'tuberculosis ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(117, 'P', 1, 19, 'Common cold is not cured by antibiotics because it is', 'NULL', ' caused by a virus', 'caused by a Gram-positive bacterium ', 'caused by Gram-negative bacterium ', 'Not an infectious disease', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(118, 'P', 1, 16, 'The effect of alcohol on the CNS is as a', 'NULL', 'stimulant', 'promoter ', 'depressant ', 'transmitter ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(119, 'P', 1, 7, 'Which of the following diseases is not transmitted by houseflies?', 'NULL', ' Cholera', 'Typhoid', 'Dysentery', 'Yellow fever', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(120, 'P', 1, 22, 'phy q 2', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(121, 'P', 1, 6, 'Which of the following occurs only in humans?', 'NULL', 'Rabies', 'Malaria ', 'Anthrax ', ' Mumps', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(122, 'P', 1, 20, 'Minamata disease is caused by due to contamination of', 'NULL', 'fish with mercury', 'mustard oil with argemone oil', ' fish with DDT ', 'none of these', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(123, 'P', 1, 15, 'Which organ in the body is most affected by excessive intake of alcohol?', 'NULL', 'Liver ', 'Intestines', 'Lungs ', 'Spleen', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(124, 'P', 1, 3, 'BCG stands for', 'NULL', ' Bacterio-chemical gangrene ', 'Bacteria culture growth', 'Bacillus Calmette Gurein ', ' Bacterial cell genome ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(125, 'P', 1, 17, 'Ringworm in humans is caused by', 'NULL', 'Viruses', 'Bacteria ', 'Fungi', 'Nematodes ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(126, 'P', 1, 24, 'phy q 4', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(127, 'P', 1, 28, 'phy q 8', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(128, 'P', 1, 26, 'phy q 6', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(129, 'P', 1, 11, 'Blood cancer is called', 'NULL', ' thrombosis', 'leukaemia', 'haemolysis', 'haemophilia', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(130, 'P', 1, 13, ' Which of the following diseases is associated with smoking? ', 'NULL', ' Bronchitis', 'Emphysema ', 'Lung cancer ', 'All of these ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(131, 'P', 1, 0, 'some', 'NULL', 'some', 'some', 'some', 'some', 'NULL', 'A', 'some', 'NULL', 0, 'B'),
(132, 'P', 1, 18, 'Which one of the following statements is correct with respect to AIDS?', 'NULL', 'The causative HIV retrovirus enters helper T-lymphocytes thus reducing their numbers', 'The HIV can be transmitted through eating food together with an infected person', 'Drug addicts are least susceptible to HIV infection.', 'AIDS patients are being fully cured cent per cent with proper care and nutrition.', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(133, 'P', 1, 27, 'phy q 7', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(134, 'P', 1, 25, 'phy q 5', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(135, 'P', 1, 8, 'AIDS virus has', 'NULL', ' single stranded DNA ', 'single stranded RNA', 'double stranded DNA ', 'double stranded RNA ', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(136, 'P', 1, 1, 'What is H20?', 'P11.png', 'water', 'kerosene', 'phenopthalein', 'None of the above', 'P11a.jpg', 'A', 'H20 stands for water', 'P11s.jpg', 0, 'B'),
(137, 'P', 1, 12, 'The spread of cancerous cells to distant sites is termed ', 'NULL', ' metastasis ', 'metachrosis ', 'metagenesis ', 'metamorphosis', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(138, 'P', 1, 14, 'The substance that causes addiction to tobacco is', 'NULL', ' nicotine ', 'cocaine', 'caffeine', 'none of these', 'NULL', 'A', 'pol', 'NULL', 0, 'B'),
(139, 'P', 1, 23, 'phy q 3', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B');

-- --------------------------------------------------------

--
-- Table structure for table `report_table`
--

CREATE TABLE `report_table` (
  `id` int(255) NOT NULL,
  `file_name` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `time` varchar(255) NOT NULL,
  `test_type` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `report_table`
--

INSERT INTO `report_table` (`id`, `file_name`, `date`, `time`, `test_type`) VALUES
(2, '29-09-2018 175702.pdf', '29-09-2018', '17:57:02', 1),
(3, '29-09-2018 175927.pdf', '29-09-2018', '17:59:27', 1),
(4, 'blank.pdf', '0', '0', 2),
(5, 'blank.pdf', '0', '0', 1),
(6, '29-09-2018 193814.pdf', '29-09-2018', '19:38:14', 1),
(7, '29-09-2018 211333.pdf', '29-09-2018', '21:13:33', 2),
(8, '29-09-2018 211504.pdf', '29-09-2018', '21:15:04', 2),
(9, '29-09-2018 211622.pdf', '29-09-2018', '21:16:22', 2);

-- --------------------------------------------------------

--
-- Table structure for table `temp_tbl`
--

CREATE TABLE `temp_tbl` (
  `subjectcode` varchar(255) NOT NULL,
  `topiccode` int(11) NOT NULL,
  `questionno` int(11) NOT NULL,
  `question` varchar(255) NOT NULL,
  `qimage` varchar(255) DEFAULT NULL,
  `op1` varchar(255) NOT NULL,
  `op2` varchar(255) NOT NULL,
  `op3` varchar(255) NOT NULL,
  `op4` varchar(255) NOT NULL,
  `optimage` varchar(255) DEFAULT NULL,
  `ca` varchar(255) NOT NULL,
  `solution` varchar(255) NOT NULL,
  `solimage` varchar(255) DEFAULT NULL,
  `checkq` int(11) NOT NULL DEFAULT '0',
  `qcolor` varchar(255) DEFAULT 'B',
  `id` int(11) NOT NULL,
  `chkans` varchar(10) DEFAULT NULL,
  `marks` decimal(1,0) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `temp_tbl`
--

INSERT INTO `temp_tbl` (`subjectcode`, `topiccode`, `questionno`, `question`, `qimage`, `op1`, `op2`, `op3`, `op4`, `optimage`, `ca`, `solution`, `solimage`, `checkq`, `qcolor`, `id`, `chkans`, `marks`) VALUES
('P', 1, 5, 'Which of the following diseases is not caused by virus?', 'NULL', ' AIDS', 'Rabies ', 'Mumps', 'Tuberculosis ', 'NULL', 'A', 'pol', 'NULL', 1, 'G', 1, 'A', '4'),
('P', 1, 27, 'phy q 7', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 2, NULL, '0'),
('P', 1, 21, 'phy q 1', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 3, NULL, '0'),
('P', 1, 1, 'What is H20?', 'P11.png', 'water', 'kerosene', 'phenopthalein', 'None of the above', 'P11a.jpg', 'A', 'H20 stands for water', 'P11s.jpg', 0, 'B', 4, NULL, '0'),
('P', 1, 9, ' Infection of Ascaris occurs by', 'NULL', ' tse tse fly ', 'mosquito bite', 'imperfectly cooked pork ', ' contaminated food and water', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 5, NULL, '0'),
('P', 1, 12, 'The spread of cancerous cells to distant sites is termed ', 'NULL', ' metastasis ', 'metachrosis ', 'metagenesis ', 'metamorphosis', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 6, NULL, '0'),
('P', 1, 0, 'some', 'NULL', 'some', 'some', 'some', 'some', 'NULL', 'A', 'some', 'NULL', 0, 'B', 7, NULL, '0'),
('P', 1, 14, 'The substance that causes addiction to tobacco is', 'NULL', ' nicotine ', 'cocaine', 'caffeine', 'none of these', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 8, NULL, '0'),
('P', 1, 2, 'Which of the following disease is not transmitted through contaminated water?', 'NULL', ' Typhoid ', 'Diphtheria', 'Hepatitis A', 'Amoebiasis ', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 9, NULL, '0'),
('P', 1, 17, 'Ringworm in humans is caused by', 'NULL', 'Viruses', 'Bacteria ', 'Fungi', 'Nematodes ', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 10, NULL, '0'),
('P', 1, 15, 'Which organ in the body is most affected by excessive intake of alcohol?', 'NULL', 'Liver ', 'Intestines', 'Lungs ', 'Spleen', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 11, NULL, '0'),
('P', 1, 28, 'phy q 8', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 12, NULL, '0'),
('P', 1, 6, 'Which of the following occurs only in humans?', 'NULL', 'Rabies', 'Malaria ', 'Anthrax ', ' Mumps', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 13, NULL, '0'),
('P', 1, 19, 'Common cold is not cured by antibiotics because it is', 'NULL', ' caused by a virus', 'caused by a Gram-positive bacterium ', 'caused by Gram-negative bacterium ', 'Not an infectious disease', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 14, NULL, '0'),
('P', 1, 24, 'phy q 4', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 15, NULL, '0'),
('P', 1, 3, 'BCG stands for', 'NULL', ' Bacterio-chemical gangrene ', 'Bacteria culture growth', 'Bacillus Calmette Gurein ', ' Bacterial cell genome ', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 16, NULL, '0'),
('P', 1, 20, 'Minamata disease is caused by due to contamination of', 'NULL', 'fish with mercury', 'mustard oil with argemone oil', ' fish with DDT ', 'none of these', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 17, NULL, '0'),
('P', 1, 4, 'Mantoux test is for', 'NULL', ' scarlet fever', 'diphtheria ', 'rheumatoid fever ', 'tuberculosis ', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 18, NULL, '0'),
('P', 1, 22, 'phy q 2', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 19, NULL, '0'),
('P', 1, 13, ' Which of the following diseases is associated with smoking? ', 'NULL', ' Bronchitis', 'Emphysema ', 'Lung cancer ', 'All of these ', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 20, NULL, '0'),
('P', 1, 3, 'something1', 'NULL', '\\\\sqrt', 'pol', 'pol', 'pol', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 21, NULL, '0'),
('P', 1, 8, 'AIDS virus has', 'NULL', ' single stranded DNA ', 'single stranded RNA', 'double stranded DNA ', 'double stranded RNA ', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 22, NULL, '0'),
('P', 1, 26, 'phy q 6', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 23, NULL, '0'),
('P', 1, 25, 'phy q 5', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 24, NULL, '0'),
('P', 1, 18, 'Which one of the following statements is correct with respect to AIDS?', 'NULL', 'The causative HIV retrovirus enters helper T-lymphocytes thus reducing their numbers', 'The HIV can be transmitted through eating food together with an infected person', 'Drug addicts are least susceptible to HIV infection.', 'AIDS patients are being fully cured cent per cent with proper care and nutrition.', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 25, NULL, '0'),
('P', 1, 10, 'Adenoma refers to cancer of', 'NULL', ' glands', 'blood ', 'muscles', 'lymph nodes ', 'NULL', 'B', 'pol', 'NULL', 0, 'B', 26, NULL, '0'),
('P', 1, 7, 'Which of the following diseases is not transmitted by houseflies?', 'NULL', ' Cholera', 'Typhoid', 'Dysentery', 'Yellow fever', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 27, NULL, '0'),
('P', 1, 16, 'The effect of alcohol on the CNS is as a', 'NULL', 'stimulant', 'promoter ', 'depressant ', 'transmitter ', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 28, NULL, '0'),
('P', 1, 11, 'Blood cancer is called', 'NULL', ' thrombosis', 'leukaemia', 'haemolysis', 'haemophilia', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 29, NULL, '0'),
('P', 1, 23, 'phy q 3', 'NULL', 'p 1 ', 'p2 ', 'p3', 'p4', 'NULL', 'A', 'pol', 'NULL', 0, 'B', 30, NULL, '0');

-- --------------------------------------------------------

--
-- Table structure for table `topiclist`
--

CREATE TABLE `topiclist` (
  `id` int(6) UNSIGNED NOT NULL,
  `subjectcode` varchar(5) NOT NULL DEFAULT 'P',
  `topiccode` int(5) NOT NULL DEFAULT '0',
  `topicnm` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `topiclist`
--

INSERT INTO `topiclist` (`id`, `subjectcode`, `topiccode`, `topicnm`) VALUES
(1, 'M', 1, 'Mathematical Logic'),
(2, 'M', 2, 'Matrices'),
(3, 'M', 3, 'Trignometric Functions 12th'),
(4, 'M', 4, 'Pair of Straight Lines'),
(5, 'M', 5, 'Vectors 12th'),
(6, 'M', 6, 'Three Dimentional Geometry'),
(7, 'M', 7, 'Line'),
(8, 'M', 8, 'Plane'),
(9, 'M', 9, 'Linear Programming'),
(10, 'M', 10, 'Continuity'),
(11, 'M', 11, 'Differentiation'),
(12, 'M', 12, 'Applications of Derivative'),
(13, 'M', 13, 'Integration'),
(14, 'M', 14, 'Definite Integral'),
(15, 'M', 15, 'Appications of Definite Integral'),
(16, 'M', 16, 'Differential Equations'),
(17, 'M', 17, 'Probablity Distribution'),
(18, 'M', 18, 'Binomial Distribution'),
(19, 'M', 19, 'Angle and Its Measurement 11th'),
(20, 'M', 20, 'Trignometric Functions 11th'),
(21, 'M', 21, 'Trignometric Functions of Compound Angles 11th'),
(22, 'M', 22, 'Factorization Formulae 11th'),
(23, 'M', 23, 'Locus 11th'),
(24, 'M', 24, 'Straight Line 11th'),
(25, 'M', 25, 'Circle and Conics 11th'),
(26, 'M', 26, 'Vectors 11th '),
(27, 'M', 27, 'Liner Inequations 11th'),
(28, 'M', 28, 'Determinants 11th'),
(29, 'M', 29, 'Matrices 11th'),
(30, 'M', 30, 'Sets, Relations and Functions 11th'),
(31, 'M', 31, 'Logarithms 11th'),
(32, 'M', 32, 'Complex Numbers 11th'),
(33, 'M', 33, 'Sequences and Series 11th'),
(34, 'M', 34, 'Permutations and Combinations 11th'),
(35, 'M', 35, 'Method of Induction and Binomial Theorem 11th'),
(36, 'M', 36, 'Limits 11th'),
(37, 'M', 37, 'Differentiation 11th'),
(38, 'M', 38, 'Integration 11th'),
(39, 'M', 39, 'Statistics 11th'),
(40, 'M', 40, 'Probablity  11th'),
(41, 'P', 1, 'Circular Motion'),
(42, 'P', 2, 'Gravitation'),
(43, 'P', 3, 'Rotational Motion'),
(44, 'P', 4, 'Oscillations'),
(45, 'P', 5, 'Elasticity'),
(46, 'P', 6, 'Surface Tension'),
(47, 'P', 7, 'Wave Motion'),
(48, 'P', 8, 'Stationary Waves'),
(49, 'P', 9, 'Kinetic Theory of Gases and Radiation'),
(50, 'P', 10, 'Wave Theory of Light'),
(51, 'P', 11, 'Interference and Diffraction'),
(52, 'P', 12, 'Electrostatics 12th'),
(53, 'P', 13, 'Current Electricity 12th'),
(54, 'P', 14, 'Magnetic effect of Electric Current 12th '),
(55, 'P', 15, 'Magnetism 12th'),
(56, 'P', 16, 'Electromagnetic Inductions'),
(57, 'P', 17, 'Electrons and photons'),
(58, 'P', 18, 'Atoms, Molecules and Nuclei'),
(59, 'P', 19, 'Semiconductors'),
(60, 'P', 20, 'Communication Systems'),
(61, 'P', 21, 'Measurements '),
(62, 'P', 22, 'Scalars and Vectors '),
(63, 'P', 23, 'Projectile Motion'),
(64, 'P', 24, 'Force'),
(65, 'P', 25, 'Friction in Solids and Liquids'),
(66, 'P', 26, 'Sound Waves'),
(67, 'P', 27, 'Thermal Expansion'),
(68, 'P', 28, 'Refraction of Light'),
(69, 'P', 29, 'Ray Optics'),
(70, 'P', 30, 'Electrostatics 11th'),
(71, 'P', 31, 'Current Electricity 11th'),
(72, 'P', 32, 'Magnetic effect of Electric Current 11th'),
(73, 'P', 33, 'Magnetism 11th'),
(74, 'P', 34, 'Electromagnetic Waves'),
(75, 'C', 1, 'Solid State'),
(76, 'C', 2, 'Solution and Colligative Properties'),
(77, 'C', 3, 'Chemical Thermodynamics and Energetics'),
(78, 'C', 4, 'Electrochemistry'),
(79, 'C', 5, 'Chemical Kinetics'),
(80, 'C', 6, 'General Principles and Process of Isolation of elements'),
(81, 'C', 7, 'p-Block elements 12th'),
(82, 'C', 8, 'd and f - Block elements'),
(83, 'C', 9, 'Co-ordination compounds'),
(84, 'C', 10, 'Halogen derivatives of alkanes and arenes'),
(85, 'C', 11, 'Alcohols, phenols and ethers'),
(86, 'C', 12, 'Aldehydes, ketones and carboxylic acids'),
(87, 'C', 13, 'Compounds containing nitrogen'),
(88, 'C', 14, 'Biomolecules'),
(89, 'C', 15, 'Polymers'),
(90, 'C', 16, 'Chemistry in everyday Life'),
(91, 'C', 17, 'Some basic concept of Chemistry'),
(92, 'C', 18, 'State of matter (Gases and Liquids)'),
(93, 'C', 19, 'Structure of Atom'),
(94, 'C', 20, 'Perodic Table'),
(95, 'C', 21, 'Redox Reactions'),
(96, 'C', 22, 'Chemical Equilibrium'),
(97, 'C', 23, 'Surface Chemistry'),
(98, 'C', 24, 'Nature of Chemical Bond'),
(99, 'C', 25, 'Hydrogen'),
(100, 'C', 26, 's- Block Elements'),
(101, 'C', 27, 'p- Block Elements (Group 13 and 14) 11th '),
(102, 'C', 28, 'Basic Principles and Techniques in Organic Chemistry'),
(103, 'C', 29, 'Alkanes'),
(104, 'C', 30, 'Alkenes'),
(105, 'C', 31, 'Alkynes'),
(106, 'C', 32, 'Aromatic Compounds'),
(107, 'C', 33, 'Environmental Chemistry'),
(108, 'B', 1, 'Genetic Basis of Inheritance'),
(109, 'B', 2, 'Gene : Its nature,expression and regulation'),
(110, 'B', 3, 'Biotechnology : Process and Application'),
(111, 'B', 4, 'Enhancement in Food Production'),
(112, 'B', 5, 'Microbes in Human Welfare'),
(113, 'B', 6, 'Photosynthessis'),
(114, 'B', 7, 'Respiration'),
(115, 'B', 8, 'Reproduction in Plants'),
(116, 'B', 9, 'Organisms and Environment - I'),
(117, 'B', 10, 'Origin and Evolution of Life'),
(118, 'B', 11, 'Chromosomal Basis of Inheritance'),
(119, 'B', 12, 'Genetic engineering and Genimics'),
(120, 'B', 13, 'Human health and Diseases'),
(121, 'B', 14, 'Animal Husbundary'),
(122, 'B', 15, 'Circulation'),
(123, 'B', 16, 'Excretion and Osmoregulation'),
(124, 'B', 17, 'Control and co-ordination'),
(125, 'B', 18, 'Human Reproduction'),
(126, 'B', 19, 'Organisms and Environment -II'),
(127, 'B', 20, 'Diversity in Organisms'),
(128, 'B', 21, 'Kingdom Plantae'),
(129, 'B', 22, 'Biochemistry of Cell'),
(130, 'B', 23, 'Cell Division'),
(131, 'B', 24, 'Morphology of Flowering Plants'),
(132, 'B', 25, 'Plant Water relations and Mineral Nutrition'),
(133, 'B', 26, 'Plant Growth and Development'),
(134, 'B', 27, 'Kingdom Animalia'),
(135, 'B', 28, 'Organization of Cell'),
(136, 'B', 29, 'Study of Animal Tissues'),
(137, 'B', 30, 'Study of Animal Type'),
(138, 'B', 31, 'Human Nutrition'),
(139, 'B', 32, 'Human Respiration'),
(140, 'B', 33, 'Human Skeleton and Locomotion');

-- --------------------------------------------------------

--
-- Table structure for table `usertable`
--

CREATE TABLE `usertable` (
  `Id` int(11) NOT NULL,
  `UserName` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usertable`
--

INSERT INTO `usertable` (`Id`, `UserName`, `Password`) VALUES
(1, 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `question_full`
--
ALTER TABLE `question_full`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `question_sub`
--
ALTER TABLE `question_sub`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `report_table`
--
ALTER TABLE `report_table`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `temp_tbl`
--
ALTER TABLE `temp_tbl`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `topiclist`
--
ALTER TABLE `topiclist`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `usertable`
--
ALTER TABLE `usertable`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `question`
--
ALTER TABLE `question`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=140;

--
-- AUTO_INCREMENT for table `question_full`
--
ALTER TABLE `question_full`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=140;

--
-- AUTO_INCREMENT for table `question_sub`
--
ALTER TABLE `question_sub`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=140;

--
-- AUTO_INCREMENT for table `report_table`
--
ALTER TABLE `report_table`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `temp_tbl`
--
ALTER TABLE `temp_tbl`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `topiclist`
--
ALTER TABLE `topiclist`
  MODIFY `id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=141;

--
-- AUTO_INCREMENT for table `usertable`
--
ALTER TABLE `usertable`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
