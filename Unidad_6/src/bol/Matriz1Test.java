package bol;

public class Matriz1Test {

	public static void main(String[] args) {
		Matriz1 m = new Matriz1(4);
		System.out.println("Matriz: ");
		m.generarAleatorios();
		System.out.println(m.toString());
		System.out.println("Filas: "+m.getFilas());
		System.out.println("Columnas: "+m.getColumnas());
		
		int sumadiagonal=0;
		for(int i=0; i<m.getFilas(); i++) {
		sumadiagonal+=m.getValor(i, i);
		}
		System.out.println("La suma de la diagonal es: "+sumadiagonal);
	}

}
