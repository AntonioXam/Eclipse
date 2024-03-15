package agendaClase;

public class Agenda   {

	//Atributos
	private Contacto[] contactos;

	//Constructores

	/**Constructor de arrays de agenda
	 * @param contactos
	 */
	public Agenda() {
		this.contactos = new Contacto[10];
	}

	/**
	 * Constructor con un parametro que indica el numero de la agenda
	 * @param num
	 */
	public Agenda(int num) {
		this.contactos = new Contacto[num];
	}


	/**
	 * Metodo que compara dos contactos y devuelve si es igual en el nombre
	 * @param c contacto que queremos ver si existe 
	 * @return TRUE si existe o FALSE si no existe
	 */
	public boolean existeContacto(Contacto c) {

		for (int i = 0; i < contactos.length; i++) {
			if( contactos[i]!=null) {
				if(contactos[i].nombreIgual(c))
					return true;
			}
		}

		return false;

	}
	/**
	 * Metodo que comprueba si hay contactos vacios 
	 * @return devuelve FALSE ,devuelve TRUE si hay espacio
	 */
	public boolean agendaLlena() {

		for (int i = 0; i < contactos.length; i++) {
			if(contactos[i]==null)
				return false;
		}
		return true;
	}


	public void addContacto(Contacto c) {

		if(agendaLlena())
			System.err.println(">> La agenda está llena");
		else if(existeContacto(c))
			System.out.println(">> El contacto ya existe");
		else {
			boolean encontrado=false;
			for (int i = 0; i < contactos.length && !encontrado; i++) {
				if(contactos[i]==null) {
					contactos[i]=c;
					encontrado=true;
				}
			}
			if(encontrado)
				System.out.println(">> Se ha añadido el nuevo contacto en la agenda");
		}
	}

	public int huecosLibres() {

		int conta=0;
		for (int i = 0; i < contactos.length; i++) {
			if(contactos[i]==null)
				conta++;
		}

		return conta;
	}

	public void listarContactos() {
		if(huecosLibres()==contactos.length)
			System.out.println("\n>> La agenda está vacia");
		else {
			for (int i = 0; i < contactos.length; i++) {
				if(contactos[i]!=null)
					System.out.println(contactos[i]);


			}
		}
	}


	public void buscarContacto(String nombre) {
		boolean encontrado=false;
		for (int i = 0; i < contactos.length && !encontrado; i++) {
			if( contactos[i]!=null && nombre.trim().equalsIgnoreCase(contactos[i].getNombre().trim())) {
				System.out.println(">> Su teléfono es: "+contactos[i].getTelefono());
				encontrado=true;
			}
		}
		if(!encontrado)
			System.out.println(">> Contacto no existe");

	}

	public void eliminarContacto(Contacto c) {
		boolean encontrado=false;
		for (int i = 0; i < contactos.length && !encontrado; i++) {
			if( contactos[i]!=null) {
				if(contactos[i].nombreIgual(c))
					contactos[i]=null; //Ponemos el contacto a null
					encontrado=true;
			}
		}
		
		if(encontrado)
			System.out.println("Contacto eliminado");
		else
			System.out.println("No se ha podido eliminar");
	}

}

