package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Se desea realizar un programa que gestione las notas de un alumno del centro. Para ello, se
		necesita leer las notas de las 6 asignaturas de un solo alumno y mostrar por pantalla al final,
		la nota media y el número de suspensos que tiene. No usar una variable para cada nota, ni es
		necesario mostrar las notas de cada asignatura, solo la media y el número de suspensos.
		*/
		
		int suspensas=0, cant=0, cantFinal=6;
		double nota, suma=0, media;
		
		System.out.println("Bienvenidos al programa.\n\n");
		
		do {
			System.out.println("Seleccione la nota.");
			nota=Leer.datoDouble();
			if(nota<=10){
				if(nota<5) {
					suspensas++;
				};
				suma+=nota;
				cant++;
			}else {
				
				System.out.println("La nota tiene que ser menos de 10, vuelva a intentarlo\n");
			}
		}while(cant<cantFinal);
		
		media=suma/cant;
		
		System.out.printf("La nota media del alumno es de %.2f y el número de suspensas es de %d\n\n",media,suspensas);
		System.out.println("Gracias por usar el programa.");
		
	}

}
