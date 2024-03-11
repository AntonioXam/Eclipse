package clazes;

public class Electrodomestico {

	protected final static double PRECIO_BASE=100;
	protected final static double PESO=5;
	protected final static char CONSUMO='F';
	protected final static String COLOR="blanco";
	
	
	protected double preciobase;
	protected double peso;
	protected char consumo;
	protected String color;
	

	
	public Electrodomestico() {
		this(PRECIO_BASE,PESO,CONSUMO,COLOR);
		
	}
		
	public Electrodomestico(double preciobase, double peso) {
		this.preciobase = preciobase;
		this.peso = peso;
		this.consumo=CONSUMO;
		this.color=COLOR;
	}
	public Electrodomestico(double preciobase, double peso, char consumo, String color) {
		this.preciobase = preciobase;
		this.peso = peso;
		this.comprobarConsumoEnergetico(consumo);
		this.comprobarColor(color);
	}

	/**
	 * @return el preciobase
	 */
	public double getPreciobase() {
		return preciobase;
	}

	/**
	 * @return el peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @return el consumo
	 */
	public char getConsumo() {
		return consumo;
	}

	/**
	 * @return el color
	 */
	public String getColor() {
		return color;
	}
	
	private void comprobarConsumoEnergetico(char letra)
	{
		if(letra<'F' && letra>'A')
			this.consumo=letra;
		this.consumo=CONSUMO;
	}
	
	private void comprobarColor(String c)
	{
		switch (c.toLowerCase().trim()) {
		case "blanco":this.color=c; break;
		case "negro":this.color=c; break;
		case "rojo":this.color=c; break;
		case "azul":this.color=c; break;
		case "gris":this.color=c; break;
		default:this.color=COLOR;break;
		}
	}
	
	public double precioFinal() {
		double precioFin=0;
		switch (consumo) {
		case 'A':precioFin+=100;break;
		case 'B':precioFin+=80;break;
		case 'C':precioFin+=60;break;
		case 'D':precioFin+=50;break;
		case 'E':precioFin+=30;break;
		case 'F':precioFin+=10;break;
		}
		
		if (peso>=0 && peso<=19)
			precioFin+=10;
		else if(peso>=20 && peso<=49)
			precioFin+=50;
		else if(peso>=50 && peso<=79)
			precioFin+=80;
		else if(peso>=80)
			precioFin+=100;
		
		return preciobase+precioFin;
		
			
		
	}

	@Override
	public String toString() {
		return "precio=" + precioFinal() + ", peso=" + peso + ", consumo=" + consumo + ", color="
				+ color ;
	}
	
	
	
}
