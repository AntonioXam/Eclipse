package Wrappers;

public class DoubleTest {

	public static void main(String[] args) {
		
		//Creamos un tipo primitivo int a partir de un String
		double x= Double.parseDouble("140.25");
		System.out.println(x);
		
		//Creamos un wrappper Integer a partir de un String
		Double y=Double.valueOf("250.6");
		System.out.println(y);
		
		//Creamos un wrapper Integer a partir de un tipo primitivo int
		Double z = Double.valueOf(9.8);
		System.out.println(z);
	}

}
