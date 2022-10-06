package ejercicio7;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realizar un programa que nos ayude a calcular el dinero gastado en gasolina en un viaje.
		 *  Para ello, daremos los kilómetros recorridos, el consumo del coche a los 100 Km y el precio 
		 *  por litro de gasolina.*/
		double gas=1.61, km= 1250.00, cons100= 7.00, cien=100, consumo=0.0, preciof=0.0;
		
	
		
		System.out.println("Bienvenidos al programa que calcula el gasto de la gasolina");
		

		consumo= km/cien*cons100;
		preciof= gas*consumo;
		System.out.printf("%.2f€\n",preciof);
		System.out.println("Gracias por usar el programa");
		
		
		
	
		
	}

}
