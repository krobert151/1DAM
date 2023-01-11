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

SELECT *
FROM locations;

SELECT *
FROM departments;

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