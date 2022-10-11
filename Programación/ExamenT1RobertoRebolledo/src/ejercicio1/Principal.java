package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*NE= todas las cuotas de deudas que se tengan y duvidiéndolas por la suma de los ingresos mensuales y multiplicar el resultado por 100*/
		
		double NE , hipoteca, cuotaCoche, nomina=1200 /*NE = Número de Endeudamiento*/;
		int cien=100;
		
		System.out.println("Bienvenidos al porgrama del cálculo del NE.\n");
		System.out.println("Primero seleccione cuanto paga al mes por la hipoteca.");
		hipoteca=Leer.datoDouble();
		System.out.println("A continuación, seleccione la cantidad que paga por la cuota de su coche a plazos.");
		cuotaCoche=Leer.datoDouble();
		
		NE=(hipoteca+cuotaCoche)/nomina*cien;
		
		System.out.printf("\nTeniendo en cuenta que usted recibe una nómina de %.2f€ y paga al mes unos %.2f€ de hipoteca y otros %.2f€ por la couta de un coche. \nObtendría un índice de NE de %.0f. \n\n",nomina,hipoteca,cuotaCoche,NE);
		System.out.println("Gracias por usar nuestro programa.");
		
		
	}

}
