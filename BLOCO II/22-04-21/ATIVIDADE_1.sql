-- MySQL Script generated by MySQL Workbench
-- Thu Apr 22 21:14:28 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_generation_game_online
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_generation_game_online
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_generation_game_online` DEFAULT CHARACTER SET utf8 ;
USE `db_generation_game_online` ;

-- -----------------------------------------------------
-- Table `db_generation_game_online`.`tb_classe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_generation_game_online`.`tb_classe` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `tipo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_generation_game_online`.`tb_personagem`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_generation_game_online`.`tb_personagem` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `atk` INT NOT NULL,
  `def` INT NULL,
  `destreza` INT NULL,
  `carisma` INT NULL,
  `fk` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tb_personagem_tb_classe_idx` (`fk` ASC) VISIBLE,
  CONSTRAINT `fk_tb_personagem_tb_classe`
    FOREIGN KEY (`fk`)
    REFERENCES `db_generation_game_online`.`tb_classe` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


INSERT INTO tb_classe (nome, tipo)
VALUES
("Montaria", "agilidade"),
("Ranger", "agilidade"),
("Guerreiro", "for??a"),
("Atirador", "agilidade"),
("Mago", "inteligencia");

INSERT INTO tb_personagem (nome,atk,def,destreza,carisma,fk) 
VALUES
("Mirana",2100,1500,700,800,1),
("Drow", 4000,700,80,900,2),
("Dragon Knight", 1000,9000,900,600,3),
("Juvinel", 1800,500,500,500,4),
("Lina Inverse", 6000,400,800,400,5);

SELECT 
    *
FROM
    tb_personagem
WHERE
    atk > 2000;

SELECT 
    *
FROM
    tb_personagem
WHERE
    def > 2000;

SELECT 
    *
FROM
    tb_personagem
WHERE
    def > 1000 AND def < 2000;

SELECT 
    *
FROM
    tb_personagem
WHERE
    nome LIKE '%c%';

SELECT 
    *
FROM
    tb_personagem
        INNER JOIN
    tb_classe ON tb_classe.id = tb_personagem.id;
