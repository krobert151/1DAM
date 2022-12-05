package test;

import java.util.Random;

public class Ppal {

	public static void main(String[] args) {
		int test []= new int [20];
		int max=46, min=1;
		Random r= new Random (System.nanoTime());
		for (int i = 0; i < test.length; i++) {
			test[i]=r.nextInt(max-min+1)+min;		

		}
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i]+" ,");
		}

		

	}

}
