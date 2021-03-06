-- MySQL Script generated by MySQL Workbench
-- Thu Apr 22 22:59:22 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_pizarria_legal
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_pizarria_legal
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_pizarria_legal` DEFAULT CHARACTER SET utf8 ;
USE `db_pizarria_legal` ;

-- -----------------------------------------------------
-- Table `db_pizarria_legal`.`tb_categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_pizarria_legal`.`tb_categoria` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `tamanho` VARCHAR(10) NULL,
  `formato` VARCHAR(10) NULL,
  `tipo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_pizarria_legal`.`tb_pizzas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_pizarria_legal`.`tb_pizzas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `sabor` VARCHAR(45) NULL,
  `massa` VARCHAR(45) NULL,
  `preco` DECIMAL(20,2) NULL,
  `fk` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_table1_tb_categoria_idx` (`fk` ASC) VISIBLE,
  CONSTRAINT `fk_table1_tb_categoria`
    FOREIGN KEY (`fk`)
    REFERENCES `db_pizarria_legal`.`tb_categoria` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;




INSERT INTO tb_categoria (tipo,tamanho,formato)
VALUES	
("sal","P","redonda"),
("doce","M","redonda"),
("sal","M", "quadrada"),
("sal","G", "redonda"),
("sal","G", "quadrada"),
("doce","familia", "redonda"),
("sal","familia", "quadrada");

INSERT INTO tb_pizzas (sabor,massa,preco,fk)
VALUES
("calabresa", "fina",12.99,1),
("frango c/ catupiry", "fina", 22.20,2),
("frango c/ catupiry", "fina", 20.20,3),
("quatro queijos","fina",35.89,4),
("quatro queijos","grossa",31.89,5),
("morango c/ chocolate","grossa",45.99,6),
("Portuguesa","fina",48.99,7);

SELECT *FROM tb_pizzas WHERE preco >45;

SELECT *FROM tb_pizzas WHERE preco >29 and preco<60;

SELECT *FROM tb_pizzas WHERE sabor LIKE "%c%";


SELECT *FROM tb_pizzas
INNER join tb_categoria on tb_categoria.id = tb_pizzas.fk;

SELECT * FROM tb_categoria
INNER join tb_pizzas on  tb_pizzas.fk =tb_categoria.id
WHERE tipo ="doce";

