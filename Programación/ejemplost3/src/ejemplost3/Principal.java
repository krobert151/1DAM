package ejemplost3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		alumno alum1=new alumno("Roberto",18);
		alumno alum2=new alumno("Roberto",18,55.5,1.63,9,false);
		
		System.out.println("Mi nombre es "+alum1.nombre+" y tengo "+alum2.edad+" años.");
		System.out.println(alum2.repetirdor);
		
	}

}
