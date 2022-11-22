package ejercicio5;

import java.util.Random;

public class Generadora {
	
	int numQuiniela,numPar;
	
	public int hecharQuiniela () {
	
		int desde=1, hasta=3;
		Random r= new Random (System.nanoTime());
		
		numQuiniela=r.nextInt(hasta-desde+1)+desde;	
		return  numQuiniela;
		 
	}
	public void resultadoQuiniela() {
		
		switch(numQuiniela) {
		
			case 1:
				
				System.out.println("Ha ganado el equipo Local.");
				break;
		
			case 2:
				
				System.out.println("Han empatado.");
				break;
				
			case 3:
				
				System.out.println("Ha ganado el quipo visitante");
			
		}
		
	}
	public boolean comprobarQuiniela(int num, int quiniela) {
		
		if(quiniela==num) {
			
			return true;
			
		}else {
			return false;
		}
		
	}
	public void mostrarQuiniela(boolean boo) {
		if(boo) {
			System.out.print("Has Ganado !!!, ");
		}else {
			System.out.print("Has fracasado, ");
		}
		
		
	}
	
	
	public int hecharPares () {
		
		int desde=1, hasta= 10;
		Random r=new Random (System.nanoTime());
		
		numPar=r.nextInt(hasta-desde+1)+desde;
		return numPar;
		
	}
	public boolean comprobarPares(int num) {
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
	}
	public void mostrarPares(boolean boo) {
		
		if(boo) {
			
			System.out.println(numPar+" es Par");
			
		}else {
			System.out.println(numPar+" es impar");

		}
		
		
	}
	
	public int hecharChinos () {
		
		int desde=1, hasta=3;
		Random r= new Random (System.nanoTime());
		
		return  r.nextInt(hasta-desde+1)+desde;	
		
	}
	public int hecharPrimitiva() {
		
		int desde=1, hasta=49;
		Random r=new Random (System.nanoTime());
		
		return r.nextInt(hasta-desde+1)+desde;
		
	}
	
	
	
}
