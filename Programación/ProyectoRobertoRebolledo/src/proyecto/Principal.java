package proyecto;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Integrantes del grupo: 

	Roberto Rebolledo Naharro (Scrum Master).
	Manuel Molina García (Relaciones Públicas).
	Marisa Lozano Macías (Secretaria).
	
	Seguimiento:
	En la primera reunión decidimos, qué iba a realizar el programa, y cómo sería la estructura. Decidimos que nuestro programa iba a realizar un control de notas del alumno, control de las faltas, asignará aleatoriamente compañeros con los que realizar un trabajo, también el usuario tiene la posibilidad de ver la evolución de las notas a través de una gráfica.
	
	En una reunión posterior hicimos el reparto de tareas:
	La primera parte comprende preguntarle al usuario datos y leerlos por teclado, y hacer los menús para ver las notas y registrarlas, además de colaborar con el Scrum Master en tareas de diseño. Realizada por Marisa
	La segunda parte comprende el recuento de faltas y generar los aleatorios para que empareje a los alumnos. Realizada por Manuel
	La tercera parte comprende la realización de los gráficos y del título. Realizada por Roberto.
	
	El día 11/11/22: Roberto entrega su parte del trabajo, además une los códigos y se encarga de tareas de diseño para que el interfaz del programa quede bonito, Marisa entrega su parte de código, además ayuda a Roberto con las tareas de diseño, Manuel, tiene terminada la parte del código que se refiere a las faltas, posteriormente se toma la decisión de modificar esa parte ya que, Manuel lo tenía configurado con tres arrays unidimensionales, y está intentando hacer esa parte con un array unidimensional, y otro bidimensional.
	
	El día 13/11/22: Manuel entrega su parte del programa.
	El día 14/11/22: Iniciamos entre todos la unión de los códigos y terminamos la depuración de errores. También terminamos la parte de diseño gráfico. 
	*/
		double[][] tablaNotas;
		int [][] tablaFaltas;
		String [][] grafico;
		String [] asigName;
		String curso;
		String [] nombAlumnos;
		int [] notaGraf;
		int [] grupos;
		int numAsig,tema,fil=0,col=0,cien=100,maxFalta=15,numFalta,numAlumnos,puntos=10,menu,menu2,menu3,menu4,menu5,mitad;
		int cero=0,uno=1,dos=2,pareja;
		double ifmitad=0,iftema;
		Random num= new Random (System.nanoTime());
		System.out.println("  ");
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
		tablaFaltas = new int [numAsig][dos];
		asigName = new String [numAsig];
		for (int i = 0; i < asigName.length; i++) {
			
			System.out.print("Selecciona una sigla para la "+(i+1)+"º asignatura. ------> ");
			asigName[i]=Leer.dato();
			
			}
		System.out.println("¿Cuántos compañeros tienes en el curso?");
		numAlumnos=Leer.datoInt();
		nombAlumnos= new String [numAlumnos];
		grupos= new int [numAlumnos];
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
				grafico[i][j]="┼";
			}
		}
		for (int i = 0; i < nombAlumnos.length; i++) {
			nombAlumnos[i]=" ";
		}
		for (int i = 0; i < grupos.length; i++) {
			grupos[i]=0;
		}


		do{
			System.out.println("───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
			System.out.println("\n   MENÚ  PRINCIPAL\n");
			System.out.println("\t1.-Ver notas de "+(curso));
			System.out.println("\t2.-Registrar notas");
			System.out.println("\t3.-Registrar alumnos/horas");
			System.out.println("\t4.-Gestionar faltas");
			System.out.println("\t5.-Trabajos");
			System.out.println("\t6.-Gráficos");
			System.out.println("\n\t0.-Salir");
			System.out.println("───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
			menu=Leer.datoInt();
			switch(menu) {
			
			case 1:
				// MOSTRAR LA TABLA DE NOTAS->

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
						if(i<9){
							System.out.print("║Tema "+(i+1)+"\t║");								
						}else {
							System.out.print("║Tema "+(i+1)+"║");	
						}
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
						System.out.printf("║%.2f\t",tablaNotas[i][j]);
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
				// <- MOSTRAR LA TABLA DE NOTAS

				break;
			case 2:
			
				do {
					System.out.println("\n───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
					System.out.println("\n   MENÚ DE NOTAS\n");
					System.out.println("\t1.-Registrar notas individualmente.");
					System.out.println("\t2.-Registrar notas por tema.");
					System.out.println("\t3.-Registrar notas por asignaturas.");
					System.out.println("\t0.-Salir");
					System.out.println("───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");

					menu2=Leer.datoInt();
					switch(menu2) {
					
					case 1:
						// MOSTRAR LA TABLA DE NOTAS->
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
								if(i<9){
									System.out.print("║Tema "+(i+1)+"\t║");								
								}else {
									System.out.print("║Tema "+(i+1)+"║");	
								}	
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
								System.out.printf("║%.2f\t",tablaNotas[i][j]);
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
						// <- MOSTRAR LA TABLA DE NOTAS
						// -> MOSTRAR TABLA DE ASIGANTURAS
						System.out.println(" ");
						System.out.println("\n\n Seleccione el número de la asignatura.\n");
						System.out.print("┌───────────────┬───────┐");
						System.out.print("\n│ Asignatura\t");
						System.out.println("│Número\t│");
						System.out.println("├───────────────┼───────┤");

						for (int i = 0; i < asigName.length; i++) {
							System.out.print(("│ ")+asigName[i]+"\t\t│");
							System.out.println(" "+(i+1)+"\t│");
							if(i==(asigName.length-1)) {
								System.out.println("└───────────────┴───────┘");
							}else {
								System.out.println("├───────────────┼───────┤");

							}
						}
						System.out.println(" ");
						fil=Leer.datoInt();/*Seleccionar asignatura*/
						while(fil>(numAsig)|fil<=0){
							System.out.println("Recuerda que solo tienes "+numAsig+" asignaturas en "+curso+", vuelve a elegir,");
							fil=Leer.datoInt();

						}
						System.out.println("Selecciona una unidad del 1 al "+(tema)+".");
						col=Leer.datoInt();/*Seleccionar undiad*/
						while(col>tema|col<0) {
							System.out.println("Número inválido, recuerda que los temas son del 1 al "+(tema)+".");
							col=Leer.datoInt();
						}
						System.out.println("Por favor, indique una nota");
						tablaNotas[fil-1][col-1]=Leer.datoDouble();
						while(tablaNotas[fil-1][col-1]>10|tablaNotas[fil-1][col-1]<0){
							System.out.println("La nota introducida debe ser entre 0 y 10");	
							tablaNotas[fil-1][col-1]=Leer.datoDouble();
						}
						break;
						
					case 2:
						System.out.println("Selecciona una unidad del 1 al "+(tema)+".");
						col=Leer.datoInt();/*Seleccionar undiad*/
						while(col>tema|col<0) {
							System.out.println("Número inválido, recuerda que los temas son del 1 al "+(tema)+".");
							col=Leer.datoInt();
						}						
						for (int i = 0; i<asigName.length;i++) {
							System.out.println("Seleccione una nota para "+asigName[i]);
							tablaNotas[i][col-1]=Leer.datoDouble();
							while(tablaNotas[i][col-1]>10|tablaNotas[i][col-1]<0){
								System.out.println("La nota introducida debe ser entre 0 y 10");
								System.out.println("Seleccione una nota para "+asigName[i]);
								tablaNotas[i][col-1]=Leer.datoDouble();
							}
							
							}
						
						// MOSTRAR LA TABLA DE NOTAS->
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
								if(i<9){
									System.out.print("║Tema "+(i+1)+"\t║");								
								}else {
									System.out.print("║Tema "+(i+1)+"║");	
								}	
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
								System.out.printf("║%.2f\t",tablaNotas[i][j]);
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
						// <- MOSTRAR LA TABLA DE NOTAS
						
						break;
						
					case 3:
						// -> MOSTRAR TABLA DE ASIGANTURAS
						System.out.println(" ");
						System.out.println("\n\n Seleccione el número de la asignatura.\n");
						System.out.print("┌───────────────┬───────┐");
						System.out.print("\n│ Asignatura\t");
						System.out.println("│Número\t│");
						System.out.println("├───────────────┼───────┤");

						for (int i = 0; i < asigName.length; i++) {
							System.out.print(("│ ")+asigName[i]+"\t\t│");
							System.out.println(" "+(i+1)+"\t│");
							if(i==(asigName.length-1)) {
								System.out.println("└───────────────┴───────┘");
							}else {
								System.out.println("├───────────────┼───────┤");

							}
						}
						System.out.println(" ");
						// -> MOSTRAR TABLA DE ASIGNATURAS
						fil=Leer.datoInt();/*Seleccionar asignatura*/
						while(fil>(numAsig)|fil<=0){
							System.out.println("Recuerda que solo tienes "+numAsig+" asignaturas en "+curso+", vuelve a elegir,");
							fil=Leer.datoInt();

						}
						
						
						for (int i = 0; i < tema; i++) {
							System.out.print("Seleccione una nota para la UD"+(i+1)+" :");
							tablaNotas[fil-1][i]=Leer.datoDouble();
							while(tablaNotas[fil-1][i]>10|tablaNotas[fil-1][i]<0){
								System.out.println("La nota introducida debe ser entre 0 y 10");
								System.out.print("Seleccione una nota para la UD"+(i+1)+" :");
								tablaNotas[fil-1][i]=Leer.datoDouble();
									
							}
						}
						break;		
						
					case 0:
						break;
					default:
						System.out.println("Opción no valida");
					break;
					}
						
				}while(menu2!=0);
			break;
			case 3:
				
				do {
					System.out.println("───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
					System.out.println("\n   MENÚ  DE REGISTRO\n");
					System.out.println("\t1.-Regirtrar horas de "+(curso));
					System.out.println("\t2.-Registar alumnos de "+(curso));
					System.out.println("\n\t0.-Salir");
					System.out.println("───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
					menu3=Leer.datoInt();
					switch(menu3) {
					
					case 1:
						System.out.println("¿Qué porcentaje de faltas permite tu centro?");
						maxFalta=Leer.datoInt();
						for (int i = 0; i < tablaFaltas.length ; i++) {
							System.out.print("Digame el número total de horas de "+(asigName[i])+" ---> ");
							tablaFaltas[i][cero]=Leer.datoInt(); 
							tablaFaltas[i][uno]=(tablaFaltas [i] [cero] *maxFalta)/cien;
						}
						
						break;
					
					case 2:
						
						for (int i = 0; i < nombAlumnos.length; i++) {
							System.out.print("Digame el nombre del alumno número "+(i+1)+" ---> ");
							nombAlumnos[i]=Leer.dato();
						}
						
						break;
					
					case 0:
						break;
					default:
						System.out.println("Opción no disponible, vuelva a intentarlo.");
						break;
					}
				}while(menu3!=0);
				
				break;
			case 4:
				
				

				do {
					System.out.println("───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
					System.out.println("\n   MENÚ  DE FALTAS\n");
					System.out.println("\t1.-Añadir una falta.");
					System.out.println("\t2.-Justificar una falta.");
					System.out.println("\t3.-Ver faltas.");
					System.out.println("\n\t0.-Salir");
					System.out.println("\t(Recuerda que antes debes registrar las horas totales de las asignaturas de "+curso+", de lo contrario las horas aparecerán en blanco.)");
					System.out.println("───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
					menu4=Leer.datoInt();
					switch(menu4) {
						case 1:
							// -> MOSTRAR TABLA DE ASIGANTURAS
							System.out.println(" ");
							System.out.println("\n\n Seleccione el número de la asignatura.\n");
							System.out.print("┌───────────────┬───────┐");
							System.out.print("\n│ Asignatura\t");
							System.out.println("│Número\t│");
							System.out.println("├───────────────┼───────┤");

							for (int i = 0; i < asigName.length; i++) {
								System.out.print(("│ ")+asigName[i]+"\t\t│");
								System.out.println(" "+(i+1)+"\t│");
								if(i==(asigName.length-1)) {
									System.out.println("└───────────────┴───────┘");
								}else {
									System.out.println("├───────────────┼───────┤");

								}
							}
							System.out.println(" ");
							fil=Leer.datoInt();/*Seleccionar asignatura*/
							while(fil>(numAsig)|fil<=0){
								System.out.println("Recuerda que solo tienes "+numAsig+" asignaturas en "+curso+", vuelve a elegir,");
								fil=Leer.datoInt();

							}
							
							System.out.println("Por favor digame cuantas horas ha faltado");
							numFalta=Leer.datoInt();
							
							tablaFaltas[fil-uno] [uno]-=numFalta;
							System.out.printf("Recuerda que las faltas restantes es un %d%% de las horas totales.\n",maxFalta);
							System.out.println  ("┌───────────────┬───────────────┬───────────────┐");

							System.out.println("│ Asignaturas\t│ Horas\t\t│ Faltas Rest.\t│");
							System.out.println("├───────────────┼───────────────┼───────────────┤");

							for(int i=0; i<asigName.length; i++) {
								
							System.out.printf("│ %s\t\t│ %d\t\t│ %d\t\t│\n",asigName[i],tablaFaltas[i][cero], tablaFaltas[i] [uno] );
								if(i==(asigName.length-1)) {
									System.out.println("└───────────────┴───────────────┴───────────────┘");
								}else {
									System.out.println("├───────────────┼───────────────┼───────────────┤");
	
								}
							}
							
							break;
						case 2:
							// -> MOSTRAR TABLA DE ASIGANTURAS
							System.out.println(" ");
							System.out.println("\n\n Seleccione el número de la asignatura.\n");
							System.out.print("┌───────────────┬───────┐");
							System.out.print("\n│ Asignatura\t");
							System.out.println("│Número\t│");
							System.out.println("├───────────────┼───────┤");

							for (int i = 0; i < asigName.length; i++) {
								System.out.print(("│ ")+asigName[i]+"\t\t│");
								System.out.println(" "+(i+1)+"\t│");
								if(i==(asigName.length-1)) {
									System.out.println("└───────────────┴───────┘");
								}else {
									System.out.println("├───────────────┼───────┤");

								}
							}
							System.out.println(" ");
							fil=Leer.datoInt();/*Seleccionar asignatura*/
							while(fil>(numAsig)|fil<=0){
								System.out.println("Recuerda que solo tienes "+numAsig+" asignaturas en "+curso+", vuelve a elegir,");
								fil=Leer.datoInt();

							}
							System.out.println("Por favor digame cuantas horas ha justificado");
							numFalta=Leer.datoInt();
							
							tablaFaltas[fil-uno] [uno]+=numFalta;
							
							System.out.printf("Recuerda que las faltas restantes es un %d%% de las horas totales.\n",maxFalta);
							System.out.println  ("┌───────────────┬───────────────┬───────────────┐");

							System.out.println("│ Asignaturas\t│ Horas\t\t│ Faltas Rest.\t│");
							System.out.println("├───────────────┼───────────────┼───────────────┤");

							for(int i=0; i<asigName.length; i++) {
								
							System.out.printf("│ %s\t\t│ %d\t\t│ %d\t\t│\n",asigName[i],tablaFaltas[i][cero], tablaFaltas[i] [uno] );
								if(i==(asigName.length-1)) {
									System.out.println("└───────────────┴───────────────┴───────────────┘");
								}else {
									System.out.println("├───────────────┼───────────────┼───────────────┤");
	
								}
							}
							break;
						case 3:
							System.out.printf("Recuerda que las faltas restantes es un %d%% de las horas totales.\n",maxFalta);
							System.out.println  ("┌───────────────┬───────────────┬───────────────┐");

							System.out.println("│ Asignaturas\t│ Horas\t\t│ Faltas Rest.\t│");
							System.out.println("├───────────────┼───────────────┼───────────────┤");

							for(int i=0; i<asigName.length; i++) {
								
							System.out.printf("│ %s\t\t│ %d\t\t│ %d\t\t│\n",asigName[i],tablaFaltas[i][cero], tablaFaltas[i] [uno] );
								if(i==(asigName.length-1)) {
									System.out.println("└───────────────┴───────────────┴───────────────┘");
								}else {
									System.out.println("├───────────────┼───────────────┼───────────────┤");
	
								}
							}
							
							
							break;
						case 0:
							
							break;
						default:
							System.out.println("Opción no disponible, vuelva a intentarlo.");
							break;
								
					}
	
				
				}while(menu4!=0);
				break;
			case 5:	

				do {
					System.out.println("───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
					System.out.println("\n   MENÚ  DE COMPAÑEROS\n");
					System.out.println("\t1.-Ver lista de la clase.");
					System.out.println("\t2.-Hacer grupo aleatorios por pareja.");
					System.out.println("\t3.-Hacer grupos de tres.");
					System.out.println("\t4.-Hacer grupos de cuatro.");
					System.out.println("\n\t0.-Salir");
					System.out.println("\t(Recuerda que antes debes registrar los nombres de los alumnos de "+curso+", de lo contrario los nombres aparecerán en blanco.)");
					System.out.println("───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
					menu5=Leer.datoInt();
					switch(menu5) {
						case 1:
							System.out.println("  Alumnos de "+(curso)+"\n");
							for (int i = 0; i < nombAlumnos.length; i++) {
								System.out.println("\t"+(i+1)+".- "+nombAlumnos[i]);
							}
							System.out.println("\n");
							break;
						case 2:
							pareja= num.nextInt((numAlumnos-1)+1);
							System.out.println("Te ha tocado ponerte en pareja con "+nombAlumnos[pareja]+".");
							System.out.println("\n");
							
							break;
						case 3:
							grupos[uno]=num.nextInt((numAlumnos-1)+1);
							for (int i = 0; i < nombAlumnos.length; i++) {
								grupos[i]=num.nextInt((numAlumnos-1)+1);
								for (int j = 0; j < i; j++) {
									if(grupos[i]==grupos[j]){
										i--;
									}
								}
								
							}
							System.out.print("Te ha tocado ponerte en grupo con : ");
						for (int i = 0; i < dos; i++) {
							for (int j = 0; j < i; j++) {
								System.out.print(nombAlumnos[grupos[i]]+ " y " +nombAlumnos[grupos[j]]+".");
							}
							
						}
						
							System.out.println("\n");
							break;
							
						case 4:
							grupos[uno]=num.nextInt((numAlumnos-1)+1);
							
							for (int i = 0; i < nombAlumnos.length; i++) {
								grupos[i]=num.nextInt((numAlumnos-1)+1);
								for (int j = 0; j < i; j++) {
									if(grupos[i]==grupos[j]){
										i--;
								}
									}
								}
								
							
							System.out.print("Te ha tocado ponerte en grupo con : ");
						for (int i = 0; i < dos; i++) {
							for (int j = 0; j < i; j++) {
									System.out.print(nombAlumnos[grupos[i]]+ ", " +nombAlumnos[grupos[j]]+ " y "+ nombAlumnos[grupos[i+1]]+"."); 
							}
							
						}
				
							System.out.println("\n");
							break;
							
						case 0:
							
							break;
							
						default:
							System.out.println("Opción no valida");
					}
							
				}while (menu5!=0);
				
				break;
			case 6:
				
				System.out.println("¿De qué asignatura quieres ver el gráfico?");
				// -> MOSTRAR TABLA DE ASIGANTURAS
				System.out.println(" ");
				System.out.print("┌───────────────┬───────┐");
				System.out.print("\n│ Asignatura\t");
				System.out.println("│Número\t│");
				System.out.println("├───────────────┼───────┤");

				for (int i = 0; i < asigName.length; i++) {
					System.out.print(("│ ")+asigName[i]+"\t\t│");
					System.out.println(" "+(i+1)+"\t│");
					if(i==(asigName.length-1)) {
						System.out.println("└───────────────┴───────┘");
					}else {
						System.out.println("├───────────────┼───────┤");

					}
				}
				System.out.println(" ");

				numAsig=Leer.datoInt();
				for (int i = 0; i < grafico.length ; i++) {
					
					
					
					for (int j = 0; j < grafico[i].length; j++) {
						
						
						notaGraf[j] = (int)tablaNotas[numAsig-1][j];
						switch(notaGraf[j]) {
						
						case 10:
					
							grafico[puntos-10][j]="█";
								
							break;
						case 9:
							
							grafico[puntos-9][j]="█";

							break;
						case 8:
								
							grafico[puntos-8][j]="█";

							break;
						case 7:
								
							grafico[puntos-7][j]="█";

							break;
						case 6:
								
							grafico[puntos-6][j]="█";

							break;
						case 5:
							
							grafico[puntos-5][j]="█";	
							
							break;
						case 4:
								
							grafico[puntos-4][j]="█";

							break;
						case 3:
							
							grafico[puntos-3][j]="█";
								
							break;
						case 2:
								
							grafico[puntos-2][j]="█";
								
							
							break;
						case 1:
															
							grafico[puntos-1][j]="█";
					
							break;
						
							
						}
						
										
					}
					
					
				}
				System.out.print("\t\t  ");
				for (int i = 0; i < mitad; i++) {
					System.out.print("  ");
				}
				if(iftema!=0) {
					System.out.print("  ");
				}else {
					System.out.print(" ");
				}
				System.out.println(asigName[numAsig-1]);
				for (int k = 0; k < grafico.length; k++) {
					System.out.println();
					if(k==0) {
						System.out.print("\t\t"+(10-k));
					}else {
						
						if(k==5) {
							System.out.print("\tNotas:\t"+(10-k)+" ");

						}else {
							System.out.print("\t\t"+(10-k)+" ");

						}

					}
					for (int k2 = 0; k2 < grafico[k].length; k2++) {

						System.out.print("─"+grafico[k][k2]+"─");
						
					}	
				}
				
				System.out.print("\n\t\t  ");
				for (int i = 0; i < tema; i++) {
					if((i+1)<10) {
						System.out.print(" "+(i+1)+" ");

					}else {
						System.out.print(" "+(i+1)+"");
					}
				}				System.out.println("\n");
				
				System.out.print("\t\t  ");
				for (int i = 0; i < mitad; i++) {
					System.out.print("  ");
				}
				if(iftema!=0) {
					System.out.print("  ");
				}else {
					System.out.print(" ");
				}
				System.out.println("Unidad:");
				System.out.println("\n");
				
				break;
			
				default:
					System.out.println("Opción no disponible");
					break;
				case 0:
					break;
			}
			
		}while(menu!=0);
		System.out.println("Gracias por usar este programa.");
	}
		
}


