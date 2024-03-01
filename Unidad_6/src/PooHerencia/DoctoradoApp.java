package PooHerencia;

import java.util.Scanner;

public class DoctoradoApp {

	public static void main(String[] args) {
		
		System.out.println("Introduce los datos del alumno de doctorado:");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nombre del alumno: ");
		String nombre=sc.nextLine();
		System.out.print("\nHoras lectivas: ");
		int horas=sc.nextInt();
		System.out.print("\nCurso: ");
		String curso=sc.nextLine();
		System.out.print("\nHoras de dedicación a la tesis: ");
		int horasT=sc.nextInt();
		System.out.print("\nNombre de la tesis: ");
		String tesis=sc.nextLine();
		
		Doctorado doc=new Doctorado(nombre, horas, curso, horasT, tesis);
		
		System.out.println("\nLos datos intro");
		
		
		
		sc.close();
	}

}
