package fraccion;

import java.util.Scanner;

public class fraccionej2 {

	public static void main(String[] args) {

		Fraccion f1=new Fraccion();
		Fraccion f2=new Fraccion();

		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Primera Fraccion: ");
			System.out.print("Numerador: ");
			f1.setNumerador(sc.nextInt());
			System.out.print("Denominador: ");
			f1.setDenominador(sc.nextInt());

			System.out.println();
			
			System.out.println("Segunda Fraccion: ");
			System.out.print("Numerador: ");
			f2.setNumerador(sc.nextInt());
			System.out.print("Denominador: ");
			f2.setDenominador(sc.nextInt());


			Fraccion f11=new Fraccion(f1.getNumerador(),f1.getDenominador());
			f11.simplificar();
			Fraccion f21=new Fraccion(f2.getNumerador(),f2.getDenominador());
			f21.simplificar();
			
			
			if(f11.toString().compareTo(f21.toString())==0)
			System.out.println("Las fracciones "+f1+" y "+f2+" son EQUIVALENTES");
			else
				System.out.println("Las fracciones "+f1+" y "+f2+" NO son EQUIVALENTES");
			
			
		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}

		sc.close();
	}

}
