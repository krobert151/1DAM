package ejercicio14;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Haga un programa de la interfaz de un cajero automático. Tendrá las opciones, ver saldo,
		retirar dinero, comprar entradas e ingresar dinero. En cada opción se pedirán los datos
		necesarios y se realizarán las operaciones adecuadas. El coste de las entradas se debe restar al
		saldo de dicha cuenta. La cuenta será creada por nosotros con un saldo inicial concreto*/
		
		double saldoBase=90000, retiro,dinero, eMenores=200,eAdultos=300,eVIP=600,ingreso;
		int seleccion, seleccionE,numE;
		System.out.println("Bienvenido");
		System.out.println("¿Qúe desea hacer?\n\n");
		System.out.println("1.-Ver saldo");
		System.out.println("2.-Retirar dinero");
		System.out.println("3.-Comprar entradas");
		System.out.println("4.-Ingresar dinero");
		seleccion=Leer.datoInt();
		
		switch(seleccion){
		
			case 1: 
				
				System.out.printf("Actualmente tienes un saldo de %.2f€\n",saldoBase);
				break;
				
			case 2:
				
				System.out.println("Seleccione la cantidad de dinero a retirar.");
				retiro=Leer.datoDouble();
				saldoBase-=retiro;
				System.out.printf("Actualmente tienes un saldo de %.2f€\n",saldoBase);
			
			case 3:
				
				System.out.println("Entradas para el Resurretion Fest");
				System.out.println("\n Seleccione su tipo de entrtada");
				System.out.println("\n Entrada para menores - 200€");
				System.out.println("\n ENtrada para adultos - 300€");
				System.out.println("\n Entrada para usuarios VIP - 600€");
				seleccionE=Leer.datoInt();
				switch(seleccionE){
				
					case 1: 
					
						System.out.println("Ha seleccionado entrada para menores.");
						System.out.println("Seleccione cuántas entradas quieres.");
						numE=Leer.datoInt();
						saldoBase=saldoBase-numE*eMenores;
						
						break;
						
					case 2: 
						
						System.out.println("Ha seleccionado entrada para adultos.");
						System.out.println("Seleccione cuántas entradas quieres.");
						numE=Leer.datoInt();
						saldoBase=saldoBase-numE*eAdultos;
						
						break;
												
					case 3: 
						
						System.out.println("Ha seleccionado entradas VIP.");
						System.out.println("Seleccione cuántas entradas quieres.");
						numE=Leer.datoInt();
						saldoBase=saldoBase-numE*eVIP;
						
						break;
						
					
					
			
			}
		
		}
		
		
		
	}

}
