package ejercicio12;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Calcula la intensidad (I) que circulará por un circuito electrónico con una resistencia eléctrica
		(R) de 20 KΩ al que se le aplica una tensión (V) de 250 voltios. La fórmula es I=V/R. Da el
		resultado con dos decimales. (K=103 , busca la forma de escribir K sin necesidad de escribir
		1000)*/
		
		double I, R, V,K=1000;
		System.out.println("BIenvenidos al programa que calcula la intensidad de un circuito electrónico.");
		System.out.println("Introduzca la tensión.");
		V=Leer.datoDouble();
		System.out.println("Ahora introduzca la resistencia en KΩ.");
		R=Leer.datoDouble();
		I = V/(R*K);
		System.out.printf("La intensidad sería igual a %.4f A \n",I);
		System.out.println("Gracia spos usar nuestro programa.");
		
		

	}

}
