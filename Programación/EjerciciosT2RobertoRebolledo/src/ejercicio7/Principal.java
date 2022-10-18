package ejercicio7;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/* Leer un número entero y mostrar su tabla de multiplicar.
*/
		int num1, num2=1,cant=10,total;
		System.out.println("Bienvenidos al programa que te calcula la trabla de multiplicar de un número entero\n");
		System.out.println("Seleccione el número a multiplicar\n");
		num1=Leer.datoInt();
		System.out.println("\n");
		while(num2<=cant){
			
			total=num1*num2;
			System.out.printf("%dx%d=%d\n",num1,num2,total);
			num2++;
		
			
			
		};
		
	}

}
