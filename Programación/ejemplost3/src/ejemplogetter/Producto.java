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
	//toString

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioB=" + precioB + "]";
	}
	
	/*Criterios comunes en 1DAM
	
	*1.- No se crean los objetos con el constructor vacío y luego se re'set'ea los atributos
	*2.- Si queremos mostrar los datos de todos los atributos es obligatorio usar 'toString'
	*3.- Si queremos mostrar el valor de un solo atributo, se puede usar el get correspondiente.
	*4.- No se imprime dentro de los métodos a menos que sea un método para imprimir.
	*5.- Cuando yo llamo a un metodo y para el calculo que tiene que realizar los valores que le hacen flata, son 
	*atributos de ese objeto, no hay que pasarles esos valores como parámetros, si no son atributos, se le pasa como parámetros
	*/
	
	
	
}
