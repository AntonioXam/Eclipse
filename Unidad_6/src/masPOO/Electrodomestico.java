package masPOO;

public class Electrodomestico {
	
	//Constante
	 protected final static double PRECIO_BASE=100;	//Precio base por defecto
	 protected final static double PESO=5;			//peso por defecto
	 protected final static char CONSUMO='F';		//consumo por defecto
	 protected final static String COLOR="blanco";	//Color por defecto
	
	 //Atributos
	protected double preciobase;		//Precio base del electrodomestico
	protected double peso;				//Peso del electrodomestico
	protected char consumoEnergetico;	//Indica el consumo
	protected String color;				//Color del electrodomestico
	
	
	//Constructores
	/**
	 * Constructor por defecto
	 */
	public Electrodomestico() {
		preciobase=PRECIO_BASE;
		peso=PESO;
		consumoEnergetico=CONSUMO;
		color=COLOR;
	}


	/**Constructor con dos parametros y el resto por defector
	 * @param preciobase
	 * @param peso
	 */
	public Electrodomestico(double preciobase, double peso) {
		this(preciobase,peso,CONSUMO,COLOR);
	}


	/**Constructor con 4 parametros
	 * @param preciobase
	 * @param peso
	 * @param consumoEnergetico
	 * @param color
	 */
	public Electrodomestico(double preciobase, double peso, char consumoEnergetico, String color) {
		this.preciobase = preciobase;
		this.peso = peso;
		comprobarConsumoEnergetico(consumoEnergetico);	//Comprueba la letra sino la pone por defecto
		comprobarColor(color);	//Comprueba el color sino lo pone por defecto
			
	}


	/** Devuelve el preciobase electrodomestico
 	 * @return el preciobase
	 */
	public double getPreciobase() {
		return preciobase;
	}


	/** Devuelve el peso electrodomestico
	 * @return el peso
	 */
	public double getPeso() {
		return peso;
	}


	/** Devuelve el consumo electrodomestico
	 * @return el consumoEnergetico
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}


	/** Devuelve el color del electrodomestico
	 * @return el color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Comprueba el consumo energetico 
	 * SOLO comprueba si son mayusculas
	 * @param letra
	 */
	private void comprobarConsumoEnergetico(char letra){
		if(letra>='A' && letra<='F')
			consumoEnergetico=letra;
		else	
			consumoEnergetico=CONSUMO;
	}
	
	
	/**
	 * Comprueba el color
	 * Se ha incluido si introducimos mayusculas 
	 * @param color
	 */
	private void comprobarColor(String color) {
		
		switch (color.toLowerCase().trim()) {
			case "blanco":this.color=color;
				break;
			case "negro":this.color=color;
				break;
			case "rojo":this.color=color;
				break;
			case "azul":this.color=color;
				break;
			case "gris":this.color=color;
				break;
			default:this.color=COLOR;
				break;
		}
	}
	
	
	public double precioFinal() {
		
		double precio=0;
		
		switch (consumoEnergetico) {
		case 'A':precio+=100;break;
		case 'B':precio+=80;break;
		case 'C':precio+=60;break;
		case 'D':precio+=50;break;
		case 'E':precio=+30;break;
		case 'F':precio+=10;break;
	
		}
		
		if(peso<=19 && peso>=0)
			precio+=10;
		else if(peso>=20 && peso<=49)
			precio+=50;
		else if(peso>=50 && peso<=79)
			precio+=80;
		else if(peso>=80)
			precio+=100;
	
		return PRECIO_BASE+precio;
			
	}


	@Override
	public String toString() {
		return "Electrodomestico: "
				+"color "+color+ ", peso="+peso+ "kg, consumo energético ="+consumoEnergetico
				+", precio final="+precioFinal();
				
	}
	
	
	
	
	
	
	

}
