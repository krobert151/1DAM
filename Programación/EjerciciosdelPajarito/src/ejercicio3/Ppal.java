package ejercicio3;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		/*Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.*/
		
		double num,par;
		System.out.println("Bienvenidos al programa");
		
		do {
		System.out.println("Selecciona un número");
		num=Leer.datoDouble();
		
		if(num==0) {
			
			System.out.println("Has marcado un 0");
		}else{
			
			par=num%2;
			
			if(par==0) {
				
				System.out.printf("El número %.2f es par\n",num);
			}else {
				
				System.out.printf("El número %.2f es impar\n",num);
			}
			
			
		}
		
		}while(num!=0);
		System.out.println("Gracias por usar el programa");

	}

}
