package agendaClase;

public class Contacto {

	//Atributos
	private String nombre;
	private int telefono;
	
	
	/**
	 * Constructor por defecto
	 */
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




	/**Constructor con 1 parametro y otro por defecto
	 * @param nombre
	 */
	public Contacto(String nombre) {
		super();
		this.nombre = nombre;
		this.telefono=0;
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



	/**Devuelve el nombre del contacto
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
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
	 * @return TRUE si los nombres de los contactos son iguales o FALSE si no lo son
	 */
	public boolean nombreIgual(Contacto c) {
		
		 return this.nombre.trim().equalsIgnoreCase(c.getNombre().trim());
			
		
	}


	/**
	 * Metodo toString del contacto que muestra informacion del contacto
	 * @return cadena con toda la informacion del contacto
	 */
	@Override
	public String toString() {
		return nombre + " - " + telefono;
	}
	
	
	
	
	
}
