package Ejemplostatic;

public class Cohete {
	
	//Atributos
	
	private static int numcohetes=0;
	

	//Constructores
Cohete() {
		numcohetes++;
	}
	
	public int getcohetes() {
		return numcohetes;
		
	}
	
	
}
