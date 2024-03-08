package agendaClase;

public class Contacto {

	//Atributos
	protected String nombre;
	protected int telefono;
	
	
	public Contacto() {
		this.nombre="";
		this.telefono=0;
	}
	
	/**Constructor 2 parametros
	 * @param nombre
	 * @param telefono
	 */
	public Contacto(String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}



	/**Devuelve el nombre del contacto
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**Establece el nombre del contacto
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**Devueleve el número telefono del contacto
	 * @return el telefono
	 */
	public int getTelefono() {
		return telefono;
	}



	/**Establece el numero de telefono del contacto
	 * @param telefono el telefono a establecer
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	/**
	 * Metodo que compruena si un contacto es igual a otro 
	 * @param palabra
	 * @return TRUE si son iguales o FALSE si no lo son
	 */
	public boolean nombreIgual(String palabra) {
		
		if(nombre.equals(palabra))
			return true;
		
		return false;
		
	}


	/**
	 * Metodo toString del contacto
	 */
	@Override
	public String toString() {
		return "Contacto : nombre= " + nombre + ", telefono= " + telefono;
	}
	
	
	
	
	
}
