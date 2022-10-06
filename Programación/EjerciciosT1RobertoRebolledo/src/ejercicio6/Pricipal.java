package ejercicio6;

import utilidades.Leer;

public class Pricipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realizar un programa que escriba el precio de un producto en una compra, 
		 * una vez descontado el tanto por ciento de descuento, dando nosotros en la
		 *  declaración de las variables el precio inicial y el tanto por ciento que 
		 *  se va a descontar. Ojo, el cálculo del tanto por ciento lo debe hacer el 
		 *  programa no el usuario, por ejemplo:*/
		
		double precio, cien=100, porcentaje, descontado, total;
		
		System.out.println("Bienvenidos al programa que muestra el descuento de un producto.");
		
		System.out.print("Precio = ");
		precio=Leer.datoDouble();
		
		System.out.print("Descuento = ");
		porcentaje=Leer.datoDouble();
		
		descontado=precio*porcentaje/cien;
		total=precio-descontado;
		
		System.out.printf("Se han descontado %2.2f€, el precio total del producto sería de %2.2f€.\n",descontado,total);
		
		System.out.println("Gracias por usar nuestro programa.");
		
		
		
		

	}

}
