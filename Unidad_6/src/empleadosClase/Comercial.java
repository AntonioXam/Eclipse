package empleadosClase;

public class Comercial extends Empleado {

	//Atributos
	private double comision;
	
	
	
	

	/**Constructor con 4 parametros
	 * @param nombre
	 * @param edad
	 * @param salario
	 */
	public Comercial(String nombre, int edad, double salario,double comision) {
		super(nombre, edad, salario);
		this.comision=comision;
	}

	

	/**Devuelve la comision
	 * @return el comision
	 */
	public double getComision() {
		return comision;
	}

	/**Establece la comision
	 * @param comision el comision a establecer
	 */
	public void setComision(double comision) {
		this.comision = comision;
	}


	/**
	 * Metodo que devuelve TRUE si se cumple la condicion o FALSE si no la cumple
	 */
	public boolean plus() {
		
		if(getEdad()>30 && comision>200) {
			setSalario(getSalario()+PLUS);
		return true;
		}
	
		return false;
		
		
	}


	/**
	 * Metodo toString de comercial
	 */
	
	@Override
	public String toString() {
		if(getNombre().equals(""))
			return "\nNo se ha registrado al empleado";
		return "\nComercial: "+super.toString()  + ", comision= "+comision;
	}
	
	

}
