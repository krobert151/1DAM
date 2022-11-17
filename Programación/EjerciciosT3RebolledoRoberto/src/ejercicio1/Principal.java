package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		double rad,res;
		Circulo cir1, cir2,cir3;
		System.out.println("Bienvenido al programa");
		//forma 1 cascaporrastyle
		cir1=new Circulo(3.45);
		
		//forma 2: leyendo por teclado
		System.out.println("Diga usted el radio");
		rad=Leer.datoDouble();
		cir2=new Circulo(rad);
		//System.out.println(cir1.radio);

		//Cómo se llama a métodos
		cir3 = new Circulo(2.2);
		res=cir3.calcularArea(rad);
		System.out.println(res);
		
		
	} 

}
