package Repaso;

public class Coche {

	// Atributos
	
	private String color;
	private String modelo;
	private int añoFabricacion;
	private int velocidadActual;
	
	// Metodos
	
	/**
	 * Constructor
	 * @param color
	 * @param modelo
	 * @param añoFabricacion
	 * @param velocidadActual
	 */
	public Coche(String color, String modelo, int añoFabricacion, int velocidadActual) {
		this.color = color;
		this.modelo = modelo;
		this.añoFabricacion = añoFabricacion;
		this.velocidadActual = velocidadActual;
	}
	
	// Constructor
	public Coche() {
		color = "azul";
		modelo = "AudiA4";
		añoFabricacion = 1999;
		velocidadActual = 0;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	
	
	@Override
	public String toString() {
		return "Coche [color=" + color + ", modelo=" + modelo + ", añoFabricacion=" + añoFabricacion
				+ ", velocidadActual=" + velocidadActual + "]";
	}

	public String maricon(String cadena) {
		StringBuffer cad = new StringBuffer(cadena);
		return cad.reverse().toString();
		
	}
	
}
