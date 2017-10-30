



select  totaulas, count(*) from cursos
group by totaulas
order by totaulas;

select  ano, count(*) from cursos
group by ano
having count(ano) >= '5'
order by count(*) desc;