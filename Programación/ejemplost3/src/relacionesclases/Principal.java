package relacionesclases;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String nombre;
		int edad;
		long numCuenta;
		double saldo, interes;
		Cliente c;
		Cuenta cu;
		System.out.println("Diga nombre");
		nombre=Leer.dato();
		System.out.println("Diga edad");
		edad=Leer.datoInt();
		c = new Cliente (nombre,edad);
		System.out.println("Diga el nº de la cuenta");
		numCuenta=Leer.datoLong();
		System.out.println("Diga Saldo");
		saldo=Leer.datoDouble();
		System.out.println("Diga interes");
		interes=Leer.datoDouble();
		System.out.println("Datos del cliente "+c);
		cu = new Cuenta (numCuenta,nombre,c,saldo,interes);
		System.out.println("Datos de la cuenta "+cu);
		
		System.out.println(cu.getC().getEdad());
		
	}

}
