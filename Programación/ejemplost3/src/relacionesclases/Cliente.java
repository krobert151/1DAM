package relacionesclases;

public class Cliente {
	private String nombre;
	private int edad;
	public Cliente(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + "]";
	}
	public double mostrarSenior(int tope) {
		double pension=500;
		if(edad>=tope) {
			return pension;
		}else {
			return 0;
		}
	}
	
}
