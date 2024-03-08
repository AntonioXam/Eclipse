package empleadosClase;

public abstract class Empleado {

	//Constante
	
	public final static double PLUS=300;
	
	//Atributos
	private String nombre;
	private int edad;
	private double salario;
	
	
		
	/**Constructor de 3 parametros
	 * @param nombre
	 * @param edad
	 * @param salario
	 */
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	/**Devuelve el nombre de empleado
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**Establece el nombre de empleado
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**Devuelve la edad de empleado
	 * @return el edad
	 */
	public int getEdad() {
		return edad;
	}

	/**Establece la edad de empleado
	 * @param edad el edad a establecer
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**Devuelve el salario de empleado
	 * @return el salario
	 */
	public double getSalario() {
		return salario;
	}

	/**Establece el salario de empleado
	 * @param salario el salario a establecer
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**
	 * Medodo abstract para comprobar el plus que se implementa en las subclases
	 * @return
	 */
	public abstract boolean plus();

	/**
	 * Metodo toString de Empleado
	 */
	@Override
	public String toString() {
		return nombre+", edad= " + edad + " años, salario= " + salario + "€";
	}
		
	
	
	
	
}
