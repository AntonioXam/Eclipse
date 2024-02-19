package Funciones;

public class Bienvenida2 {
	/**
	 * Procedimiento que muestra por pantalla mensajes de saludo
	 * @param nombre
	 */
	public static void saluda(String nombre) {
		System.out.println("Hola " +nombre+"!");
		System.out.println("Bienvenido al C.E.S Vega Media");
		System.out.println("Este curso vas a aprender a programar en Java");
		System.out.println("Espero que te guste!\n");
	}

	//Programa Principal
	public static void main(String[] args) {
		saluda("Antonio");
		saluda("David");
		saluda("Jaime");
		saluda("Miguel");
		saluda("Juan Miguel");
		saluda("Natalia");
		
		
		

	}

}
