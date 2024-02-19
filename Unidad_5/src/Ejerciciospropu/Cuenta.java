package Ejerciciospropu;

public class Cuenta {


	//Atributos

	private String titular;
	private double cantidad;



	/**	Contructor 
	 * @param titular -nombre
	 * @param cantidad - cantidad dinero
	 */
	public Cuenta(String titular, double cantidad) {
		this.titular=titular;
		//Si la cantidad es menor que cero, la ponemos a cero
		if (cantidad < 0)
			this.cantidad=0;
		else
			this.cantidad=cantidad;
	}

	public Cuenta(String titular) {
		this.titular = titular;
		this.cantidad = 0;
	}

	/**
	 * @return el titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular el titular a establecer
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return el cantidad
	 */
	public double getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad el cantidad a establecer
	 */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";

	}

	/**
	 *  Metodo Ingresar
	 * @param dinero a ingresar
	 * @return la cantidad mas dinero
	 */
	public void ingresar(double cantidad) {
		if (cantidad>0)
			this.cantidad+=cantidad;

	}

	public void retirar (double cantidad) {
		if (this.cantidad < cantidad)
			this.cantidad=0;
		else
			this.cantidad-= cantidad;

	}


}
