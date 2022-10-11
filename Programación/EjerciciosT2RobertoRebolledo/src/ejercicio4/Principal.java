package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Leer un número y mostrar por la salida estándar si dicho número es o no par.*/
		double num1, dos=2, cero=0;
		
		System.out.println("Bienvenidos al programa que calcula si un número es par o impar");
		System.out.println("\nSeleccione el número.");
		num1=Leer.datoDouble();
		if(num1%dos==cero) {
			System.out.println("El número es par.");
		}else {
			System.out.println("El número es impar.");
		}
	
		System.out.println("Gracias por usar el programa.");
	}

}
