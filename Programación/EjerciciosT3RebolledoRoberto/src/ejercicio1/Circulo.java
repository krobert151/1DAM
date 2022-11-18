package ejercicio1;

public class Circulo {
	//atributo "Nunca se le da un valor a los atributos en las clases"
	double radio;
	//constructores
	public Circulo(double radio){
		this.radio=radio;
	}
	public Circulo() {
		
	}
	//Métodos
	public double calcularArea (double cosa) {
		int exp=2;
		double resultado=0.00;
		resultado=Math.PI*Math.pow(cosa, exp);
		return  resultado;
	}
}
