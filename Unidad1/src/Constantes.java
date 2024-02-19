package ejemplos;

public class Constantes {

	//Declaración e Inicializacion de la constante PI
		final static double PI=3.141592;
		
	public static void main(String[] args) {
		// Mostramos por pantalla el valor de la constante PI
		System.out.println("PI=");
		System.out.println(PI);
		
		//Dlecaración e Inicialización las variables: radio, longitud y area
		int radio=4;
		double longitud=2*PI*radio;
		double area=PI*radio*radio;
		//Mostramos los valores de las variables
		System.out.println("Radio="+radio);
		System.out.println("Longitud="+longitud);
		System.out.println("Area="+area);
		
		System.out.println("Longitud de una circunferencia de radio "+'3'+"="+(2*PI*3));
		

	}

}
