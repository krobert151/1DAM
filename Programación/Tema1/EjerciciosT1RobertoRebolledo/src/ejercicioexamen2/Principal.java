package ejercicioexamen2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*2. Realizar un programa que calcule el espacio recorrido por un objeto que se mueve 
		 * a velocidad constante. El objeto, por ejemplo, zapatilla de una madre hacia el hijo,
		 *  ha recorrido un espacio inicial de 5.5 m y se mueve a una velocidad constante de 3.2 m/s.
		 *  V osotros debéis dar un valor al tiempo que el objeto está en movimiento. La ecuación usada
		 *   es: espacio= espacioInicial + velocidad*tiempo*/
		
		
		double espacioIni=5.5, velocidad=3.2,espacio, tiempo;
		
		System.out.println("Bienvenidos al programa que calcula la distancia que recorre la zapatilla de una madre lanzada a su hijo");
		System.out.println("Durante cuantos segundos va a estar volando la zapatilla");
		tiempo=Leer.datoDouble();
		espacio=espacioIni+velocidad*tiempo;
		
		System.out.printf("La chancla va a recorrer un espacio de %.2f m en %.2f s.\n",espacio,tiempo);
		System.out.println("Gracias por usar nuestro programa.");
		
		
	}

}
