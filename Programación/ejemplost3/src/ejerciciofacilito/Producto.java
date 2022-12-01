package ejerciciofacilito;

public class Producto {
	private String nombre,seccion;
	private double precioBase,pvp,ganancia,descuento,precioLibras;
	private boolean rebaja;
	public Producto(String nombre, String seccion, double precioBase,  double ganancia) {
		super();
		this.nombre = nombre;
		this.seccion = seccion;
		this.precioBase = precioBase;
		this.ganancia = ganancia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public double getPvp() {
		return pvp;
	}
	public void setPvp(double pvp) {
		this.pvp = pvp;
	}
	public double getGanancia() {
		return ganancia;
	}
	public void setGanancia(double ganancia) {
		this.ganancia = ganancia;
	}
	public boolean isRebaja() {
		return rebaja;
	}
	public void setRebaja(boolean rebaja) {
		this.rebaja = rebaja;
	}
	
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getPrecioLibras() {
		return precioLibras;
	}
	public void setPrecioLibras(double precioLibras) {
		this.precioLibras = precioLibras;
	}
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", seccion=" + seccion + ", precioBase=" + precioBase + ", pvp=" + pvp
				+ ", ganancia=" + ganancia + ", descuento=" + descuento + ", precioLibras=" + precioLibras + ", rebaja="
				+ rebaja + "]";
	}
	public double calcularPvp(){
		int cien=100;
		pvp = precioBase+((precioBase*ganancia)/cien);
		return pvp;
	}
	public double calcularRebja() {
		
		int cien=100;
		rebaja=true;
		pvp = pvp-((pvp*descuento)/cien);
		return pvp;
	}
	public double calcularLibras(double libras) {
		
		precioLibras=libras*pvp;
		return precioLibras;
	}
	public boolean comprobarMegaganga() {
		
		if(pvp>3) {
			return false;
		}else {
			return true;
		}
		
	}
	public void devolverMegaganga(boolean boo) {
		
		if(boo) {
			System.out.println("¡¡MEGAGANGA!!");
		}else {
			System.out.println("Lo sentimos, no es una megaganga");
		}
	}
	
	
	
}

