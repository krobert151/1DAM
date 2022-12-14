SELECT *
FROM demografia_basica;

SELECT SUM(hombres)
FROM demografia_basica
WHERE (provincia='Cáceres' OR provincia='Badajoz')AND anio BETWEEN 2002 AND 2003;

SELECT *
FROM demografia_basica
WHERE hombres>=600000 OR mujeres>=600000
ORDER BY provincia DESC, anio DESC;

SELECT *
FROM demografia_basica
WHERE (hombres>=600000 OR mujeres>=600000)
AND anio BETWEEN 2014 AND 2019
ORDER BY provincia DESC, anio DESC;

SELECT * 
FROM demografia_avanzada
WHERE (provincia='Cádiz' OR
	   provincia='Huelva' OR
	   provincia='Sevilla' OR
	   provincia='Málaga' OR
	   provincia='Córdoba' OR
	   provincia='Jaén' OR
	   provincia='Almería' OR
   	   provincia='Granada')
AND sexo='M'
AND (rango_edad='De 20 a 24 años' OR rango_edad='De 25 a 29 años')
ORDER BY numero_habitantes ASC;

--Selecciona el número de hombres que vivían en la comunidad 
--de Madrid entre los años 2010 y 2015 (ambos inclusive), 
--donde el rango de edad sea menores de 20 años o mayores de 
--65 (demografia_avanzada). La salida se debe ordenar por anio 
--(menor a mayor), número de habitantes (mayor a menor) y edad 
--(menor a mayor)

SELECT *
FROM demografia_avanzada
WHERE provincia='Madrid'
AND sexo='H'
AND anio BETWEEN 2010 AND 2015
AND (edad_mayor<20 OR edad_mayor<65)
ORDER BY anio ASC, numero_habitantes DESC, rango_edad ASC;
	   