package ejemploarray;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam;
		int [] edades;
		System.out.println("Introduzca cuantas edades quiere guardar");
		tam=Leer.datoInt();
		
		edades=new int [tam];
						
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Introduzca una edad");
			edades[i]=Leer.datoInt();			
			
		}

		System.out.println("\n");
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Edad nº"+ (i+1));
			System.out.println(edades[i]);
			
		}
		
		
	}

}
