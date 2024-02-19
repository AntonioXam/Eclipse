package Ejerciciocadena;

public class Cadena {
	
	private String Cadena;

	/**Contructores
	 * 
	 */
	public Cadena() {
	}

	/** Contructor
	 * @param cadena
	 */
	public Cadena(String cadena) {
		Cadena = cadena;
	}

	/**
	 * @return el cadena
	 */
	public String getCadena() {
		return Cadena;
	}

	/**
	 * @param cadena el cadena a establecer
	 */
	public void setCadena(String cadena) {
		Cadena = cadena;
	}
	
	public int contarVocales() {
		int conta = 0;
		char c;

		for (int i = 0; i < Cadena.length(); i++) {
			c = Cadena.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				conta++;
			if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
				conta++;
		}
		return conta;
	}

	// Contar el número de consonantes
	public int contarConsonantes() {
		int conta = 0;
		char c;
		for (int i = 0; i < Cadena.length(); i++) {
			c = Cadena.charAt(i);
			if(c >= 'b' && c <= 'z') {
				if(c!= 'e' && c!= 'i' && c!= 'o' && c!= 'u')
					conta++;
			}
			if(c >= 'B' && c <= 'Z') {
				if(c!= 'E' && c!= 'I' && c!= 'O' && c!= 'U')
					conta++;
			}
		}
		return conta;
	}
	

	public boolean isCaracter(char C) {
		
		for (int i = 0; i < Cadena.length(); i++) {
			char letra=Cadena.charAt(i);
			if (letra==C) {
				return true;
			}
		}
		return false;
			
	}
	public void deleteBlancos() {
		
		String sinespacios=Cadena.replace(" ","");
		System.out.println(sinespacios);
		
	}

		
	}
	
	
	


