package ejercicio1;

import ejercicio1.CrudProducto;
import ejercicio1.Producto;
import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		/*1. Escriba una clase Producto, caracterizada por 5 atributos (uno de ellos debe ser precio de fábrica).
		En una clase Gestion, con un array de productos como atributo se podrá: listar datos de todos los
		productos, calcular el precio de venta al público, que será el precio de fábrica más un 50 %,
		comprobar si el producto es “frágil” o no, mediante un método que devuelva un tipo boolean y añadir
		un producto a la lista pasando como parámetro un producto. Crear un main de prueba.*/ 
		
		CrudProducto crud;
		Producto []listaCrud;
		int tam;
		String codigo;
		float precioF;
		System.out.println("Diga cuántos productos habrá");
		tam=Leer.datoInt();
		listaCrud= new Producto [tam];
		crud = new CrudProducto (listaCrud);
		
		crud.findById(codigo);
		

	}

}
