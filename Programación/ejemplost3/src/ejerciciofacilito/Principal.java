package ejerciciofacilito;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Empiezan las campañas Navideñas. Luces, regalos, compras, rebajas, etc. Vamos a echar una mano a los
		comerciantes de Triana para que las cuentas les salgan bien realizando un programa para calcular todo lo
		relacionado con los precios de los productos a vender.
		
		Crear la clase Producto cuyas principales características son: nombre, precio base (lo que le cuesta al dueño
		de la tienda), sección, si será artículo para poner en rebajas o no y PVP (Precio de Venta al Público). El precio
		de venta al público se calcula sumando un tanto por ciento (lo que gana el vendedor) al precio base.
		
		Inicialmente, no se dará el PVP al crear el objeto porque se calculará en una de las opciones del menú, por
		lo que este valor será el valor por defecto. No aparecerá como parámetro en el constructor con parámetros.
		La clase principal, comenzará pidiendo los datos necesarios para crear un solo producto y posteriormente se
		mostrará el menú con las siguientes opciones (en cada case se debe poder ver en pantalla el resultado de la
		operación que se haga y todas las operaciones se deben realizar mediante métodos):
		
		• Calcular el precio de venta al público, pasando como parámetro el porcentaje de ganancia que se
		desea para ese producto. Dicho porcentaje se leerá por teclado. El método debe devolver el resultado
		y, además, guardarlo en el atributo correspondiente para que quede actualizado.
		
		• Aplicar descuento para las rebajas. Para ello, se comprobará si el producto es apto para rebajas o no.
		Si lo es, se calculará sunuevo precio de venta al público, descontando al PVP que tenga un porcentaje
		dado como argumento y leído antes por teclado. Si no lo es, el PVP quedará igual.
		
		• Imprimir datos de un producto, con todos sus datos y usando el método toString.
		se
		• Triana es muy visitada por ingleses, cuya moneda oficial es la Libra Esterlina. En esta opción, se
		calculará y devolverá el PVP del producto en libras esterlinas. El valor del cambio se leerá por teclado
		(si quieres probar con un valor real, ahora mismo 1 € son 0.86 libras).
		
		• Modificar el precio base pasando el nuevo precio como parámetro.
		
		• Un método para imprimir un mensaje extra para aquellos productos cuyo precio de venta al público
		sea menor de 3 euros, es decir, comprobar el precio de venta del producto y si este es menor a 3 €,
		mostrar por pantalla “Producto MegaGanga”. No devolverá nada.
		
		En la clase principal se trabajará solo con un producto creado al principio y se podrá realizar todas las opciones
		del menú con el mismo producto.
		El programa debe repetirse hasta que el usuario desee.*/
		
		Producto prod;
		String name,seccion;
		double precio, porcentaje,rebaja,libras=0.86;
		int num;
		
		System.out.println("Bienvenido al programa");
		System.out.println("Intorduzca el nombre del producto");
		name=Leer.dato();
		System.out.println("Intorduzca la sección a la que pertenece dicho producto");
		seccion=Leer.dato();
		System.out.println("Introduzca el precio base de dicho producto.");
		precio=Leer.datoDouble();
		System.out.println("Introduzca porcentaje de ganancia de dicho producto");
		porcentaje=Leer.datoDouble();
		
		prod= new Producto (name,seccion,precio,porcentaje);
		
		do {
			System.out.println("Que quieres hacer?");
			System.out.println("1.-Calcular PVP producto");
			System.out.println("2.-Aplicar rebajas");
			System.out.println("3.-Ver datos del producto");
			System.out.println("4.-Ver precio del producto en libras");
			System.out.println("5.-modificar el precio base");
			System.out.println("6.-Comprobar Producto Megaganga ");
			
			num=Leer.datoInt();
			switch(num) {
			
			case 1:
				System.out.println("El PVP del producto es de " +prod.calcularPvp() );
				break;

			case 2:
				System.out.println("De cuanto es la rebaja?");
				rebaja=Leer.datoDouble();
				prod.setDescuento(rebaja);
				System.out.println("El PVP del producto es de " +prod.calcularRebja() );
				break;

			case 3:
				System.out.println(prod.toString());
				break;
				
			case 4:
				System.out.println("El PVP del producto en libras es de " +prod.calcularLibras(libras) );
				break;

			case 5:
				System.out.println("Selecciona el nuevo precio base");
				precio=Leer.datoDouble();
				prod.setPrecioBase(precio);
				break;
				
			case 6:
				prod.devolverMegaganga(prod.comprobarMegaganga());
				break;
				
			case 0:
				break;
		
			default:
				System.out.println("Opción no disponible");
				break;
				
			}
			
		}while(num!=0);
	
	}

}
