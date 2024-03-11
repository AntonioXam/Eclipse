package bol;

public class MatrizTest {

	public static void main(String[] args) {
		Matriz m= new Matriz(4);

		m.ValoresAleatorios();
		System.out.println("Matriz: ");
		System.out.println(m.toString());
		System.out.println("Numero de filas: "+m.getFilas());
		System.out.println("Numero de columnas: "+m.getColumnas());
		System.out.println("Mayor valor: "+m.obtenerMayor());
		m.mostrarPares();
		System.out.println("Nº de pares: "+m.contarPares());
		m.mostrarImpares();
		System.out.println("Nª de impares: "+m.contarImpares());
		int sumaDiagonal = 0;
		for (int j = 0; j <m.getColumnas(); j++) {
			sumaDiagonal += m.getValor(j, j);
		}
		System.out.println("La suma de la diagonal es: " + sumaDiagonal);

		m.ordenarFilas();
		System.out.println("\nMatriz ordenada por filas: ");
		System.out.println(m.toString());
	}

}
