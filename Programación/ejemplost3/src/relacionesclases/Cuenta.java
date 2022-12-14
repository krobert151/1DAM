package relacionesclases;

public class Cuenta {
	private long numero;
	private String titular;
	private Cliente c;
	private double saldo;
	private double interes;
	
	public Cuenta(long numero, String titular, Cliente c, double saldo, double interes) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.c = c;
		this.saldo = saldo;
		this.interes = interes;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", titular=" + titular + ", c=" + c + ", saldo=" + saldo + ", interes="
				+ interes + "]";
	}
	
	//Métodos
	
	public double ingresarPension (int tope) {
		return saldo+c.mostrarSenior(tope);
	}
	
	
	
}
