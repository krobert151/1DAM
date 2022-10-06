package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Escribir un programa que sirva para calcular el precio final de un producto. El cliente se lleva
4 unidades del producto por lo que se le aplica un descuento del 20 % al precio total.*/ 

		double precio, cantidad=1, descuento,descontado, cien=100, total,result ;
		String nproducto;
		
		System.out.println("Bienvenidos al programa que calcula un descuento.\n\n");
		System.out.println("¿Cúal es el producto que quiere comprar?");
		nproducto= Leer.dato();
		System.out.println("¿Cúanto cuesta ese producto?");
		precio=Leer.datoDouble();
		System.out.println("¿Cúantas unidades va a tomar?");
		cantidad=Leer.datoDouble();
		System.out.println("¿Qúe porcentaje de descuento tiene?");
		descuento=Leer.datoDouble();
		total=precio*cantidad;
		descontado=total*descuento/cien;
		result=total-descontado;
		System.out.printf("Usted ha comprado %1.0f %s con un descuento del %2.2f%%, al cual se queda en un total de %2.2f€.",cantidad,nproducto,descuento,result);
		
		
		
		
		
		
		
		
	}

}
