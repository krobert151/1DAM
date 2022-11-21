package ejercicio3;

public class Cilindro {
	double radio, altura;
	
	public Cilindro (double radio, double altura) {
		this.altura=altura;
		this.radio=radio;
	}
	public Cilindro() {
		
	}
	public double calcularVolumen (double altura, double radio) {
		int dos=2;
		double resultado=0.00;
		resultado=Math.PI*altura*(Math.pow(radio, dos));		
		return resultado;
	}
}
