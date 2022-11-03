--Selecciona la suma de la precipitación total acumulada en Galicia 
--durante el mes de Septiembre de 2019
SELECT sum(precipitacion_total)
FROM climatologia
WHERE provincia='Galicia'
AND fecha BETWEEN '2019,09,01' and '2019,09,30'