package clas;



public class Criptografia {

	public Criptografia(String mensaje) {
		
	}

	public String cifrado_Cesar(String mensaje) {

		String criptograma="";
		for (int i = 0; i < mensaje.length(); i++) {
			if (mensaje.charAt(i)>='A' && mensaje.charAt(i)<='Z') {
				int caracter=mensaje.charAt(i)+3;
				if ((char)caracter>'Z') 
					caracter-=26;
				criptograma+=(char)caracter;
			}
			//controlar de la 'a' a la 'z' y que sea circular 
			else if (mensaje.charAt(i)>='a' && mensaje.charAt(i)<='z') {
				int caracter=mensaje.charAt(i)+3;
				if ((char)caracter>'z') 
					caracter-=26; //restando a la z para volver a emprezar
				criptograma+=(char)caracter;
			}
			else
				criptograma+=mensaje.charAt(i);		// dejar los otros caracteres fuera del rango igual

		}
		return criptograma;

	}

	public String descifrado_Cesar(String mensaje) {

		String criptograma="";
		for (int i = 0; i < mensaje.length(); i++) {
			if (mensaje.charAt(i)>='A' && mensaje.charAt(i)<='Z') {
				int caracter=mensaje.charAt(i)-3;
				if ((char)caracter<'A') 
					caracter+=26; //sumando A la a para volver a emprezar
				criptograma+=(char)caracter;
			}
			//controlar de la 'a' a la 'z' y que sea circular 
			else if (mensaje.charAt(i)>='a' && mensaje.charAt(i)<='z') {
				int caracter=mensaje.charAt(i)-3;
				if ((char)caracter<'a') 
					caracter+=26; //sumando a la a para volver a emprezar
				criptograma+=(char)caracter;
			}
			else
				criptograma+=mensaje.charAt(i);		// dejar los otros caracteres fuera del rango igual

		}
		return criptograma;

	}

	public String cifrado_Riel(String mensaje) {

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

	public String descifrado_Riel(String mensaje) {
		int longitud = mensaje.length();
		int mitad = (longitud + 1) / 2; // Calcula la longitud de la parte 'pares'

		String pares = mensaje.substring(0, mitad);
		String impares = mensaje.substring(mitad);

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

