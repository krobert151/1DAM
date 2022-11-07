package ejercicio4;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		/* Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.*/
		int cant=0,seguir;
		double num;
		System.out.println("Bienvenidos al programa");

		do {		
			
			do {
			
				System.out.println("Seleccione un número");
				num=Leer.datoDouble();
				cant++;
			
			}while(num>0);
			System.out.println("Ha regitrado "+(cant-1)+" numeros\n");
			System.out.println("Pulse 1 para repetir o pulse 0 para acabar");
			seguir=Leer.datoInt();
		}while(seguir!=0);
		
	}

}
