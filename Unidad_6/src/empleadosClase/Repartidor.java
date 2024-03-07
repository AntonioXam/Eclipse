package empleadosClase;

public class Repartidor extends Empleado {

	
	//Atributo
	private String zona;

	
	/**
	 * 
	 */
	public Repartidor() {
		super();
		this.zona="";
		
	}

	/**
	 * @param nombre
	 * @param edad
	 * @param salario
	 */
	public Repartidor(String nombre, int edad, double salario,String zona) {
		super(nombre, edad, salario);
		this.zona=zona;
	}

	/**
	 * @return el zona
	 */
	public String getZona() {
		return zona;
	}

	/**
	 * @param zona el zona a establecer
	 */
	public void setZona(String zona) {
		this.zona = zona;
	}

	public boolean plus() {
		
		if(edad>25 && zona.equals("zona 3")) {
			salario=salario+PLUS;
		return true;
		}
	
		return false;
		
}

	@Override
	public String toString() {
		if(nombre.equals(""))
			return "\nNo se ha registrado al empleado";
		return "\nRepartidor: " +nombre+", edad= " + edad + ", zona: "+zona+", salario= " + salario + "€";
	}

	
	
}
