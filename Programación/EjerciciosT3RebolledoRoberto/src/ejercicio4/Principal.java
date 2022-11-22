package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Cuando era pequeño me mandaban a copiar determinadas frases cuando hacía algo mal para no olvidarlo.
		Realizar un programa que lea un texto del teclado y un número entero y muestre en pantalla dicho texto
		una cantidad de veces igual al número introducido. La clase se puede llamar "Copiado".*/
		int num;
		String texto;
		Copiado c1= new Copiado();
		System.out.println("Seleccione la Frase");
		texto=Leer.dato();
		System.out.println("Seleccione cuantas veces quieres copiarla");
		num=Leer.datoInt();
		c1.ImprimirText(num, texto);		
		
	}

}
