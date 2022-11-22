package ejercicio2;

public class Operaciones {
	int num;
	boolean boo;
	
	public Operaciones (int num) {
		
		this.num=num;
		
	}
	public Operaciones () {
		
	}
	public boolean comprobarPar (int num) {
		int dos=2,div;
		div=num%dos;
		if(div==0) {
			return true;
		}else {
			return false;
		}
		 
	}
	public boolean comprobarPos (int num) {
		String resultado="0";
		int cero=0;
		
			if(num>=cero) {
				return true;			
			}else{
				return false;			
			}
			
				
	}
	public void imprimirPar (boolean boo) {
		
		if(boo) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		
	}
	public void imprimirPos (boolean boo) {
		if(boo) {
			System.out.println("Positivo");
		}else {
			System.out.println("Negativo");
		}
	}
	
	
}
