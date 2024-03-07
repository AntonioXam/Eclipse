package claseAbstracta;

import java.util.Scanner;

public class DoctoradoApp {

	public static void main(String[] args) {
		
		System.out.println("Introduce los datos del alumno de doctorado:");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nombre del alumno: ");
		String nombre=sc.nextLine();
		System.out.print("Horas lectivas: ");
		int horas=Integer.parseInt(sc.nextLine());
		System.out.print("Curso: ");
		String curso=sc.nextLine();
		System.out.print("Horas de dedicación a la tesis: ");
		int horasT=Integer.parseInt(sc.nextLine());
		System.out.print("Nombre de la tesis: ");
		String tesis=sc.nextLine();
		
		Doctorado doc=new Doctorado(nombre, horas, curso, horasT, tesis);
		
		System.out.println("\nLos datos introducidos son:");
		System.out.println(doc);
		
		
		
		sc.close();
	}

}
