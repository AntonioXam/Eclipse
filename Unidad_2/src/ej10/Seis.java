package ej10;

import java.util.Scanner;

public class Seis {

	public static void main(String[] args) {
		
		int cero=0, posi=0, nega=0, sumaPosit=0, sumaNega=0;

		Scanner sc = new Scanner (System.in);

		for(int i=1; i<=10; i++) {
			System.out.print("Dime un número: ");
			int num=sc.nextInt();
			
			if(num>0) {
				sumaPosit+=num;
				posi++;
			}else if(num<0) {
				sumaNega+=num;
				nega++;
			}else {
				cero++;
			}
		}
		if(posi>0)
		System.out.println("La media de los numeros positivos es: "+((float)sumaPosit/posi));
		if(nega>0)
		System.out.println("La media de los numeros negativos es: "+((float)sumaNega/nega));
		if(cero>0)
		System.out.println("Has introducido "+cero+" ceros");
		
		sc.close();
	}

}
