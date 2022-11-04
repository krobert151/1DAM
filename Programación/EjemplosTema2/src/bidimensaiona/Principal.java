package bidimensaiona;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		//
		int sub=0, temas=0;
		int [ ] [ ] miTabla;
		System.out.println("BIenvenido al programa");
		System.out.println("Seleccione cuántas asignaturas tienes");
		sub=Leer.datoInt();
		System.out.println("Seleccione cuántos temas tiene cada asignatura");
		temas=Leer.datoInt();		
		miTabla= new int [sub][temas];
		
			for (int i = 0; i < miTabla.length; i++) {
				System.out.println("");
				System.out.print("*");
				
				for (int j = 0; j < miTabla.length; j++) {
					System.out.print("0");
					
				}
				
			}


	}

}
