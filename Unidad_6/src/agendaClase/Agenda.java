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
	
	public Agenda(int num) {
		this.contactos = new Contacto[num];
	}

	
	/**
	 * Metodo que compara dos objetos y devuevle si es igual en el nombre
	 * @param c
	 * @return
	 */
	public boolean existeContacto(Contacto c) {
		
		for (int i = 0; i < contactos.length; i++) {
			if(contactos[i].nombreIgual(c.getNombre()))
					return true;
				
		}
		
		return false;
		
	}
	/**
	 * Metodo que comprueba si hay contactos vacios ,devuelve TRUE si hay espacio
	 * @return
	 */
	public boolean agendaLlena() {
		
		for (int i = 0; i < contactos.length; i++) {
			if(contactos[i].nombreIgual(""))
				return false;
		}
		return true;
	}
	
	
	public void addContacto(Contacto c) {
		
		if(agendaLlena())
			System.out.println("La agenda está llena");
		else if(existeContacto(c))
			System.out.println("El contacto ya existe");
		
	}
	
	
}
