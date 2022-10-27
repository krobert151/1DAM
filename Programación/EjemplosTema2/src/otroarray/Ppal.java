package otroarray;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam, pos,num, sino,exit,sino2,total=0;
		int []numeros;
		System.out.println("Bienvenidos al programa.");
		System.out.println("¿Cuántos números quiere introducir?");
		tam=Leer.datoInt();
		
		numeros=new int[tam];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca el "+(i+1)+"º número.");
			numeros[i]=Leer.datoInt();
		}
		
		System.out.println("\n");
		for (int j = 0; j < numeros.length; j++) {
			System.out.print("Número"+(j+1)+" = ");
			System.out.println(numeros[j]);
		}
		
		System.out.println("\nQuiere cambiar algún número");
		System.out.println("1.- Si");
		System.out.println("2.- No");
		sino=Leer.datoInt();
		if (sino==1) {
			
			do {
				System.out.println("Qué número deseas cambiar");
				pos=Leer.datoInt();
				System.out.println("Por qué número lo deseas cambiar");
				num=Leer.datoInt();
				numeros[pos-1] =num;
				
				System.out.println("\nQuiere volver a cambiar otro número");
				System.out.println("1.- Si");
				System.out.println("2.- No");
				exit=Leer.datoInt();
				
			}while(exit==1);
			
			for (int i = 0; i < numeros.length; i++) {
				System.out.print("Número"+(i+1)+" = ");
				System.out.println(numeros[i]);
				
			}
			
			System.out.println("\n¿Quiere sumar todos los número?");
			System.out.println("1.- Si");
			System.out.println("2.- No");
			sino2=Leer.datoInt();
			if (sino2==1) {
				
				for (int i = 0; i < numeros.length; i++) {
					
					total+=numeros[i];
					
				}
				System.out.println("EL total es "+total);
			}
			
		}
		
		System.out.println("\nGracias por usar el programa.");
		
		
		
	}

}
