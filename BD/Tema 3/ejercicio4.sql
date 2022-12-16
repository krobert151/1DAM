SELECT *
FROM climatologia;

--Selecciona la media de la temperatura media de todas las estaciones meteorológicas de 
--Andalucía que comiencen por AL para el mes de mayo de 2019. Ojo, no se puede utilizar 
--LIKE ni ILIKE.

SELECT ROUND(AVG(temperatura_media),2)
FROM climatologia
WHERE provincia IN ('Almería','Cádiz','Córdoba','Huelva','Jaén','Granada','Málaga','Sevilla') 
AND (fecha <= '2019-05-31' AND fecha >= '2019-05-01') 
AND (starts_with (estacion,'Al'));

--Correccion 

SELECT ROUND(AVG(temperatura_media),2)
FROM climatologia
WHERE provincia IN ('Almería','Cádiz','Córdoba','Huelva','Jaén','Granada','Málaga','Sevilla') 
AND fecha BETWEEN '2019-05-01'::date AND '2019-05-31'::date 
AND (STARTS_WITH (UPPER(estacion),'AL'));




--Selecciona los datos meteorológicos de la provincia de Jaén para el mes de Noviembre de 
--2019. Debe aparecer la fecha, estación, temperatura_media y la precipitacion_total. La 
--precipitación total no debe aparecer como un número, sino que debe aparecer como un texto
--, con las siguientes equivalencias

--		>= 50 litros: CHUZOS DE PUNTA
--		40 <= precipitacion < 50: A CÁNTAROS
--		25 <= precipitacion < 40: MUCHA LLUVIA
--		10 <= precipitacion < 25: FALTA LE HACÍA AL CAMPO
--		< 10: HA LLOVIDO POCO
--		0 o null: NO HA LLOVIDO

--			Ordena la salida por fecha ascendente y estación ascendente.

SELECT fecha, estacion ,temperatura_media ,
CASE  
	WHEN precipitacion_total > 50 then 'CHUZOS DE PUNTA'
	WHEN precipitacion_total BETWEEN 40 AND 49 then 'A CÁNTAROS'
	WHEN precipitacion_total BETWEEN 25 AND 39 then 'MUCHA LLUVIA'
	WHEN precipitacion_total BETWEEN 10 AND 24 then 'FALTA LE HACÍA AL CAMPO'
	WHEN precipitacion_total < 10 then'HA LLOVIDO POCO'
	WHEN precipitacion_total IS NULL then 'NO HA LLOVIDO'
	
	END as "precipitacion_total"
FROM climatologia
WHERE provincia = 'Jaén'
ORDER BY fecha , estacion DESC;

--Selecciona, mostrando todos los datos en mayúsculas, aquellos datos de climatología 
--donde la hora de máxima temperatura fueran las 14:00 para un día cualquiera de Marzo 
--de 2019 de Asturias o Cantabria

SELECT fecha, UPPER(estacion), UPPER(provincia), 
temperatura_minima,hora_temperatura_maxima, temperatura_maxima, 
hora_temperatura_minima, temperatura_media, racha_viento, hora_racha_viento, 
velocidad_maxima_viento, hora_velocidad_maxima_viento, precipitacion_total, 
precipitacion_0_a_6, precipitacion_6_a_12, precipitacion_12_a_18, precipitacion_18_a_24
FROM climatologia
WHERE hora_temperatura_maxima = '14:00'
AND fecha::text ILIKE '2019_03%'
AND provincia IN ('Asturias','Cantabria');

--Invéntate el enunciado de una consulta que
--	No sea SELECT *
--	Tenga al menos tres condiciones a cumplir (unidas por and o por or)
--	Que utilice alguna función de cadena de caracteres
--	Que utilice alguna función numérica
--	Que tenga algún orden

SELECT temperatura_media, provincia || ' - España' AS "provincias_de_espania", estacion, 
ROUND((precipitacion_0_a_6*precipitacion_6_a_12)/2,2) AS "precipitacion_de_0_a_12",
ROUND((precipitacion_12_a_18*precipitacion_18_a_24)/2,2) AS "precipitacion_de_12_a_24"
FROM climatologia
WHERE precipitacion_total > 10
AND  precipitacion_0_a_6>0
AND  precipitacion_6_a_12>0
AND  precipitacion_12_a_18>0
AND  precipitacion_18_a_24>0
ORDER BY temperatura_media DESC, precipitacion_de_0_a_12, precipitacion_de_12_a_24;
