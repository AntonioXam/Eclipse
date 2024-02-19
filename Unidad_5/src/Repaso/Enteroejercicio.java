package Repaso;

import java.util.Scanner;

public class Enteroejercicio {

	public static void main(String[] args) {
		
		Entero num=new Entero();
		
		Scanner sc = new Scanner(System.in);
		try {
			 
			System.out.print("Dime un número entero: ");
			num.setNumero(sc.nextInt());
			
		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}
	   
	     sc.close();
	     
	     
	     
	     System.out.println("Número: "+num.getNumero());
	     System.out.println("Doble: "+num.doble());
	     System.out.println("Triple: "+num.triple());
	     System.out.println("Mitad: "+num.mitad());
	     if (num.espar()) {
	    	 System.out.println("Es un nº par");
			
		} else {
			 System.out.println("Es un nº impar");

		}
	     System.out.println("Conversión a double: "+num.todouble());
	     
	     System.out.println("Elevado a 0: "+num.potencia(0));
	     System.out.println("Elevado a 0: "+num.potencia(1));
	     System.out.println("Elevado a 0: "+num.potencia(2));
	     System.out.println("Elevado a 0: "+num.potencia(3));
	}

}
