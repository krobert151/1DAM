--Selecciona los datos meteorológicos para aquellas estaciones 
--cuyo nombre contenga la letra E, en los últimos días de mes de 
--Febrero, Marzo y Abril de 2019. Ordena los resultados por provincia
--ascendentemente, estación ascendentemente y fecha, descendentemente.

SELECT *
FROM climatologia
WHERE fecha BETWEEN '2019,02,15' and '2019,02,28'
OR fecha BETWEEN '2019,03,15' and '2019,03,31'
OR fecha BETWEEN '2019,04,15' and '2019,04,30'
AND estacion LIKE '%E%';