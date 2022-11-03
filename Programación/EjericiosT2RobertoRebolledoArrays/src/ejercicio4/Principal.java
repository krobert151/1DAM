package ejercicio4;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Rellenar un array unidimensional de 10 posiciones con números aleatorios entre 1 y 99 y mostrar el 
		 * número guardado en un lugar que indique el usuario por teclado.*/
		int tam=10, max=99, min=1,selec,bucle;
		int num[];
		Random r= new Random (System.nanoTime() );
		System.out.println("Bienvenido al programa que guarda 10 números aleatorios");
		num = new int [tam];
		
		do {
			System.out.println("Seleccione una opción");
			System.out.println("1.-Generar números aleatorios");
			System.out.println("2.-Mostrar los números");
			System.out.println("0.-Salir");
			bucle=Leer.datoInt();
			
			switch(bucle) {
			
				case 1:
					for (int i = 0; i < num.length; i++) {
						
						num[i]=r.nextInt(max-min)+min;
			
					}
					System.out.println("Números generados");
					
					break;
			
				case 2:
					do{
						System.out.println("Selecciona la posición del número que se encuentra entre el "+min+" o el "+max+" o seleccione 0 para salir");
						selec=Leer.datoInt();
						System.out.println("Ha seleccionado la posición número "+selec);
						System.out.println(num[selec-1]);
						
					}while(selec!=0);
					break;
					
					
				case 0:
					break;
				
				default:
					System.out.println("No disponible, por favor selecciona una opción disponible");
					break;
					
					
			}
			
		
		}while(bucle!=0);
		System.out.println("Gracias por usar el programa");
		
	}

}
