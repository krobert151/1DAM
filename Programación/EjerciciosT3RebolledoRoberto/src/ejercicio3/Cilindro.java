package ejercicio3;

public class Cilindro {
	private double radio, altura;
	
	public Cilindro (double radio, double altura) {
		this.altura=altura;
		this.radio=radio;
	}
	
	public Cilindro() {
		
	}
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	@Override
	public String toString() {
		return "Cilindro [radio=" + radio + ", altura=" + altura + "]";
	}

	public double calcularVolumen () {
		int dos=2;
		double resultado=0.00;
		resultado=Math.PI*altura*(Math.pow(radio, dos));		
		return resultado;
	}
}
