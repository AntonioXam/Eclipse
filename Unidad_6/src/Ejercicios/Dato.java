package Ejercicios;

public class Dato {

	
	private int dato;

	/**
	 * @param dato
	 */
	public Dato(int dato) {
		this.dato = dato;
	}

	/**
	 * @return el dato
	 */
	public int getDato() {
		return dato;
	}

	/**
	 * @param dato el dato a establecer
	 */
	public void setDato(int dato) {
		this.dato = dato;
	}
	
	
	public int metodox() {
		Double dato2 = Double.valueOf(dato*1.5);
		return dato2.intValue();
		
	}
	
	
}
