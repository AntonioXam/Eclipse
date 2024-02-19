package password;

public class Password {
	//Atributos 
	private int longitud=8;
	private String contraseña;
	
	/**
	 * Constructor por defecto 
	 */
	public Password() {
		contraseña=generarPassword();
	}
	
	public Password(int lon) {
		longitud=lon;
		contraseña=generarPassword();
	}
	
	//Métodos

	public String generarPassword() {
		StringBuffer p=new StringBuffer();
		int tombola;
		for(int i=0; i<longitud; i++) {
			//para generar el num del 1 al 3, y que elija qué generar 
			tombola=(int)(Math.random()*3+1);
			if(tombola==1)
				//Genera letra minúscula 'a'....'z' (97...122)
				p.append((char)(97+Math.random()*26));			
				
			else if(tombola==2)
				//Genera letra mayuscula 'A'...'Z'(65...90)
				p.append((char)(65+Math.random()*26));
			else
				//Genera número 0 al 9 (48...57)
				p.append((char)(48+Math.random()*10));
		}
		return p.toString();
		
	}
	
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}

}
