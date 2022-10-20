package ejercicio13;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Realizar un programa que calcule el salario mensual de un vendedor. Este será el resultado de
		un sueldo fijo 1000€ mensuales más un porcentaje de las ventas realizadas. Lo que se cobra
		por ventas se calculará mediante el 20 % de lo vendido en total al mes.
		 */
		double total, sFijo=1000, porcentaje=20,vendido;
		int cien=100, sino;
		do {
		System.out.println("Bienvenidos al programa que calcula el salario mensual de un vendedor");
		System.out.println("Seleccione cuanto ha vendido en total este mes");
		vendido=Leer.datoDouble();
		total=sFijo+(porcentaje*vendido/cien);
		System.out.printf("El vendedor obtendrá un salario de %.2f€\n\n",total);
		System.out.println("¿Desea calcular el salario de otro vendedor?");
		System.out.println("1.- Si");
		System.out.println("2.- No");
		sino=Leer.datoInt();
		}while(sino==1);
		System.out.println("Gracias por usar el programa");
	}

}
