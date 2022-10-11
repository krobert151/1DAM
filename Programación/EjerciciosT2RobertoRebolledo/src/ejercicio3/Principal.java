package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Leer un número que será la cantidad de dinero que una persona quiere retirar de su cuenta
		bancaria. Mostrar un mensaje diciendo que “no es posible” si la cantidad que se quiere retirar
		es mayor que el saldo de la cuenta y el nuevo saldo si se ha podido retirar.*/
		
		double saldoCuenta=10000, retirar;
		
		System.out.println("Bienvenidos al programa que retira dinero de tu cuenta bancaria.\n");
		
		System.out.println("Seleccione la cantidad a sacar.");
		retirar=Leer.datoDouble();
		
		if (saldoCuenta>=retirar) {
			
			saldoCuenta=saldoCuenta-retirar;
			System.out.printf("Usted ha retirado una cantidad de %.2f€ y le quedan %.2f€ de saldo",retirar,saldoCuenta);
		}else {
			System.out.println("Lo sentimos no podemos retirar tal cantidad de dinero, por favor intenelo de nuevo con una cantidad inferior.");
		}
		
		System.out.println("\n\nGracias por usar nuestro programa.");
	}

}
