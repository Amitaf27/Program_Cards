create database ProgramBD;
use ProgramBD;

create table Usuario (
	nomeUsuario VARCHAR(50) not null unique,
    senha CHAR(6) primary key not null,
    nome VARCHAR(50)
);

select * from Usuario;
