package proyecto;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Cambiar los int a double*/
		double [][] tabla;
		String [][] grafico;
		double nota=0;
		int asig=6, tema, fil=0, col=0,cien=100,maxFalta=15,asigFaltada,falta,salir,numAlumnos,numAl,tamGrup,puntos=10,numAsig,notaGrafico;
		int menu,menu2,menu3,menu4;
		int  [] horas = {192,128,96,96,192,256};
		int [] faltas = new int [asig];
		Random r= new Random (System.nanoTime());
		String [] asigN = {"Base de Datos\t","Leng de Marcas\t","Ent Desarrollo\t", "FOL\t\t", "Sist Informáticos", "Programación\t"};
		String [] alumnos;		
		System.out.println("Bienvenidos al programa");
		
		System.out.println("Insterte el número de temas");
		tema=Leer.datoInt();
		grafico= new String [puntos][tema];
		tabla= new double [asig] [tema];
		grafico= new String [puntos][tema];
		System.out.println("¿Cuántos alumnos hay en este curso?");
		numAlumnos=Leer.datoInt()-1;
		alumnos = new String [numAlumnos];

		
		for (int i = 0; i < tabla.length; i++) {
			
			for (int j = 0; j < tabla[i].length; j++) {
				
				tabla[i][j]=0;
				
			}
		}
		for (int i = 0; i < grafico.length; i++) {
			
			for (int j = 0; j < grafico[i].length; j++) {
				
				grafico[i][j]="-";
				
			}
		}
		
		for (int i = 0; i < faltas.length; i++) {
			faltas[i]=(horas[i]*maxFalta)/cien;
		}
		
		
		do {
			System.out.println("\n\n1.- Ver Notas del Curso");
			System.out.println("2.- Registrar las notas del curso");
			System.out.println("3.- Faltas");
			System.out.println("4.- Trabajo con compañeros");
			System.out.println("5.- Gráficos");
			System.out.println("0.- Salir del programa");
			
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
					menu2=Leer.datoInt();
					switch(menu2) {
					
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
								nota=Leer.datoDouble();
								while(nota>10|nota<0) {
									System.out.println("La nota debe ser entre el 0 y el 10");
									nota=Leer.datoDouble();
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
								nota=Leer.datoDouble();
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
								nota=Leer.datoDouble();
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
							
						case 0:
							
							break;
							
						default:
							
							System.out.println("Opción no disponible en el menú");
							
							break;
					
					
					}
				}while(menu2!=0);
				
				break;
				
			case 3:
				
				do {
					System.out.println("1.-Registrar faltas");
					System.out.println("2.-Quitar faltas");
					System.out.println("3.-Ver faltas");
					System.out.println("0.-Salir");
					menu3=Leer.datoInt();
					switch(menu3) {
					
					case 1:
						
						System.out.println("En qué asignatura has faltado");
						System.out.print("\nNúmero\t");
						System.out.print("Asignatura\t\t");
						System.out.print("Horas\t");
						System.out.println("Horas que puedes faltar");
						System.out.println(" ");
						for (int i = 0; i < asigN.length; i++) {
							System.out.print((i+1)+"\t");
							System.out.print(asigN[i]+"\t");
							System.out.print((horas[i])+"\t");
							System.out.println(faltas[i]);
							
						}
						asigFaltada=Leer.datoInt();
						System.out.println("¿Cuántas horas has faltado en esa asignatura?");
						falta=Leer.datoInt();
						faltas[asigFaltada-1]-=falta;
			
						System.out.print("\nAsignatura\t\t");
						System.out.print("Número\t");
						System.out.print("Horas\t");
						System.out.println("Horas que puedes faltar");
						System.out.println(" ");
						for (int i = 0; i < asigN.length; i++) {
							System.out.print(asigN[i]+"\t");
							System.out.print((i+1)+"\t");
							System.out.print((horas[i])+"\t");
							System.out.println(faltas[i]);
							
						}
						
						break;
						
					case 2:
						
						System.out.println("En qué asignatura te van a quitar la falta");
						System.out.print("\nNúmero\t");
						System.out.print("Asignatura\t\t");
						System.out.print("Horas\t");
						System.out.println("Horas que puedes faltar");
						System.out.println(" ");
						for (int i = 0; i < asigN.length; i++) {
							System.out.print((i+1)+"\t");
							System.out.print(asigN[i]+"\t");
							System.out.print((horas[i])+"\t");
							System.out.println(faltas[i]);
							
						}
						asigFaltada=Leer.datoInt();
						System.out.println("¿Cuántas horas te han quitado de faltas en esa asignatura?");
						falta=Leer.datoInt();
						faltas[asigFaltada-1]+=falta;
						System.out.print("\nAsignatura\t\t");
						System.out.print("Número\t");
						System.out.print("Horas\t");
						System.out.println("Horas que puedes faltar");
						System.out.println(" ");
						for (int i = 0; i < asigN.length; i++) {
							System.out.print(asigN[i]+"\t");
							System.out.print((i+1)+"\t");
							System.out.print((horas[i])+"\t");
							System.out.println(faltas[i]);
							
						}
						
						break;
						
					case 3:
						
						System.out.print("\nAsignatura\t\t");
						System.out.print("Número\t");
						System.out.print("Horas\t");
						System.out.println("Horas que puedes faltar");
						System.out.println(" ");
						for (int i = 0; i < asigN.length; i++) {
							System.out.print(asigN[i]+"\t");
							System.out.print((i+1)+"\t");
							System.out.print((horas[i])+"\t");
							System.out.println(faltas[i]);
							
						}
						
						break;
						
					case 0:
						
						break;
						
					default:
						
						System.out.println("Opción no disponible en el menú");
						
						break;
						
					}
					
				}while(menu3!=0);
				
				break;
				
				
			case 4:
				
				do {
					
					System.out.println("1.-Registrar alumnos");
					System.out.println("2.-Ver lista de alumnos");
					System.out.println("3.-Pareja aleatoria");
					System.out.println("4.-Grupo aleatorio");
					System.out.println("0.-Salir");
					menu4=Leer.datoInt();
					
					switch(menu4) {
					
					case 1:
						System.out.println("\n");
						for (int i = 0; i < alumnos.length; i++) {
							System.out.println("Nombre del "+(i+1)+"º alumno.");
							alumnos[i]=Leer.dato();
						}					
						System.out.println("\n");
						break;
					case 2:
						System.out.println("\n");
						for (int i = 0; i < alumnos.length; i++) {
							System.out.print((i+1)+".- ");
							System.out.println(alumnos[i]);
							
						}
						System.out.println("\n");
						
						break;
					case 3:
						System.out.println("\n");
						numAl= r.nextInt((numAlumnos-1)+1);
						System.out.println("Te ha tocado ponerte en pareja con "+alumnos[numAl]);
						System.out.println("\n");
						break;
						
					case 4:
						System.out.println("Selecciona el tamaño de los grupos");
						tamGrup=Leer.datoInt();
						while(tamGrup>numAlumnos|tamGrup<0) {
							System.out.println("El grupo no puede ser mas grande que la clase o menor que 0, vuelva a intentarlo.");
							tamGrup=Leer.datoInt();

						}
						System.out.print("Te ha tocado ponerte en grupo con ");
						for(int i=0; i<tamGrup; i++) {
							numAl= r.nextInt((numAlumnos-1)+1);
							System.out.print(alumnos[numAl]+", ");
							
						}
						System.out.print(".\n\n");
						
						break;
					case 0:
						
						break;
					
					default:
						System.out.println("Opción no disponible en el menú");
						break;
					
					
					}
					
				}while(menu4!=0);
				
				break;
				
			case 5:
				System.out.println("¿De qué asignatura quieres ver el gráfico?");
				System.out.print("\nAsignatura\t\t");
				System.out.println("Número");
				for (int i = 0; i < asigN.length; i++) {
					System.out.print(asigN[i]+"\t");
					System.out.println((i+1));
					
				}
				System.out.println(" ");
				numAsig=Leer.datoInt();
				for (int i = 0; i < grafico.length ; i++) {
					
					
					
					for (int j = 0; j < grafico[i].length; j++) {
						
						
						notaGrafico = (int)tabla[numAsig-1][j];
						switch(notaGrafico) {
						
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
				 
				
				break;
				
			case 0:
				
				break;
				
			default:
				
				System.out.println("Opción no disponible en el menú");
				
				break;
			
				
				
			}
			
		}while(menu!=0);
		System.out.println("Gracias por usar el programa.");
		



		

			
		

		
		
	}

}
