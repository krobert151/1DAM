--Seleccionar el número de vuelos que salen desde Berlín y llegan a Londres en el último trimestre de 2020.

SELECT COUNT(*)
FROM vuelos
WHERE desde='Berlín'
AND (hasta='Londres'
AND salida BETWEEN '2020-09-01 00:00:00'::date AND '2020-12-31 23:59:59'::date);


--El precio final de un vuelo se obtiene aplicando el descuento al precio. Selecciona, mostrando todos 
--los datos del vuelo, incluido el precio con descuento, redondeado a dos decimales, aquellos vuelos 
--que salen en el mes de Diciembre de 2020 desde Sevilla o Málaga y llegan a Madrid o Barcelona.

SELECT id, salida, desde, llegada, hasta , precio
,COALESCE(descuento,0) AS "descuento",
ROUND(precio - ((precio* COALESCE(descuento,0) )/100),2) AS "precio_final"
FROM vuelos
WHERE desde IN ('Sevilla','Málaga')
AND hasta IN ('Madrid','Barcelona')
AND salida BETWEEN '2020-12-01 00:00:00'::date AND '2020-12-31 23:59:59'::date;


--Seleccionar, de entre los vuelos que no tienen descuento, aquellos que la fecha de llegada esté en la 
--primera quincena de Octubre, y hayan llegado al aeropuerto de Nueva York.

SELECT *
FROM vuelos
WHERE (descuento IS NULL OR descuento = 0)
AND llegada::text ILIKE '%-10-%'
AND RIGHT(LEFT(llegada::text,10),2)::int BETWEEN 1 AND 15
AND hasta='Nueva York';


--Selecciona los vuelos que saldrán en el mes de Enero de 2021 desde Ámsterdam y llegarán entre las 09:00 
--y 09:59 de la mañana. PISTA: puedes comparar la fecha de llegada como texto.

SELECT *
FROM vuelos
WHERE (salida BETWEEN '2021-01-01 00:00:00' AND '2021-01-31 23:59:59') AND desde = 'Ámsterdam' 
AND llegada::text LIKE '%-%-% 09:%:%';


--Selecciona, mostrando todos los datos del vuelo, mostrando el precio final, todos 
--los vuelos que saldrán de Sevilla en 2021.
--Además, debes mostrar este mensaje según el precio del vuelo
--PRECIO < 60 - ¡OFERTÓN!
--60 <= PRECIO < 120 ECONÓMICO
--120 <= PRECIO < 200 NORMAL
--200 <= PRECIO < 300 CARO
--PRECIO >= 300 MUY CARO
SELECT CASE 
WHEN  COALESCE(ROUND(precio * (1-(descuento/100)),2),precio ) < 60 THEN '¡OFERTÓN!'
WHEN  COALESCE(ROUND(precio * (1-(descuento/100)),2),precio ) >=60 AND 
COALESCE(ROUND(precio * (1-(descuento/100)),2),precio ) <120 THEN 'ECONOMICO'
WHEN  COALESCE(ROUND(precio * (1-(descuento/100)),2),precio ) >=120 AND 
COALESCE(ROUND(precio * (1-(descuento/100)),2),precio ) <200 THEN 'NORMAL'
WHEN  COALESCE(ROUND(precio * (1-(descuento/100)),2),precio ) >=200 AND 
COALESCE(ROUND(precio * (1-(descuento/100)),2),precio ) <300 THEN 'CARO'
WHEN  COALESCE(ROUND(precio * (1-(descuento/100)),2),precio ) > 300 THEN 'MUY CARO'
END AS "Rentabilidad",id, salida, desde, llegada, hasta , precio
,COALESCE(descuento,0) AS "descuento",
ROUND(precio - ((precio* COALESCE(descuento,0) )/100),2) AS "precio_no_chachi",--forma mediochachi
COALESCE(ROUND(precio * (1-(descuento/100)),2),precio ) AS "precio_chachi"--forma tela de chachi

FROM vuelos
WHERE desde ='Sevilla'
AND salida::text ILIKE '2021%';

