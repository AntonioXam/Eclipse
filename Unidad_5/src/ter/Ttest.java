package ter;

import java.util.Scanner;

public class Ttest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime una hora: ");
		int h=sc.nextInt();
		System.out.print("Dime los minutos: ");
		int m=sc.nextInt();
		System.out.print("Dime los segundos: ");
		int s=sc.nextInt();
		sc.close();
		
		T time=new T(h,m,s);
		
		if (time.horaOK()) {
			System.out.println("\nHora introducida: "+time.toString());
		}else {
			System.out.println("\nHora incorrecta.");
		}

	}

}
