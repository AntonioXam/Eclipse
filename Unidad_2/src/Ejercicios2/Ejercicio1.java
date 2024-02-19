package Ejercicios2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		try {
			do {
			System.out.print("Introduce un número entero 1 y 999: ");
			  num= sc.nextInt();
			} while (num<1 || num>999);
			
			int u,d,c;
			
			u=num%10;
			
			num=num/10;
			d=num%10;
			
			num=num/10;
			c=num%10;
			
			if (c==0 && d==0) {
				System.out.print(u);
			} else if(c==0) {
				System.out.print(u+""+d);
				
			} else {
				System.out.print(""+u+d+c);
			}
			
		} catch (Exception e) {
			System.out.println("Error!!");
		}
	    sc.close();
	}

}
