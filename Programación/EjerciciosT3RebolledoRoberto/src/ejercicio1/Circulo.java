package ejercicio1;

public class Circulo {
	//atributo
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
