package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// chachi
		double rad;
		Circulo cir1;
		System.out.println("Diga el rádio del circulo");
		rad=Leer.datoDouble();
		cir1 = new Circulo (rad);
		cir1.calcularArea();
		// no chachi
		Circulo cir2 = new Circulo ();
		System.out.println("Diga el radio del circulo");
		rad=Leer.datoDouble();
		cir2.setRadio(rad);
		
		//no chachi, ultimo día de vida
		Circulo cir3 ;
		System.out.println("Diga el radio del circulo");
		rad=Leer.datoDouble();
		cir3 = new Circulo ();
		cir3.setRadio(rad);
				
	} 

}
