package ejercicio5;

import utilidades.Leer;

public class Pincipal {

	public static void main(String[] args) {
		
		/*Crear una clase llamada Generadora sin atributos, pero con varios métodos que generen aleatoriamente
		distintos números o resultados según las características del sorteo o para qué se vaya a usar, por ejemplo,
		generar 1, x, 2 para una quiniela, generar par o impar para jugar a pares o nones, generar 1, 2 o 3 para jugar
		a los "chinos", del 1 al 49 para el sorteo de primitiva... Crear una clase principal donde se prueben todos
		los métodos pidiendo los datos necesarios para cada generación*/
		
		
		int [] numPrimitiva=new int [6]; 
		int num1,num2,num,menu,numQuiniela,select,numChinos;
		Generadora Gen1=new Generadora();
		do {
			System.out.println("\n1.-Quiniela");
			System.out.println("2.-Pares o nones");
			System.out.println("3.-Los chinos");
			System.out.println("4.-La primitiva");
			menu=Leer.datoInt();
			
			switch(menu) {
			
			
			case 1:
				System.out.println("\nPulse 1 para apostar por el equipo local.");
				System.out.println("Pulse 2 para apostar por un empate.");
				System.out.println("Pulse 3 para apostar por el equipo visitante.");
				num=Leer.datoInt();
				while(num >3| num<1) {
					System.out.println("No está disponible esa opción vuelva a repetir");
					num=Leer.datoInt();
				}
				numQuiniela=Gen1.hecharQuiniela();
				Gen1.mostrarQuiniela(Gen1.comprobarQuiniela(num,numQuiniela));				
				Gen1.mostrarResultadoQuiniela(numQuiniela);
				
				break;
			
			case 2:
				System.out.println("Jugador nº1 Seleccione 1 para Par o 2 para None");
				select=Leer.datoInt();
				if(select==1) {
					System.out.println("El jugador 1 ha elejido Par, por lo tanto al 2 le toca None.");
					num1=Gen1.hecharPares();	
					num2=Gen1.hecharPares();	

				}else {
					System.out.println("El jugador 1 ha elejido None, por lo tanto al 2 le toca Par.");

					num1=Gen1.hecharPares();	
					num2=Gen1.hecharPares();;
				}
				
				num=Gen1.sumar2Num(num1, num2);
				System.out.print(num+" --> ");
				Gen1.mostrarPares(Gen1.comprobarPares(num));				
				
				break;
			
			case 3:
				System.out.println("Seleccione un número del 1 al 3.");
				num=Leer.datoInt();
				while(num >3| num<1) {
					System.out.println("No está disponible esa opción vuelva a repetir");
					num=Leer.datoInt();
				}
				numChinos=Gen1.hecharChinos();
				System.out.print("El número que ha salido es el "+numChinos+", ");
				Gen1.mostrarChinos(Gen1.comprobarChinos(num, numChinos));	
				
				break;
			
			
			case 4:
				System.out.println("Selecciona los 6 números de la primitiva");
				for (int i = 0; i < numPrimitiva.length; i++) {
					numPrimitiva[i]=Leer.datoInt();
				}
				int [] resPrim = Gen1.hecharPrimitiva(); 
				Gen1.mostrarPrimitiva(resPrim);
				System.out.println(" ");
				Gen1.resultadoPrimitiva(Gen1.comprobarPrimitiva(numPrimitiva, resPrim));;
				break;
			}
				
		}while(menu!=0);
			
		
	}

}
