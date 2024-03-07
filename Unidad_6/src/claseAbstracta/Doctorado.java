package claseAbstracta;

public class Doctorado extends Alumno {

	
	//Constantes
	public final int H_TESIS=10;
	
	//Atributos
	private int horas_tesis;
	private String nombre_tesis;
	
	
	/**Constructor
	 * @param nombre
	 * @param horas
	 * @param curso
	 * @param horas_tesis
	 * @param nombre_tesis
	 */
	
	public Doctorado(String nombre, int horas, String curso, int horas_tesis, String nombre_tesis) {
		super(nombre, horas, curso);
		this.horas_tesis = horas_tesis;
		this.nombre_tesis = nombre_tesis;
	}


	/**
	 * @return el horas_tesis
	 */
	public int getHoras_tesis() {
		return horas_tesis;
	}


	/**
	 * @param horas_tesis el horas_tesis a establecer
	 */
	public void setHoras_tesis(int horas_tesis) {
		this.horas_tesis = horas_tesis;
	}


	/**
	 * @return el nombre_tesis
	 */
	public String getNombre_tesis() {
		return nombre_tesis;
	}


	/**
	 * @param nombre_tesis el nombre_tesis a establecer
	 */
	public void setNombre_tesis(String nombre_tesis) {
		this.nombre_tesis = nombre_tesis;
	}


	@Override
	public String toString() {
		return super.toString()+ "Tesis doctoral: "+ nombre_tesis 
				+ " ("+horas_tesis+" horas semanales)"
				+"\nHoras totales: "+horasTotales();
	}


	//Metodo abstracto
	@Override
	public int horasTotales() {
		return getHoras()+getHoras_tesis();
	}
	
	
	
	
	
	}
	


