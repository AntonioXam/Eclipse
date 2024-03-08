package empleadosClase;

public class Repartidor extends Empleado {

	
	//Atributo
	private String zona;

	


	/** Constructor con 4 parametros
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
		
		if(getEdad()>25 && zona.equalsIgnoreCase("zona 3")) {
			setSalario(getSalario()+PLUS);
		return true;
		}
	
		return false;
		
}

	@Override
	public String toString() {
		if(getNombre().equals(""))
			return "\nNo se ha registrado al empleado";
		return "\nRepartidor: "+super.toString()+ ", zona: "+zona;
	}

	
	
}
