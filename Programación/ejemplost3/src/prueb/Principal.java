package prueb;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		int desde=1, hasta=49,num;
		int  [] numerosPrim= new int [6];
		Random r=new Random (System.nanoTime());
		
		//genera  numeros aleatorioas
		for (int i = 0; i < numerosPrim.length; i++) {
			numerosPrim[i]=r.nextInt(hasta-desde+1)+desde;			
			}
		
		for (int i = 0; i < numerosPrim.length; i++) {

			for (int j = 0; j < numerosPrim.length; j++) {
				if(i==j) {
					
				}else {
					
					while(numerosPrim[i]==numerosPrim[j]) {
						
						numerosPrim[i]=r.nextInt(hasta-desde+1)+desde;	
						
					}
					
				}
			}
		}
		
		//muestra el arry
		for (int i = 0; i < numerosPrim.length; i++) {
			System.out.println(numerosPrim[i]);
		}
	}

}
