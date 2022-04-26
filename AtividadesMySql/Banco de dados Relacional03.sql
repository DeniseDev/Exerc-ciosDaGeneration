create database db_farmacia_bem_estar;
use db_farmacia_bem_estar;

create table tb_categorias(
id bigint auto_increment,
prescrito varchar (255) not null,
generico varchar (255) not null,
primary key (id)
);


create table tb_produtos(
id bigint auto_increment,
valor integer not null,
quantidade integer,
cor varchar (255) not null,
uso varchar (255) not null,
id_categorias bigint,
primary key (id),
foreign key (id_categorias) references tb_categorias(id)
);


#Insira 5 registros na tabela tb_categorias.
insert into tb_categorias (prescrito, generico) values
('sim', 'nao');
insert into tb_categorias (prescrito, generico) values
('sim', 'sim');
insert into tb_categorias (prescrito, generico) values
('nao', 'nao');
insert into tb_categorias (prescrito, generico) values
('sim', 'nao');
insert into tb_categorias (prescrito, generico) values
('nao', 'sim');


#Insira 8 registros na tabela tb_produtos, preenchendo a Chave Estrangeira para criar a relação com a tabela tb_categorias.
insert into tb_produtos (valor, quantidade, cor, uso, id_categorias) values
(50, 10, 'branco', 'oral', 2);
insert into tb_produtos (valor, quantidade, cor, uso, id_categorias) values
(60, 23, 'cinza', 'oral', 1);
insert into tb_produtos (valor, quantidade, cor, uso, id_categorias) values
(50, 10, 'preto', 'pele', 3);
insert into tb_produtos (valor, quantidade, cor, uso, id_categorias) values
(70, 100, 'azul', 'oral', 4);
insert into tb_produtos (valor, quantidade, cor, uso, id_categorias) values
(50, 20, 'amarelo', 'pele', 5);
insert into tb_produtos (valor, quantidade, cor, uso, id_categorias) values
(50, 37, 'branco', 'oral', 5);
insert into tb_produtos (valor, quantidade, cor, uso, id_categorias) values
(60, 48, 'preto', 'pele', 4);
insert into tb_produtos (valor, quantidade, cor, uso, id_categorias) values
(40, 8, 'cinza', 'pele', 1);

# buscas gerais nas tabelas
select * from tb_categorias;
select * from tb_produtos;

#Faça um SELECT que retorne todes os produtos cujo valor seja maior do que R$ 50,00.
select * from tb_produtos where valor > 50;

#Faça um SELECT que retorne todes os produtos cujo valor esteja no intervalo R$ 5,00 e R$ 60,00.
select * from tb_produtos where valor > 5 and valor < 60;

#Faça um SELECT utilizando o operador LIKE, buscando todes os produtos que possuam a letra C no atributo nome.
select * from tb_produtos where uso like '%p%';

#Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_produtos com os dados da tabela tb_categorias.
select * from tb_produtos inner join
tb_categorias on tb_categorias.id = tb_produtos.id_categorias;

#Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_produtos com os dados da tabela tb_categorias, onde traga apenas os produtos que pertençam a uma categoria específica (Exemplo: Todes os produtos que pertencem a categoria cosméticos).
select * from tb_produtos inner join
tb_categorias on tb_categorias.id = tb_produtos.id_categorias
where generico = 'sim';