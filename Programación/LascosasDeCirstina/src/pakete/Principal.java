package pakete;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int num, desde=1,hasta=2;
		Random r= new Random (System.nanoTime());
		num= r.nextInt (hasta-desde+1)+desde;
		if(num==1) {
			
			System.out.println("Cistina no va a la disco");
			
		}else {
			System.out.print("Cris va la disco y ");
			num= r.nextInt (hasta-desde+1)+desde;
			if(num==1) {
				System.out.println("el poya se va de marcha");
			}else {
				System.out.println("el poya se queda con el clamido");
			}
		}
	}
}
