Create database db_meuEstoque; -- cria um novo banco de dados

-- creating a new table
CREATE TABLE tb_produtos (
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(30),
    preco DECIMAL(10 , 2 ),
    cor VARCHAR(10),
    tamanho VARCHAR(1),
    PRIMARY KEY (id)
);

-- filling a table

Insert into tb_produtos (nome, preco, tamanho, cor)
values 
("camisa",50.50,"G", "branca"),
("camisa",50.50, "M", "branca"),
("camisa",50.50,"P", "branca"),
("camisa",50.50, "M", "preta"),
("short",20.50,"G", "verde"),
("short",20.50, "M", "rosa"),
("short",20.50,"G", "branca"),
("short",20.50, "P", "rosa");

-- retornar produtos acima de 500 unidades de medida de preço
Select * from tb_produtos where preco >200;

-- retornar produtos acima de 500 unidades de medida
Select * from tb_produtos where preco <200;

Update tb_produtos set preco = 600.98 where id =1;

Select * from tb_produtos


