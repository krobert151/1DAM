package ejemplocrud;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
				
		CrudProducto crud;
		Producto []listaCrud;
		int tam,menu,contador=0;
		String nombre,codigo,codigoABuscar;
		float precioU,precioNuevo;
		System.out.println("Diga cuántos productos habrá");
		tam=Leer.datoInt();
		listaCrud= new Producto [tam];
		crud = new CrudProducto (listaCrud);
		do {
			imprimirMenu();
			menu=Leer.datoInt();
			switch(menu) {
			
			case 1:
				crud.findAll();
				System.out.println("Diga el código a buscar");
				codigoABuscar=Leer.dato();
				System.out.println(crud.findById(codigoABuscar));
				break;
				
			case 2:
				System.out.println("Seleccione un nombre");
				nombre=Leer.dato();
				System.out.println("Seleccione el codigo del producto");
				codigo=Leer.dato();
				System.out.println("Diga el precio de la unidad");
				precioU=Leer.datoFloat();
				crud.add(new Producto (codigo,nombre,precioU,true), contador);
				contador++;
				break;
				
			case 3:
				
				System.out.println("Indique el código del producto a modificar:");
				crud.imprimirSoloActivos();
				codigo=Leer.dato();
				System.out.println("Indique el nuevo precio");
				precioNuevo=Leer.datoFloat();
				crud.editPrecio(codigo, precioNuevo);
				
				break;
			
			case 4:
				
				System.out.println("Diga el código del producto que desea borrar");
				codigo = Leer.dato();
				crud.delete(codigo);
				
				break;
			
				
			}
			
			
		}while(menu!=0);
	
		
	}
	private static void imprimirMenu() {
		
		System.out.println("1.-Listar productos");
		System.out.println("2.-Añadir un nuevo producto");
		System.out.println("3.-Modificar precio");
		System.out.println("4.-Borrar producto");
		
	}

}
