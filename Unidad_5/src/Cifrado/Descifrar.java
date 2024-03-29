package Cifrado;

public class Descifrar {

	//Atributo

	private String mensaje;


	/**Contructor
	 * @param mensaje
	 */
	public Descifrar(String mensaje) {
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


	public String DescifrarSustitucion(int clave) {

		String criptograma="";
		for (int i = 0; i < mensaje.length(); i++) {
			if (mensaje.charAt(i)>='A' && mensaje.charAt(i)<='Z') {
				int caracter=mensaje.charAt(i)-clave;
				if ((char)caracter<'A') 
					caracter+=26; //sumando A la a para volver a emprezar
				criptograma+=(char)caracter;
			}
			//controlar de la 'a' a la 'z' y que sea circular 
			else if (mensaje.charAt(i)>='a' && mensaje.charAt(i)<='z') {
				int caracter=mensaje.charAt(i)-clave;
				if ((char)caracter<'a') 
					caracter+=26; //sumando a la a para volver a emprezar
				criptograma+=(char)caracter;
			}
			else
				criptograma+=mensaje.charAt(i);		// dejar los otros caracteres fuera del rango igual

		}
		return criptograma;

	}

	public String descifrarTransposicion(String mensajeCifrado) {
	    int longitud = mensajeCifrado.length();
	    int mitad = (longitud + 1) / 2; // Calcula la longitud de la parte 'pares'

	    String pares = mensajeCifrado.substring(0, mitad);
	    String impares = mensajeCifrado.substring(mitad);

	    String mensajeDescifrado = "";

	    for (int i = 0; i < mitad; i++) {
	        if (i < pares.length()) {
	            mensajeDescifrado += pares.charAt(i);
	        }
	        if (i < impares.length()) {
	            mensajeDescifrado += impares.charAt(i);
	        }
	    }

	    return mensajeDescifrado;
	}

}

