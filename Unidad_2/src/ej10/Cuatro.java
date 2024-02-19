package ej10;

import java.util.Scanner;

public class Cuatro {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		try {
			int d,m,a;
			int dias_del_mes=0; // Variable que almacenará el no de días que tiene el mes (28, 30 o 31)
			System.out.print("Introduce un día: ");
			d=teclado.nextInt();
			System.out.print("Introduce un mes: ");
			m=teclado.nextInt();
			System.out.print("Introduce un año: ");
			a=teclado.nextInt();
			// Si la fecha introducida no es correcta, mostramos mensaje de error
			if (!Tres.fecha(d,m,a)) {
				System.out.println("ERROR. Has introducido una fecha incorrecta");
			}
			// Si la fecha introducida es correcta, mostramos por pantalla la fecha del día siguiente
			else {
				// Número de días del mes
				if (m==2)
					dias_del_mes=28;
				if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12 )
					dias_del_mes=31;
				if (m==4 || m==6 || m==9 || m==11)
					dias_del_mes=30;
				// Calculamos la fecha del día siguiente
				// Incrementamos el número de días del mes
				d++;
				// Si el día supera el número de días del mes,
				// lo reiniciamos a 1 e incrementamos el mes
				if (d>dias_del_mes) {
					m++;
					d=1;
					// Si el mes supera 12, lo reiniciamos a 1 e incrementamos el año
					if (m>12) {
						a++;
						m=1;
					}
				}
				// El año 0 nunca existió, y se pasó del -1 al 1,
				// en el caso de que el año se haya incrementado y pasado a 0, habrá que corregirlo
				if (a==0)
					a++;
				System.out.println("Fecha del día siguiente: "+d+"/"+m+"/"+a);
			}
		} catch (Exception e) {
			System.out.println("ERROR: No has introducido un valor válido.");
		}
		teclado.close();

	}

}
