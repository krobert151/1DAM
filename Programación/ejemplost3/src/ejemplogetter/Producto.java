package ejemplogetter;

public class Producto {
	
	//Atributos
	
	private String nombre;
	private double precioB;
	
	//Constructor
	public Producto (String nombre, double precioB) {
		
		this.nombre=nombre;
		this.precioB=precioB;
		
	}
	//Getter and Setter
	
	public String getNombre () {
		
		return nombre;		
	}
	public void setNombre (String nombre) {
		
		this.nombre=nombre;
		
	}
	
	public double getPrecioB () {
		
		return precioB;
	}
	public void setPrecioB (double precioB) {
		
		this.precioB=precioB;
	}
	
	
}
