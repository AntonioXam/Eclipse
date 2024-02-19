package string.ejemplos;

public class Comparaciones {

	public static void main(String[] args) {
		String nombre1="Juan";
		String nombre2=new String("JUAN");
		String nombre3="Aurelio";
		
		System.out.println("COmparamos...");
		
		/*
		 * 1. COn el método compareTo()
		 */
		System.out.println(nombre1.compareTo(nombre2));//SI devuelve 0 son iguales los strings 
		//Sirve para saber si son iguales
		System.out.println(nombre1.compareTo(nombre3));
		//Los numeros que aparecen es la distancia que se llevan de codigo ASCII
		
		if(nombre1.compareTo(nombre2)==0)
			System.out.println(nombre1+" y "+nombre2+" son iguales");
		else 
			System.out.println(nombre1+" y "+nombre2+" no son iguales ");
		
		/*
		 * 2. COn el método compareToIgnoreCase() para que no tenga en cuenta mayusculas y min 
		 */
		if(nombre1.compareToIgnoreCase(nombre2)==0)
			System.out.println(nombre1+" y "+nombre2+" son iguales");
		else 
			System.out.println(nombre1+" y "+nombre2+" no son iguales ");
		
		
		/*
		 * 3.Con el método equals 
		 */
		if(nombre1.equals(nombre3)==true)
			System.out.println(nombre1+" y "+nombre3+" son iguales");
		else 
			System.out.println(nombre1+" y "+nombre3+" son distintos");
		
		/*
		 * 4.Con el igual
		 */
		
	}

}
