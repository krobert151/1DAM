package ejercicio;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Examen*/
		int cal [];
		int suma,media,tam,selec,desde,hasta,max,diaMax=1,dia,newCal,diasMenCal=0;
		double porcent,mediaSana=2200,cien=100;
		Random r= new Random (System.nanoTime());
		System.out.println("Bienvenido al programa que calcula las calorías");
		System.out.println("¿Durante cúantos días quieres estar calculando calorías?");
		tam=Leer.datoInt();
		cal= new int [tam];
		do {
			
			System.out.println("\n***********************************************");
			System.out.println("Seleccione una opción.");
			System.out.println("***********************************************");
			System.out.println("1.-Generar calorías. ");
			System.out.println("2.-Mostrar calorías.");
			System.out.println("3.-Mostrar el total de calorías.");
			System.out.println("4.-Mostrar el maximo de calorías en un día.");
			System.out.println("5.-Mostrar la media de claorías por día.");
			System.out.println("6.-Modificar calorías.");
			System.out.println("7.-Mostrar días por debajo de la media recomendada.");
			System.out.println("8.-Mostrar porcentaje de calorías.");
			System.out.println("0.-Salir.");
			System.out.println("***********************************************");
					
			selec=Leer.datoInt();
			switch(selec){
			
			case 1:
				
				System.out.println("Seleccione el número máximo de calorías.");
				hasta=Leer.datoInt();
				System.out.println("Seleccione el valor mínimo de calorías.");
				desde=Leer.datoInt();
				
				for (int i = 0; i < cal.length; i++) {
					cal[i]=r.nextInt(hasta-desde+1)+desde;
				}
				break;

			case 2:
				
				System.out.print("\nDia\t\t");
				System.out.println("Calorías");
				for (int i = 0; i < cal.length; i++) {
					System.out.print((i+1)+"\t\t");
					System.out.println(cal[i]);
				}
				System.out.println(" ");
				
				break;

			case 3:
				suma=0;
				for (int i = 0; i < cal.length; i++) {
					suma+=cal[i];
					}
					System.out.printf("\nLa suma total de calorías ingeridas en estos días es de %d cal.\n",suma);
				break;

			case 4:
				max=cal[1];
				for (int i = 0; i < cal.length; i++) {
					if(max<cal[i]) {
						max=cal[i];
						diaMax++;
					}
				}
				System.out.println("\nEL día que más calorías se consumió fue el "+(diaMax+1)+"º día y fueron "+max+" cal.\n");
				diaMax=0;
				break;

			case 5:
				suma=0;
				for (int i = 0; i < cal.length; i++) {
					suma+=cal[i];
				}
				media=suma/tam;
				System.out.printf("\nLa media de calorías consumidas por días es de %d cal\n",media);
				
				break;

			case 6:
							
				System.out.print("\nDia\t\t");
				System.out.println("Calorías");
				for (int i = 0; i < cal.length; i++) {
					System.out.print((i+1)+"\t\t");
					System.out.println(cal[i]);
				}
				System.out.println(" ");
				System.out.println("¿Qué día quieres modificar?");	
				dia=Leer.datoInt();
				while(dia>cal.length) {
					System.out.println("Ese día no se encuentra en la lista, intente otro.");
					dia=Leer.datoInt();
				} 
					System.out.println("¿Por cúantas calorías las quieres remplazar?");
					newCal=Leer.datoInt();
					cal[dia-1]=newCal;
					
					System.out.print("\nDia\t\t");
					System.out.println("Calorías");
					for (int i = 0; i < cal.length; i++) {
						System.out.print((i+1)+"\t\t");
						System.out.println(cal[i]);
					}
					System.out.println(" ");
				
				break;

			case 7:
				
				for (int i = 0; i < cal.length; i++) {
					if(mediaSana>=cal[i]) {
						diasMenCal++;
					}
				}
				System.out.println("\nEL número total de días que se han consumido calorías por debajo de la media recomendada en este periodo son de "+diasMenCal+" días.\n");
				break;

			case 8:
				
				System.out.println("Selecciona un día");
				dia=Leer.datoInt();
				while(dia>cal.length) {
					System.out.println("Ese día no se encuentra en la lista, intente otro.");
					dia=Leer.datoInt();					
				}
				
				porcent=cal[dia-1]*cien/mediaSana;
				System.out.printf("El porcentaje de exactitud de calorías del %dº día es del %.2f%%. \n",dia,porcent);
				
				break;		
			
			case 0:
				
				System.out.println("Ha seleccionado salir.");
				break;
			
			default:
				
				System.out.println("Número no disponible.");
				break;			
			
			}
				
		}while(selec!=0);
		
		System.out.println("Gracias por usar el programa.");
		
		
	}

}
