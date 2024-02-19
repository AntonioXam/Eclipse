package Arrays;

public class Funciones_array {

	public static void imprime(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	}
	
	public static void inverso(int array[]) {
		for (int i = array.length-1; i >=0; i--) {
			System.out.print(array[i]+" ");
		}
	
		
	}
	
	public static void imprimeTamaño(int array[],int tam) {
		 for (int i = 0; i < tam; i++) {
				System.out.print(array[i]+" ");
			}
	}
	
	public static void inversoTamaño(int array[],int tam) {
		 for (int i =tam-1; i >=0; i--) {
				System.out.print(array[i]+" ");
			}
	}
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

	}

}
