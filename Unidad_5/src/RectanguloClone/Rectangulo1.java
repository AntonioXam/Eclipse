package RectanguloClone;

public class Rectangulo1 {
	
	private int ancho=0;
	private int alto =0;
	/**
	 * @return el ancho
	 */
	public int getAncho() {
		return ancho;
	}
	/**
	 * @param ancho el ancho a establecer
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	/**
	 * @return el alto
	 */
	public int getAlto() {
		return alto;
	}
	/**
	 * @param alto el alto a establecer
	 */
	public void setAlto(int alto) {
		this.alto = alto;
	}
	/**
	 * @param ancho
	 * @param alto
	 */
	public Rectangulo1(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public Rectangulo1 incrementarAncho() {
		ancho++;
		return this;
		
		
	}
	

}
