package ejemplos;

public class Masedad {

	public static void main(String[] args) {
		//Definimos una constante
		//Su valor no va a cambiar durante la ejecución del programa
		final int MAYORIAEDAD;
		MAYORIAEDAD=18;
		
		//Definimos una variable
		//Su valor puede cambiar durante la ejecuión del programa
		int edad;
		edad=19;
		
		/*
		 * las dos lineas anterioes son equivalentes en una única linea a lo siguiente
		 * int edad=19;
		 */
		System.out.println("Mi edad es: " +edad);
		
		//Vamos a variar el valor de la variable
		edad=edad+1;
		System.out.println("Mi edad el año que viene será: "+edad);
		
		edad=edad-2;
		System.out.println("Mi edad el año pasado será: "+edad);
		
		System.out.println("La mayoria de edad está en: "+MAYORIAEDAD+" años");
		
		edad=MAYORIAEDAD+2;
		
		System.out.println("Mi edad ahora es de :"+edad);
		System.out.println("Si la mayoria de edad subiese 10 años, estaria en: "+(MAYORIAEDAD+10)+" años.");
	


		
		
		
		

	}

}
