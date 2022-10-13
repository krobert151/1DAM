package ejemploswitch;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		System.out.println("1.-Copiar");
		System.out.println("2.-Pegar");
		System.out.println("3.-Cortar");
		System.out.println("4.-Negrita");
		System.out.println("5.-Cursiva");
		System.out.println("6.-Tachado");
		opcion=Leer.datoInt();
		switch(opcion){
		
		case 1 : 
			System.out.println("Texto copiado");
			break;
			
		case 2 : 
			System.out.println("Texto pegado");
			break;
		case 3 :
			System.out.println("Texto cortado");
			break;
		case 4 : 
			System.out.println("Negrita");
			break;
		case 5:
			System.out.println("Cursiva");
			break;
		case 6:
			System.out.println("Tachado");
			break;
			
			
			
			
			
		}

	}

}
