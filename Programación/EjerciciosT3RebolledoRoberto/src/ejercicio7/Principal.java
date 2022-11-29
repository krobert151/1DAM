package ejercicio7;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Se desea llevar un control del estado de una cuenta corriente. Una cuenta corriente está caracterizada por
		su saldo y el nombre del titular y sobre ella se pueden realizar tres tipos de operaciones:
		• Ingresar (cantidad): ingresa en la cuenta una cantidad de dinero dada por el usuario. No imprime
		de nuevo el saldo, pero sí lo actualiza.
		• Retirar (cantidad): Debe comprobar si queda suficiente saldo y si es así, disminuye la cuenta una
		determinada cantidad de dinero especificada por el usuario. No imprime de nuevo el saldo, pero
		sí lo actualiza.
		• Calcular el saldo en dólares americanos. Se le debe pasar el valor de cambio y debe devolver el
		valor del saldo en dólares.
		• Consultar el saldo. Solo imprime el saldo.
		Supón que la cuenta inicialmente tiene un saldo de cero. Escribe una clase CuentaCorriente que implemente
		las funcionalidades descritas y un main con un menú para probarlas.*/
		int num;
		double cero=0,cant;
		String nombre;
		CuentaCorriente cuen1;
		System.out.println("Bienvenido al programa");
		System.out.println("Diga un nombre para su cuenta corriente");
		nombre=Leer.dato();
		cuen1= new CuentaCorriente (cero,nombre);
		do {
		System.out.println("Seleccione una opción");
		System.out.println("1.-Ingresar");
		System.out.println("2.-Retirar");
		System.out.println("3.-Ver el saldo en dolar");
		System.out.println("4.-Consultar saldo");
		
		
		num=Leer.datoInt();
		
			switch(num) {
				case 1:
						System.out.println("Ingrese cantidad");
						cant=Leer.datoDouble();
						cuen1.insertarDinero(cant);
					break;
					
				case 2:
						System.out.println("Ingrese cantidad");
						cant=Leer.datoDouble();
						cuen1.retirarDinero(cant);
					break;
					
				case 3:
					System.out.println(cuen1.calcularDolares());
						
					break;
				case 4:
					System.out.println(cuen1.getSaldo());
					break;
				case 0:
					break;
				
				default:
					System.out.println("Opciónnno valida");
					break;
				
				
				
			}
		}while(num!=0);
	}
	

}
