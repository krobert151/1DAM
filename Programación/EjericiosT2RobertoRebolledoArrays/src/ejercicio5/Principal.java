package ejercicio5;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Crear un programa que realice lo siguiente:
			• Solicitar al usuario que introduzca por teclado el tamaño del array.
			• Declarar y definir el array de enteros.
			• Rellenar el array mediante números aleatorios entre los dos valores que diga el usuario.
			• Mostrar por pantalla la suma de todos los elementos.
			• Mostrar el mayor y el menor guardados en el array.
			• Modificar un valor elegido por el usuario.*/
		int num[];
		int tam,max,min,suma=0,sino,cambio,nuevo;
		
		Random r= new Random (System.currentTimeMillis());
		System.out.println("Bienvenidos al progarma");
		
		System.out.println("Introduzca el tamaño de los números a almacenar");
		tam=Leer.datoInt();
		num= new int[tam];
		int men=num[1],may=num[1];
		
		System.out.println("Seleccione el número máximo que quieras que pueda generar");
		max=Leer.datoInt();
		
		System.out.println("Seleccione el número mínimo que quieras que pueda generar");
		min=Leer.datoInt();
		
		for (int i = 0; i < num.length; i++) {
			num[i]=r.nextInt(max-min)+min;
		}
		
		for (int i = 0; i < num.length; i++) {
			suma+=num[i];
		}
		
		System.out.println("La suma de todos los números es de "+suma);
		
		for (int i = 0; i < num.length; i++) {
		
			if(may<num[i]) {
				
				may=num[i];				
			}
			
			if(men>num[i]) {
				
				men=num[i];
				
			}
				
		}
		System.out.println("El número mayor es "+may+" y el menor es "+men);
		

		System.out.println("Quiere cambiar algún núemro");
		System.out.println("1.- Si");
		System.out.println("2.- No");
		sino=Leer.datoInt();
		if(sino==1) {
			do {

					
				System.out.println("¿Qúe valor desea cambiar?");
				cambio=Leer.datoInt();
				System.out.println("¿Por qué valor quiere cambiarlo?");
				nuevo=Leer.datoInt();
				
				num[cambio-1]=nuevo;
				System.out.println("Quiere cambiar algún núemro");
				System.out.println("1.- Si");
				System.out.println("2.- No");
				sino=Leer.datoInt();
					
					
			}while(sino==1);
		}
		
		
	}

}
