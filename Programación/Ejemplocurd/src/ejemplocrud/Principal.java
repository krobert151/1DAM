package ejemplocrud;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CrudProducto crud;
		Producto []listaCrud;
		int tam,menu,contador=0;
		String nombre,codigo,codigoABuscar;
		float precioU;
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
				
				
				
				break;
				
			}
			
			
		}while(menu!=0);
	
		
	}
	private static void imprimirMenu() {
		
		System.out.println("1.-Listar productos");
		System.out.println("2.-Añadir un nuevo producto");
		System.out.println("3.-");
		
	}

}
