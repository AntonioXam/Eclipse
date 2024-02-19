package Herencia;

public class Cuadrado extends Figura{   // Con extends le damos herencia de otra clase
	
	private int lado;

	
	public Cuadrado(int lado) {
		this.lado = lado;
	}
	
	public int getArea() {
		
		return lado*lado;
		
	}

}
