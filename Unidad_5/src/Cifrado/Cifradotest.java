package Cifrado;

import java.util.Scanner;

public class Cifradotest {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		try {


		System.out.print("Texto a cifrar: ");
		String texto=sc.nextLine().trim();
		
		Mensaje m=new Mensaje(texto);
		Descifrar d=new Descifrar(m.sustitucion(3));
		
		
		System.out.println("Texto plano: "+m.getMensaje());
		System.out.println("Texto cifrado: "+m.sustitucion(3));
		System.out.println("Texto descifrado: "+d.DescifrarSustitucion(3));
		System.out.println("Texto cifrado a transposicion: "+m.transposicion());
		System.out.println("Texto descifrado de transposcion: "+d.descifrarTransposicion(m.transposicion()));
		
		
		



		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}

		sc.close();
	}



}
