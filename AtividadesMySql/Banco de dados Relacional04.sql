create database db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tb_categorias(
id bigint auto_increment,
congelado varchar(255),
nobre varchar(255),
primary key (id)
);

create table tb_produtos(
id bigint auto_increment,
valor integer not null,
corte varchar(255),
proteina integer not null,
maciez varchar(255) not null,
id_categorias bigint,
primary key (id),
foreign key (id_categorias) references tb_categorias(id)
);

#Insira 5 registros na tabela tb_categorias.
insert into tb_categorias (congelado,nobre) values
('sem gelo','nao');
insert into tb_categorias (congelado,nobre) values
('sem gelo','nao');
insert into tb_categorias (congelado,nobre) values
('com gelo','sim');
insert into tb_categorias (congelado,nobre) values
('sem gelo','nao');
insert into tb_categorias (congelado,nobre) values
('com gelo','sim');

#Insira 8 registros na tabela tb_produtos, preenchendo a Chave Estrangeira para criar a relação com a tabela tb_categorias.
insert into tb_produtos (valor,corte,proteina,maciez,id_categorias) values
(35,'vertical',37,'pouco macia',5);
insert into tb_produtos (valor,corte,proteina,maciez,id_categorias) values
(55,'vertical',90,'muito macia',3);
insert into tb_produtos (valor,corte,proteina,maciez,id_categorias) values
(175,'horizontal',50,'muito macia',2);
insert into tb_produtos (valor,corte,proteina,maciez,id_categorias) values
(25,'vertical',55,'pouco macia',4);
insert into tb_produtos (valor,corte,proteina,maciez,id_categorias) values
(35,'horizontal',73,'pouco macia',1);
insert into tb_produtos (valor,corte,proteina,maciez,id_categorias) values
(85,'vertical',29,'muito macia',1);
insert into tb_produtos (valor,corte,proteina,maciez,id_categorias) values
(120,'horizontal',88,'muito macia',4);
insert into tb_produtos (valor,corte,proteina,maciez,id_categorias) values
(160,'vertical',95,'muito macia',5);

# buscas gerais nas tabelas
select * from tb_categorias;
select * from tb_produtos;

#Faça um SELECT que retorne todes os produtos cujo valor seja maior do que R$ 50,00.
select * from tb_produtos where valor > 50;

#Faça um SELECT que retorne todes os produtos cujo valor esteja no intervalo R$ 50,00 e R$ 150,00.
select * from tb_produtos where valor > 50 and valor < 150;

#Faça um SELECT utilizando o operador LIKE, buscando todes os produtos que possuam a letra C no atributo nome.
select * from tb_produtos where maciez like '%p%';

#Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_produtos com os dados da tabela tb_categorias.
select * from tb_produtos inner join
tb_categorias on tb_categorias.id = tb_produtos.id_categorias;

#Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_produtos com os dados da tabela tb_categorias, onde traga apenas os produtos que pertençam a uma categoria específica (Exemplo: Todes os produtos que pertencem a categoria aves ou frutas).
select * from tb_produtos inner join
tb_categorias on tb_categorias.id = tb_produtos.id_categorias
where nobre = 'sim';