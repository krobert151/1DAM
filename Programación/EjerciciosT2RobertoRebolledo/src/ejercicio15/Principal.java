package ejercicio15;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Realizar una “mini-calculadora”, que realice las siguientes operaciones: suma, resta, 
		 * multiplicación, división y decir si un número es par o impar. Se hará con un menú, y 
		 * se pedirá en cada caso del switch los datos necesarios para realizar las operaciones. 
		 * Se valorarán las comprobaciones que se hagan sobre los datos introducidos 
		 * (por ejemplo, no dividir por cero).*/
		
		int seleccion,cero=0,num3;
		double num1,num2,total;
		System.out.println("Bienvenido a la calculadora");
		do {
			System.out.println("\nCalculadora\n");
			System.out.println("1.-Suma");
			System.out.println("2.-Resta");
			System.out.println("3.-Multiplicación");
			System.out.println("4.-Dividsión");
			System.out.println("5.-Par o Impar");
			System.out.println("0.-Salir");
			seleccion=Leer.datoInt();	
			switch(seleccion) {
			
			case 1:
				System.out.println("Seleccione el primer número");
				num1=Leer.datoDouble();
				System.out.println("Selñeccione el segundo número");
				num2=Leer.datoDouble();
				total=num1+num2;
				System.out.printf("%.2f + %.2f = %.2f\n",num1,num2,total);
				break;
			case 2:
				System.out.println("Seleccione el primer número");
				num1=Leer.datoDouble();
				System.out.println("Selñeccione el segundo número");
				num2=Leer.datoDouble();
				total=num1-num2;
				System.out.printf("%.2f - %.2f = %.2f\n",num1,num2,total);
				break;
			
			case 3:
				System.out.println("Seleccione el primer número");
				num1=Leer.datoDouble();
				System.out.println("Selñeccione el segundo número");
				num2=Leer.datoDouble();
				total=num1*num2;
				System.out.printf("%.2f x %.2f = %.2f\n",num1,num2,total);
				break;
			
			case 4: 
				System.out.println("Seleccione el número que quiera dividir");
				num1=Leer.datoDouble();
				System.out.println("Selecicone por cúanto lo quiere dividir");
				num2=Leer.datoDouble();
				total=num1/num2;
				System.out.printf("%.2f / %.2f = %.2f\n",num1,num2,total);
				break;
			case 5:
				System.out.println("Seleccione el número");
				num3=Leer.datoInt();
				num1=num3%2;
				if(num1==0){
					
					System.out.println("El número "+num3+" es par");
					
				}else {
					
					System.out.println("El número "+num3+" es impar");

				}				
				break;			
			
			case 0:
				break;
				
			default:
				System.out.println("Número inválido, por favor seleccione otro número.");
				
			}		
			
		}while(seleccion!=cero);
		System.out.println("Gracias por usar el programa");
	}

}
