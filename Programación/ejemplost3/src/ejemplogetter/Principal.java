package ejemplogetter;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		double precioB;
		
		Producto prod;
		
		System.out.println("Diga el nombre");
		nombre=Leer.dato();
		System.out.println("Diga el precio Base");
		precioB=Leer.datoDouble();
		
		prod=new Producto (nombre,precioB);
		prod.setNombre(nombre);
		System.out.println(prod.getNombre());
		System.out.println(prod.getPrecioB());
		
		
		System.out.println("Cabia el precio");
		precioB=Leer.datoDouble();
		prod.setPrecioB(precioB);
		System.out.println(prod.getPrecioB());
		
		
		
	}

}
