SELECT *
FROM locations;

SELECT *
FROM regions;

SELECT *
FROM departments;

SELECT *
FROM countries;

SELECT *
FROM regions;

SELECT *
FROM employees;

SELECT *
FROM employees, departments,jobs
where employees.department_id = 
		departments.department_id
		AND employees.job_id = jobs.job_id
		AND salary> 10000
		ORDER BY salary DESC;
		
SELECT *
FROM employees, departments;

SELECT * 
FROM employees CROSS JOIN departments;

SELECT *
FROM employees NATURAL JOIN departments;

SELECT *
FROM employees e1 JOIN employees e2 ON (e1.manager_id = e2.employee_id);

SELECT * 
FROM employees  JOIN departments USING (department_id)
WHERE department_name ILIKE 'executive';

SELECT DISTINCT department_name
FROM departments JOIN employees USING (department_id)
WHERE salary BETWEEN 8000 AND 10000;


SELECT first_name, last_name
FROM employees JOIN departments USING (department_id) 
JOIN locations USING (location_id)
WHERE city != 'Oxford'; 

SELECT COUNT(*)
FROM employees JOIN departments USING (department_id) 
JOIN locations USING (location_id)
JOIN countries USING (country_id)
JOIN regions USING (region_id)
WHERE region_name = 'Europe';

/*Seleccionar el nombre, los apellidos y el email de los empleados 
que trabajen en una oficina del Reino Unido (United Kindom)*/


SELECT first_name, last_name, email
FROM employees JOIN departments USING (department_id)
JOIN locations USING (location_id)
JOIN countries USING (country_id)
WHERE country_name = 'United Kingdom';

/*Seleccionar el número total de empleados que trabajan en las regiones de América y Asia*/

SELECT count(*) AS "Número total de empleados"
FROM employees JOIN departments USING (department_id)
JOIN locations USING (location_id)
JOIN countries USING (country_id)
JOIN regions USING (region_id)
WHERE region_name IN ('Americas','Asia');

SELECT count(distinct manager_id) AS "Número total de empleados"
FROM employees JOIN departments USING (department_id)
JOIN locations USING (location_id)
JOIN countries USING (country_id)
JOIN regions USING (region_id)
WHERE region_name IN ('Americas','Asia');

/*Seleccionar el nombre de aquellos departamentos en los que trabaja un 
empleado que fue contratado a lo largo del año 1993.*/

SELECT department_name
FROM employees JOIN departments USING(department_id)
WHERE hire_date::text ILIKE '1993%';

/*Seleccionar la región de los empleados con un salario inferior a 10000$*/

SELECT region_name
FROM employees JOIN departments USING (department_id)
JOIN locations USING (location_id)
JOIN countries USING (country_id)
JOIN regions USING (region_id)
WHERE salary < 10000;



