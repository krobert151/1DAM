package ejericio2;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		/*Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.*/
		double num;
		System.out.println("Bienvenidos al programa");
		
		do {
		System.out.println("Selecciona un número");
		num=Leer.datoDouble();
		
		if(num==0) {
			
			System.out.println("Has marcado un 0");
		}else{
			
			if(num<0) {
				
				System.out.printf("El número %.2f es negativo\n",num);
			}
			
			if(num>0) {
				
				System.out.printf("El número %.2f es positivo\n",num);
			}
			
			
		}
		
		}while(num!=0);
		System.out.println("Gracias por usar el programa");
		
	}

}
