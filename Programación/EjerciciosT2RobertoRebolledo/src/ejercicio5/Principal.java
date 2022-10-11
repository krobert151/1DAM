package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Mostrar en pantalla un menú de un cine con 4 salas y las películas que se proyectan en cada
		una. Se debe leer la sala deseada y mostrar:
		a. Un mensaje con el precio de la entrada, que será diferente en cada sala (por ejemplo,
		sala vip, sala 3D, sala normal y sala para niños).
		b. Pedir el número de entradas.
		c. Calcular el precio final y mostrarlo.*/ 

		int pelicula,numE;
		double tresD=10.50, VIP=15.6, normal=6, kid=4.5, total;
		String P3D="\"Avatar 2\"", PVIP="\"Saga JURASSIC PARK\"", Pnomral="\"Smile\"",Pkid="\"Tadeo Jones 3\"";
		System.out.println("Bienvenido al cine, selecciona que películas deseas ver.\n");
		System.out.println("1.- Avatar 2 			(Sala 3D)");
		System.out.println("2.- Smile 	 		(Sala normal)");
		System.out.println("3.- Tadeo Jones 3		(Sala kid)");
		System.out.println("4.- Saga JURASSIC PARK  	(Sala VIP)");
		pelicula=Leer.datoInt();
		
		switch(pelicula) {
			
		case 1:
			
			System.out.printf("Ha saleccionado ver %s \n",P3D);
			System.out.println("Seleccione el número de entradas.");
			numE=Leer.datoInt();
			total=tresD*numE;
			System.out.printf("El precio final de %d entradas sería de %.2f€",numE,total);
			
			
			break;
		case 2:
			
			System.out.printf("Ha saleccionado ver %s \n",Pnomral);
			System.out.println("Seleccione el número de entradas.");
			numE=Leer.datoInt();
			total=normal*numE;
			System.out.printf("El precio final de %d entradas sería de %.2f€",numE,total);
			
			
			break;
		case 3:
			
			System.out.printf("Ha saleccionado ver %s \n",Pkid);
			System.out.println("Seleccione el número de entradas.");
			numE=Leer.datoInt();
			total=kid*numE;
			System.out.printf("El precio final de %d entradas sería de %.2f€",numE,total);
			
			
			break;
		case 4:
			
			System.out.printf("Ha saleccionado ver %s \n",PVIP);
			System.out.println("Seleccione el número de entradas.");
			numE=Leer.datoInt();
			total=VIP*numE;
			System.out.printf("El precio final de %d entradas sería de %.2f€",numE,total);
			
			
			break;
		
		}
		System.out.println("\nGracias por usar nuestro cine.");
		
	}

}
