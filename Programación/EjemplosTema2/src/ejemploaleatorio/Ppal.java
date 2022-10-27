package ejemploaleatorio;

import java.util.Random;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int desde, hasta, aleatorio=0,cant=3;
		
		Random num= new Random (System.nanoTime());
		
		System.out.println("Bienvenidos al programa que genera númeor aleatorios.");
		System.out.println("¿Desde qué numero quieres generar el aleatorio?");
		desde=Leer.datoInt();
		System.out.println("¿Hasta qué número quiere generarlo?");
		hasta=Leer.datoInt();
		
		for (int i=0; i<cant; i++) {
		aleatorio=num.nextInt(hasta-desde+1)+desde;
		System.out.println("Ha salido el "+aleatorio);
		
		}
		
	}

}
