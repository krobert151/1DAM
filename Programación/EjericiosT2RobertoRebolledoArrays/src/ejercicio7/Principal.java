package ejercicio7;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam, num;
		
		String name [];
		double race1[];
		double race2[];
		double race3[];
		double suma[];
		double media[];
		System.out.println("Bienvenidos al programa de las carreras");
		System.out.println("Seleccione cuántos corredores participarán este año");
		tam=Leer.datoInt();
		name = new String [tam];
		race1= new double [tam];
		race2= new double [tam];
		race3= new double [tam];
		suma= new double [tam];
		media=new double [tam];
		
		do{
			System.out.println("1.- Registrar los nombres de los jugadores");
			System.out.println("2.- Empezar la 1º carrera");
			System.out.println("3.- Empezar la 2º carrera");
			System.out.println("4.- EMpezar la 3º carrera");
			System.out.println("---------------------------------------------------------");
			System.out.println("Pulse 0 para salir y mostrar resultados \n(Solo se mostrarán los resultados si se han realizado todas las carreras)");
			System.out.println("---------------------------------------------------------");
			num=Leer.datoInt();
			
			switch(num){
			
			case 1:
				for (int i = 0; i < name.length; i++) {
					System.out.println("Seleccione el nombre del "+(i+1)+"º corredor");
					name[i]=Leer.dato();
				}
			break;
			
			case 2:
				System.out.println("Primera carrera");
				
				for (int i = 0; i < race1.length; i++) {
					System.out.println("Selecciona el tiempo que ha sacado "+name[i]);
					race1[i]=Leer.datoDouble();
				}
			break;
			
			case 3:
				System.out.println("Segunda carrera");
				
				for (int i = 0; i < race2.length; i++) {
					System.out.println("Selecciona el tiempo que ha sacado "+name[i]);
					race2[i]=Leer.datoDouble();
				}
			break;
			
			case 4:
				System.out.println("Tercera carrera");
				
				for (int i = 0; i < race3.length; i++) {
					System.out.println("Selecciona el tiempo que ha sacado "+name[i]);
					race3[i]=Leer.datoDouble();
				}
			break;
			
			case 0:
				break;
				
			default:
				System.out.println("Pulse otro número");
				break;
			}
		
					
			
		}while(num!=0);
		
			for (int i = 0; i < media.length; i++) {
				
				suma[i]=race1[i]+race2[i]+race3[i];
				media[i]=suma[i]/3;
				
			}
			System.out.printf("Nombre\t\tCarrera1\tCarrera2\tCarrera3\tSuma tiempo\tMedia tiempo\n");
			for (int i = 0; i < race1.length; i++) {
				System.out.print(name[i]);
				System.out.printf("\t\t");
				System.out.printf("%.2f",race1[i]);
				System.out.printf("\t\t");
				System.out.printf("%.2f",race2[i]);
				System.out.printf("\t\t");
				System.out.printf("%.2f",race3[i]);
				System.out.printf("\t\t");
				System.out.printf("%.2f",suma[i]);
				System.out.printf("\t\t");
				System.out.printf("%.2f\n",media[i]);

				
				
			}
			
		
		
			
	}

}
