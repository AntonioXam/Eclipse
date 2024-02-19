package ejemplos;

public class OperadoresUnitarios {

	public static void main(String[] args) {
		int a=10;
		
		System.out.println(a);
		a++;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		a+=2;
		System.out.println(a);
		
		int b;
		b=a++;
		System.out.println("a="+a+" b="+b);            // Equivalente b=a;  a++;
		
		b=++a;
		System.out.println("a="+a+" b="+b);            // Equivalente a++; b=a;
		
	}

}
