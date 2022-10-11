package ejercicioexamen;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		String nombre="Robeto Rebolledo Naharro", fecha="04/10/2022", product1, product2, product3;
		double precio1, precio2, precio3, efectivo,total1,total2,total3, total, cambio;
		int uni1, uni2, uni3;
		
		System.out.println("Bienvenidos a MCdonalds");
		System.out.println("¿Qué quieres pedir?");
		product1= Leer.dato();
		System.out.println("¿Cuántas unidades de "+product1+" va a tomar?");
		uni1= Leer.datoInt();
		System.out.println("¿Que precio tiene cada "+product1+"?");
		precio1=Leer.datoDouble();
		System.out.println("¿Qué más quiere pedir?");
		product2= Leer.dato();
		System.out.println("¿Cuántas unidades de "+product2+" va a tomar?");
		uni2= Leer.datoInt();
		System.out.println("¿Que precio tiene cada "+product2+"?");
		precio2=Leer.datoDouble();
		System.out.println("¿Que más quiere pedir?");
		product3= Leer.dato();
		System.out.println("¿Cuántas unidades de "+product3+" va a tomar?");
		uni3= Leer.datoInt();
		System.out.println("¿Que precio tiene cada "+product3+"?");
		precio3=Leer.datoDouble();
		total1=precio1*uni1;
		total2=precio2*uni2;
		total3=precio3*uni3;
		total=total3+total2+total1;
		System.out.printf("Serían %.2f€\n\n",total);
		System.out.println("Seleccione la cantidad a pagar.");
		efectivo =Leer.datoDouble();
		cambio=efectivo-total;
		System.out.printf(""
				+ "\t\t\t\t    McDonnalds\n"
				+ "\n"
				+ "Atendido por: %s\n"
				+ "Fecha: %s\n"
				+ "\n"
				+ "-----------------------------------------------------------------------------------\n"
				+ "Producto\t\tCantidad\t\tPrecioUd\t\tTotal\n"
				+ "%s \t\t %d \t\t\t %.2f€ \t\t\t %.2f€ \n"
				+ "%s \t\t %d \t\t\t %.2f€ \t\t\t %.2f€ \n"
				+ "%s \t\t %d \t\t\t %.2f€ \t\t\t %.2f€ \n"
				+ "-----------------------------------------------------------------------------------\n"
				+ "Total \t\t\t\t\t\t\t\t\t %.2f€\n"
				+ "Efectivo \t\t\t\t\t\t\t\t %.2f€\n"
				+ "Cambio \t\t\t\t\t\t\t\t\t %.2f€\n"
				+ "-----------------------------------------------------------------------------------\n"
				+ "Gracias por su compra",nombre,fecha,product1,uni1,precio1,total1,
				product2,uni2,precio2,total2,product3,uni3,precio3,total3,total,efectivo,cambio);
	
		
		
		
	}

}
