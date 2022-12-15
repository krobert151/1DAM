--Seleccionar aquellos empleados cuyo número de departamento 
--esté entre el 8 y el 12 (ambos excluidos).

SELECT *
FROM employees
WHERE department_id > 8 AND department_id < 12;

--Seleccionar todos los países que contengan una letra a en la segunda posición.

SELECT *
FROM countries
WHERE country_name ILIKE '_a%';

--Seleccionar el nombre y apellidos de los empleados cuyo salario bruto anual 
--sea mayor o igual que 100000$, y que no sean contables (job_id = 6).

SELECT first_name, last_name
FROM employees
WHERE (salary*12)>=100000 AND NOT department_id = 6;

--Seleccionar aquellos departamentos cuyo nombre contenga dos letras t.

SELECT *
FROM departments
WHERE department_name ILIKE '%t%t%';

--Seleccionar las localizaciones que estén en las ciudades de 
--Toronto u Oxford, o bien en el estado de California.

SELECT *
FROM  locations
WHERE city='Toronto' OR city='Oxford' OR state_province='California';

--Consulta anterior corregida

SELECT *
FROM locations
WHERE city IN ('Toronto','Oxford') OR state_province = 'California';

--Otra forma de hacer la consulta anterior

SELECT *
FROM locations
WHERE LOWER(city) IN ('toronto','oxford') OR state_province = 'California';