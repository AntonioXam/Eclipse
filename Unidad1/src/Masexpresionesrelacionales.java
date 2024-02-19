package ejemplos;

public class Masexpresionesrelacionales {

	public static void main(String[] args) {
		//Ejemplos de operadores relacionales
		System.out.println(10>5);     //true
		System.out.println(10<5);     //False
		System.out.println(10>=5);    //true
		System.out.println(10!=5);    //true

		//Ejemplos de operadores lógicos
		int a=8, b=6;
		boolean res;
		res=(a<=b)&&(a!=b);
		System.out.println(res);       //False
		
		res=(a<=b)||(a!=b);
		System.out.println(res);             //true
		System.out.println((a>b)&&(b>5));    //true
	}

}
