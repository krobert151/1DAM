package ejercicio9;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Leer una secuencia de números, hasta que el usuario introduzca un número negativo
		 *  y mostrar la suma total de dichos números sin contar el negativo.*/ 
		double num,suma=0,cero=0;
		
		System.out.println("Bienvenidos al programa.\n");
		
		do {
			System.out.println("Seleccione un número");
			num=Leer.datoDouble();
			if(num>=cero){
				suma+=num;
			};		
			
		}while(num>=cero);
		
		System.out.printf("%.2f es el resultado de la suma\n\n",suma);
		System.out.println("Gracias por usar el programa.");
		
		
	}

}
