package fraccion;

public class Fraccion {
	//Atributo
	private int numerador;
	private int denominador;
	
	//Métodos
	
	/**
	 * Constructor vacío
	 * 
	 */
	public Fraccion(){
		numerador=0;
		denominador=1; //denominador no puede ser 0, porque nunca puedes dividir entre 0 
	}

	/**
	 * Construcyot con parámetros 
	 * @param numerador
	 * @param denominador
	 */
	public Fraccion(int numerador,int denominador){
		this.numerador=numerador;
		if(denominador==0)
			this.denominador=1; //lo cambiamos a uno
		else
			this.denominador=denominador;
	}
	
	/**
	 * Devuelve el numerador de la fracción
	 * @return numerador - de la fracción
	 */
	public int getNumerador() {
		return numerador;
	}
	
	public int getDenominador() {
		return denominador;
	}
	/**
	 *Establece el numerador de la fracción	 
	 * @param numerador - a establecer 
	 */
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	
	}
	
	public void setDenominador(int denominador) {
		if(denominador==0)
			this.denominador=1; //lo cambiamos a uno
		else
			this.denominador=denominador;
		
	}

	
	/**
	 * Devuelve una cadena de caracteres que representa la fracción 
	 */
	@Override
	public String toString() {
		if(denominador==1)
			return numerador+"";
					
		return numerador+"/"+denominador;
	}

	/**
	 * Sumar dos fracciones 
	 * @param f fraccion que sumas a la fraccion principal
	 * @return fraccion resultado
	 */
	public Fraccion sumar(Fraccion f) {
		Fraccion aux=new Fraccion(); //guarda el resultado, que es una nueva fraccion
		aux.numerador=(this.numerador*f.denominador)+(f.numerador*this.denominador);
		aux.denominador=this.denominador*f.denominador;
		return aux;
		
	}
	
	//HACER RESTA, MULTIPLICACION Y DIVISION  
	
	public Fraccion restar(Fraccion f) {
		Fraccion aux=new Fraccion(); //guarda el resultado, que es una nueva fraccion
		aux.numerador=(this.numerador*f.denominador)-(f.numerador*this.denominador);
		aux.denominador=this.denominador*f.denominador;
		return aux;
		
	}
	/**
	 * Devuelve la multiplicacion de fracciones, numerador*numerador y denom*denom, en linea 
	 * @return fraccion resultado 
	 */
	public Fraccion multi(Fraccion f) {
		Fraccion aux=new Fraccion();
		aux.numerador=this.numerador*f.numerador;
		aux.denominador=this.denominador*f.denominador;
		return aux;
	}
	/**
	 * Devuelve la fraccion resultado de dividir, multiplicando en cruz  
	 * @param f fraccion a dividir 
	 * @return fraccion resultado
	 */
	public Fraccion divi(Fraccion f) { //ahorramos lineas creando fraccion resultado en el return 
		return new Fraccion(this.numerador*f.denominador,this.denominador*f.numerador);
	}
	
	//------------------------MAXIMO COMUN DIVISOR--------------------
	
	/**
	 * obtiene el maximo comun divisor del numerador y denominador
	 * Utiliza el algoritmo de Euclides
	 * @return maximo comun divisor(nº entero)
	 */
	private int mcd() {
		int u=Math.abs(numerador);
		int v=Math.abs(denominador);
		
		if(v==0)
			return u;
		
		int r;
		
		while(v!=0) {
			r=u%v;
			u=v;
			v=r;
		}
		return u;
	}
	
	/**
	 * Hacemos uso del mcd
	 */
	public void simplificar() {
		int n=mcd(); //calculamos el mcd de la fracción
		numerador=numerador/n;
		denominador=denominador/n;
	}

}
