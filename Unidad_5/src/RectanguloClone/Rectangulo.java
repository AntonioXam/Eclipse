package RectanguloClone;

public class Rectangulo implements Cloneable{
	
	private int ancho=0;
	private int alto =0;
	private String nombre;
	
	
	public Object clone() {
		
	Object objeto=null;
	try {
		objeto=super.clone();
	} catch (CloneNotSupportedException ex) {
		System.out.println("Error al duplicar");
	}
	return objeto;
	
	}
	
		/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

		public Rectangulo(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	
		
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

	
	public Rectangulo incrementarAncho() {
		ancho++;
		return this;
		
	}
	public Rectangulo incrementarAlto() {
		alto++;
		return this;
	}

}
