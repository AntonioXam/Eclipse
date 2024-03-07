package Entregar;

public class Serie implements Entregable {


	//Constructor
	private final static int NUM_TEM=3; //numero de temporadas por defecto
	
	
	
	//Atributos
	private String titulo;   		//Titulo de la serie
	private int numTemporadas;		//Numero de temporadas
	private String genero;			//Genero de la serie
	private String creador;			//Nombre del creador de la serie
	private boolean prestado;
	
	
	//Contructor
	
	/**
	 * Constructor por defecto
	 */
	public Serie() {
		this("",NUM_TEM,"","");
	}


	/**Constructor con titulo y creador lo demas por defecto
	 * @param titulo
	 * @param creador
	 */
	public Serie(String titulo, String creador) {
		this(titulo,NUM_TEM,"",creador);
	}


	/** Constructor con todos los parametros EXCEPTO prestrado
	 * @param titulo
	 * @param numero de Temporadas
	 * @param genero
	 * @param creador
	 */
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.prestado=false;
	}

	


	/** Devuelve el titulo de la serie
	 * @return el titulo
	 */
	public String getTitulo() {
		return titulo;
	}



	/**Establece el titulo de la serie
	 * @param titulo el titulo a establecer
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}






	/**Devuelve el numero de temporadas de la serie
	 * @return el numTemporadas
	 */
	public int getNumTemporadas() {
		return numTemporadas;
	}






	/**Establece el numero de temporadas de la serie
	 * @param numTemporadas el numTemporadas a establecer
	 */
	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}






	/**Devuelve el genero de la serie
	 * @return el genero
	 */
	public String getGenero() {
		return genero;
	}






	/**Establece el genero de la serie
	 * @param genero el genero a establecer
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}






	/**Devuelve el creador de la serie
	 * @return el creador
	 */
	public String getCreador() {
		return creador;
	}






	/**Establece el creador de la serie
	 * @param creador el creador a establecer
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}





	public void entregar() {
		prestado=true;
		
	}

	public void devolver() {
		prestado=false;
	}

	
	public boolean isPrestado() {
		return prestado;
	}


	@Override
	public String toString() {
		if(titulo.equals(""))
			return "Serie: sin informacion registrada";
		return "Serie: "+titulo+" ("+creador+")"+", Numero de temporadas: "+numTemporadas+", Género: "+genero;
	}
	
	
	
	
	
	

}
