package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Implementar un programa que contenga dos métodos en una clase “operaciones”: un método al que se le
		pase un número entero y diga si este es positivo o negativo y otro que diga si un número es par o impar. La
		clase no debe tener ningún atributo. Se deben probar los métodos en el main*/
		
		int num;
		boolean par, pos;
		Operaciones op1;
		System.out.println("Seleccione el número");
		num=Leer.datoInt();
		
		op1=new Operaciones(num);
		par=op1.comprobarPar(num);
		pos=op1.comprobarPos(num);
		
		//forma 1 -- NO
		System.out.println(par);

		//forma 2: la guay del paraguay, no es chachi -- para nada chachi
		System.out.println(op1.comprobarPar(num));
		
		//forma 3: esto si es chachi -- no necesitas na variable
		op1.imprimirPar(op1.comprobarPar(num));	
		//forma 4: también chachi --necesitas la variable
		op1.imprimirPar(par);
		op1.imprimirPos(pos);
		
		
		
	}

}
