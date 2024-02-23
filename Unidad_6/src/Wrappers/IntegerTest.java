package Wrappers;

public class IntegerTest {

	public static void main(String[] args) {
		
		//Creamos un tipo primitivo int a partir de un String
		int x= Integer.parseInt("100");
		System.out.println(x);
		
		//Creamos un wrappper Integer a partir de un String
		Integer y=Integer.valueOf("200");
		System.out.println(y);
		
		//Creamos un wrapper Integer a partir de un tipo primitivo int
		Integer z = Integer.valueOf(300);
		System.out.println(z);

	}

}
