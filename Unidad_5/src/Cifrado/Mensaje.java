package Cifrado;

public class Mensaje {

	//Contante 
	public final int CESAR=3; // Clave a aplicar en el cifrado del cesar
	
	public final int ROT13=13;// Clave a aplicar en el cifrado del ROT13
	
	// Atributo

	private String mensaje;    // Mensaje a cifrar

	/**Contructor
	 * @param mensaje
	 */
	public Mensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/** Devuelve el mensaje sin cifrar
	 * @return el mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/** Establece un valor para el mensaje a cifrar
	 * @param mensaje el mensaje a establecer
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * metodo para cifrar por sustitucion
	 * ocupa 'clave' posiciones en adelante en el alfabeto
	 * Cifra solo los caracteres del alfabeto : 'A'....'Z' y 'a'...'z'
	 * Cualquier otro caracter se copiara sin cifrar(incuidos los espacios)
	 * Considera el alfabeto circular, de forma que despues de la 'z' continuaria la 'a' y en mayusculas
	 * @param clave a aplicar en el cifrado por sustitucion
	 * @return el criptrograma al que se le ha aplicado el cifrado por sustitucion
	 */
	public String sustitucion(int clave) {

		String criptograma="";
		for (int i = 0; i < mensaje.length(); i++) {
			if (mensaje.charAt(i)>='A' && mensaje.charAt(i)<='Z') {
				int caracter=mensaje.charAt(i)+clave;
				if ((char)caracter>'Z') 
					caracter-=26;
				criptograma+=(char)caracter;
			}
			//controlar de la 'a' a la 'z' y que sea circular 
			else if (mensaje.charAt(i)>='a' && mensaje.charAt(i)<='z') {
				int caracter=mensaje.charAt(i)+clave;
				if ((char)caracter>'z') 
					caracter-=26; //restando a la z para volver a emprezar
				criptograma+=(char)caracter;
			}
			else
				criptograma+=mensaje.charAt(i);		// dejar los otros caracteres fuera del rango igual
				
		}
		return criptograma;

	}
	
	/**
	 * Cifrado por la transposicion de Riel
	 * el mensaje se cifra alternando las letras en dos cadenas separadas
	 * y concatenando las dos cadenas
	 * @return el criptograma que se obtiene al aplicar la transposicion de Riel
	 */
	public String transposicion() {
		
		String pares="";
		String impares="";
		
		for (int i = 0; i < mensaje.length(); i++) {
			if (i%2==0) 
				pares+=mensaje.charAt(i);
			else
				impares+=mensaje.charAt(i);			
			
		}
			
		
		return pares+impares;
	}
	
	
		
		
	}

