package RectanguloClone;

public class Rectangulo2test {

	public static void main(String[] args) {
		
		Rectangulo r1= new Rectangulo(5,7);
		Rectangulo r2= (Rectangulo)r1.clone();
		
		//Incrementamos ancho y alto para r2
		r2.incrementarAncho();
		r2.incrementarAlto();
		
		
		//Asignamos nombre a r1 y r2
		r1.setNombre("Pequeño");
		r2.setNombre("Grande");
		
		// Mostramos valores de atributos para r1
		System.out.println("Nombre: "+r1.getNombre());
		System.out.println("Alto: "+r1.getAlto());
		System.out.println("Ancho: "+r1.getAncho());
		
		// Mostramos valores de atributos para r2
		System.out.println("\nNombre: "+r2.getNombre());
		System.out.println("Alto: "+r2.getAlto());
		System.out.println("Ancho: "+r2.getAncho());
		
		
		
	}

}
