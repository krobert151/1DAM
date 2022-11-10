package proyecto;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		System.out.println("************************************************************************************************************************************");
		System.out.println("\t\t\t\t   ____   _      _____   ___   ___      _       _");
		System.out.println("\t\t\t\t  /  __| | |    |  _  | / __| / __|   _| |_   _| |_");
		System.out.println("\t\t\t\t |  |    | |    |  _  | | |_  | |_   |_   _| |_   _|");
		System.out.println("\t\t\t\t |  |__  | |__  | | | | \\__ | \\__ |    |_|     |_|");
		System.out.println("\t\t\t\t  \\____| |____| |_| |_| |___/ |___/\n");
		System.out.println("************************************************************************************************************************************");

		double[][] tablaNotas;
		String [][] grafico;
		String [] asigName;
		String curso;
		int numAsig,tema,fil=0,col=0,cien=100,maxFalta=15,asigFalta=0,numFalta,salir,numAlumnos,numAl,puntos=10,notaGraf,menu,menu2,menu3,menu4;
		
		
		
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
		tablaNotas= new double [numAsig][tema];
		grafico= new String [puntos][tema];
		for (int i = 0; i < tablaNotas.length; i++) {
			
			for (int j = 0; j < tablaNotas[i].length; j++) {
				
				tablaNotas[i][j]=0;
				
			}
		}
		System.out.println("______________________________________________________________________________________________________________________________________");
		System.out.println("\n\tMENÚ  PRINCIPAL\n");
		System.out.println("\t1.-Ver noptas de "+(curso));
		System.out.println("\t2.-Registrar notas");
		System.out.println("\t3.-Gestionar faltas");
		System.out.println("\t4.-Trabajos");
		System.out.println("\t5.-Gráficos");
		System.out.println("\n\t0.-Salir");
		System.out.println("______________________________________________________________________________________________________________________________________");

		menu=Leer.datoInt();
		switch(menu) {
		
		case 1:
			System.out.println("\t\t\t");
			for (int i = 0; i < tema; i++) {
				System.out.println("Tema "+(i+1)+"\t");	
			} 
			
			for (int i = 0; i < tablaNotas.length; i++) {
				System.out.println("");
				System.out.println(asigName[i]+"\t");
				for (int j = 0; j < tablaNotas.length; j++) {
					System.out.println(tablaNotas[i][j]+"\t");
				}		
			}
			break;
		case 2:
			
			System.out.println("\n1.- Para registrar notas individualmente.");
			System.out.println("2.- Para registrar notas por tema.");
			System.out.println("3.- Para registrar notas por asignaturas.");
			System.out.println("0.- Para salir");
			menu2=Leer.datoInt();
			
			do {
				
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
					
					for (int i = 0; i < tema; i++) {
						System.out.println("Tema "+(i+1)+"\t");	
					}
					System.out.println(" ");
					col=Leer.datoInt();
					
					for (int i = 0; i<asigName.length;i++) {
						System.out.println("Seleccione una nota para "+asigName[i]);
						tablaNotas[fil-1][col-1]=Leer.datoDouble();
						
					}
					
				}
				
				
				
			}while(menu2!=0);
		
		case 5:
			
			System.out.println("¿De qué asignatura quieres ver el gráfico?");
			System.out.print("\nAsignatura\t\t");
			System.out.println("Número");
			for (int i = 0; i < asigName.length; i++) {
				System.out.print(asigName[i]+"\t");
				System.out.println((i+1)+"\t");
				
			}
			System.out.println("");
			numAsig=Leer.datoInt();
			for (int i = 0; i < grafico.length; i++) {
				
				
				
				for (int j = 0; j < grafico.length; j++) {
					
					notaGraf = (int)tablaNotas[numAsig-1][j];
					switch(notaGraf) {
					
					case 10:
						grafico[puntos-10][j]="X";
						break;
					case 9:
						grafico[puntos-9][j]="X";
						break;
					case 8:
						grafico[puntos-8][j]="X";
						break;
					case 7:
						grafico[puntos-7][j]="X";
						break;
					case 6:
						grafico[puntos-6][j]="X";
						break;
					case 5:
						grafico[puntos-5][j]="X";
						break;
					case 4:
						grafico[puntos-4][j]="X";
						break;
					case 3:
						grafico[puntos-3][j]="X";
						break;
					case 2:
						grafico[puntos-2][j]="X";
						break;
					case 1:
						grafico[puntos-1][j]="X";
						break;
					
						
					}
					
					
				}
			}
			
			
			break;
		
		}
		
	}
		
}


