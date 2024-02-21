package Ahorcado;

public class AhorcadoPOO {
	
	//constantes
	public final int TOTAL_INTENTOS=10;
	
	//Atributos
	private String palabraAcertar;		//Palabra a acertar
	private String palabraMostrar;		//Palabra acercar convertida a asteriscos
	private int intentos;			
	private boolean acertada;
	
	
	/** Contructores
	 * @param palabraAcertar
	 * @param palabraMostrar
	 * @param intentos
	 * @param acertada
	 */
	public AhorcadoPOO() {
		this.palabraAcertar =generarPalabra();
		this.palabraMostrar =generarPalabraMotrar();
		this.intentos = 0;
		this.acertada = false;
	}
	
	
	
	
	
	
	private String generarPalabra() {

		String[] array={"MANDALORIANO","BABY YODA","SUSPENSO","VICTORVERDU","IMPRESORA","FILAMENTO","EXTRUSOR"};

		String palabraAleatoria=array[(int)(Math.random()*array.length)];

		return palabraAleatoria;

	}
	
	private String generarPalabraMotrar() {
		
		for (int i = 0; i < generarPalabra().length(); i++) {
			this.palabraMostrar+="*";
		}
		return palabraMostrar;
	}


	public boolean intentar(char letra) {
		for (int i = 0; i < palabraAcertar.length(); i++) {
			if(palabraAcertar.charAt(i)==letra)
				return acertada= true;

		}
		return acertada=false;
		
	
	}

	public boolean resolver(String palabra) {
		return acertada;
		
	}


	

	/**
	 * @return el tOTAL_INTENTOS
	 */
	public int getNumerodeIntentos() {
		
		int Total=TOTAL_INTENTOS;
		return Total-=intentos;
		
	}



	/**
	 * @return el palabraAcertar
	 */
	public String getPalabraAcertar() {
		return palabraAcertar;
	}



	/**
	 * @return el palabraMostrar
	 */
	public String getPalabraMostrar() {
		return palabraMostrar;
	}




	/**
	 * @return el intentos
	 */
	public int getIntentos() {
		return intentos;
	}




	/**
	 * @return el acertada
	 */
	public boolean isAcertada() {
		return acertada;
	}


	
}
