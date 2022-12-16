package ejercicio;

public class Operaciones {
	
	public Operaciones () {
		
	}
	
	public Fraccion multiplicar (Fraccion num1, Fraccion num2) {
		
		return new Fraccion (num1.getNumerador()*num2.getNumerador(), num1.getDenominador()*num2.getDenominador());
	}
	
	public Fraccion cambiarSigno (int num, int den) {
		
		return new Fraccion (num * (-1), den);
	}
	
	public Fraccion dividir (Fraccion num1, Fraccion num2) {
		 
		return new Fraccion (num1.getDenominador()*num2.getNumerador(), num1.getNumerador()*num2.getDenominador());
	}
	public Fraccion sumar (Fraccion num1, Fraccion num2) {
		
		int den, num;
		Fraccion div;
		num=num1.getDenominador()*num2.getNumerador();
		den=num1.getNumerador()*num2.getDenominador();	
		div = new Fraccion (num, den);
		return div;
		
	}
	
	
	
	
}
