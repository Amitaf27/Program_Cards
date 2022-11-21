create schema programbd;
use programbd;

drop table if exists usuario;

create table usuario (
    id int primary key,
    nomeUsuario varchar(50) unique,
    senha char(10) unique not null,
    nome varchar(50),
    email varchar(100),
    resultado_quest char(20) check(resultado_quest = "iniciante" or resultado_quest = "intermediario" or resultado_quest = "avançado")
);

#cadastro
insert into Usuario (nome, nomeUsuario, email, senha) values (?, ?, ?, ?);

#login
select * from usuario where nomeUsuario = ? and senha = ?;

#mudar nickname
select * from usuario where nomeUsuario = ?;
update usuario set nomeUsuario = ? where nomeUsuario = ?;

#mudar senha
select * from usuario where email = ?;
update usuario set senha = ? where email = ?;

#resultado do questionario
update usuario set resultado_quest = ? where id = (select max(id) from usuario);
