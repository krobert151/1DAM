package ejemplo1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double prod;
		System.out.println("Selecciona el precio del proeducto");
		prod = Leer.datoDouble();
		if(prod>100) {
			System.out.println("Usted se lleva el descuento");}
		else 
		{System.out.println("No se lleva nada");}
	}
}
