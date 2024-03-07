package electrodomesticoClase;

public class Lavadora extends Electrodomestico {

	//Constante 
	final static int CARGA=5;
	
	
	//Atributos
	private int carga;
	
	/**
	 * Constructor por defecto
	 */
	public Lavadora() {
		this(PRECIO_BASE, PESO, CONSUMO, COLOR, CARGA);
		
	}

	/**Constructo de 5 parametros
	 * @param preciobase
	 * @param peso
	 * @param consumoEnergetico
	 * @param color
	 * @param carga
	 */
	public Lavadora(double preciobase, double peso, char consumoEnergetico, String color,int carga) {
		super(preciobase, peso, consumoEnergetico, color);
		this.carga=carga;
		
	}

	/**Constructor solo con precio y peso
	 * @param preciobase
	 * @param peso
	 */
	public Lavadora(double preciobase, double peso) {
		super(preciobase, peso);
		this.carga=CARGA;
	}

	/** Devuevle la carga de la lavadora
	 * @return el carga
	 */
	public int getCarga() {
		return carga;
	}

	
	/**
	 * Calcula el precio final en funcion de su carga
	 * @return devuelve el precio final de la lavadora
	 */
	public double precioFinal() {
	
		double preciofin=super.precioFinal();
		
		if(carga>30)
			preciofin+=50;
		
		return preciofin;
		
	}

	/**
	 * Metodo toString para devolver la informacion sobre el electrodomestico
	 */
	@Override
	public String toString() {
		return "\nLavadora :" 
				+"color "+color+ ", peso="+peso+ "kg, consumo energético= "+consumoEnergetico+", carga "+carga
				+", precio final= "+precioFinal()+"€";
	}
	
	
	
	

	
}
