package resueltos;

public class Minumero {
	int dato; //atributo
	/**
	 * COnstructor
	 * @param d numero
	 */
	Minumero(int d){
		dato=d;
	}
	
	public int doble() {
		return dato+dato;
	}
	public int triple() {
		return doble()+dato;
	}
	public int cuadr() {
		return doble()+doble();
	}

}
