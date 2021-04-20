
Create database  db_escola;

use db_escola;

Create table tb_alunes (
id bigint auto_increment,
nome varchar (30),
idade bigint(3),
turma varchar(20),
nota bigint (30),

primary key (id)
 );
 
 Insert into tb_alunes (nome, idade, turma, nota) 
 values
 ("Maria", 18, "turma 101", 9.80),
 ("Karina", 19, "turma 201", 7.70),
 ("Julia", 20, "turma 101", 7.80),
 ("Pedro", 19, "turma 201", 5.60),
 ("Maria", 22, "turma 101", 6.80),
 ("Karina", 19, "turma 201", 4.80);
 
 Select *from tb_alunes where nota > 7;
 
 SELECT * FROM tb_alunes WHERE  nota < 7;
 
 UPDATE tb_alunes SET nota = 10.00
WHERE id = 1;
 
 
      


