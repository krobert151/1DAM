package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double altura, radio;
		Cilindro Cil1;
		System.out.println("Bienvenido al programa");
		System.out.println("Introduzca la altura del cilindro");
		altura=Leer.datoDouble();
		System.out.println("Introduzca el radio del cilindro");
		radio=Leer.datoDouble();
		Cil1=new Cilindro(altura,radio);
		System.out.println(Cil1.calcularVolumen());
		
		
	}

}
