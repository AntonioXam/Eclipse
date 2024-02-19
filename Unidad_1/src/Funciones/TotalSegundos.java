package Funciones;

public class TotalSegundos {
	/*
	 * Funcion que devuelve los segundos, minutos y horas en total de segundos
	 */
	public static int totalsegundos (int horas, int minutos, int segundos) {
		int total;
		total=3600*horas+60*minutos+segundos;
		return total;
		
				
		
	}
	
	public static void main(String[] args) {
		int h=0, m=0,s=1;
		System.out.println(h+" horas "+m+" minutos "+s+" segundos son el total: "+totalsegundos(h,m,s)+"segundos");
		
		h=1; 
		m=5;
		s=36;
		System.out.println(h+" horas "+m+" minutos "+s+" segundos son el total: "+totalsegundos(h,m,s)+"segundos");
		
		h=7; m=55;s=54;
		System.out.println(h+" horas "+m+" minutos "+s+" segundos son el total: "+totalsegundos(h,m,s)+"segundos");

	}

}
