package ejercicio8;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Crear un programa que gestione un sorteo de lotería. Tendremos la clase Sorteo y la principal para probar
		todo. El programa debe hacer lo siguiente:
		• Posibilidad de comprar/generar un décimo (elegir un número).
		• Hacer sorteo, donde se generará aleatoriamente el número premiado.
		• Comprobar si nuestro décimo está premiado devolviendo un boolean.
		• Mostrar si eres ganador o no (en el main).
		*/
		int num;
		Sorteo  sort1;
		System.out.println("Bienvenido a loterias");
		System.out.println("Seleccione un décimo del 1 al 100");
		num=Leer.datoInt();
		sort1 = new Sorteo ();
		sort1.generarLoteria();
		sort1.mostrarGanador(sort1.comprobarLoteria(num));
		
	}	

}
