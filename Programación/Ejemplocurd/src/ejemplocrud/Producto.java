package ejemplocrud;

public class Producto {
	
	private String codigo;
	private String nombre;
	private float precioUnitario;
	private boolean activo;
	
	public Producto(String codigo, String nombre, float precioUnitario, boolean activo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.activo = activo;
	}
	public Producto() {
		
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

	public float getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precioUnitario=" + precioUnitario + ", activo="
				+ activo + "]";
	}
	public int compareTo(Producto o) {
		
		if (this.codigo.equalsIgnoreCase(o.getCodigo())
				&& this.nombre.equalsIgnoreCase(o.getNombre())
				&& this.precioUnitario == (o.getPrecioUnitario()))
			return 0;
		
		return 1;
		
	}
	
	
}
