package clas;

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
	public String deleteBlancos() {
		
		String sinespacios=Cadena.replace(" ","");
		return sinespacios;
		
	}
	
	public String alReves() {
		return new StringBuffer(Cadena).reverse().toString();
	}
	

	public boolean esPalindromo() {
	   
	    if(Cadena.equals(alReves()))
	    	return true;
		return false;
	}
	
	public int contarCaracter(char caracter) {
	    int contador = 0;
	    for (int i = 0; i < Cadena.length(); i++) {
	        if (Cadena.charAt(i) == caracter) {
	            contador++;
	        }
	    }
	    return contador;
	}
	
	// Eliminar un caracter de una cadena
		public String eliminar(char c) {
			String resultado = "";
			for (int i = 0; i < Cadena.length(); i++) {
				if(Cadena.charAt(i) != c)
					resultado+=Cadena.charAt(i);
			}
			return resultado;
		}
		
		

		// Toda la cadena en mayusculas
		public String mayusculas() {
			return Cadena.toUpperCase();
		}

		// Toda la cadena en minisculas
		public  String minusculas() {
			return Cadena.toLowerCase();
		}

		
		private  boolean esvocal(char c) {
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U')
				return true;
			return false;

		}
		private  boolean esconsonante(char c) {

			if(esvocal(c))
				return false;
			if(c>='b' && c<='z')
				return true;
			if(c>='B' && c<='Z')
				return true;
			return false;

		}
		
		public String lasVocales() {
			String vocal="";
			for (int i = 0; i < Cadena.length(); i++) {
					char c=Cadena.charAt(i);
					if(esvocal(c))
						vocal+=c;
					
			
			}
			return vocal;
		}
		
		public String lasConsonantes() {
			String conso="";
			for (int i = 0; i < Cadena.length(); i++) {
				char c=Cadena.charAt(i);
				if(esconsonante(c))
					conso+=c;
			}
			return conso;
		}
	}
	
	
	


