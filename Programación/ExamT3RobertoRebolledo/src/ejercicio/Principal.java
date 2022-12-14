package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Hay un toString oculto guardado dentro del switch para ayudar al programador a ver los datos, el número oculto es 151, solo funciona una vez calculado el sueldoTotal*/
		Jugador jug1;
		int topeEdad,menu,partidos=7,hasta,desde,edad,minGoles,porcentaje,numGoles,diaPartido,newGol;
		int goles[];
		goles= new int [partidos];
		String nombre;
		double sueldoBase,sueldoTotal;
		
		System.out.println("Bienvenidos al programa");
		System.out.println("Antes de empezar vamos a registrar los datos de nuestro jugador");
		System.out.println("Nombre del Jugador");
		nombre=Leer.dato();
		System.out.println("Edad del Jugador");
		edad=Leer.datoInt();
		System.out.println("Sueldo base del Jugador");
		sueldoBase=Leer.datoDouble();
		jug1 = new Jugador (nombre,sueldoBase,edad,goles);
		
		
		do {
			System.out.println("\nSeleccione una opción");
			System.out.println("1.-Anotar goles");
			System.out.println("2.-Calcular el total de goles de "+jug1.getNombre());
			System.out.println("3.-Calcular el sueldo total de "+jug1.getNombre());
			System.out.println("4.-Ver cuantos partidos ha marcado "+jug1.getNombre());
			System.out.println("5.-Modificar el nº de goles de "+jug1.getNombre());
			System.out.println("6.-Ver si "+jug1.getNombre()+" tiene más de 40 años");
			System.out.println("0.-Salir");
			menu=Leer.datoInt();
			switch(menu) {
			
				case 1:
					System.out.println("Selecciona el nº mínimo de goles");
					desde=Leer.datoInt();
					System.out.println("Seleccione el nº máximo de goles");
					hasta=Leer.datoInt();
					jug1.rellenarGoles(hasta, desde);
					
					break;
					
				case 2:
					
					numGoles=(jug1.calcularGoles());
					System.out.println(numGoles);
					
					break;
					
				case 3:
					
					System.out.println("Cuántos goles como mínimo tiene que marcar "+jug1.getNombre()+" para que le suban el sueldo");
					minGoles=Leer.datoInt();
					System.out.println("Que porcentaje le van a subir el sueldo");
					porcentaje=Leer.datoInt();
					sueldoTotal=(jug1.calcularSueldo(jug1.comprobarCantGoles(minGoles), porcentaje));
					System.out.printf("El nuevo sueldo de %s es de %2.2f€ \n",jug1.getNombre(), sueldoTotal);
										
					break;
					
				case 4:
					
					System.out.println(jug1.contarPartidosMarc());
					
					break;
				case 5:
					
					jug1.mostrarGoles();
					System.out.println("\nSelecciona el día en el que quieras modificar el gol");
					diaPartido=Leer.datoInt();
					while(diaPartido>7|diaPartido<=0) {
						System.out.println("Error, Selecciona el día en el que quieras modificar el gol");
						diaPartido=Leer.datoInt();
					}
					System.out.println("Selecciona cuántos goles marcó realmente");
					newGol=Leer.datoInt();
					
					goles[(diaPartido-1)]=newGol;
					
					jug1.actualizarGoles(goles);
					
					jug1.mostrarGoles();
					break;
					
				case 6:
					System.out.println("A qué edad se debería jubilar.");
					topeEdad=Leer.datoInt();
					jug1.mostrarRetirada(topeEdad);
					
					break;
				case 0:
					break;
				case 151:
					System.out.println(jug1);
					break;
				default:
					System.out.println("Opción no valida");
					break;
			
			}
			
		}while(menu!=0);
		System.out.println("Gracias por usar este programa.");
	}

}
