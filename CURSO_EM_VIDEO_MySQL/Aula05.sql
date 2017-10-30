
use cadastro;

INSERT INTO Pessoas
( nome, nascimento, sexo, peso, altura, nacionalidade)
VALUES
('Maria', '1999-12-03', 'F', '55.2', '1.65', 'Portugal');

INSERT INTO Pessoas
( nome, nascimento, sexo, peso, altura, nacionalidade)
VALUES
('Creuza', '1920-12-03', 'F', '50.2', '1.65', DEFAULT);

select * from pessoas;