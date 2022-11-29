package ejercicio6;

import java.util.Random;

public class Juego {
	
	int ladoMoneda;
	
	
	public Juego(int ladoMoneda) {
		super();
		this.ladoMoneda = ladoMoneda;
	}
	public Juego() {
		
	}
	
	public int getLadoMoneda() {
		return ladoMoneda;
	}
	
	public void setLadoMoneda(int ladoMoneda) {
		this.ladoMoneda = ladoMoneda;
	}

	public int lanzarMoneda () {
		
		int desde=1, hasta=2;
		Random r=new Random (System.nanoTime());
		ladoMoneda = r.nextInt(hasta-desde+1)+desde;
		return ladoMoneda;
	}
	public boolean comprobarGanador (int num) {
		
		if(num==ladoMoneda) {
			
			return true;
		}else {
			return false;
		}
		
	}
	
	public void mostrarGanador (boolean boo) {
		
		if(boo) {
			System.out.println("Has ganado");
		}else {
			System.out.println("Has perdido");
		}
		
	}
	
}
