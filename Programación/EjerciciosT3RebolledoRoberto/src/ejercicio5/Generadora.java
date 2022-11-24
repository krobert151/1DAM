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
		
	public int [] hecharPrimitiva() {
		
		int desde=1, hasta=49;
		int  [] numePrim= new int [6];
		Random r=new Random (System.nanoTime());
		
		
		for (int i = 0; i < numePrim.length; i++) {
			numePrim[i]=r.nextInt(hasta-desde+1)+desde;			
			}
		
		for (int i = 0; i < numePrim.length; i++) {

			for (int j = 0; j < numePrim.length; j++) {
				if(i==j) {
					
				}else {
					
					while(numePrim[i]==numePrim[j]) {
						
						numePrim[i]=r.nextInt(hasta-desde+1)+desde;	
						
					}
					
				}
			}
		}
		
		return numePrim; 
		
	}
	public void mostrarPrimitiva (int  num[]) {
		System.out.println("Números de la primitiva");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"  ");
		}
		
		
	}
	public int comprobarPrimitiva (int numPer[], int numPri[]) {
		
		int aciertos=0;
		
		for (int i = 0; i < numPri.length; i++) {
			
			for (int j = 0; j < numPri.length; j++) {
				
				if(numPer[i]==numPri[j]) {
					
					aciertos++;
					
				}
				
			}
		}
		
		return  aciertos;
		
	}
	public void resultadoPrimitiva (int num) {
		
		switch(num) {
		
			case 0:
			
				System.out.println("Lo siento, no te ha tocado nada.");
				
				break;
				
			case 1:
				
				System.out.println("Has coincidido en un número, pero aún así no te llevas nadaa.");
				
				break;
				
			case 2:
				
				System.out.println("Has coincidido en dos números, se te devuelver el dinero de la apuesta");
				
				break;
				
			case 3:
				
				System.out.println("Enhorabuena has coincidio en 3 números +1000€");
				
				break;
				
			case 4:
				
				System.out.println("Enhorabuena has coincidio en 4 números +5000€");
				
				break;
				
			case 5:
				
				System.out.println("Enhorabuena has coincidio en 5 números +10000€");
				
				break;
				
			case 6:
				
				System.out.println("Enhorabuena has coincidio en 6 números +25000€");
				
				break;
				
		}
		
	}
	
	
	
}
