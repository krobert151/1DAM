package ejercicio1;

public class Circulo {
	//atributo "Nunca se le da un valor a los atributos en las clases"
	private double radio;
	

	//constructores
	public Circulo(double radio){
		this.radio=radio;
	}
	public Circulo() {
		
	}
	
	//getter and setter
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	//Métodos
	public double calcularArea () {
		int exp=2;
		return  Math.PI*Math.pow(radio, exp);
	}
	
}
