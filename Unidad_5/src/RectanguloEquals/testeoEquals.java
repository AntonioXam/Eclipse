package RectanguloEquals;

public class testeoEquals {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo(5, 7);
		Rectangulo r2= new Rectangulo(5, 7);
		Rectangulo r3= r1;
		
		if (r1.equals(r2)) 
			System.out.println("Iguales r1 y r2 (equals).");		
		if (r1.equals(r3)) 
			System.out.println("Iguales r1 y r3 (equals).");
		

	}

}
