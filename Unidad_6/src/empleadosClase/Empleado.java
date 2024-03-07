package empleadosClase;

public abstract class Empleado {

	//Constante
	
	protected final static double PLUS=300;
	
	//Atributos
	protected String nombre;
	protected int edad;
	protected double salario;
	
	
	public Empleado() {
		this("",18,0);
	}
	
	/**
	 * @param nombre
	 * @param edad
	 * @param salario
	 */
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
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
	 * @return el edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad el edad a establecer
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return el salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario el salario a establecer
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public abstract boolean plus();

	@Override
	public String toString() {
		return nombre+", edad= " + edad + ", salario= " + salario + "€";
	}
		
	
	
	
	
}
