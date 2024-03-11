package clazes;

public class Television extends Electrodomestico{

	final static int PULGADAS=20;
	
	private int pulgadas;

	/**
	 * 
	 */
	public Television() {
		super();
		this.pulgadas=PULGADAS;
	}
	/**
	 * @param preciobase
	 * @param peso
	 * @param consumo
	 * @param color
	 */
	public Television(double preciobase, double peso, char consumo, String color,int pulgadas) {
		super(preciobase, peso, consumo, color);
		this.pulgadas=pulgadas;
	}

	/**
	 * @param preciobase
	 * @param peso
	 */
	public Television(double preciobase, double peso) {
		super(preciobase, peso);
		this.pulgadas=PULGADAS;
	}
	/**
	 * @return el pulgadas
	 */
	public int getPulgadas() {
		return pulgadas;
	}

	public double precioFinal() {
		double precioFin=super.precioFinal();
		
		if(pulgadas>40)
			precioFin+=preciobase*0.3;
		
		return precioFin;
		
		
	}
	@Override
	public String toString() {
		return "Television "+super.toString()+"pulgadas="+ pulgadas;
	}
	
	

	
}
