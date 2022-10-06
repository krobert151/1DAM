package ejercicio13;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*13. Imprime por pantalla un ticket de una tienda. El empleado se llama “John Snow”, y 
		 * el cliente ha comprado dos latas de Coca Cola a 70 céntimos, una bolsa de pipas de 0.40 € 
		 * y una espada llamada “Garra” que cuesta 150 €. No hace falta calcular le devolución de la compra.*/
		
		double precio1, precio2, precio3, precio4,total1,total2,total3,total4,cant1,cant2,cant3,cant4, descuento, cien=100,descontado,total,totaldescon,  efectivo, cambio;
		String producto1, producto2, producto3, producto4;
		System.out.println("Bienvenidos al programa que realiza el ticket de la compra.\n\n");
		System.out.println("Por favor introduzca el primer producto de la compra.");
		producto1= Leer.dato();
		System.out.println("Indique la cantidad del producto.");
		cant1=Leer.datoDouble();
		System.out.println("Indique su precio por unidad.");
		precio1=Leer.datoDouble();
		System.out.println("Introduzca el siguiente producto.");
		producto2=Leer.dato();
		System.out.println("Indique la cantidad del producto.");
		cant2=Leer.datoDouble();
		System.out.println("Indique su precio por unidad.");
		precio2= Leer.datoDouble();
		System.out.println("Introduzca el siguiente producto.");
		producto3=Leer.dato();
		System.out.println("Indique la cantidad del producto.");
		cant3=Leer.datoDouble();
		System.out.println("Indique su precio por unidad.");
		precio3=Leer.datoDouble();
		System.out.println("Introduzca el siguiente producto. ");
		producto4=Leer.dato();
		System.out.println("Indique la cantidad del producto.");
		cant4=Leer.datoDouble();
		System.out.println("Indique su precio por unidad.");
		precio4=Leer.datoDouble();
		System.out.println("Indique el descuento a aplicar");
		descuento=Leer.datoDouble();
		System.out.println("Indique porte a pagar en efectivo");
		efectivo=Leer.datoDouble();
		total1=precio1*cant1;
		total2=precio2*cant2;
		total3=precio3*cant3;
		total4=precio4*cant4;
		total=total1+total2+total3+total4;
		descontado=(descuento/cien)*total;
		totaldescon=total-descontado;
		cambio=efectivo-totaldescon;
		
		System.out.printf("\n\n\n"
				+ "				Ticket de la compra					  \n"
				+ "\n"
				+ "\n"
				+ "La Riberilla 3\n"
				+ "Calle Roma nº69\n"
				+ "41219 Las Pajanosas\n"
				+ "\n"
				+ "Artículo 		Unidades	Precio					Total\n"
				+ "------------------------------------------------------------------------------------------\n"
				+ "%s			%2.2f		%2.2f€					%2.2f€\n"
				+ "%s			%2.2f		%2.2f€					%2.2f€\n"
				+ "%s			%2.2f		%2.2f€					%2.2f€\n"
				+ "%s			%2.2f		%2.2f€					%2.2f€\n"
				+ "\n"
				+ "------------------------------------------------------------------------------------------\n"
				+ "TOTAL 										%2.2f€\n"
				+ "Base										%2.2f€\n"
				+ "Descuento del %2.2f%%								%2.2f€\n"
				+"-------------------------------------------------------------------------------------------\n"
				+"\n"
				+ "Efectivo 									%2.2f€\n"
				+ "Cambio 										%2.2f€\n"
				+ "------------------------------------------------------------------------------------------\n"
				+ "Gracias por su compra!!",producto1,cant1,precio1,total1,producto2
				,cant2,precio2,total2,producto3,cant3,precio3,total3,producto4,cant4
				,precio4,total4,totaldescon,total,descuento,descontado,efectivo,cambio);
		
				
		
		
		
		
		
	}

}
