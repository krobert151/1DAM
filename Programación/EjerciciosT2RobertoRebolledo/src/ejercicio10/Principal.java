package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Escriba un programa al que se le pasen dos números a y b y calcule y muestre la operación ab. No se puede usar la función pow ().*/

		double total=1,num1,num2;
		int cont=0;
		System.out.println("Bienvenido al programa que eleva un número a otro.\n");
		do {
			System.out.println("Introduzca el número que quiera elevar, pulse un número negativo para salir");
			num1=Leer.datoInt();
			System.out.println("Introduizca cuántas veces lo vas a elevar");
			num2=Leer.datoInt();		
			while(cont<num2) {
				total=total*num1;
				cont++;
			};	
			
			System.out.printf("\n\nEl resultado final sería de %.2f\n\n",total);
		}while(num1>=0);
		System.out.println("Gracias por usar nuetro programa.");
		
		
	}

}
