package arrayobjetos;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		int tam=5, nVa=0, seguir,num;
		String modelo;
		double potencia;
		
		Vehiculo lista[] = new Vehiculo[tam];
		do {
			System.out.println("Introduce el nombre del vehículo");
			modelo=Leer.dato();
			System.out.println("Introduce la ptencia:");
			potencia=Leer.datoDouble();
			lista[nVa]=new Vehiculo (modelo, potencia);
			nVa++;
			
			System.out.println("Quieres cambiar la potencia pulse 1");
			seguir=Leer.datoInt();
			if (seguir==1) {
				
				System.out.println("Qué coche quieres cambiar");
				num=Leer.datoInt();
				System.out.println("Quánt potencia tiene actualmente");
				potencia=Leer.datoDouble();
				lista[num-1].setPotencia(potencia);
				
			}
			System.out.println("Si desea salir pulse 0");
			seguir=Leer.datoInt();
		}while(seguir!=0&&nVa<lista.length);
		
		

	}

}
