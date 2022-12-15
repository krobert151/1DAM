SELECT *
FROM climatologia;

--Seleccionar el nombre de la estación, la fecha y temperaturas máxima y mínima cuya 
--temperatura máxima estuviera entre 30 y 40 grados, siempre que la fecha sea de Julio 
--o Agosto del 2019. Ordena la salida por fecha.

SELECT estacion, fecha, temperatura_maxima, temperatura_minima
FROM climatologia
WHERE temperatura_maxima BETWEEN 30 AND 40  
AND  (fecha::text LIKE '2019-07%' OR fecha::text LIKE '2019-08%')
ORDER BY fecha;


--Selecciona la precipitación total media para todas las estaciones meteorológicas de 
--la provincia de Sevilla para el mes de Abril de 2019. Redondea el resultado con 2 decimales

SELECT  ROUND(AVG(precipitacion_total),2)
FROM climatologia
WHERE provincia='Sevilla'
AND  fecha::text LIKE  '2019_04%';

--Selecciona los datos meteorológicos para aquellas estaciones cuyo nombre contenga la letra 
--E, en los últimos días del mes de Febrero, Marzo y Abril de 2019. Ordena los resultados por 
--provincia ascendentemente, estación ascendentemente y fecha, descendentemente.

--Selecciona la suma de la precipitación total acumulada en Galicia durante el mes de Septiembre de 2019

--Selecciona el porcentaje de precipitación de cada tramo de horas (0 a 6, 6 a 12, 12 a 18, 18 a 24) 
--con respecto de la precipitación total para las estaciones de Castilla La Mancha en la primavera de 
--2019 (21 Marzo a 20 de Junio). Como resultado de la consulta debe aparecer la fecha, estación, 
--provincia, precipitación total y los porcentajes de cada tramo horario. Redondea los porcentajes 
--con 2 decimales.

SELECT fecha, estacion, provincia, precipitacion_total,
ROUND((precipitacion_0_a_6/ precipitacion_total)*100,2) AS "% de 0 a 6",
ROUND((precipitacion_6_a_12/ precipitacion_total)*100,2)AS "% de 6 a 12",
ROUND((precipitacion_12_a_18/ precipitacion_total)*100,2)AS "% de 12 a 18",
ROUND((precipitacion_18_a_24/ precipitacion_total)*100,2)AS "% de 18 a 24"
FROM climatologia
WHERE provincia IN ('Albacete', 'Cuidad Real', 'Toledo', 'Cuenca', 'Guadalajara')
AND fecha BETWEEN '2019-03-21'::date AND '2019-06-20'::date
AND precipitacion_total > 0;

--Selecciona todos los datos de aquellas estaciones que han tenido algún día  con una precipitación 
--total de más de 50 litros por metro cuadrado, y donde el % de la precipitación caída de 6 a 12 
--horas sea entre el 60 y el 80%. Ordena la salida por precipitación total descendente, y fecha 
--ascendente.