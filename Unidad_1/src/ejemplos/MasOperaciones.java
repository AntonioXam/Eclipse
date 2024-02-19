package ejemplos;

public class MasOperaciones {

	public static void main(String[] args) {
		int x=3, y=8;
		
		/**
		 * int x, y;
		 * x=3;
		 * y=8;
		 * 
		 * int x=3;
		 * int y=8;
		 * 
		 */
		
		System.out.println("x="+x+" y="+y);
		x++;
		y--;
		System.out.println("\nx="+x+" y="+y);
		x+=y;
		System.out.println("\nx="+x+" y="+y);
		x-=3;
		y*=2;
		System.out.println("\nx="+x+" y="+y);
	}

}
