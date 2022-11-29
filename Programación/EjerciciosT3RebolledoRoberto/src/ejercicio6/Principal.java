package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int num;
		Juego uno;
		uno=new Juego();
		/*Crear un progrma que simule el juego de cara o cruz. Para ello, se usarán los siguientes métodos:
		• Método que simule el lanzamiento de la moneda y resultado.
		• Método para comprobar ganador, se le pasará el número elegido por el jugador y dentro se generará
			el aleatorio llamando al método anterior. Devuelve true si son iguales o false si no.
		• Un método para mostrar en bonito el ganador. Si se le pasa true mostrar un mensaje de ganador y
			si no, debe mostrar "Siga jugando".
		• En el main, se debe crear lo necesario para simular un juego de cara o cruz.*/

		System.out.println("Bienvenido a cara o cuz");
		System.out.println("\nSeleciona cara o cruz");
		System.out.println("1.-Cara");
		System.out.println("2.-Cruz");
		num=Leer.datoInt();
		while(num<0|num>2) {
			System.out.println("Número no valido");
			num=Leer.datoInt();
		}
		uno.lanzarMoneda();
		uno.mostrarGanador(uno.comprobarGanador(num));
		System.out.println(uno.getLadoMoneda());
		
		
		
		
	}

}
