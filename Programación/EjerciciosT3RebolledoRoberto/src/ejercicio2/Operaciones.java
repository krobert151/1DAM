package ejercicio2;

public class Operaciones {
	int num;
	
	public Operaciones (int num) {
		
		this.num=num;
		
	}
	public Operaciones () {
		
	}
	public boolean comprobarPar (int num) {
		int dos=2,div;
		boolean par;
		div=num%dos;
		if(div==0) {
			par=true;
		}else {
			par=false;
		}
		return par;
	}
	public String comprobarPos (int num) {
		String resultado="0";
		int cero=0;
		
			if(num>=cero) {
				resultado="Positivo";			

			}else{
				resultado="Negativo";			

			}
			
		
		return resultado;
				
	}
	
}
