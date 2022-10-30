create  database ProgramBD;
use ProgramBD;

drop table Usuario;

create table Usuario (
    nomeUsuario VARCHAR (50) not null unique,
    senha CHAR (6) primary key not null,
    nome VARCHAR (50) not null,
    idade int not null
);

select * from Usuario;

alter table usuario 
 drop PRIMARY KEY,
 add PRIMARY KEY (nomeUsuario),
 add UNIQUE INDEX senha_UNIQUE (senha ASC) VISIBLE;
 ;
