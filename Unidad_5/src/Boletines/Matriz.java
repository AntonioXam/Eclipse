package Boletines;



public class Matriz {

	//atributo

	private int[][] valores;

	/** Constructor
	 * 
	 * @param matriz
	 */
	public Matriz() {
		valores=new int[3][3];
	}


	public Matriz(int n) {
		valores=new int[n][n];
	}

	public Matriz(int n,int m) {
		valores=new int[n][m];
	}

	public int Filasm() {

		return valores.length;
	}
	public int Columnam() {

		return valores[0].length;
	}



	public void generarValores() {
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) 

				valores[i][j]=(int)(Math.random()*10);


		}
	}

	public int mayorValor() {
		int mayor=valores[0][0];

		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				if (valores[i][j]>mayor) {
					mayor=valores[i][j];
				}
			}

		}
		return mayor;


	}

	public int menorValor() {

		int menor=valores[0][0];
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				if (valores[i][j]<menor) {
					menor=valores[i][j];
				}
			} 
		}
		return menor;

	}


	@Override
	public String toString() {
		String matriz="";
		for (int i = 0; i < valores.length; i++) {
			{for (int j = 0; j < valores[i].length; j++) 
				matriz=matriz+valores[i][j]+"\t";

			}
			matriz=matriz+"\n";
		}

		return matriz;


	}

	public int setPosicion(int n,int m,int v){
		if (n<Filasm() && m<Columnam()) {
			return -1;
		}
		return valores[n][m]=v;

	}

	public int getValores(int n,int m) {
		if (n<Filasm() && m<Columnam()) {
			return -1;
		}
		return valores[n][m];
	}

}





