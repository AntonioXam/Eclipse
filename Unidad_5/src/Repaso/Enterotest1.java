package Repaso;

public class Enterotest1 {

	public static void main(String[] args) {
		
		Entero e=new Entero();
		
		System.out.println(e.getNumero());
		e.setNumero(-100);
	    if (e.espositivo()) {
			System.out.println(e.getNumero()+" es positivo");
		} else {
			System.out.println(e.getNumero()+" es negativo");
		}
		System.out.println(e.getNumero());
		e.setNumero(100);
	    if (e.escero()) {
			System.out.println(e.getNumero()+" es cero");
		} else {
			System.out.println(e.getNumero()+" es distinto de cero");
		}

	}

}
