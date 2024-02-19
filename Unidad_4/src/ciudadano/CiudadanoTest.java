package ciudadano;

public class CiudadanoTest {

	public static void main(String[] args) {
		Ciudadano gay=new Ciudadano();
		System.out.print("Nombre: ");
		gay.leernombre();
		System.out.print("Sexo: ");
		gay.leersexo();
		System.out.print("Edad: ");
		gay.leeredad();
		
		if(gay.getEdad()>=18)
			System.out.println(gay.getnombre()+" es mayor de edad");
		
	}

}
