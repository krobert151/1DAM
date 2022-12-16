package ejercicio;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu,num,num2;
		Fraccion f1, f2,ftotal, fdiv;
		Operaciones op;
		f1 = new Fraccion ();
		f2 = new Fraccion ();
		ftotal = new Fraccion ();
		fdiv = new Fraccion ();
		op = new Operaciones ();
		System.out.println("Bienvenido al programa");
		System.out.println("Seleccione una opción");
		
		
		do {
			
			System.out.println("1.-Insertar 1º Fraccion");
			System.out.println("2.-Insertar 2º Fraccion");
			System.out.println("3.-Cambiar signo");
			System.out.println("4.-Multiplicar Fracciones");
			menu=Leer.datoInt();
			switch(menu){
				
			case 1:
				System.out.println("Inserta el numerador");
				num=Leer.datoInt();
				f1.setNumerador(num);
				System.out.println("INserta el denominador");
				num=Leer.datoInt();
				f1.setDenominador(num);
				break;
			case 2:
				System.out.println("Inserta el numerador");
				num=Leer.datoInt();
				f2.setNumerador(num);
				System.out.println("INserta el denominador");
				num=Leer.datoInt();
				f2.setDenominador(num);
				break;
			
			case 3:
				System.out.println("num1=..");
				num=Leer.datoInt();
				System.out.println("num2=...");
				num2=Leer.datoInt();
				System.out.println(op.cambiarSigno(num, num2));
				
				break;
			
			case 4:
				ftotal=op.multiplicar(f1, f2);
				op.imprimirFraccion(ftotal);
				break;
				
			case 5:
				fdiv=op.dividir(f1, f2);
				System.out.println(fdiv);
				break;
				
			}
			
			
		}while(menu!=0);
	}

}
