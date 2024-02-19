package Funciones;

public class Longitudfuncion {

	final public static double PI=3.14;

	public static double Longitud (int r) {
		double resultado;
		resultado=2*PI*r;
		return resultado;
	}
	public static double Radio (int r)  {
		return PI*r*r;

	}


	public static void main(String[] args) {

		int radio=7;

		System.out.println("La longitud de "+radio+" es: "+Longitud(radio));
		System.out.println("El radio de "+radio+" es: "+Radio(radio));




	}

}
