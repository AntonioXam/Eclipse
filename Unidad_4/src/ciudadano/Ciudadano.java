package ciudadano;

import java.util.Scanner;

public class Ciudadano {
	//Atributos
	private int edad;
	private String nombre;
	private String sexo;
	
	Scanner sc=new Scanner(System.in);
	//Metodos
	
	public void leernombre() {
		nombre=sc.nextLine();
	}
	
	public void leeredad() {
		edad=sc.nextInt();
	}
	public void leersexo() {
		sexo=sc.nextLine();
	}
	public String getnombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}
	
	
}
