package ejercicio7;

import utilidades.Leer;

public class PPal {

	public static void main(String[] args) {
		/*Pedir números hasta que se introduzca uno negativo, y calcular la media.*/


		int div=0,repetir,suma=0,media,num;
		
		System.out.println("Bienvenidos al programa");
		
		do {
			
			do {
				
				System.out.println("Seleccione un número");
				num=Leer.datoInt();
				suma+=num;
				div++;	

												
			}while(num>0);
			
			media=suma/div;
			System.out.printf("La media es %d \n",media);
			
			
			
			System.out.println("1.- Repetir");
			System.out.println("0.- Salir");
			repetir=Leer.datoInt();
		}while(repetir!=0);
		
		
		
	}

}
