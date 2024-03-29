package Ejerciciospropu;

public class Password {

	private final static int LONG=8;

	//atributos

	private int longitud;
	private String contraseña;
	/**
	 * 
	 */
	public Password() {
		this.longitud=LONG;
		this.contraseña=generaPassword();
	}
	/**
	 * @param longitud
	 */
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña=generaPassword();

	}
	/**
	 * @return el longitud
	 */
	public int getLongitud() {
		return longitud;
	}
	/**
	 * @param longitud el longitud a establecer
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	/**
	 * @return el contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}


	public String generaPassword() {
		String passwd="";
		for (int i=0; i<longitud; i++) {
			// Generamos un no aleatorio según el cual eligiremos si añadir una mayúscula, una minúscula o un número
			int eleccion=(int)(Math.random()*3+1);
			switch(eleccion) {
			case 1: // Añadimos una mayúscula 'A' y 'Z' (65..90)
				char may=(char)(65+Math.random()*26);
				passwd=passwd+may;
				break;
			case 2: // Añadimos una minúscula aleatoria entre 'a’ y 'z' (97..122)
				char min=(char)(97+Math.random()*26);
				passwd=passwd+min;
				break;
			case 3: // Añadimos un dígito aleatorio entre ‘0’ y ‘9’ (48..57)
				char num=(char)(48+Math.random()*10);
				passwd=passwd+num;
				break;

			}
		}
		return passwd;
	}

	public boolean esFuerte() {
		int contaMay=0;
		int contaMin=0;
		int contanum=0;

		if (contraseña.length()<8)
			return false;

		else {

			// Recorremos la contraseña carácter a carácter
			for (int i=0; i<contraseña.length(); i++) {
				if (contraseña.charAt(i)>='a' && contraseña.charAt(i)<='z')
					contaMin++;
				else if (contraseña.charAt(i)>='A' && contraseña.charAt(i)<='Z')
					contaMay++;
				else
					contanum++;

			}
			if (contaMay>=2 && contaMin>=2 && contanum>=2)
				return true;
			return false;

		}

	}


}
