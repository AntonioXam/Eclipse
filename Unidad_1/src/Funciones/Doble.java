package Funciones;

public class Doble {
	/**
	 * Funciones para devolver un número , su doble , su triple y su mitad.
	 * @param num  declarar el número 
	 * @return
	 */
	public static int doble(int num) {
		int resultado= num*2;
		return resultado;
	}
	/**
	 * devolver el número anterior y devolver su triple.
	 * @param num
	 * @return
	 */
	public static int triple(int num) {
		return 3*num;

	}

	/**
	 * Devolver el número anterior y devolver su mitad.
	 * @param num
	 * @return
	 */
	public static double mitad(int num)  { 

		return (double) (num/2.0);

	}
	public static void main(String[] args) {
		int numero=6;
		System.out.println(numero+" Su doble es: "+doble(numero));
		System.out.println(numero+" Su triple es: "+triple(numero));
		System.out.println(numero+" Su mitad es: "+mitad(numero)+"\n");

		int numero1=45;
		System.out.println(numero1+" Su doble es: "+doble(numero1));
		System.out.println(numero1+" Su triple es: "+triple(numero1));
		System.out.println(numero1+" Su mitad es: "+mitad(numero1)+"\n");

		int numero11=675;
		System.out.println(numero11+" Su doble es: "+doble(numero11));
		System.out.println(numero11+" Su triple es: "+triple(numero11));
		System.out.println(numero11+" Su mitad es: "+mitad(numero11)+"\n");







	}

}
