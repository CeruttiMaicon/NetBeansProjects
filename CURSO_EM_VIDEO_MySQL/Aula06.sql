

desc gafanhotos;

-- adicionando coluna
alter table Pessoas
add column profissao varchar(10);

-- removendo coluna
alter table Pessoas
drop column profissao;

-- adicionando o campo profissão na tabela pessoas depois da coluna nome
alter table pessoas
add column profissao varchar(10) after nome;

-- adicionando coluna como a primeira coluna
alter table pessoas
add column codigo int first;

-- alterando o tipo da coluna e o not null + default vazio
alter table pessoas
modify column profissao varchar(20) not null default '';

-- alterando o nome da coluna
alter table pessoas
change column profissao prof varchar(20);

-- renomeando o nome da tabela
alter table pessoas
rename to gafanhotos;


select * from gafanhotos;


-- -----------------------------------------------------------

create table if not exists cursos(
nome varchar(30) not null unique,
descricao text,
carga int unsigned,
totaulas int unsigned,
ano year default '2017'

)default charset = utf8;

describe cursos;

alter table cursos
add column idcurso int FIRST ;

alter table cursos
add primary key (idcurso);


