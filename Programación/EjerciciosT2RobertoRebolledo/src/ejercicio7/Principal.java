package ejercicio7;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/* Leer un número entero y mostrar su tabla de multiplicar.
*/
		int num1,num2=1, total=0, diez=10;
		System.out.println("Bienvenido a el programa que calcula una tabala de multiplicar" );
		System.out.println("\n¿De qué número quiere su tabla?\n");
		num1=Leer.datoInt();
		for(; num2 <= diez ; num2++) {
			total=num1*num2;
			System.out.printf("%d x %d = %d\n",num1,num2,total);
			
		}
		System.out.println("Gracias por usar nuestro programa.");
	}

}
