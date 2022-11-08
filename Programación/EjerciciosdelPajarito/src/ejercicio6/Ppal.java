package ejercicio6;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		/*Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.*/

		double num,suma=0;
		int repetir;
		
		System.out.println("Bienvenidos al programa");
		
		do {
			
			do {
				
				System.out.println("Delcara un número");
				num=Leer.datoDouble();
				suma+=num;
				
				
			}while(num!=0);
			
			System.out.printf("La suma de los numeros es %.2f\n",suma);
			
			System.out.println("¿Quieres volver a realizar el programa?");
			System.out.println("1.- Si");
			System.out.println("0.- No");
			repetir=Leer.datoInt();
			
		}while(repetir!=0);
		
		
		
	}

}
