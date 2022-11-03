package ejercicio6;

import java.util.Iterator;

import utilidades.Leer;

public class principal {

	public static void main(String[] args) {
		/*Muestra los valores de un array con números double, por ejemplo, precios o pagos de algo,
		imprimiendo también la cabecera de dichos valores. Las cabeceras deben estar en otro array
		de String, por ejemplo:
									Enero febrero marzo
									1200.55 2500.45 800.50*/

		int tam, continuar;
		double num [];
		String nombre[];
		System.out.println("Bienvenidos al prgrama");
		
		System.out.println("¿Cuántos productos hay?");
		tam=Leer.datoInt();
		num= new double [tam];
		nombre = new String [tam];
		
		do {
		
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Seleccione el nombre del "+(1+i)+" º producto");
			nombre[i]=Leer.dato();
			System.out.println("Seleccione el precio del "+(1+i)+" º producto");
			num[i]=Leer.datoDouble();
		}
		
		
		for (int i = 0; i < nombre.length; i++) {
			System.out.print(nombre[i]);
			System.out.printf("\t");
		}
		System.out.println(" ");
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%.2f",num[i]);
			System.out.print("\t");
		}
		System.out.println(" ");
		System.out.println("¿Quiere continuar?");
		System.out.println("1.- Si");
		System.out.println("0.- No");
		continuar=Leer.datoInt();
		}while(continuar!=0);
		System.out.println("Gracias por usar el programa");
		
	}

}
