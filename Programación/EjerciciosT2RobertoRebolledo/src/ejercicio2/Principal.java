package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Leer dos números doubles. Vamos a dividir el primero entre el segundo y se debe mostrar un
		mensaje de error si el segundo es cero ANTES de hacer la operación. Mostrar el resultado de
		la división con dos decimales si no lo es.
		 */

		double num1, num2, igual;
		
		System.out.println("Bienvenidos al programa que divide dos números");
		System.out.println("Introduzca el primer número");
		num1=Leer.datoDouble();
		System.out.println("Introduzca el segundo número");
		num2=Leer.datoDouble();
		
		if (num2==0) {
			System.out.println("Error, no puedes dividir entre 0");
			
		}else {
			igual=num1/num2;
			System.out.printf("%.2f es el resultado de la división",igual);
		}
		
		System.out.println("\n\nGracias por usar el programa.");
		
	}

}
