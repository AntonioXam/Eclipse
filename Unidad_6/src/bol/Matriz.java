package bol;


public class Matriz {
	// Atributo
	private int[][] matriz;

	// Constructor
	/**
	 * Constructor por defecto
	 */
	public Matriz() {
		int filas = 3;
		int columnas = 3;
		this.matriz = new int[filas][columnas]; // Inicializa la matriz
	}
	/**
	 * Constructor con parametro de número entero
	 * @param N
	 */
	public Matriz(int N) {
		this.matriz = new int[N][N]; // Inicializa la matriz
	}

	// Método para establecer un valor en la matriz
	//public void setValor(int i, int j, int v) {
	//matriz[i][j] = v;
	//}

	// Método para obtener un valor de la matriz
	/**
	 * Devuelve un valor para la matriz
	 * @param i
	 * @param j
	 * @return
	 */
	public int getValor(int i, int j) {
		return matriz[i][j];
	}

	// Método para obtener el número de filas
	/**
	 * Devuelve un valor para las filas
	 * @return
	 */
	public int getFilas() {
		return matriz.length;
	}

	// Método para obtener el número de columnas
	/**
	 * Devuelve un valor para las columnas
	 * @return
	 */
	public int getColumnas() {
		return matriz[0].length;
	}

	// Método para llenar la matriz con valores aleatorios entre 0 y 9 usando Math.random()
	/**
	 * Método que genera aleatoriamente valores entre 0 y 9 
	 */
	public void ValoresAleatorios() {
		for (int i = 0; i < getFilas(); i++) {
			for (int j = 0; j < getColumnas(); j++) {
				int Aleatorio = (int) (Math.random() * 10); // Genera un número aleatorio entre 0 (inclusive) y 10 (exclusive)
				this.matriz[i][j] = Aleatorio;
			}
		}
	}
	// Método para ordenar cada fila de la matriz
	/**
	 * Método el cual ordena las filas de la matriz
	 */
	public void ordenarFilas() {
		for(int i=0; i<getFilas(); i++) {
			for(int j=0;j<getColumnas()-1;j++) {
				for(int k=0; k<getColumnas()-j-1;k++) {
					if(matriz[i][k]<matriz[i][k+1]) {
						int aux=matriz[i][k];
						matriz[i][k]=matriz[i][k+1];
						matriz[i][k+1]=aux;
					}
				}
			}
		}
	}
	// Método para devolver el mayor valor de la matriz
	/**
	 * Método el cual devuelve el mayor valor de la matriz
	 * @return
	 */
	public int obtenerMayor() {
		int mayor=matriz[0][0];
		for(int i=0; i<getFilas(); i++) {
			for(int j=0; j<getColumnas(); j++) {
				if(matriz[i][j]>mayor)
					mayor=matriz[i][j];
			}

		}
		return mayor;
	}
	// Método para devolver la cantidad de números pares hay en la matriz
	/**
	 * Método el cúal cuenta los números pares de la matriz
	 * @return
	 */
	public int contarPares() {
		int pares = 0;
		for (int i = 0; i < getFilas(); i++) {
			for (int j = 0; j < getColumnas(); j++) {
				if (matriz[i][j] % 2 == 0) {
					pares++;
				}
			}
		}
		return pares;
	}
	// Método para devolver la cantidad de números impares hay en la matriz
	/**
	 * Método el cúal cuenta los números impares de la matriz
	 * @return
	 */
	public int contarImpares() {
		int impares = 0;
		for (int i = 0; i < getFilas(); i++) {
			for (int j = 0; j < getColumnas(); j++) {
				if (matriz[i][j] % 2 != 0) {
					impares++;
				}
			}
		}
		return impares;
	}

	// Método para obtener una cadena con los números pares en la matriz
    // Método para mostrar los números pares en la matriz
	/**
	 * Método para mostrar los números pares de la matriz 
	 */
    public void mostrarPares() {
        System.out.print("Números pares en la matriz: ");
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
	
    // Método para obtener una cadena con los números pares en la matriz
    // Método para mostrar los números pares en la matriz
    /**
     * Método para mostrar los números impares de la matriz
     */
    public void mostrarImpares() {
        System.out.print("Números impares en la matriz: ");
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
                if (matriz[i][j] % 2 != 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
	// Sobrescribir el método toString para imprimir la matriz
    /**
     * Método el cúal devuelve la matriz como una cadena para imprimirla por pantalla
     */
	@Override
	public String toString() {
		String Cadena = "";
		for (int i = 0; i < getFilas(); i++) {
			for (int j = 0; j < getColumnas(); j++) {
				Cadena += matriz[i][j] + "\t";
			}
			Cadena += "\n";
		}
		return Cadena;
	}
}



