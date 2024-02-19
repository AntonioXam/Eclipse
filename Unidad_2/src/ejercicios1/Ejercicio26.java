package ejercicios1;

import java.util.Scanner;

public class Ejercicio26 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		try {
			 
			int num,mayor,menor;
			
			do {
				System.out.print("Introduce numeros entre -100 y 100: ");
				num=sc.nextInt();
				
			} while (num<-100 || num>100);
			
			mayor=menor=num;
			
			while (num!=0) {
				if (num>=-100 && num<=100) {
				
				if (num>mayor) 
					mayor=num;
				if (num<menor)
					menor=num;
				} else {
					System.out.println("No es un numero en el intervalo");
				}
				System.out.print("dame otro numero: ");
				num=sc.nextInt();
				
			}
			
			System.out.println("> El mayor numero es: "+mayor);
			System.out.println("> El menor numero es: "+menor);
			System.out.println("> Media= "+"("+menor+" + "+mayor+")/2 = "+(float)(menor+mayor)/2);
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}
	   
	     sc.close();

	}

}
