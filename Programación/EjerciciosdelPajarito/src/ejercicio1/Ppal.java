package ejercicio1;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		/*Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
debe indicarlo.*/
		
		int sino;
		double a, b, c, x, r1, r2;
		
	do{
		
		System.out.println("Bienvenido al programa");
		System.out.println("Selecciona el valor de a");
		a = Leer.datoDouble();
		System.out.println("Selecciona el valor de b ");
		b = Leer.datoDouble();
		System.out.println("Selecciona el valor de c ");
		c = Leer.datoDouble(); 
		
		x=(b*b)-4*a*c;
		
		if(x<0) {
			System.out.println("No se puede hacer");					
			
		}else {
			
			r1=(-b+Math.sqrt(x))/(2*a);
			r2=(-b-Math.sqrt(x))/(2*a);			
			
			System.out.println("El primer resultado de la ecuación es "+r1);
			System.out.println("El segundo resultado de la ecuación es "+r2);
			
			
		}
		
		System.out.println("¿Quiere volver a repetir?");
		System.out.println("1.-Si");
		System.out.println("0.-No");
		sino=Leer.datoInt();
		
	}while(sino!=0);
	
	System.out.println("Gracias por usar el programa");
		
	}
	
}
