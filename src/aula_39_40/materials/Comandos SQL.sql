#1
CREATE DATABASE unoesc_trabalho_CRUD;
USE unoesc_trabalho_CRUD;

#2
CREATE TABLE pessoa (
	id_pessoa INT(11) AUTO_INCREMENT PRIMARY KEY,
    nome_pessoa VARCHAR(50) NOT NULL,
    data_nascimento DATE NOT NULL,
    salario DECIMAL(12, 2) NOT NULL CHECK(salario >= 0)
);

#3
INSERT INTO pessoa VALUES (null, "Danimar Henrique Varisa", '1990-05-02', 8900.00);

#4
INSERT INTO pessoa (nome_pessoa, data_nascimento, salario) VALUES ("Jaqueline Candiago de Oliveira", '1990-07-16', 6850.00);
INSERT INTO pessoa (nome_pessoa, data_nascimento, salario) VALUES ("Daniel Varisa", '1967-09-09', 11000.00);
INSERT INTO pessoa (nome_pessoa, data_nascimento, salario) VALUES ("Diego de Melo Varisa", '2010-10-10', 900.00);
INSERT INTO pessoa (nome_pessoa, data_nascimento, salario) VALUES ("Duany Henrique Varisa", '1993-10-20',1500.00);

#5
SELECT * FROM pessoa ORDER BY nome_pessoa ASC;
SELECT * FROM pessoa ORDER BY data_nascimento ASC;
SELECT * FROM pessoa ORDER BY salario ASC;

#6
UPDATE pessoa SET salario = 1800.00 WHERE id_pessoa = 4;

#7
DELETE FROM pessoa WHERE id_pessoa = 5;

#8
SET lc_time_names='pt_BR';

#9
SELECT nome_pessoa, date_format(data_nascimento, '%d de %M de %Y') AS 'Data de nascimento' FROM pessoa;

#10
SELECT AVG(salario), SUM(salario) FROM pessoa;