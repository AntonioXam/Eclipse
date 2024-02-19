package Cifrado;

import java.util.Scanner;

public class Mensajetest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.print("Escribe el mensaje a cifrar: ");
		String texto=sc.nextLine().trim();
		
		Mensaje m=new Mensaje(texto);
		
		System.out.println("Texto plano: "+m.getMensaje());
		
		System.out.println("Texto cifrado ROT3: "+m.sustitucion(m.CESAR));
		
		System.out.println("Texto cifradi ROT13: "+m.sustitucion(m.ROT13));
		
		System.out.println("Texto cifrado por transposicion: "+m.transposicion());
		
		
		} catch (Exception e) {
			
			System.out.println("Error");
			
		}
		sc.close();

	}

}
