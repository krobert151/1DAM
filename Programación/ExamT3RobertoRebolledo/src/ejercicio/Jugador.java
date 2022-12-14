package ejercicio;

import java.util.Arrays;
import java.util.Random;

public class Jugador {
	private String nombre;
	private double sueldoBase;
	private double sueldoTotal;
	private int edad;
	private int goles[];
	
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int[] getGoles() {
		return goles;
	}
	public void setGoles(int[] goles) {
		this.goles = goles;
	}
	public double getSueldoTotal() {
		return sueldoTotal;
	}
	public void setSueldoTotal(double sueldoTotal) {
		this.sueldoTotal = sueldoTotal;
	}
	//to String
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", sueldoBase=" + sueldoBase + ", edad=" + edad + ", goles="
				+ Arrays.toString(goles) +", sueldoTotal=" + sueldoTotal + "]";
	}
	
	//Constructores
	public Jugador(String nombre, double sueldoBase, int edad, int[] goles) {
		super();
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.edad = edad;
		this.goles = goles;
	}
	
	public Jugador() {
		
	}
	//Métodos 
	public void rellenarGoles (int hasta, int desde) {
		
		Random r= new Random (System.nanoTime());		
		
		for (int i = 0; i < goles.length; i++) {
			goles[i]= r.nextInt(hasta-desde+1)+desde;
		}

	}
	public int calcularGoles () {
		
		int totalGoles=0;
		
		for (int i = 0; i < goles.length; i++) {
			
			totalGoles+=goles[i];
		}
		return totalGoles;
	}
	public boolean comprobarCantGoles(int cantGoles) {
		
		if(calcularGoles()>=cantGoles) {
			return true;
		}else {
			return false;
		}
		
	}
	public double calcularSueldo (boolean boo, int porcentaje ) {
		
		double sueldoTotal;
		if(boo) {
			double cien=100;
			sueldoTotal=sueldoBase+((sueldoBase*porcentaje)/cien);
		}else {
			sueldoTotal=sueldoBase;
		}
		return sueldoTotal;
	}
	public int contarPartidosMarc () {
		int cont=0;
		for (int i = 0; i < goles.length; i++) {
			if(goles[i]>0) {
				cont++;
			}
		}	
		return cont;
	}
	public void mostrarGoles () {
		
		System.out.println("Goles de "+getNombre());
		for (int i = 0; i < goles.length; i++) {
			System.out.print("Dia "+(i+1)+"\t");
			System.out.println("Goles "+goles[i]);
		}
		
	}
 	public void actualizarGoles (int newGoles[]) {
		
		for (int i = 0; i < goles.length; i++) {
			goles[i]=newGoles[i];
		}
	}
	public boolean comprobarEdad (int topeEdad) {
		
		if(edad>=topeEdad) {
			return true;
		}else {
			return false;
		}
		
	}
	public void mostrarRetirada (int topeEdad){
		
		if(comprobarEdad(topeEdad)) {
			
			System.out.println("Es hora de que "+getNombre()+" vaya pensando en retirarse.");
		}else {
			System.out.println("Sigue en una buena edad.");
		}
		
	}
	
	
	
	
}

