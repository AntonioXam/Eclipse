package Repaso;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un numero: ");
	     int num = sc.nextInt();
	     
	     
	     if (num>0) {
	    	 System.out.println("Num\tDoble\tTiple");
	    	 for (int i = 1; i<=num; i++) {
	    		 System.out.println(i+"\t"+(i*2)+"\t"+(i*3));
	    		 
				
			}
			
		} else {
			System.out.println("Numero no valido.");
		}
	     sc.close();
	}

}
