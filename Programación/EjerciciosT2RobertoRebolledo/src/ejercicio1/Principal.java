package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Leer 2 números y determinar el mayor de ellos. Mejorar el programa mostrando también la
		posibilidad de que sean iguales.*/
		
		double num1,num2;
		
		System.out.println("Bienvenidos al programa que compara dos números.");
		System.out.println("Primero introduzca el primer número.");
		num1=Leer.datoDouble();
		System.out.println("Ahora introduzca el segundo número");
		num2=Leer.datoDouble();
		
		if (num1==num2) {
			System.out.println("Ambos números son inguales.");
		}
		if (num1>num2) {
			
			System.out.printf("%.2f es mayor que %.2f",num1,num2);
		}
		if (num2>num1){
			System.out.printf("%.2f es mayor que %.2f",num2,num1);
		}
		
		System.out.println("\n\nGracias por usar el programa");

		
		
	}

}
