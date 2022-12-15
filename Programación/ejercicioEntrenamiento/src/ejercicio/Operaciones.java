package ejercicio;

public class Operaciones {
	
	public Operaciones () {
		
	}
	
	public Fraccion multiplicar (Fraccion num1, Fraccion num2) {
		
		int den, num;
		Fraccion mult;
		
		num=num1.getNumerador()*num2.getNumerador();
		den=num1.getDenominador()*num2.getDenominador();	
		mult = new Fraccion (num, den);
		return mult;
		
	}
	public Fraccion cambiarSigno (int num, int den) {
		
		Fraccion inversa;	
		num= num * (-1);
		inversa = new Fraccion (num, den);
		return inversa;
		
	}
	public Fraccion dividir (Fraccion num1, Fraccion num2) {
		
		int den, num;
		Fraccion div;
		num=num1.getDenominador()*num2.getNumerador();
		den=num1.getNumerador()*num2.getDenominador();	
		div = new Fraccion (num, den);
		return div;
		
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
