package Ejemplolectura;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1=0.00, num2=0.00, suma=0.00;
		String nombre;
		
		
		System.out.println("Por favor, introduzca el nombre.");
		nombre=Leer.dato();
		System.out.println("Bienvenido al programa "+nombre+", vamos a sumar dos números");
		
		System.out.println("Dime el priemer número");
		
		num1=Leer.datoDouble();
		
		System.out.println("Dime el segundo");
		
		num2=Leer.datoDouble();
		
		suma=num1+num2;
		
		System.out.printf("El resultado es %2.2f\n",suma);
		System.out.println("Gracias por usar el programa");
		
		
		
		
		
	}

}
