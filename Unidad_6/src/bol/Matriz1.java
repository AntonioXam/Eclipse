package bol;

public class Matriz1 {
	// Atributo
	int matriz[][];
	
	// Constructores
	/**
	 * Constructor
	 */
	public Matriz1() {
		int filas=3;
		int columnas=3;
		matriz= new int[filas][columnas];
	}
	/**
	 * Constructor 
	 * @param N - Número entero
	 */
	public Matriz1(int N) {
		matriz=new int[N][N];
	}

	public void setValores(int i, int j, int v) {
		matriz[i][j]=v;
	}
	
	public int getValor(int i, int j) {
		return matriz[i][j];
	}
	
	public int getFilas() {
		return matriz.length;
	}
	
	public int getColumnas() {
		return matriz[0].length;
	}
	
	public void generarAleatorios() {
		for(int i=0; i<getFilas(); i++)
			for(int j=0; j<getColumnas(); j++) {
				int aleatorios=(int)(Math.random()*10);
				matriz[i][j]=aleatorios;
			}
	}
	@Override
	public String toString() {
		String cadena="";
		for(int i=0; i<getFilas(); i++) {
			for(int j=0; j<getColumnas(); j++) {
				cadena=cadena+matriz[i][j]+"\t";
			}
			cadena= cadena+"\n";
		}
		return cadena;
	}
	
	
}
