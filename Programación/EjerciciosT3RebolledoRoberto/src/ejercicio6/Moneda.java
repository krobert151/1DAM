package ejercicio6;

import java.util.Random;

public class Moneda {

	public int lanzarMoneda () {
		
		int desde=1, hasta=2;
		Random r=new Random (System.nanoTime());
		return r.nextInt(hasta-desde+1)+desde;
		
	}
	public boolean comprobarGnador (int num, int moneda) {
		
		if(num==moneda) {
			
			return true;
		}else {
			return false;
		}
		
	}
	
	public void mostrarGanador (boolean boo) {
		
		if(boo) {
			System.out.println("Hs ganado");
		}else {
			System.out.println("Has perdido");
		}
		
	}
	
}
