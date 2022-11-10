package proyecto;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		System.out.println(" ____   _      _____   ___   ___      _       _");
		System.out.println("/  __| | |    |  _  | / __| / __|   _| |_   _| |_");
		System.out.println("|  |   | |    |  _  | | |_  | |_   |_   _| |_   _|");
		System.out.println("|  |_  | |__  | | | | \\__ | \\__ |    |_|     |_|");
		System.out.println("\\____| |____| |_| |_| |___/ |___/");


		double[][] tablaNotas;
		String [][] grafico;
		String [] asigName;
		
		int numAsig,tema,fil=0,col=0,cien=100,maxFalta=15,asigFalta=0,numFalta,salir,numAlumnos,numAl,puntos=10,notaGraf,menu,menu2,menu3,menu4;
		
		
		
		
		System.out.println("cuantas asignaturas");
		numAsig=Leer.datoInt();
		asigName = new String [numAsig];
		for (int i = 0; i < asigName.length; i++) {
			
			System.out.println("Selecciona el nombre para la "+(i+1)+"º asignatura.");
			asigName[i]=Leer.dato();
			
			}
		System.out.println("Cuántos temas");
		tema=Leer.datoInt();
		tablaNotas= new double [numAsig][tema];
		grafico= new String [puntos][tema];
		for (int i = 0; i < tablaNotas.length; i++) {
			
			for (int j = 0; j < tablaNotas[i].length; j++) {
				
				tablaNotas[i][j]=0;
				
			}
		}
		
		
		
		
		
		System.out.println("5.-Gráfico");
		menu=Leer.datoInt();
		switch(menu) {
		
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


