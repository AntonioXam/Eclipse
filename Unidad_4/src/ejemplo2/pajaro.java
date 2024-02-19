package ejemplo2;

public class pajaro {
	
	// atributos y propiedades
	private static int numpajaros=0;
	private int edad;
	private char color;
	
	// Metodos de la clase
	/**
	 *  constructor de la calse
	 * @param e
	 */
	static void nuevopajaro() {
		numpajaros++;
	}
	
	static void numpajaros() {
		System.out.println(numpajaros);
	}
	
	pajaro() {
		color= 'v';
		edad=0;
		nuevopajaro();
	}
	
	/**
	 * @return el numpajaros
	 */
	public static int getNumpajaros() {
		return numpajaros;
	}

	/**
	 * @param numpajaros el numpajaros a establecer
	 */
	public static void setNumpajaros(int numpajaros) {
		pajaro.numpajaros = numpajaros;
	}

	/**
	 * @return el edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad el edad a establecer
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return el color
	 */
	public char getColor() {
		return color;
	}

	/**
	 * @param color el color a establecer
	 */
	public void setColor(char color) {
		this.color = color;
	}

	pajaro(int e,char c) {
		edad=e;
		color=c;
		nuevopajaro();
		
	

	
	
	}

}
