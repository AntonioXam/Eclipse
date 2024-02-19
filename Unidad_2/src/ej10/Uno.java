package ej10;

import java.util.Scanner;

public class Uno {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int u,d,c, num;
		try {
			do {
				System.out.print("Introduce un número: ");
				num=sc.nextInt();
			}while(num<1 || num>999);
			
			u=num%10;
			num=num/10;
			d=num%10;
			num=num/10;
			c=num%10;

			if(c==0 && d==0) {
				System.out.println(u);
			}else if(c==0) {
				System.out.println(u+""+d);
			}else {
				System.out.println(u+""+d+""+c);
			}

		} catch (Exception e) {
			System.out.println("Error");
		}

		sc.close();
	}

}
