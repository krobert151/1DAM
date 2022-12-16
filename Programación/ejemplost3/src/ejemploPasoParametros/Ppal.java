package ejemploPasoParametros;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 2;
		System.out.print("Valores de x e y antes de la modificación: ");
		System.out.println(" x = " + x + "; y = " + y);
		modifyPrimitiveTypes(x, y);
		System.out.print("Valores de x e y después de la modificación: ");
		System.out.println(" x = " + x + "; y = " + y);
	}
	private static void modifyPrimitiveTypes(int x, int y) {
		x = 5;
		y = 10;
	
	}
}
