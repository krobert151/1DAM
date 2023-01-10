package ejemplocrud;

public class CrudProducto {
	
	private Producto [] lista;

	public CrudProducto() {
		
		int cuatro=4;
		lista = new Producto [cuatro];
		
	}
	
	//esto es telísima de guarro
	
	public CrudProducto(Producto [] lista) {
		
		this.lista=lista;
		
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	public void add(Producto p, int posicion) {
		lista[posicion]=p;
	}
	
	public void editPrecio(String codigo, float precioN) {
		
		
	}
	
	public Producto findById (String codigo) {
		
		int i=0;
		boolean encontrado = false;
		
		while (i<lista.length && !encontrado) {
			
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo)) {
				encontrado = true;
			}
			else {
				i++;
			}
			
		}
		if (encontrado) {
			return lista[i];
		}else {
			return null;
		}
		
	}
	
	public int findByIdV2 (String codigo) {
		
		int i=0;
		boolean encontrado = false;
		
		while (i<lista.length && !encontrado) {
			
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo)) {
				encontrado = true;
			}
			else {
				i++;
			}
			
		}
		if (encontrado) {
			return i;
		}else {
			return -1;
		}
		
	}
	public void mostrarLista (Producto[] prod) {
		
		for (int i = 0; i < lista.length; i++) {
			System.out.print(prod[i].getNombre());
			System.out.print("\n\n");
			System.out.println(prod[i].getPrecioUnitario());
		}
		
	}
}
