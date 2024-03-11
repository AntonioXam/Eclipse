package hour;

import java.util.Scanner;

public class horasTest {

	public static void main(String[] args) {
		
		horas horaActual= new horas();
		
		System.out.println("Hora actual: "+horaActual);
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Introduce una hora");
			System.out.print("Hora: ");
			int h=sc.nextInt();
			System.out.print("Minutos: ");
			int m=sc.nextInt();
			System.out.print("Segundos: ");
			int s=sc.nextInt();
			
			
			horas horaIntro=new horas(h,m,s);
			System.out.println("Hora introducida: "+horaIntro);
			if(!horaIntro.horaOk())
				System.out.println("La hora no es correcta");
			
			
			if(horaActual.getHoras()>horaIntro.getHoras())
				System.out.println("La hora es anterior");
			else if(horaActual.getMinutos()>horaIntro.getMinutos())
				System.out.println("La hora es anterior");
			else if(horaActual.getSegundos()>horaIntro.getSegundos())
				System.out.println("La hora es anterior");
			else if(horaActual.getHoras()<horaIntro.getHoras())
				System.out.println("La hora es posterior");
			else if(horaActual.getMinutos()<horaIntro.getMinutos())
				System.out.println("La hora es posteriro");
			else if(horaActual.getSegundos()<horaIntro.getSegundos())
				System.out.println("La hora es posterior");
			else
				System.out.println("Es la misma hora");
				
			horaIntro.segundoAntes();
			System.out.print("Segundo antes:"+horaIntro);
			
			System.out.println();
			
			horaIntro.segundoDespues();
			System.out.print("Segundo después: "+horaIntro);
			
		} catch (Exception e) {
			System.err.println("Error");
		}
		
		
		
		sc.close();
	}

}
