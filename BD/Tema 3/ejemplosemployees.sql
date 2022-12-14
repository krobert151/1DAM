SELECT * 
FROM employees
WHERE first_name ILIKE 'a%a%';

SELECT *
FROM employees
WHERE department_id IN (1,3,5);

SELECT *
FROM employees
WHERE NOT (salary >10000);

-- Seleccionar la inversa de empleados 
--del departamento 6 que cobren entre 
--7000$ y 9000$

SELECT *
FROM employees
WHERE NOT (department_id =6
  AND salary BETWEEN 7000 AND 9000);
	
-- Seleccionar a los empleados que cobren 
-- menos de 10000$ y la primera letra de su
--nombre es A, E o I.

SELECT *
FROM employees
WHERE salary < 10000
  AND (first_name ILIKE 'a%'
   OR first_name ILIKE 'n%')
 
-- Seleccionar los no nulos
 
SELECT *
FROM employees
WHERE manager_id IS NOT NULL;

-- Concatenar 
-- comillas simples es para concatenar texto 
-- y comillas dobles para nombrar a la columna
SELECT first_name || ' ' || last_name as "Full name",
	   'Department ID:' || department_id as "Department ID"	
FROM employees;

--Mostrar el salario y el salario
-- con el -10%

SELECT salary , 
--		salary - (salary*10/100)
--		salary - (salary*0.1)
		salary * 0.9,
		employees.* --muestra todos los datos inlcuyendo los anteriores
FROM employees;

--Buscar las fechas de junio

SELECT *
FROM employees
WHERE hire_date::text LIKE '%-06-%';

--Ordena a los epmleados aleatoriamente

SELECT *
FROM employees 
ORDER BY random ();

--Cuentan todas las tuplas

SELECT count (*)
FROM employees
WHERE department_id=6;

--Devolver la media del salario

SELECT avg (salary)
FROM employees
WHERE department_id = 6;

-- Ver cuanto le cuesta a la empresa pagar toda la nómina

SELECT sum(salary)
FROM employees;

--Ver el máximo salario y el mínimo del departamento 6

SELECT ROUND(avg(salary),2),max(salary), min(salary)
FROM employees
WHERE department_id =6;





