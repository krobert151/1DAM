package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		double rad,res,total;
		Circulo cir1=new Circulo ();
		Circulo cir2;
		System.out.println("Bienvenido al programa");
		//forma 1 cascaporrastyle
		System.out.println("Introduzca el radio");
		rad =Leer.datoDouble();
		cir2= new Circulo(rad);
		res=Leer.datoDouble();
		total=cir2.calcularArea(res);
		System.out.println(cir2.calcularArea(res));
		System.out.println(total);
		
		
	} 

}
