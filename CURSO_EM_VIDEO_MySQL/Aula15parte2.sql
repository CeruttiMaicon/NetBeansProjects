
select nome, cursopreferido from gafanhotos;

select nome, ano from cursos;

select gafanhotos.nome,  cursos.nome, cursos.ano 
from gafanhotos join cursos
on cursos.idcurso = gafanhotos.cursopreferido;

select gafanhotos.nome,  cursos.nome, cursos.ano 
from gafanhotos join cursos
on cursos.idcurso = gafanhotos.cursopreferido
order by gafanhotos.nome;