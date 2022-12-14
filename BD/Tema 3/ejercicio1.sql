SELECT *
FROM employees
WHERE department_id > 8 AND department_id < 12;

SELECT *
FROM countries
WHERE country_name LIKE '_a%';

SELECT first_name, last_name
FROM employees
WHERE (salary*12)>=100000 AND NOT department_id = 6;

SELECT *
FROM departments
WHERE department_name ILIKE '%t%t%';

SELECT *
FROM  locations
WHERE city='Toronto' OR city='Oxford' OR state_province='California';