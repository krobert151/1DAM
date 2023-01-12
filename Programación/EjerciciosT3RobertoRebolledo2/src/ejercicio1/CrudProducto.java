package ejercicio1;

public class CrudProducto {
	/*1. Escriba una clase Producto, caracterizada por 5 atributos (uno de ellos debe ser precio de fábrica).
	En una clase Gestion, con un array de productos como atributo se podrá: listar datos de todos los
	productos, calcular el precio de venta al público, que será el precio de fábrica más un 50 %,
	comprobar si el producto es “frágil” o no, mediante un método que devuelva un tipo boolean y añadir
	un producto a la lista pasando como parámetro un producto. Crear un main de prueba.*/ 
	
	
	private Producto [] lista;

	public CrudProducto(Producto[] lista) {
		super();
		this.lista = lista;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}
	
 	public Producto findById (String codigo) {
 		
 		int i=0;
 		boolean encontrado=false;
 		while (i<lista.length && !encontrado) {
 			
 			Producto deLista = lista[i];
 			if(deLista.getCodigo().equalsIgnoreCase(codigo)) 
 				encontrado=true;	
 			else 
 				i++;	 			
 		}
 		if (encontrado) {
				return lista[i];
			}else {
				return null;
			}
 		 		
 	}
 	public float findPrecioFabrica(Producto p) {
 		
 		return p.getPrecioFabrica();
 		
 	}
 	
 	

}
