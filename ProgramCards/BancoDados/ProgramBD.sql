create schema programbd;
use programbd;

drop table if exists usuario;

create table usuario (
    nomeUsuario varchar(50) primary key unique,
    senha char(10) unique not null,
    nome varchar(50),
    email varchar(100)
);

select * from usuario;
