package Boletines;

public class Matriztest {

	public static void main(String[] args) {
		
		
		Matriz m=new Matriz(4);
		m.generarValores();
		System.out.println(m.toString());
		
		System.out.println("Mayor número: "+m.mayorValor());
		System.out.println("Menor número: "+m.menorValor());
	
		System.out.println("Añadir un numero "+m.setPosicion(1, 2, 13));
		System.out.println(m.toString());
		System.out.println(" numero en la posicion (3,3)"+m.getValores(3, 3));
		
		
		

	}

}
