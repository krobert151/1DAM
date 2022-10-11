package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*¡Qué follón! Mi pueblo ha tenido cortes de agua este verano debido a la sequía. Han tenido
que abrir pozos. La capacidad de sacar agua de los pozos se cuenta por litros por segundo
y la capacidad del depósito para guardar el agua en metros cúbicos. Serías capaz de crear
un programa que calcule cuántos metros cúbicos se sacan de uno de los pozos que tiene
un caudal de 8 litros por segundo si está conectado 24 horas.*/
		
		double Ls, m3L=1000, m3s, sh=3600, h ,total;
		
		System.out.println("Bienvenido al programa, vamos a calcular cuantos m³ sacamos del pozo");
		System.out.println("Primero introduzca cuantos litros saca tu pozo por segundo. ");
		Ls=Leer.datoDouble();
		System.out.println("Durante cuántas horas va a estar abierto el pozo?");
		h=Leer.datoDouble();
		m3s=Ls/m3L;//Calculamos cuantos m³ produce por segundo.
		total=m3s*sh*h;	
		System.out.printf("Durante %2.2f horas el pozo ha sacado %2.2f m³ de agua ",h,total);
		
		
		

	}

}
