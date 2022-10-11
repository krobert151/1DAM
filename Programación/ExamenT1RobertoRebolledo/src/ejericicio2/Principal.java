package ejericicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		double sueldoBru, horasEx=20, descuentoDes=2.5,totalHEx ,IRPB=12,precioIRPB, sueldoNet, total,totalAño;
		int numHorasEx=17, cien=100, pagas=14;
		String empresa="Javazón",fecha="06/10/2022",nombre="Roberto Rebolledo Naharro",domicilio="Calle Roma nº 69, Las Pajanosas";
		
		System.out.println("Bienvenidos al programa que calcula una nómina de Javazón");
		System.out.println("Introduzca su sueldo bruto.");
		sueldoBru=Leer.datoDouble();
		totalHEx=horasEx*numHorasEx;
		total=totalHEx+sueldoBru-descuentoDes;
		precioIRPB=total*IRPB/cien;
		sueldoNet= total-precioIRPB;
		totalAño=sueldoNet*pagas;
		
		System.out.printf("\t\t\t    %s \n"
				+ "-----------------------------------------------------------------\n"
				+ "\n"
				+ "Nombre: %s\n"
				+ "Domicilio: %s \n"
				+ "Fecha: %s \n"
				+ "\n"
				+ "-----------------------------------------------------------------\n"
				+ "\n"
				+ "Sueldo bruto\t\t\t\t\t\t %.2f€\n"
				+ "Plus por horas extras\t\t %d x %.2f€ \t\t %.2f€\n"
				+ "Desempleo \t\t\t\t\t\t -%.2f€\n"
				+ "IRPB del %.2f%% \t\t\t\t\t -%.2f€\n"
				+ "\n"
				+ "-----------------------------------------------------------------\n"
				+ "Sueldo neto \t\t\t\t\t\t %.2f€\n"
				+ "\n"
				+ "Al año con %d pagas cobraría  \t\t\t\t %.2f€\n"
				+ "-----------------------------------------------------------------\n\n"
				,empresa,nombre,domicilio,fecha,sueldoBru,numHorasEx,horasEx,totalHEx,descuentoDes,
				IRPB,precioIRPB,sueldoNet,pagas,totalAño);
		System.out.println("Gracias por usar nuestro programa.");

		
	}

}
