Create Database db_funcionarios; -- creates a new database
use db_funcionarios;

-- creating a new table

CREATE TABLE tb_funcionarios (
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    cargo VARCHAR(30) NOT NULL,
    salario DECIMAL(10 , 2 ) NOT NULL,
    contato VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);


-- populando tabela

Insert into tb_funcionarios (nome, cargo, salario, contato) 
values ("Maria", "diretora Geral", 14848.11, "maria@mycompany.com"),
 ("Karina", "dentista", 4848.88, "karina@gmail.com"),
 ("Fernanda", "advogada", 5848.88, "Nanda@gmail.com"),
 ("Bruna", "operadora", 4848.88, "karina@gmail.com"),
 ("João", "dentista", 4848.88, "jo2010@gmail.com"),
 ("Carlos", "gerente", 4848.88, "carlitos@gmail.com");

-- retorna funcionarios com salário maior que 2000
Select * from tb_funcionarios where salario > 2000;

-- retorna funcionarios com salario menor que 2000
Select * from tb_funcionarios where salario < 2000;

-- atualizando a tabela

UPDATE tb_funcionarios
SET 
    salario = 1400
WHERE
    id = 4;
