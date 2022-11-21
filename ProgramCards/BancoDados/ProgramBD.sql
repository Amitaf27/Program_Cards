create schema programbd;
use programbd;

drop table if exists usuario;

create table usuario (
	nomeUsuario varchar(50) primary key unique,
    senha char(10) unique not null,
    nome varchar(50),
    email varchar(100),
    resultado_quest char(20) check(resultado_quest = "iniciante" or resultado_quest = "intermediario" or resultado_quest = "avançado")
);

select * from usuario;
