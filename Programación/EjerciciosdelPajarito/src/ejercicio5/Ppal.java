package ejercicio5;

import java.util.Random;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		/*Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
cuando el usuario acierta.
*/
		
		int oculto,max,min,num,repetir;
		Random r= new Random (System.nanoTime());
		System.out.println("Bienvenidos al programa");
		
		
		do {
			
			System.out.println("Selecciona un número máximo a elegir");
			max=Leer.datoInt();
			System.out.println("Selecciona un número mínimo a elegir");
			min=Leer.datoInt();
			oculto=r.nextInt(max-min+1)+min;
			
			do {
				
				System.out.println("Seleccione un número");
				num=Leer.datoInt();
				if(num==oculto) {
					
					System.out.println("Número acertado");
					
				}else {
					
					if(num<oculto) {
						
						System.out.println("Un poquito más");
						
					}
					if(num>oculto) {
						
						System.out.println("Un poquito menos");
						
					}
							
				}
				
				
			}while(num!=oculto);
			
			System.out.println("¿Quieres volver a intentarlo?");
			System.out.println("1.- Si");
			System.out.println("0.- No");
			repetir=Leer.datoInt();
				
		}while(repetir!=0);
		
		System.out.println("Gracias por usar el programa");


	}

}
