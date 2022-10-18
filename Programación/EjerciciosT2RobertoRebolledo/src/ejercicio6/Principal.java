package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Realizar un programa dirigido por menús que solicite el peso de una persona, y escriba por pantalla su peso en cualquier planeta del Sistema Solar. */
		
		double peso,eMercurio=0.38, eVenus=0.91, eTierra=1, eMarte=0.38, eJupiter=2.53, eSaturno=1.06, eUrano=0.92, eNeptuno=1.2, total;
		int planeta, sino;
		
		
		
		System.out.println("Bienvenidos al programa que calcula tu peso en cualquier plaeta del sistema solar.");
		System.out.println("Primero dime cuanto pesas (en KG)");
		peso=Leer.datoDouble();
		do {
		System.out.println("Selecciona el planeta en el que quieres que se calcule tu peso\n");			
		System.out.println("1.- Mercurio");
		System.out.println("2.- Venus");
		System.out.println("3.- Tierra");
		System.out.println("4.- Marte");
		System.out.println("5.- Júpiter");
		System.out.println("6.- Saturno");
		System.out.println("7.- Urano");
		System.out.println("8.- Neptuno");
		planeta=Leer.datoInt();
		switch(planeta) {
		
			case 1: 
				total = peso*eMercurio;
				System.out.printf("En el planeta Mercurio su peso es %.2fKg",total);
				break;
			case 2: 				
				total = peso*eVenus;
				System.out.printf("En el planeta Venus su peso es %.2fKg",total);
				break;
			case 3: 				
				total = peso*eTierra;
				System.out.printf("En el planeta Tierra su peso es %.2fKg",total);
				break;
			case 4: 				
				total = peso*eMarte;
				System.out.printf("En el planeta Marte su peso es %.2fKg",total);
				break;
			case 5: 				
				total = peso*eJupiter;
				System.out.printf("En el planeta Jupiter su peso es %.2fKg",total);
				break;
			case 6: 				
				total = peso*eSaturno;
				System.out.printf("En el planeta Saturno su peso es %.2fKg",total);
				break;
			case 7: 				
				total = peso*eUrano;
				System.out.printf("En el planeta Urano su peso es %.2fKg",total);
				break;
			case 8: 				
				total = peso*eNeptuno;
				System.out.printf("En el planeta Neptuno su peso es %.2fKg",total);
				break;			
			default: 
				System.out.println("No es un planeta, vuelva a intentarlo.");
			}
		
		System.out.println("\n\n¿Quieres volver a repetir?");
		System.out.println("1.- Si");
		System.out.println("2.- No");
		sino=Leer.datoInt();
		
		}while(sino==1);
		
		System.out.println("\n\nGracias por usar nuestra báscula.");
		
	}

}
