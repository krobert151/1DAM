package proyecto;

import java.util.Iterator;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		double[][] tablaNotas;
		String [][] grafico;
		String [] asigName;
		String curso;
		int [] notaGraf;
		int numAsig,tema,fil=0,col=0,cien=100,maxFalta=15,asigFalta=0,numFalta,salir,numAlumnos,numAl,puntos=10,menu,menu2,menu3,menu4,mitad;
		double ifmitad,iftema;
		System.out.println("             ▓█▓    ███                                              ");
		System.out.println("          ▒███████▓ ███                                              ");
		System.out.println("          ███   ▓██ ███  ██████    ██████   ██████    ▄▄▄       ▄▄▄    ");
		System.out.println("          ██▓       ███      ███  ██       ██         ███       ███    ");
		System.out.println("          ██▓       ███   ▓█████  █████▓   █████▓  █████████ █████████ ");
		System.out.println("          ███▒ ▒███ ███  ██▒ ███      ███      ███    ███       ███    ");
		System.out.println("           ▓██████  ███  ███████  ██████   ██████     ▀▀▀       ▀▀▀    ");

	
		System.out.println("\nBienvenido al programa de Class++");
		System.out.println("\nClass++ es un programa de consola que se encarga de gestionar personalemnte la administración de un curso de una forma más sencilla.");
		System.out.println("Pero antes de comenzar es necesario que pongas un poco de tu parte y nos informes de la composición de tu clase.");
		System.out.println("Antes de nada indica que curso estás cursando actualmente.");
		curso=Leer.dato();
		System.out.println("¿Cúantas asignaturas tiene el curso de "+(curso)+"?");
		numAsig=Leer.datoInt();
		asigName = new String [numAsig];
		for (int i = 0; i < asigName.length; i++) {
			
			System.out.print("Selecciona una sigla para la "+(i+1)+"º asignatura. ------> ");
			asigName[i]=Leer.dato();
			
			}
		System.out.println("¿De cúantos temas se compone cada asignatura?");
		tema=Leer.datoInt();
		iftema=tema;
		mitad=tema/2;
		ifmitad=iftema%2;
		notaGraf= new int [tema];
		tablaNotas= new double [numAsig][tema];
		grafico= new String [puntos][tema];
		
		for (int i = 0; i < tablaNotas.length; i++) {
			for (int j = 0; j < tablaNotas[i].length; j++) {	
				tablaNotas[i][j]=0;
			}
		}
		
		for (int i = 0; i < grafico.length; i++) {
			for (int j = 0; j < grafico[i].length; j++) {
				grafico[i][j]="·";
			}
		}
		
		


		do{
			System.out.println("______________________________________________________________________________________________________________________________________");
			System.out.println("\n   MENÚ  PRINCIPAL\n");
			System.out.println("\t1.-Ver notas de "+(curso));
			System.out.println("\t2.-Registrar notas");
			System.out.println("\t3.-Gestionar faltas");
			System.out.println("\t4.-Trabajos");
			System.out.println("\t5.-Gráficos");
			System.out.println("\n\t0.-Salir");
			System.out.println("______________________________________________________________________________________________________________________________________");
			menu=Leer.datoInt();
			switch(menu) {
			
			case 1:
				System.out.println("\n");
				for (int i = 0; i < mitad; i++) {
					System.out.print("\t");
				}
				if(iftema!=0) {
					System.out.print("     ");


				}else {
					System.out.print("\t");
				}
				System.out.println(curso);
				System.out.print("\n");
				for (int i = 0; i < tema; i++) {
					if (i==0) {
						System.out.print("\t╔═══════╦");

					}else {
						if(i==(tema-1)) {
							System.out.print("═══════╗");
						}else {
							
							System.out.print("═══════╦");

						}
						
					}
					
					
				}
				System.out.print("\n\t");
				for (int i = 0; i < tema; i++) {
					if(i==(tema-1)) {
						System.out.print("║Tema "+(i+1)+"║");	

					}else {
						if(i<9){
							System.out.print("║Tema "+(i+1)+"\t");	
							
						}else {
							System.out.print("║Tema "+(i+1));	
						}						
					}

				}
				System.out.print("\n╔═══════╬");
				for (int i = 0; i < tema; i++) {
					if(i==(tema-1)) {
						System.out.print("═══════╣");

					}else {
						System.out.print("═══════╬");
					}
				}
				
				for (int i = 0; i < tablaNotas.length; i++) {
					System.out.print("\n║ ");
					System.out.print(asigName[i]+"\t");
					for (int j = 0; j < tablaNotas[i].length; j++) {
						System.out.print("║  "+tablaNotas[i][j]+"\t");
					}
					if(i==(tablaNotas.length-1)){
						System.out.print("║\n╚═══════╩");

					}else {
						System.out.print("║\n╠═══════╬");
						
					}
					
					for (int j = 0; j < tablaNotas[i].length; j++) {
						if(i==(tablaNotas.length-1)) {
							
							if(j==(tablaNotas[i].length-1)) {
								System.out.print("═══════╝");

							}else {
								System.out.print("═══════╩");								
							}
	
						}else {
							
							if(j==(tablaNotas[i].length-1)) {
								System.out.print("═══════╣");

							}else {
								System.out.print("═══════╬");
		
							}
						}

					}	
				}
				System.out.println(" ");
				break;
			case 2:
			
				do {
					System.out.println("\n______________________________________________________________________________________________________________________________________");
					System.out.println("\n   MENÚ DE NOTAS\n");
					System.out.println("\t1.-Registrar notas individualmente.");
					System.out.println("\t2.-Registrar notas por tema.");
					System.out.println("\t3.-Registrar notas por asignaturas.");
					System.out.println("\t0.-Salir");
					System.out.println("______________________________________________________________________________________________________________________________________");

					menu2=Leer.datoInt();
					switch(menu2) {
					
					case 1:
						System.out.println(" ");
						System.out.print("\t");
						for (int i = 0; i < tema; i++) {
							System.out.print("Tema "+(i+1)+"\t");	
						} 
						
						for (int i = 0; i < tablaNotas.length; i++) {
							System.out.println("");
							System.out.print(asigName[i]+"\t");
							for (int j = 0; j < tablaNotas[i].length; j++) {
								System.out.print(tablaNotas[i][j]+"\t");
							}		
							
						}
						System.out.println("\n\nSelecciona la Asignatura");
						System.out.print("\nAsignatura\t");
						System.out.println("Número");
						for (int i = 0; i < asigName.length; i++) {
							System.out.print(asigName[i]+"\t");
							System.out.println("\t"+(i+1));
						}
						System.out.println(" ");
						System.out.println("Por favor, indique el número de asignatura");
						fil=Leer.datoInt();
						System.out.println("Por favor, selecciona un tema");
						for (int i = 0; i <tema; i++) {
							System.out.println("Tema "+(i+1)+"\t");	
						}
						System.out.println(" ");
						col=Leer.datoInt();
						System.out.println("Por favor, indique una nota");
						tablaNotas[fil-1][col-1]=Leer.datoDouble();
						while(tablaNotas[fil-1][col-1]>10|tablaNotas[fil-1][col-1]<0){
							System.out.println("La nota introducida debe ser entre 0 y 10");	
						}
						System.out.println("1.- Para añadir otra nota.");
						System.out.println("0.- Para salir.");
						salir=Leer.datoInt();
						break;
						
					case 2:
						System.out.println("Por favor, selecciona un tema");
						for (int i = 0; i <tema; i++) {
							System.out.println("Tema "+(i+1)+"\t");	
						}
						
						System.out.println(" ");
						col=Leer.datoInt();
						
						for (int i = 0; i<asigName.length;i++) {
							System.out.println("Seleccione una nota para "+asigName[i]);
							tablaNotas[i][col-1]=Leer.datoDouble();
							while(tablaNotas[i][col-1]>10|tablaNotas[i][col-1]<0){
								System.out.println("La nota introducida debe ser entre 0 y 10");
								System.out.println("Seleccione una nota para "+asigName[i]);
								tablaNotas[i][col-1]=Leer.datoDouble();
							}
							
							}
						System.out.println("1.- Para añadir otra nota.");
						System.out.println("0.- Para salir.");
						salir=Leer.datoInt();
						break;
						
					case 3:
						System.out.println("Por favor, seleccione una asignatura.");
						for (int i = 0; i < asigName.length; i++) {
							System.out.println((i+1)+".- "+asigName[i]);
						}
						System.out.println(" ");
						fil=Leer.datoInt();
						
						
						for (int i = 0; i < tema; i++) {
							System.out.println("Seleccione una nota para el tema: "+(i+1));
							tablaNotas[fil-1][i]=Leer.datoDouble();
							while(tablaNotas[fil-1][i]>10|tablaNotas[fil-1][i]<0){
								System.out.println("La nota introducida debe ser entre 0 y 10");
								System.out.println("Seleccione una nota para el tema: "+(i+1));
								tablaNotas[fil-1][i]=Leer.datoDouble();
									
							}
						}
						break;			
					}
						
				}while(menu2!=0);
			break;
			case 5:
				
				System.out.println("¿De qué asignatura quieres ver el gráfico?");
				System.out.print("\nAsignatura\t\t");
				System.out.println("Número");
				for (int i = 0; i < asigName.length; i++) {
					System.out.print(asigName[i]+"\t");
					System.out.println((i+1));
					
				}
				System.out.println(" ");
				numAsig=Leer.datoInt();
				for (int i = 0; i < grafico.length ; i++) {
					
					
					
					for (int j = 0; j < grafico[i].length; j++) {
						
						
						notaGraf[j] = (int)tablaNotas[numAsig-1][j];
						switch(notaGraf[j]) {
						
						case 10:
							if(j==0) {
								
								grafico[puntos-10][j]="¯¯";
		
							}else {
								if(notaGraf[j]<notaGraf[j-1]){
									
									grafico[puntos-10][j]="\\";
									
								}
								if(notaGraf[j]==notaGraf[j-1]){
									
									grafico[puntos-10][j]="¯¯";
									
								}
								
							}
							break;
						case 9:
							if(j==0) {
								
								grafico[puntos-9][j]="/";
	
							}else {
								if(notaGraf[j]<notaGraf[j-1]){
									
									grafico[puntos-9][j]="\\";
									
								}
								if(notaGraf[j]>notaGraf[j-1]){
									
									grafico[puntos-9][j]="/";
									
								}
								if(notaGraf[j]==notaGraf[j-1]){
									
									grafico[puntos-9][j]="¯¯";
									
								}
								
							}
							break;
						case 8:
							if(j==0) {
								
								grafico[puntos-8][j]="/";

							}
							else {
								if(notaGraf[j]<notaGraf[j-1]){
									
									grafico[puntos-8][j]="\\";
									
								}
								if(notaGraf[j]>notaGraf[j-1]){
									
									grafico[puntos-8][j]="/";
									
								}
								if(notaGraf[j]==notaGraf[j-1]){
									
									grafico[puntos-8][j]="¯¯";
									
								}
								
							}
							break;
						case 7:
							if(j==0) {
								
								grafico[puntos-7][j]="/";

							}else {
								if(notaGraf[j]<notaGraf[j-1]){
									
									grafico[puntos-7][j]="\\";
									
								}
								if(notaGraf[j]>notaGraf[j-1]){
									
									grafico[puntos-7][j]="/";
									
								}
								if(notaGraf[j]==notaGraf[j-1]){
									
									grafico[puntos-7][j]="¯¯";
									
								}
								
							}
							break;
						case 6:
							if(j==0) {
								
								grafico[puntos-6][j]="/";

							}else {
								if(notaGraf[j]<notaGraf[j-1]){
									
									grafico[puntos-6][j]="\\";
									
								}
								if(notaGraf[j]>notaGraf[j-1]){
									
									grafico[puntos-6][j]="/";
									
								}
								if(notaGraf[j]==notaGraf[j-1]){
									
									grafico[puntos-6][j]="¯¯";
									
								}
								
							}
							break;
						case 5:
							if(j==0) {
								
								grafico[puntos-5][j]="/";

							}else {
								if(notaGraf[j]<notaGraf[j-1]){
									
									grafico[puntos-5][j]="\\";
									
								}
								if(notaGraf[j]>notaGraf[j-1]){
									
									grafico[puntos-5][j]="/";
									
								}
								if(notaGraf[j]==notaGraf[j-1]){
									
									grafico[puntos-5][j]="¯¯";
									
								}
								
							}
							break;
						case 4:
							if(j==0) {
								
								grafico[puntos-4][j]="/";

							}else {
								if(notaGraf[j]<notaGraf[j-1]){
									
									grafico[puntos-4][j]="\\";
									
								}
								if(notaGraf[j]>notaGraf[j-1]){
									
									grafico[puntos-4][j]="/";
									
								}
								if(notaGraf[j]==notaGraf[j-1]){
									
									grafico[puntos-4][j]="¯¯";
									
								}
								
							}
							break;
						case 3:
							if(j==0) {
								
								grafico[puntos-3][j]="/";
								
							}else {
								if(notaGraf[j]<notaGraf[j-1]){
									
									grafico[puntos-3][j]="\\";
									
								}
								if(notaGraf[j]>notaGraf[j-1]){
									
									grafico[puntos-3][j]="/";
									
								}
								if(notaGraf[j]==notaGraf[j-1]){
									
									grafico[puntos-3][j]="¯¯";
									
								}
								
							}
							break;
						case 2:
							if(j==0) {
								
								grafico[puntos-2][j]="/";
								
							}else {
								if(notaGraf[j]<notaGraf[j-1]){
									
									grafico[puntos-2][j]="\\";
									
								}
								if(notaGraf[j]>notaGraf[j-1]){
									
									grafico[puntos-2][j]="/";
									
								}
								if(notaGraf[j]==notaGraf[j-1]){
									
									grafico[puntos-2][j]="¯¯";
									
								}
								
							}
							
							break;
						case 1:
							if(j==0) {
								
								grafico[puntos-1][j]="/";

								
							}else {

								if(notaGraf[j]>notaGraf[j-1]){
									
									grafico[puntos-1][j]="/";
									
								}
								if(notaGraf[j]==notaGraf[j-1]){
									
									grafico[puntos-1][j]="¯¯";
									
								}
								
							}
							
							break;
						
							
						}
						
										
					}
					
					
				}
				
				for (int k = 0; k < grafico.length; k++) {
					System.out.println();
					System.out.print(10-k+"\t");
					for (int k2 = 0; k2 < grafico[k].length; k2++) {
						
						System.out.print(grafico[k][k2]+("\t"));
	
					}	
				}
				System.out.println("\n");
				System.out.print("\t");
				for (int i = 0; i < tema; i++) {
					System.out.print("Tema "+(i+1)+"\t");
				}
				System.out.println("\n");
				
				break;
			
			}
			
		}while(menu!=0);
		
	}
		
}


