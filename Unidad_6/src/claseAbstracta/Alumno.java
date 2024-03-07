package claseAbstracta;

public abstract class Alumno {

	//Constante
	public final int H_LECTIVAS=30;

	//Atributos
	private String nombre;
	private int horas;
	private String curso;


	//Constructor

	/**
	 * @param nombre
	 * @param horas
	 * @param curso
	 */
	public Alumno(String nombre, int horas, String curso) {
		this.nombre = nombre;
		this.horas = horas;
		this.curso = curso;




	}
	/**
	 * @param nombre
	 * @param curso
	 */
	public Alumno(String nombre, String curso) {
		this.nombre = nombre;
		this.curso = curso;
		this.horas=H_LECTIVAS;
	}
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return el horas
	 */
	public int getHoras() {
		return horas;
	}
	/**
	 * @param horas el horas a establecer
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}
	/**
	 * @return el curso
	 */
	public String getCurso() {
		return curso;
	}
	/**
	 * @param curso el curso a establecer
	 */
	public void setCurso(String curso) {
		curso = curso;
	}
	@Override
	public String toString() {
		return "\nAlumno: " +nombre
				+"\nCurso: " + curso 
				+" ("+horas+" horas lectivas)\n";
	}
	
	//Metodos abstractos
	public abstract int horasTotales();
		
	
	


}








