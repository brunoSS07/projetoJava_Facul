-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 06-Jun-2018 às 17:37
-- Versão do servidor: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projeto2018`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id` int(3) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `dataNasc` varchar(50) NOT NULL,
  `telefone` varchar(50) NOT NULL,
  `cpf` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `rua` varchar(50) NOT NULL,
  `numero` int(50) NOT NULL,
  `bairro` varchar(50) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `estado` varchar(50) NOT NULL,
  `cep` int(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id`, `nome`, `dataNasc`, `telefone`, `cpf`, `email`, `rua`, `numero`, `bairro`, `cidade`, `estado`, `cep`) VALUES
(1, 'Bruno da Silva Santos', '07/09/1991', '5364363474', '7777777777', 'brunoss@gmail', 'dos alfeneiros', 55, 'Cumbica', 'Guarulhos', 'SP', 55555555),
(2, 'Josefina', '22/03/1993', '353256664', '5553554545', 'josefina@gmail.com', 'dhhfhfhs', 55, 'shsfhsfhfh', 'Guarulhos', 'SP', 355455),
(6, 'Maria joaquina', '01/02/2003', '3333333333', '364634636', 'maria@gmail', 'efhdhgfdhdfh', 33, 'rhtrhrthtrhtht', 'Guarulhos', 'SP', 55555555),
(4, 'Maria Conceição', '07/09/2000', '45455646', '46436556', 'maria@gmail', 'sfhfhfdhdfh', 55, 'fhdfhdhfd', 'dgdgxxf', 'sp', 5454534),
(5, 'Joselito das couves', '09/04/1950', '33254545', '4634363', 'joselito@gmail', 'dos alfeneiros', 43, 'Cumbica', 'Guarulhos', 'sp', 4445545),
(7, 'Joaquim', '06/05/2000', '888888888', '364634636', 'joaquim@gmail', 'jykhkykykhkhkh', 127, 'aafsdfafasf', 'Guarulhos', 'SP', 55555555),
(8, 'Fabio', '06/08/2000', '222222222', '5643646', 'fabio@gmail', 'tyhkukgkhgkjhghjgj', 23, 'dfsgsdgdgs', 'Guarulhos', 'SP', 55555555),
(9, 'Rose', '06/08/2000', '7777777777', '5466646343', 'Rose@gmail', 'dgsdgsdhsdhs', 22, 'sgsdgs', 'Guarulhos', 'SP', 11111111),
(10, 'Adriana', '06/08/1990', '212344243', '5353134235', 'adriana@gmail', 'gfsdgfhfhfh', 65, 'sgsdgsfgsg', 'Guarulhos', 'SP', 11111111),
(11, 'Andreia freitas', '06/08/1985', '3455254554', '6634646464', 'andreia@gmail', 'hdhsdgrgsdgwa', 212, 'esgesgwetgr', 'Guarulhos', 'SP', 11111111),
(12, 'Diego freitas', '06/08/1997', '463253232', '3454336346', 'diego@gmail', 'hdhsdgrgsdgwa', 67, 'esgesgwetgr', 'Guarulhos', 'SP', 77887666),
(13, 'Manuela freitas', '06/08/2000', '435255355', '463646364', 'manu@gmail', 'ghrghghgh', 99, 'ghjggjjrkgfsgf', 'Guarulhos', 'SP', 55555555),
(16, 'Ana Paula araujo', '06/08/1980', '463646364', '435255355', 'paula@gmail', 'ehhrthth', 678, 'regehth', 'Guarulhos', 'SP', 55555555),
(15, 'Erundina', '06/08/1960', '3523555', '454646346', 'erundina@gmail', 'ghrghghgh', 66, 'ghjggjjrkgfsgf', 'Guarulhos', 'SP', 55555555),
(17, 'Bryan Araujo', '06/08/1980', '4544646464', '46346346', 'bryan@gmail', 'ehethrywewet', 875, 'ewtwyryetheheh', 'Guarulhos', 'SP', 4365476),
(18, 'Aldair', '06/08/1995', '4525255', '44534664636', 'aldair@gmail', 'edfhdfhdfhdfh', 234, 'ewtwyryetheheh', 'Guarulhos', 'SP', 4365476),
(19, 'Alice', '06/08/1998', '325235325', '325535255', 'alice@gmail', 'fhfhefdhfdhssyrry', 678, 'wtrewreyerhrghd', 'Guarulhos', 'SP', 4365476),
(20, 'Lincoln', '06/08/1998', '455545455', '36346346346', 'lincoln@gmail', 'fhfhefdhfdhssyrryghfffjgfj', 678, 'fhdfhdfhdfhtgjfmgmmmmm', 'Guarulhos', 'SP', 4365476),
(21, 'Lucas portela', '06/08/1998', '3433252353', '36346346346', 'portela@gmail', 'sdgsdgfhfhfh', 564, 'fhdfhdfhdfhtgjfmgmmmmm', 'Guarulhos', 'SP', 4365476),
(22, 'PC Siqueira', '06/08/1998', '545345435', '36346346346', 'pc@gmail', 'fhrfhfdhdjtryjykuflglldsgsggg', 126, 'fhdfhdfhdfhtgjfmgmmmmm', 'Guarulhos', 'SP', 4365476),
(23, 'Maria conceição', '10/05/1980', '35636151780', '999352540', 'maria@gmail.com', 'Vila Mimosa', 77, 'Mooca', 'São Paulo', 'SP', 7185250);

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id` int(10) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `dataNasc` varchar(50) NOT NULL,
  `dataAdm` varchar(50) NOT NULL,
  `cpf` varchar(50) NOT NULL,
  `email` varchar(200) NOT NULL,
  `salario` double NOT NULL,
  `codFunc` int(10) NOT NULL,
  `telefone` varchar(50) NOT NULL,
  `rua` varchar(200) NOT NULL,
  `numero` int(10) NOT NULL,
  `bairro` varchar(200) NOT NULL,
  `cidade` varchar(200) NOT NULL,
  `estado` varchar(200) NOT NULL,
  `cep` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`id`, `nome`, `dataNasc`, `dataAdm`, `cpf`, `email`, `salario`, `codFunc`, `telefone`, `rua`, `numero`, `bairro`, `cidade`, `estado`, `cep`) VALUES
(7, 'Vera aguiar', '11/09/1970', '01/05/2018', '54545545', 'vera@gmail', 2000, 123, '4545454554', 'tytryrtyyytyttyyytyyty', 89, 'jyjjljjkljjgkjjlgjgjgj', 'São Paulo', 'SP', '9988989'),
(2, 'Jair Messias Bolsonaro', '11/09/1953', '01/01/2018', '4654486868', 'bolsonaro@gmail', 100000, 123, '3523525', 'dos tiros', 231, 'não sei', 'São Paulo', 'SP', '4556666'),
(3, 'LULA', '10/07/1950', '01/01/2002', '21464688', 'Lula@gmail', 100000, 567, '456754754', 'Bangu 1 ', 987, 'não sei', 'Curitiba', 'PR', '5766868'),
(4, 'Joselito', '10/07/1970', '01/01/2008', '456754754', 'joselito@gmail', 4500, 886866, '46346373', 'rfhdfdfjdtjdj', 657, 'gjgjgjg', 'Guarulhos', 'SP', '54574775'),
(5, 'Bossa', '10/07/1975', '01/01/2010', '36357573', 'bossa@gmail', 5000, 466, '46436346', 'dfhdjgfjgjdgj', 657, 'fhsfhsff', 'Guarulhos', 'SP', '355324675'),
(6, 'Gonçalves', '10/07/1980', '02/01/2011', '36357573', 'goncalves@gmail', 5500, 777, '46436346', 'fdhsdhdgdag', 66, 'rhfhgjthkghj', 'Guarulhos', 'SP', '457547'),
(8, 'Valdice Araujo', '11/09/1965', '25/03/2018', '45346636', 'val@gmail', 2000, 123, '9797699', 'yjykhkhkhkkhkdfgsd', 59, 'qerrreretwetwegwet', 'São Paulo', 'SP', '5745757'),
(9, 'Caue Moura', '11/09/1965', '25/03/2018', '66666555', 'caue@gmail', 5500, 678, '45454643636', 'hjgfhfsterwefdsd', 69, 'qerrreretwetwegwet', 'São Paulo', 'SP', '12345655'),
(10, 'Pedro goncalves', '11/09/1965', '25/03/2018', '66666555', 'caue@gmail', 3200, 765, '453436366', 'hjgfhfsterwefdsd', 66, 'qerrreretwetwegwet', 'São Paulo', 'SP', '453463566'),
(11, 'Maria da Silva', '11/09/1995', '25/03/2018', '77777777', 'maria@gmail', 3000, 765, '554545', 'ghfhhdfdfdfhdfdfh', 333, 'qerrreretwetwegwet', 'São Paulo', 'SP', '124244144'),
(12, 'Bruno da Silva Santos', '07/09/1991', '01/03/2018', '45464636', 'bruno@gmail', 3000, 765, '4363666', 'ethhrfhrtywwerrewrr', 333, 'dfghdfhhfdhhh', 'São Paulo', 'SP', '124244144'),
(13, 'Manuela Freitas', '07/09/1985', '01/02/2018', '65656566', 'manu@gmail', 3500, 765, '434343434', 'weeqeqsdwfffef', 777, 'rtfhgfhghghhghg', 'São Paulo', 'SP', '35255225'),
(14, 'Josefina Silva', '07/09/1986', '05/02/2018', '65656566', 'josefina@gmail', 3700, 765, '565653656', 'weeqeqsdwfffef', 678, 'rtfhgfhghghhghg', 'São Paulo', 'SP', '35255225'),
(15, 'Adriana Araujo', '07/09/1970', '05/03/2018', '363543346', 'adriana@gmail', 2800, 987, '456566656', 'afsfsdfsdgdgdgeg', 456, 'afafafsxfwetwttwt', 'São Paulo', 'SP', '567457776'),
(16, 'Pedro alvarez Cabral', '07/09/1970', '05/03/2015', '4545454545', 'cabral@gmail', 15000, 987, '5525', 'afsfsdfsdgdgdgeg', 456, 'afafafsxfwetwttwt', 'São Paulo', 'SP', '567457776'),
(17, 'Albert Einstein', '07/09/1965', '05/03/2010', '43346636', 'albert@gmail', 15000, 987, '255555454', 'efgsagafdsgsdgs', 758, 'aggsgsgdgsdggs', 'São Paulo', 'SP', '57674744'),
(18, 'Adriano Imperador', '01/02/1980', '01/10/2010', '46564654', 'imperador@gmail', 2000, 171, '3464636356', 'fdhfhfshsfh', 78, 'shshsshhftrutyrwqqqtq', 'Guarulhos', 'SP', '57457475'),
(19, 'Ronaldo Fenômeno', '01/02/1980', '01/10/2010', '36443657', 'r9fenomeno@gmail', 100000, 181, '3464636356', 'sddgdfhdfhfde', 87, 'fjkyjllouihgghmnvvxzdzf', 'Guarulhos', 'SP', '21234343'),
(20, 'Ronaldinho gaucho', '01/02/1979', '01/10/2012', '97978664', 'ronaldinho@gmail', 100000, 181, '436776435', 'gfzxvcvzswfegshsrh', 23, 'uiljkjhkmhbvnzzzssreryyer', 'Guarulhos', 'SP', '12323343'),
(21, 'Valdivia', '01/02/1981', '01/10/2013', '43643636', 'elmago@gmail', 100000, 567, '434365775', 'gfzxvcvzswfegshsrh', 22, 'yjytjstasatwegeheth', 'Guarulhos', 'SP', '4586586'),
(22, 'Neymar Junior', '01/02/1992', '01/10/2014', '36446444', 'neymar_njr10@gmail', 1000000, 1010, '4546464643', 'erhrdhdhdhfh', 10, 'yjytjstasatwegehethfhfdhh', 'Santos', 'SP', '64365665'),
(23, 'Elisabete das Fores', '25/03/1970', '10/7/2000', '24875698', 'bete@gmail.com', 4500, 56, '56734565555', 'alvares pedroso', 33, 'Mooca', 'São Paulo', 'SP', '7185456');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `id` int(10) NOT NULL,
  `codProd` int(10) NOT NULL,
  `nomeProd` varchar(50) NOT NULL,
  `valorProd` float NOT NULL,
  `descProd` varchar(250) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`id`, `codProd`, `nomeProd`, `valorProd`, `descProd`) VALUES
(25, 456, 'Notebook Inspiron 15 5000 (5570)', 3500, 'dfhhdghsdgahrahH'),
(20, 30, 'Ugly Stick', 400, 'aeromodelo para iniciantes'),
(21, 31, 'CESNA 182', 1100, 'aeromodelo para iniciantes'),
(5, 25, 'Iphone', 4000, 'dddddddddddddddddddd'),
(22, 32, 'CESNA 182', 1100, 'aeromodelo para iniciantes'),
(14, 15, 'Notebook', 2000, 'bbbbbbbbbbbbbbbbbbb'),
(18, 4, 'Radio FS SKYFLY', 550, 'fagsfhddtjyrjdjjeawwa'),
(17, 2, 'Radio Futaba', 550, 'mmmmmmmmmmmmmmmmmmm'),
(23, 55, 'X BOX ONE', 1650, 'Video Game da microsoft com 2 jogos inclusos,GTA V e UNCHARTED 4'),
(24, 6, 'Radio sei la o que', 1000, 'rhshdsdf'),
(26, 26, 'Notebook SANSUNG', 1700, 'dfhhdghsdgahrahH'),
(27, 5050, 'Notebook Dell Inspiron', 1800, 'dfhhdghsdgahrahH'),
(28, 4545, 'Notebook Positivo Stilo', 1299, 'rgjgheargdDGSADG'),
(29, 3535, 'Notebook Lenovo', 2159, 'asfagerahethethHaEGsdg'),
(30, 2525, 'Notebook Acer', 2449, 'hyukuilfkjafhdhg'),
(31, 1515, 'Notebook Positivo Motion', 899, 'hyukuilfkjafhdhg'),
(32, 66, 'Headset Gamer Razer', 332, 'Marca: Razer \nModelo: Kraken Essential\nConexão com a internet (para instalação do driver)');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT for table `produto`
--
ALTER TABLE `produto`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
