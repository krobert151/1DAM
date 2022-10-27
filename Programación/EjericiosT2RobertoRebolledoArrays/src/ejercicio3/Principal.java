package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Crear un array de enteros unidimensional de 8 posiciones. 
		 * Rellenarlo con números leídos por teclado y mostrar la media 
		 * de todos los elementos y la cantidad de números “cero” introducidos.*/
		int tam=8, cero=0;
		int [] numeros;
		double suma=0,total;
		System.out.println("Bienvenidos al programa");
		numeros= new int [tam];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca el "+(i+1)+"º número");
			numeros[i]=Leer.datoInt();
			if(numeros[i]==0){
				cero++;
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			suma+=numeros[i];
		}
		total=suma/tam;
		System.out.printf("La media de los núemros sumados es de %.2f y la cantidad de 0 es de %d\n",total,cero);		
		
		
	}

}
