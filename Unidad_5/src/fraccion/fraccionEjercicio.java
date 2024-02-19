package fraccion;

public class fraccionEjercicio {

	public static void main(String[] args) {
		
		Fraccion x=new Fraccion(1,2);
		Fraccion y=new Fraccion(3,4);
		Fraccion z=new Fraccion(2,3);
		
		
		System.out.println("x ="+x);
		System.out.println("y ="+y);
		System.out.println("z ="+z);
		
		
		Fraccion resultado=(x.sumar(y)).multi(z);
		resultado.simplificar();
		System.out.println("(x+y)*z = "+resultado);
		
		 resultado=x.sumar(y.multi(z));
		 resultado.simplificar();
		 System.out.println("x+(y*z) = "+resultado);
		
	}

}
