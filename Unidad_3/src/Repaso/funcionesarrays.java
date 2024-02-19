package Repaso;



public class funcionesarrays {

	
	public static boolean encontrar(int[] array,int N) {
		for (int i = 0; i < array.length; i++) {
			if (array[i]==N) {
				return true;
				
			}
		}
		return false;
		
	}
	
	public static boolean posicion(int[] array,int N,int pos) {
		for (int i = 0; i < pos; i++) {
			if (array[i]==N) {
				return true;
			}
			
		}
		return false;
		
		
	}
	
	public static void burbuja(int[] array) {
		int aux;
		for (int i = array.length; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				if (array[j]>array[j+1]) {
					aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
					
				}
				
			}
		}
		
	}
	
	public static boolean compa(int[] A,int[] B) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (A[i]!=B[j]) {
					return false;
					
					
				}
			}
			
		}
		return true;
		
	}
	
	public static boolean Primo(int N) {
		for (int i = 2; i <=N/2; i++) {
			if (N%i==0) {
				return false;
				
			}
			
		}
		return true;
		
	}
	
	 public static int mayordiv(int N) {
		 int mdiv=1;
		 for (int i = 2; i <=N/2; i++) {
			 if (N%i==0) {
				 mdiv=i;
				
			}
			
		}
		return mdiv;
		
	}
	 
	 public static long facto(int N) {
		 long fact=1;
		 for (int i = N; i >=1; i--) {
			 fact*=i;
			
		}
		return fact;
		 
		
	}
	public static void main(String[] args) {
		
		
		
	}

}
