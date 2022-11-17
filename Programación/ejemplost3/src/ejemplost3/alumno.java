package ejemplost3;

public class alumno {
	public alumno(String nombre, int edad, double peso, double altura, double notaMedia, boolean repetidor) {
		this.nombre=nombre;
		this.edad=edad;
		this.peso=peso;
		this.altura=altura;
		this.notaMedia=notaMedia;
		this.repetirdor=repetidor;
	}
	public alumno(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
			
		}
	String nombre;
	int edad;
	double peso, altura,notaMedia;
	boolean repetirdor;
}
