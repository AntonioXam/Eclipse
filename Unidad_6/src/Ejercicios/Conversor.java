package Ejercicios;

public class Conversor {

	
	private int num;

	/**
	 * @param num
	 */
	public Conversor(int num) {
		this.num = num;
	}

	/**
	 * @return el num
	 */
	public String getNumero(String letra) {
		
		if(letra.toUpperCase().equals("B"))
			return Integer.toBinaryString(num);
		if(letra.toUpperCase().equals("O"))
			return Integer.toOctalString(num);
		if(letra.toUpperCase().equals("H"))
			return Integer.toHexString(num);
		else
				return "Letra no coincide";
	
		
		
	}


	
	
}
