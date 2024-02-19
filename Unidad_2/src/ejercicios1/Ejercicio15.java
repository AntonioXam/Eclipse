package ejercicios1;

import java.util.Scanner;

public class Ejercicio15 {

	public static String decimalaRomano(int num) {
		String res=""; int N=Math.abs(num);

		while (N>=1000) {N=N-1000;res=res+"M";}
		while (N>=900) {N=N-900;res=res+"CM";}
		while (N>=500) {N=N-500;res=res+"D";}
		while (N>=400) {N=N-400;res=res+"CD";}
		while (N>=100) {N=N-100;res=res+"C";}
		while (N>=90) {N=N-90;res=res+"XC";}
		while (N>=50) {N=N-50;res=res+"L";}
		while (N>=40) {N=N-40;res=res+"XL";}
		while (N>=10) {N=N-10;res=res+"X";}
		while (N>=9) {N=N-9;res=res+"IX";}
		while (N>=5) {N=N-5;res=res+"V";}
		while (N>=4) {N=N-4;res=res+"IV";}
		while (N>=1) {N=N-1;res=res+"I";	}

		if(num<0) res=res+" a.C.";return res;}

	public static void main(String[] args)
	{ Scanner sc = new Scanner(System.in); 
	System.out.print("Introduce un Número entrero: ");
	int romano = sc.nextInt(); 
	System.out.println(romano+" --> "+decimalaRomano(romano)); 
	sc.close(); }
}
