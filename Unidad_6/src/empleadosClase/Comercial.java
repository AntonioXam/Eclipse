package empleadosClase;

public class Comercial extends Empleado {

	//Atributos
	private double comision;
	
	
	
	
	
	public Comercial() {
		super();
		this.comision=0;
	}

	

	/**
	 * @param nombre
	 * @param edad
	 * @param salario
	 */
	public Comercial(String nombre, int edad, double salario,double comision) {
		super(nombre, edad, salario);
		this.comision=comision;
	}

	

	/**
	 * @return el comision
	 */
	public double getComision() {
		return comision;
	}

	/**
	 * @param comision el comision a establecer
	 */
	public void setComision(double comision) {
		this.comision = comision;
	}



	public boolean plus() {
		
		if(edad>30 && comision>200) {
			salario=salario+PLUS;
		return true;
		}
	
		return false;
		
		
	}



	@Override
	public String toString() {
		if(nombre.equals(""))
			return "\nNo se ha registrado al empleado";
		return "\nComercial: " +nombre+", edad= " + edad + ",comision= "+comision+", salario= " + salario + "€";
	}
	
	

}
