use cadastro;

select * from gafanhotos;
select * from cursos;

select nome, descricao, ano  from cursos where ano <= '2015'
order by nome;


-- between especifica faixas de valorees
select nome, ano from cursos
where ano between 2014 and 2016
order by ano desc, nome;

-- in especifica valores exatos
select nome, descricao, ano from cursos
where ano in (2014, 2016)
order by ano;


select * from cursos
where carga > 35 and totaulas < 30;