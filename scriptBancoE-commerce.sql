create database ecommerce
default character set utf8
default collate utf8_general_ci;

create table usuarios (
id_usuario tinyint auto_increment primary key,
nome_usuario varchar(100) unique key,
senha varchar(100)
);

create table produto(
id serial,
nome varchar (100),
descricao varchar (255),
precoUnitario real,
imagem varchar (100),
Primary Key(id)
);

create table venda (
idVenda tinyint,
idProduto tinyint,
qtde tinyint not null,
valorTotal double not null,
primary key (idVenda, idProduto),
foreign key (idProduto) references produto
);

create table imagens (
id_imagem tinyint auto_increment,
descricao_img varchar(100),
nome varchar(100) unique key,
primary key (id_imagem)
);

insert into usuarios (nome_usuario, senha) values ('admin', 'admin');
insert into usuarios (nome_usuario, senha) values ('alysson', 'alysson');

insert into produto (descrecao_produto, informacao_produto, valor_produto) values ('CRF 230', 'Nacional 230cc', 12000);
insert into produto (descrecao_produto, informacao_produto, valor_produto) values ('TTR 230', 'Yamaha Nacional 230cc', 11000);

insert into imagens (descricao_img, nome) values ('login.jpg', 'Imagem Login');

insert into produto (id, nome, descricao, precoUnitario) values (1, 'TT-R 230', 'Moto Off-Road',
11200);
insert into produto (id, nome, descricao, precoUnitario) values (2, 'CRF 230', 'Moto Off-Road',
13200);
insert into produto (id, nome, descricao, precoUnitario) values (3, 'KTM 450', 'Moto Off-Road',
50200);

select * from produto;

UPDATE produto SET nome = 'TTR 230', descricao = 'Off-Road', precoUnitario = 11100 WHERE id = 1;