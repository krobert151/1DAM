package ejercicio4;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Rellenar un array unidimensional de 10 posiciones con números aleatorios entre 1 y 99 y mostrar el 
		 * número guardado en un lugar que indique el usuario por teclado.*/
		int tam=10, num1,max=99,min=1;
		int [] posicion;
		int [] orden;
		Random num=new Random(System.nanoTime());
		System.out.println("Bienvenidos al programa");
		posicion = new int [tam];
		orden = new int [tam];
		
		for (int i = 0; i < orden.length; i++) {
			orden[i]=0;
			System.out.println(orden[i]);
		}
		
		for (int i = 0; i < posicion.length; i++) {
			System.out.println("¿Dódnde desea guardar el "+(1+i)+"º número?");
			num1=Leer.datoInt();
			if(orden[num1]!=0){
				
				System.out.println("Este espacio del array ya ha sido utilizado, por favor utilize otro.");
				i=i-1;
				
			}else {
			posicion[num1]=num.nextInt(max-min)+min;
			System.out.println(posicion[num1]);
			}

		}
		
		
		
	}

}
