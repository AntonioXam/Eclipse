package serieVideojuegos;

public class Videojuego implements Entregable{

	//Constante
	private final static int HORAS_ES=100;
	
	//Atributo
	private String titulo;
	private int horasEstimadas;
	private String genero;
	private String desarrollador;
	private boolean prestado;
	
	
	

		
	/**
	 * Constructor por defecto
	 */
	public Videojuego() {
		this("",HORAS_ES,"","");
	}




	/**Constructor con 2 parametros y los demas por defecto
	 * @param titulo
	 * @param desarrollador
	 */
	public Videojuego(String titulo, String desarrollador) {
		this(titulo,HORAS_ES,"",desarrollador);
	}



	/**Constructor con 4 parametros EXCEPTO prestado
	 * @param titulo
	 * @param horasEstimadas
	 * @param genero
	 * @param desarrollador
	 * @param prestado
	 */
	public Videojuego(String titulo, int horasEstimadas, String genero, String desarrollador)
	{
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.desarrollador = desarrollador;
		this.prestado = false;
	}
	
	


	/**Devuelve el titulo del videojuego
	 * @return el titulo
	 */
	public String getTitulo() {
		return titulo;
	}




	/**Establece el titulo videojuego
	 * @param titulo el titulo a establecer
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	/**Devuelve las horas estimadas del videojuego
	 * @return el horasEstimadas
	 */
	public int getHorasEstimadas() {
		return horasEstimadas;
	}




	/**Establece las horas estimadas del videojuego
	 * @param horasEstimadas el horasEstimadas a establecer
	 */
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}




	/**Devuelve el genero del videojuego
	 * @return el genero
	 */
	public String getGenero() {
		return genero;
	}




	/**Establece el genero del videojuego
	 * @param genero el genero a establecer
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}




	/**Devuelve el desarrollador del videojuego
	 * @return el desarrollador
	 */
	public String getDesarrollador() {
		return desarrollador;
	}




	/**Establece el desarrollador del videojuego
	 * @param desarrollador el desarrollador a establecer
	 */
	public void setDesarrollador(String desarrollador) {
		this.desarrollador = desarrollador;
	}



	/**
	 * Metodo que cambia prestado a TRUE al ser entregado
	 */
	public void entregar() {
		prestado=true;
		
	}

	/**
	 * Metodo que cambia prestado a FALSE al ser devuelto
	 */
	public void devolver() {
		prestado=false;
		
	}

	/**
	 * Metodo que devuelve el estado de prestado
	 */
	public boolean isPrestado() {
		
		return prestado;
	}




	/**
	 * Metodo toString que devuelve el videojuego
	 */
	@Override
	public String toString() {
		if(titulo.equals(""))
			return "Videojuego: No hay información sobre el videojuego";
		return "Videojuego: "+titulo+" ("+desarrollador+") "+", Numero de horas estimadas: "+horasEstimadas+", Género: "+genero;
	}

	
	
}
