package introduccion;

public class arraytest {

	public static void main(String[] args) {
		array a=new array(10);
		
		System.out.println("Longitud del array: "+a.getLongitud());
		
		for (int i = 0; i <a.getLongitud(); i++) 
			a.setValor(i+1, i);
		
		System.out.print("Valores: ");
		a.mostrarValores();
		
		
		int[] b=a.getValores();
		System.out.print("\nNuevo array: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		
		
		a.setValor(25, 9);
		System.out.print("\nValores Cambiados: ");
		a.mostrarValores();
	}

}
