package ejercicios02;

import java.util.Scanner;

public class Dos {

	public static boolean escapicua(int n) {

		int num=n;
		int u, d, c, um, dm;

		u=num%10;
		num=num/10;
		d=num%10;
		num=num/10;
		c=num%10;
		num=num/10;
		um=num%10;
		num=num/10;
		dm=num%10;

		if(dm==u && um==d) {
			return true;
		}
		if(u==um && c==d && dm==0) {
			return true;
		}
		if(dm==0 && um==0 && c==u) {
			return true;
		}
		if(dm==0 && um==0 && c==0 && d==u) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int num;
		do {
			System.out.print("Dime un numero entre 1 y 99999: ");
			num=sc.nextInt();
		} while (num<1 || num>99999);

		if(escapicua(num)==true)
			System.out.println("El numero "+num+" es capicua");
		else
			System.out.println("No es capicua");

		sc.close();
	}

}
