package ejercicio5;

import java.util.Random;

public class Generadora {
	
	
	public int hecharQuiniela () {
	
		int desde=1, hasta=3;
		Random r= new Random (System.nanoTime());
		
		return r.nextInt(hasta-desde+1)+desde;	
		  
		 
	}
	public void mostrarResultadoQuiniela( int num) {
		
		switch(num) {
		
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
		
		int desde=1, hasta= 5;
		Random r=new Random (System.nanoTime());
		
		return r.nextInt(hasta-desde+1)+desde;
		 
		
	}
	public int sumar2Num (int num1, int num2) {
		
		return num1+num2;
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
			
			System.out.println("Ha salido Par!!");
			
		}else {
			System.out.println("Ha salido None!!");

		}
		
		
	}
	
	public int hecharChinos () {
		
		int desde=1, hasta=3;
		Random r= new Random (System.nanoTime());
		
		return  r.nextInt(hasta-desde+1)+desde;	
		
	}
	public boolean comprobarChinos (int num, int chinos) {
		
		if(chinos==num) {
			
			return true;
		}else {
			return false;
		}		
	}
	public void mostrarChinos (boolean boo) {
		
		if(boo) {
			System.out.println("Has acertado");
		}else {
			System.out.println("Has fracasado");
		}
		
	}
		
	public int hecharPrimitiva() {
		
		int desde=1, hasta=49;
		Random r=new Random (System.nanoTime());
		
		return r.nextInt(hasta-desde+1)+desde;
		
	}
	public boolean comprobarPrimitiva (int num, int primitiva) {
		
		if(num==primitiva) {
			
			return true;
		}else {
			return false;
		}
		
	}
	public void resultadoPrimitiva (boolean boo) {
		
		if(boo) {
			
			System.out.println("Enhorabuena has ganado la Primitiva!!!");
			
		}else {
			System.out.println("Fracaso absoluto.");
		}
		
	}
	
	
	
}
