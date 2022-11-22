package ejercicio5;

import utilidades.Leer;

public class Pincipal {

	public static void main(String[] args) {
		/*Crear una clase llamada Generadora sin atributos, pero con varios métodos que generen aleatoriamente
		distintos números o resultados según las características del sorteo o para qué se vaya a usar, por ejemplo,
		generar 1, x, 2 para una quiniela, generar par o impar para jugar a pares o nones, generar 1, 2 o 3 para jugar
		a los "chinos", del 1 al 49 para el sorteo de primitiva... Crear una clase principal donde se prueben todos
		los métodos pidiendo los datos necesarios para cada generación*/

		int num,menu;
		Generadora Gen1=new Generadora();
		do {
			System.out.println("1.-Quiniela");
			System.out.println("2.-Pares o nones");
			System.out.println("3.-Los chinos");
			System.out.println("4.-La primitiva");
			menu=Leer.datoInt();
			switch(menu) {
			
			case 1:
				System.out.println("Pulse 1 para apostar por el equipo local.");
				System.out.println("Pulse 2 para apostar por un empate.");
				System.out.println("Pulse 3 para apostar por el equipo visitante.");
				num=Leer.datoInt();
				while(num >3| num<1) {
					System.out.println("No está disponible esa opción vuelva a repetir");
					num=Leer.datoInt();
				}
				
				Gen1.mostrarQuiniela(Gen1.comprobarQuiniela(num, Gen1.hecharQuiniela()));				
				Gen1.resultadoQuiniela();
				
				break;
			
			case 2:
				
				System.out.println("Seleccione un número del 1 al 10");
				num=Leer.datoInt();
				while(num>0|num<10) {
					System.out.println("Ese número noe stá disponible, seleccione un número del 1 al 10.");
					num=Leer.datoInt();
				}
				
				
				
				break;
			
			}
		
		
		}while(menu!=0);
		
		
		
		
	}

}
