package masPOO;

public class Television extends Electrodomestico {

	//Constante
	final static int RESOLUCION=20;
	
	//Atributos
	private int resolucion;

	/**
	 * Constructor por defecto
	 */
	public Television() {
		super();
		this.resolucion=RESOLUCION;
	}

	/** Constructor con 5 parametros
	 * @param preciobase
	 * @param peso
	 * @param consumoEnergetico
	 * @param color
	 * @param resolucion
	 */
	public Television(double preciobase, double peso, char consumoEnergetico, String color,int resolucion) {
		super(preciobase, peso, consumoEnergetico, color);
		this.resolucion=resolucion;
	}
	/** Constructor con preciobase y peso y los demas por defecto
	 * @param preciobase
	 * @param peso
	 */
	public Television(double preciobase, double peso) {
		super(preciobase, peso);
		this.resolucion=RESOLUCION;
	}

	/**
	 * @return el resolucion
	 */
	public int getResolucion() {
		return resolucion;
	}
	
	
	/**
	 * Metodo que calcula el precipo final de la television
	 * @return devuelve el precio de la television
	 */
	public double precioFinal() {
		
		double preciofin=super.precioFinal();
		
		if(resolucion>40)
			preciofin+=preciofin+preciobase*0.30;
		
		return preciofin;
		
	}

	
	/**
	 *  Metodo toString sobreescrito con el atributo television
	 */
	@Override
	public String toString() {
		return "\nTelevision :" 
				+"color "+color+ ", peso="+peso+ "kg, consumo energético= "
				+consumoEnergetico+", resolucion "+resolucion
				+", precio final= "+precioFinal()+"€";
	}
	
	
	
	
	
	
	
	
	
}
