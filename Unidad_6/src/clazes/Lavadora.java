package clazes;

public class Lavadora extends Electrodomestico{

	 final static int CARGA=5;
	
	private int carga;

	/**
	 * 
	 */
	public Lavadora() {
		super();
		this.carga=CARGA;
	}

	/**
	 * @param preciobase
	 * @param peso
	 * @param consumo
	 * @param color
	 */
	public Lavadora(double preciobase, double peso, char consumo, String color,int carga) {
		super(preciobase, peso, consumo, color);
		this.carga=carga;
		
	}

	/**
	 * @param preciobase
	 * @param peso
	 */
	public Lavadora(double preciobase, double peso) {
		super(preciobase, peso);
		this.carga=CARGA;
	}

	/**
	 * @return el carga
	 */
	public int getCarga() {
		return carga;
	}


	public double precioFinal() {
		double precioFin=super.precioFinal();
		
		if(carga>30)
			precioFin+=50;
		
		return precioFin;
	}

	public String toString() {
		return "Lavadora "+super.toString() +"carga="+carga;  
	}
	
	    
	
	
}
