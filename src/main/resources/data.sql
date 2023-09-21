-- Create a sample table and insert data
CREATE TABLE IF NOT EXISTS employee (
id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(50),
last_name VARCHAR(50),
email VARCHAR(100)
);

INSERT INTO employee (first_name, last_name, email)
VALUES
('John', 'Doe', 'john.doe@example.com'),
('Jane', 'Smith', 'jane.smith@example.com');

--Exercicio 6
SELECT * FROM employee;

--Exercicio 7
INSERT INTO employee (first_name, last_name, email)
VALUES
('Jack', 'Rose', 'jack@titanic.com');

--Exercicio 8
ALTER TABLE employee
ADD COLUMN salary double;

--Exercicio 9
INSERT INTO employee (first_name, last_name, email, salary)
VALUES
('Rose', 'Namajunas', 'namajunas@titanic.com', 500000);

--Exercicio 10
SELECT * FROM employee;

--Exercicio 11
DELETE FROM employee WHERE id=1;

--Exercicio 12
SELECT * FROM employee;

--Exercicio 13
UPDATE employee
SET salary = 100000
WHERE first_name='Jane';
