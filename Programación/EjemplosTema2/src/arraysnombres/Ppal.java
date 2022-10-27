package arraysnombres;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam;
		String [] nombre;
		System.out.println("Seleccione cuantos nombres quieres almacenar");
		tam=Leer.datoInt();
		nombre=new String[tam];
		
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Introduzca el "+(i+1)+"º nombre");
			nombre[i]=Leer.dato();
		}
			
		for (int j = 0; j < nombre.length; j++) {
			System.out.println((j+1)+"º Nombre");
			System.out.println(nombre[j]);
		}
	}

}
