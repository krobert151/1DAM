package ejercicio8;

import java.util.Random;

public class Sorteo {
	private int num;

	public Sorteo(int num) {
		super();
		this.num = num;
	}
	public Sorteo() {
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void generarLoteria() {
	
		int desde=1, hasta=100;
		Random r= new Random (System.nanoTime());
		num=r.nextInt(hasta-desde+1)+desde;		
		
	}
	public boolean comprobarLoteria(int numElegido) {
		//Preguntar a Angel por llamar a un metodo en la misma clase
		if(numElegido==num) {
			
			return true;
			
		}else {
			return false;
		}
		
	}
	public void mostrarGanador (boolean boo) {
		
		if(boo) {
			System.out.println("Felicidades has ganado");
		}else {
			System.out.println("Lo sentimos, ha salido el núemro "+num);
		}
		
	}
}
