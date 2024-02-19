package string2;

public class comparaciones4 {

	public static void main(String[] args) {
		String nombre1="abcd";
		String nombre2=new String("ABCd");
		
		System.out.println("Comparamos...");
		
		// 1. Con el metodo compareto()
		
		if (nombre1.compareTo(nombre2)==0)
			System.out.println(nombre1+" y "+nombre2+" son iguales");
		else
			System.out.println("Son distintos");

		if (nombre1.compareToIgnoreCase(nombre2)==0)
			System.out.println(nombre1+" y "+nombre2+" son iguales");
		else
			System.out.println("Son distintos");
		
		// 2. con el metodo equals()
		
		if(nombre1.equals(nombre2)==true)//no haria falta
		  System.out.println(nombre1+" y "+nombre2+" son iguales");
		else
			System.out.println("Son distintos");
		
		if(nombre1.equalsIgnoreCase(nombre2))
			  System.out.println(nombre1+" y "+nombre2+" son iguales");
			else
				System.out.println("Son distintos");
		
		// 3 con el igual ==
		if (nombre1==nombre2)
			System.out.println(nombre1+" y "+nombre2+" son iguales");
		else
			System.out.println("Son distintos");


	}

}
