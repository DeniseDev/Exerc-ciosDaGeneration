#1- Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema trabalhará com as informações dos colaboradores desta empresa. 
create database servicos_rh;
use servicos_rh;

#2- Crie uma tabela de colaboradores e determine 5 atributos relevantes dos colaboradores para se trabalhar com o serviço deste RH.
create table tb_colaboradores(
id bigint auto_increment,
nome char(255) not null,
idade int not null,
salario double not null,
funcao varchar(255) not null,
descricao varchar(255),
primary key (id)

);
#3- Insira nesta tabela no mínimo 5 dados (registros).
select * from tb_colaboradores;

insert into tb_colaboradores (nome,idade,salario,funcao,descricao)
values ("Denise",30,3000,"DevJr","funcionario do mês!");

insert into tb_colaboradores (nome,idade,salario,funcao)
values ("Kamila",18,1500,"DevJr");

insert into tb_colaboradores (nome,idade,salario,funcao,descricao)
values ("Babbi",17,2800,"DevJr","funcionario fantasma!");

insert into tb_colaboradores (nome,idade,salario,funcao,descricao)
values ("Lucas",26,1600,"DevJr","funcionario em evolução!");

#4- Faça um SELECT que retorne todes os colaboradores com o salário maior do que 2000
select * from tb_colaboradores where salario > 2000;

#5- Faça um SELECT que retorne todes os colaboradores com o salário menor do que 2000.
select * from tb_colaboradores where salario < 2000;

#6- Ao término atualize um registro desta tabela através de uma query de atualização.
update tb_colaboradores set nome = "Mario" where id = 1;