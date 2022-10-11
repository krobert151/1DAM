package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double largo=50.0, ancho=21.0, profun=2.5, precio=1.8 ;
		double area=0.0,volumenm=0.0,volumenl=0.0, preciot=0.0 ,mil=1000;
		
		//Cuando declaramos variables del mismo tipo, solo cuando son del mismo tipo, se pueden declarar varias variables en la misma líenea.
		System.out.println("Bienvenido, vamos a calcular el área de la psicina.");
		area=largo*ancho;
		System.out.println("El área de la piscina es "+area+" m²\n");
		System.out.println("Ahora el volumen.");
		volumenm=profun*area;
		volumenl=volumenm*mil;
		System.out.println("El volumen de la piscina es "+volumenl+" L\n");
		System.out.println("Ahora vamos a calcular el precio que costaría llenar la piscina, sabiendo que el m³ de agua está a 1,80€.");
		preciot=precio*volumenm;
		System.out.println("El precio que costaría llenar la piscina es de "+preciot+" €\n");
		System.out.println("Gracias por usar nuestro programa.");
		
		
		
		
	}

}
