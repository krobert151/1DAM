package ejercicio12;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Un trabajador necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
		Si trabaja 40 horas o menos se le paga 16 euros por hora, si trabaja más de 40 horas se le paga
		16 euros por cada una de las primeras 40 horas y 20 euros por cada hora extra. El programa
		deberá pedir al usuario el número de horas trabajadas por el obrero en total y mostrar el salario
		que le corresponde.*/
		
		int horas,cuarenta=40, ex, horasNex, siono=0;
		double total,s40H=16,sEx=20;
		
		System.out.println("Bienvenido al programa que calcula tu salario en base a tus horas de trabajo.");
		
		do {	
					
			System.out.println("Primero seleccione cuántas horas ha estado trabajano durante este mes.");
			horas=Leer.datoInt();
			
			if(horas<=cuarenta) {
				
				total=horas*s40H;
				System.out.printf("El salario que le corresponde a este més sería de %.2f€\n",total);
				
			};
			
			if(horas>cuarenta) {
				
				ex=horas-cuarenta;
				horasNex=horas-ex;
				total=(horasNex*s40H)+(ex*sEx);
				System.out.printf("El salario que le corresponde a este més sería de %.2f€\n",total);
				
			};
			
			
			System.out.println("\n¿Quiere volver a usar el programa?");
			System.out.println("1.- Si");
			System.out.println("2.- No");
			siono=Leer.datoInt();
			
		}while( siono == 1);
			
			System.out.println("Gracias por usar el programa.");
			
			
			
	
		
	}

}
