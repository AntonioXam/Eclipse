package Repaso;

import java.util.Scanner;

public class Ej23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	     try {
	    	 int conta = 0;
	    	 int suma = 0;
	    	 System.out.print("Introduce un número: "); 
    		 int num = sc.nextInt();
	    	
	    	 while (num>=0) {
	    		 suma+=num;   
	    		 System.out.print("Dame otro número: "); 
	    		 num = sc.nextInt();
	    		 conta++;
	            
	             
			}
	    	 
	    	 System.out.println("La media de los números es: "+(float)(suma/conta));
	    	
	    	 
		} catch (Exception e) {
			System.out.println("ERROR");
		}
	     sc.close();
	}

}
