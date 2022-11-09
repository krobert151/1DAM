package proyecto;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Cambiar los int a double*/
		int [][] tabla;
		int asig=6, tema,menu, fil=0, col=0,nota=0,cien=100,maxFalta=15,asigFaltada,falta,salir;
		int sis=192,prog=256,bdd=192,ed=96,lm=128,fol=96;
		int sisF,progF,bddF,edF,lmF,folF;
		String [] asigN = {"Base de Datos\t","Leng de Marcas\t","Ent Desarrollo\t", "FOL\t\t", "Sist Informáticos", "Programación\t"};
		System.out.println("Bienvenidos al programa");
		System.out.println("Insterte el número de temas");
		tema=Leer.datoInt();
		tabla= new int [asig] [tema];
		
		for (int i = 0; i < tabla.length; i++) {
			
			for (int j = 0; j < tabla[i].length; j++) {
				
				tabla[i][j]=0;
				
			}
		}
		
		do {
			System.out.println("\n\n1.- Ver Notas del Curso");
			System.out.println("2.- Registrar las notas del curso");
			System.out.println("3.- Registrar faltas");
			System.out.println("4.- Ver faltas");
			
			menu=Leer.datoInt();
			switch(menu){
			
				
			case 1:
				System.out.print("\t\t\t");
				for (int i = 0; i < tema; i++) {
					System.out.print("Tema "+(i+1)+"\t");
				}
				for (int i = 0; i < tabla.length; i++) {
					
					System.out.println("");
					System.out.print(asigN[i]+"\t");
					for (int j = 0; j < tabla[i].length; j++) {
						
						System.out.print(tabla[i][j]+("\t"));
						
					}
				}
				break;
			case 2:
				
				do {
					
					System.out.println("\n1.-Registrar notas individualmente");
					System.out.println("2.-Registrar notas por temas");
					System.out.println("3.-Registrar notas por asignatura");
					System.out.println("0.-Salir");
					menu=Leer.datoInt();
					switch(menu) {
					
						case 1:
							
							do {
								
								System.out.print("\t\t\t");
								for (int i = 0; i < tema; i++) {
									System.out.print("Tema "+(i+1)+"\t");
								}
								for (int i = 0; i < tabla.length; i++) {
									
									System.out.println("");
									System.out.print(asigN[i]+"\t");
									for (int j = 0; j < tabla[i].length; j++) {
										
										System.out.print(tabla[i][j]+("\t"));
										
									}
								}
								System.out.println("\n\nSelecciona la Asignatura");
								System.out.print("\nAsignatura\t\t");
								System.out.println("Número");
								for (int i = 0; i < asigN.length; i++) {
									System.out.print(asigN[i]+"\t");
									System.out.println((i+1));
									
								}
								System.out.println(" ");
								fil=Leer.datoInt();
								System.out.println("Selecciona un tema");
								
								for (int i = 0; i < tema; i++) {
									System.out.print("Tema "+(i+1)+"  ");
								}
								System.out.println(" ");
								
								
								col=Leer.datoInt();
								System.out.println("Selecciona la nota");
								nota=Leer.datoInt();
								while(nota>10|nota<0) {
									System.out.println("La nota debe ser entre el 0 y el 10");
									nota=Leer.datoInt();
								}
								tabla[fil-1][col-1]=nota;
								System.out.println("¿Quiere añadir otra nota?");
								System.out.println("1.-Si");
								System.out.println("0.-No");
								
								salir=Leer.datoInt();
								
							}while(salir!=0);
							
							break;
						
						case 2:
							
							System.out.println("Selecciona un tema");
							
							for (int i = 0; i < tema; i++) {
								System.out.print("Tema "+(i+1)+"  ");
							}
							System.out.println(" ");
							
							
							col=Leer.datoInt();
							for (int i = 0; i < asigN.length; i++) {
								System.out.println("Seleccione una nota para "+asigN[i]);
								nota=Leer.datoInt();
								tabla[i][col-1]=nota;
								
							}
							System.out.print("\t\t\t");
							for (int i = 0; i < tema; i++) {
								System.out.print("Tema "+(i+1)+"\t");
							}
							for (int i = 0; i < tabla.length; i++) {
								
								System.out.println("");
								System.out.print(asigN[i]+"\t");
								for (int j = 0; j < tabla[i].length; j++) {
									
									System.out.print(tabla[i][j]+("\t"));
									
								}
							}
							
							break;
						
						case 3:
							
							System.out.println("\n\nSelecciona la Asignatura");
							System.out.print("\nAsignatura\t\t");
							System.out.println("Número");
							for (int i = 0; i < asigN.length; i++) {
								System.out.print(asigN[i]+"\t");
								System.out.println((i+1));
								
							}
							System.out.println(" ");
							fil=Leer.datoInt();
							
							for (int i = 0; i < tema; i++) {
								
								System.out.println("Seleccione una nota para el tema "+(i+1));
								nota=Leer.datoInt();
								tabla[fil -1][i]=nota;
								
							}
							System.out.print("\t\t\t");
							for (int i = 0; i < tema; i++) {
								System.out.print("Tema "+(i+1)+"\t");
							}
							for (int i = 0; i < tabla.length; i++) {
								
								System.out.println("");
								System.out.print(asigN[i]+"\t");
								for (int j = 0; j < tabla[i].length; j++) {
									
									System.out.print(tabla[i][j]+("\t"));
									
								}
							}
							
							
							
							
							
							
							break;
					
					
					}
				}while(menu!=0);
				
				break;
				
			case 3:
				
				System.out.println("En qué asignatura has faltado");
				System.out.print("\nAsignatura\t\t");
				System.out.println("Número");
				for (int i = 0; i < asigN.length; i++) {
					System.out.print(asigN[i]+"\t\t\t");
					System.out.println((i+1));
				}
				asigFaltada=Leer.datoInt();
				System.out.println("¿Cuántas horas has faltado en esa asignatura?");
				falta=Leer.datoInt();
				
				
				
				
				break;
			}
			
		}while(menu!=0);
		
		



		

			
		

		
		
	}

}
