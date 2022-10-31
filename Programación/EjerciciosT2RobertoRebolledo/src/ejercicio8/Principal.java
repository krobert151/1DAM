package ejercicio8;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Leer una secuencia de 10 números y mostrar solo la suma y el producto de todos ellos.*/ 
	
		int cant=0, cantFinal=10;
		double suma=0, producto=1, num;
		System.out.println("Bienvenido al programa que te calcula la suma y el producto de 10 números.\n");
		do {
			System.out.println("Introduzca un número, pulse un número negativo para salir");
			num=Leer.datoDouble();
			while(cant<cantFinal){
				suma+=num;
				producto*=num;
				cant++;
			};
		System.out.printf("\nEl producto de los números sería %.2f y la suma %.2f",producto,suma);
		}while(num>=0);
		System.out.println("\n\nGracias por usar el programa");
	}

}
