package resueltos;

public class Coche {
	//Atributos 
	private int velocidad;
	
	/**
	 * Constructor 
	 */
	Coche(){
		velocidad=0;
	}
	
	public int getvelocidad() {
		return velocidad;
	}
	
	public void acelera(int mas) {
		velocidad+=mas;
	}
	public void frena(int menos) {
		velocidad-=menos;
	}
}
