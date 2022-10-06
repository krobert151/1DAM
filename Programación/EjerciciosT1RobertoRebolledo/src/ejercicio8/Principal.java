package ejercicio8;

public class Principal {

	public static void main(String[] args) {
		/*Haz un programa que calcule la longitud de una circunferencia de radio 3 metros y el área
de un círculo de radio 5.2 metros.*/
		// (A = π r²)
		//circunferencia igual a pi multiplicado por diámetro
		double r1= 3, r2= 5.2, circ=0.00, area=0.00;
		int dos=2;
		
		System.out.println("Bienveidos al programa que calcula la longuitud de una circunferencia y el área de un circulo.");
		circ=dos*Math.PI*r1;
		System.out.printf ("La longuitud de la circunferencia cuyo rádio son %2.2fm",r1);
		System.out.printf(" es de %2.2fm.\n",circ);
		System.out.println("Ahora vamos a calcular el área.");
		area=  Math.PI * Math.pow(r2, dos);		
		System.out.printf("El área del círculo cuyo rádio son %2.2fm",r2)  ;
		System.out.printf(" es %2.2fm².\n",area);
		System.out.println("Gracias por utilizar nuestro programa.");
	}

}
