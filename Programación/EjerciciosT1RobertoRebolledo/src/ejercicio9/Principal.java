package ejercicio9;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double habitantes, plazas, total;
		
		String pueblo, sitio;
		
		System.out.println("Bienvenido al programa");
		System.out.println("¿Cúal es tu pueblo?");
		pueblo = Leer.dato();
		System.out.println("¿Cúanta gente vive en tu pueblo?");
		habitantes = Leer.datoDouble();
		System.out.println("¿Donde quieres meter a toda esa gente?");
		sitio=Leer.dato();
		System.out.println("¿Cúanta gente caben en ese sitio?");
		plazas=Leer.datoDouble();
		
		total=plazas/habitantes;
		
		System.out.printf("En %s caben %3.2f %s\n\n\n\n ",sitio,total,pueblo );
		
		System.out.println("Gracias por usar nuestro programa.");
		
		
		
	}

}
