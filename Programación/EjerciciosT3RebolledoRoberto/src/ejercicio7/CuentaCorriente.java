package ejercicio7;

public class CuentaCorriente {
	double saldo;
	String nombre;
	public CuentaCorriente(double saldo, String nombre) {
		super();
		this.saldo = saldo;
		this.nombre = nombre;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void insertarDinero(double cant) {
		saldo+=cant;	
	}
	
	public void retirarDinero(double cant) {
		saldo-=cant;
	}
	
	public double calcularDolares() {
				
		return saldo*1.03;
	}	
	
	
	
	@Override
	public String toString() {
		return "CuentaCorriente [saldo=" + saldo + ", nombre=" + nombre + "]";
	}
	
}
