package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		/*Implementar un programa que rellene automáticamente un array de 
		 * enteros con 10 posiciones, cada elemento debe contener el valor del 
		 * doble de su índice. Mostrar el resultado por pantalla.*/ 

		int tam=10;
		int [] numeros;
		System.out.println("Bienvenidos al programa");
		numeros = new int [tam];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(i+1)*2;
			System.out.println("Número "+(1+i)+" es igual a "+numeros[i]);
		}
		
		System.out.println("Gracias por usar el programa");
		
		
		
	}

}
