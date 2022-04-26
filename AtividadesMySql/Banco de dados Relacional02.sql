create database db_pizzaria_legal;
use db_pizzaria_legal;

create table  tb_categorias(
id bigint auto_increment,
tipo varchar(255) not null,
borda varchar(255) not null,
primary key (id)
);

create table tb_pizzas(
id bigint auto_increment,
sabor varchar(255) not null,
espessura varchar(255) not null,
verduras varchar(255) not null,
tamanho varchar(255) not null,
valor double not null,
id_categorias bigint,
primary key (id),
foreign key (id_categorias) references tb_categorias(id)
);

drop table tb_pizzas;
 
 #Insira 5 registros na tabela tb_categorias.
 insert into tb_categorias (tipo,borda) values
 ('artesanal','catupiry');
 insert into tb_categorias (tipo,borda) values
 ('artesanal','cheddar');
 insert into tb_categorias (tipo,borda) values
 ('gourmet','catupiry');
 insert into tb_categorias (tipo,borda) values
 ('gourmet','cream cheese');
 insert into tb_categorias (tipo,borda) values
 ('artesanal','cream cheese');
 
 #Insira 8 registros na tabela tb_pizzas, preenchendo a Chave Estrangeira para criar a relação com a tabela tb_categorias.
 insert into tb_pizzas (sabor,espessura,verduras,tamanho,valor,id_categorias) values
 ('calabresa','fina','tomate','media',25,2);
 insert into tb_pizzas (sabor,espessura,verduras,tamanho,valor,id_categorias) values
 ('marguerita','fina','azeitona','media',35,4);
 insert into tb_pizzas (sabor,espessura,verduras,tamanho,valor,id_categorias) values
 ('bacon','grossa','tomate','pequena',55,1);
 insert into tb_pizzas (sabor,espessura,verduras,tamanho,valor,id_categorias) values
 ('calabresa','grossa','mangericao','gigante',60,5);
 insert into tb_pizzas (sabor,espessura,verduras,tamanho,valor,id_categorias) values
 ('mussarela','fina','tomate','grande',37,2);
 insert into tb_pizzas (sabor,espessura,verduras,tamanho,valor,id_categorias) values
 ('nordestina','grossa','cebola','grande',70,3);
 insert into tb_pizzas (sabor,espessura,verduras,tamanho,valor,id_categorias) values
 ('nordestina','fina','azeitona','pequena',30,1);
 insert into tb_pizzas (sabor,espessura,verduras,tamanho,valor,id_categorias) values
 ('mussarela','grossa','cebola','pequena',15,4);
 
 # buscas gerais nas tabelas
select * from tb_categorias;
select * from tb_pizzas;

#Faça um SELECT que retorne todas as pizzas cujo valor seja maior do que R$ 45,00.
select * from tb_pizzas where valor > 45;

#Faça um SELECT que retorne todas as pizzas cujo valor esteja no intervalo R$ 50,00 e R$ 100,00.
select * from tb_pizzas where valor > 50 and valor < 100;

#Faça um SELECT utilizando o operador LIKE, buscando todas as pizzas que possuam a letra M no atributo nome.
select * from tb_pizzas where sabor like '%m%';

#Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias.
select * from tb_pizzas inner join 
tb_categorias on tb_categorias.id = tb_pizzas.id_categorias;

#Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias, onde traga apenas as pizzas que pertençam a uma categoria específica (Exemplo: Todas as pizzas que são doce).
select * from tb_pizzas inner join 
tb_categorias on tb_categorias.id = tb_pizzas.id_categorias
where tipo = 'artesanal';
