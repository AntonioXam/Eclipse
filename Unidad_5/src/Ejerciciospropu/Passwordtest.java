package Ejerciciospropu;

public class Passwordtest {

	public static void main(String[] args) {
		
		Password p1=new Password();
		System.out.println("Contraseña 1: "+p1.getContraseña());
		System.out.println("Longitud: "+p1.getLongitud());
		if (p1.esFuerte()) {
			System.out.println("Es una contraseña fuerte");
		} else {
			System.out.println("Es una contraseña debil");
		}
		
		Password p2=new Password();
		System.out.println("Contraseña 2: "+p2.getContraseña());
		System.out.println("Longitud: "+p2.getLongitud());
		if (p2.esFuerte()) {
			System.out.println("Es una contraseña fuerte");
		} else {
			System.out.println("Es una contraseña debil");
		}
	}

}

