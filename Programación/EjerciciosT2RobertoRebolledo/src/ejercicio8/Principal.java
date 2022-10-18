package ejercicio8;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Leer una secuencia de 10 números y mostrar solo la suma y el producto de todos ellos.*/ 
	
		int cant=0, cantFinal=10;
		double suma=0, producto=1, num;
		System.out.println("Bienvenido al programa que te calcila la suma y el producto de 10 números.\n");
		while(cant<cantFinal){
			System.out.println("Introduzca un número");
			num=Leer.datoDouble();
			suma+=num;
			producto*=num;
			cant++;
		};
		System.out.printf("\nEl producto de los números sería %.2f y la suma %.2f",producto,suma);
		System.out.println("\n\nGracias por usar el programa");
	}

}
