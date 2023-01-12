package ejercicio1;

public class Producto {
	/*1. Escriba una clase Producto, caracterizada por 5 atributos (uno de ellos debe ser precio de fábrica).
	En una clase Gestion, con un array de productos como atributo se podrá: listar datos de todos los
	productos, calcular el precio de venta al público, que será el precio de fábrica más un 50 %,
	comprobar si el producto es “frágil” o no, mediante un método que devuelva un tipo boolean y añadir
	un producto a la lista pasando como parámetro un producto. Crear un main de prueba.*/ 
	
	private String codigo;
	private String nombre;
	private float precioFabrica;
	private boolean fragil;
	private boolean disponible;
	
	public Producto(String codigo, String nombre, float precioFabrica, boolean fragil, boolean disponible) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precioFabrica = precioFabrica;
		this.fragil = fragil;
		this.disponible = disponible;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(float precioFabrica) {
		this.precioFabrica = precioFabrica;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	public float calcularPrecio() {
		
		return precioFabrica * 0.25f;		
		
	}
	
	
}
