package Ejercicio16;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Generar los N primeros términos de la serie de Fibonacci. El valor N (entero y positivo) deberá
		ser leído por el teclado. En esta serie los dos primeros números son 1, y el resto se obtiene
		sumando los dos anteriores: 1, 1, 2, 3, 5, 8, 13, 21…Se realizan N veces el paso de sumar.*/
		
		
		int N=0,num1=1,num2=0,suma;
		System.out.println("Bienvenidos al programa");
		
		do {
			System.out.println("\nSeleciona cuantas veces quieres repetir la suceción de Fibonaci");
			System.out.println("Pulse 0 para cerrar el programa");
			N=Leer.datoInt();
			
			for (int i = 0; i < N; i++) {
				suma=num1+num2;
				num1=num2;
				num2=suma;
				System.out.print(suma+", ");
						
			}
			suma=0;
			num1=1;
			num2=0;
			
		}while(N!=0);
		System.out.println("Gracias por usar el programa");
	}

}
