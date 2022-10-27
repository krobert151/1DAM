package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Crear un array de tipo String, inicializarlo en la propia definición con el nombre de 5 personas y mostrarlo por la pantalla mediante un bucle for.*/ 
		
		int tam=5;
		String[]nombres;
		System.out.println("Bienvenidos al programa");
		nombres= new String[tam];
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Seleccione el "+(1+i)+"º nombre");
			nombres[i]=Leer.dato();
		}
		System.out.println("\n");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Nombre número"+(1+i));
			System.out.println(nombres[i]);
		}
		
		
	}

}
