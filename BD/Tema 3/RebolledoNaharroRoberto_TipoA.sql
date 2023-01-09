SELECT * 
FROM climatologia;


--Ejercicio 1

SELECT ROUND(AVG(precipitacion_total),2) AS "precipitacion_total_media"
FROM climatologia
WHERE provincia IN ('Huesca','Zaragoza','Teruel')
AND fecha::text ILIKE '2019-06%'
AND precipitacion_total < 20;

--Ejercicio2

SELECT (precipitacion_0_a_6+precipitacion_6_a_12+precipitacion_12_a_18+precipitacion_18_a_24) 
AS "suma_de_precipitaciones",*
FROM climatologia
WHERE fecha::text ILIKE '2019-02%'
AND (estacion ILIKE '%f%'
	OR estacion ILIKE '%t%'
	OR estacion ILIKE '%x%');
	
--Ejercicio 3

SELECT *
FROM climatologia
WHERE LEFT(estacion, 2) = 'Ba'
AND temperatura_maxima BETWEEN 25 AND 30
AND temperatura_minima < 15
AND (fecha::text ILIKE '2019-09%'
	OR fecha::text ILIKE '2019-10%');

--Ejercicio 4

SELECT estacion, provincia, fecha, racha_viento,
CASE 
WHEN racha_viento > 25 AND racha_viento <= 40 THEN 'Ventoso'
WHEN racha_viento > 40 AND racha_viento <= 60 THEN 'Muy ventoso'
WHEN racha_viento > 60 THEN 'Huracanado'
END AS "mensaje"
FROM climatologia
WHERE racha_viento > 25 
AND hora_racha_viento::text ILIKE '15:00'
AND (LEFT((RIGHT(fecha::text,5)),2) ILIKE '03'	
	OR LEFT((RIGHT(fecha::text,5)),2) ILIKE '04')
ORDER BY racha_viento ASC;

--Ejercicio 5

SELECT provincia, estacion, fecha, velocidad_maxima_viento,racha_viento, 
ROUND((temperatura_minima*100)/temperatura_maxima,2) || '%' AS "diferencia_temperaturas"
FROM climatologia
WHERE (temperatura_maxima IS NOT NULL AND temperatura_maxima >0) 
AND (temperatura_minima IS NOT NULL AND temperatura_minima >10)
AND (((temperatura_maxima-temperatura_minima)*100)/temperatura_maxima) BETWEEN 20 AND 30
ORDER BY provincia DESC, estacion DESC, fecha ASC;


