package Funciones;

public class TablaMultiplicardel2 {
	/**
	 * Procedimiento que visualiza la tabla de multiplicar
	 * @param num
	 */
	public static void tabla(int num) {
		System.out.println(num+" x 1 = "+(num*1));
		System.out.println(num+" x 2 = "+(num*2));
		System.out.println(num+" x 3 = "+(num*3));
		System.out.println(num+" x 4 = "+(num*4));
		System.out.println(num+" x 5 = "+(num*5));
		System.out.println(num+" x 6 = "+(num*6));
		System.out.println(num+" x 7 = "+(num*7));
		System.out.println(num+" x 8 = "+(num*8));
		System.out.println(num+" x 9 = "+(num*9));
		System.out.println(num+" x 10 = "+(num*10)+"\n");
	}
	public static void main(String[] args) {
		tabla(3);
		tabla(7);
		tabla(5);
		tabla(2);
		tabla(123);
		tabla(454363466);
		tabla((int)(Math.random()*50+(Math.random()*100)));
		

	}

}
