package ejercicioexamen1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*1. El precio final de venta de un automóvil nuevo para un comprador es la suma total de: 
		 * el coste de fabricación del vehículo, el porcentaje de la ganancia del vendedor y los impuestos 
		 * estatales aplicables (sobre el coste de fabricación). Suponer una ganancia del vendedor del 15 % 
		 * en coche y un impuesto del 12.5 cada % y diseñar un programa para calcular el precio final de un 
		 * automóvil e imprimirlo por pantalla. Para ello, vosotros asignaréis el coste de fabricación d el 
		 * coche y se deben realizar los cálculos para un solo vehículo*/
		
		double precioFab, porGanancia=15,precioGana,porImpuesto=12.5,precioImpue,cien=100,preciof;
		
		System.out.println("Bienvenidos al programa que calcula el precio total de un coche.");
		System.out.println("Introduzca cuanto vale el coche de fábrica.");
		precioFab=Leer.datoDouble();
		
		precioGana=precioFab*porGanancia/cien;
		precioImpue=precioFab*porImpuesto/cien;
		
		preciof=precioGana+precioFab+precioImpue;
		System.out.printf("Ganancia del %.2f%% = + %.2f€.\n",porGanancia,precioGana);
		System.out.printf("IMpuesto del %.2f%% = + %.2f€.\n",porImpuesto,precioImpue);
		System.out.printf("El coche saldría por un precio final de %.2f€.\n",preciof);
		System.out.println("Gracias por usar nuestro programa.");
		
		
		
	}

}
