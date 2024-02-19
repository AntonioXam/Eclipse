package fraccion;



public class fracciontest1 {

	public static void main(String[] args) {

		Fraccion f1=new Fraccion();
		Fraccion f2=new Fraccion(1,4);
		Fraccion f3=new Fraccion(2,0);
		Fraccion f4=new Fraccion(3,8);
		

		f1.setNumerador(5);
		f1.setDenominador(8);


		System.out.println(f1.toString());
		System.out.println(f2.toString()); // si no has definido toString en la clase mostrará la celda de memoria
		System.out.println(f3);  // si has definido toString en la clase ,al mostrarlo lo coge por defecto
		System.out.println(f4);


		System.out.println(f4.sumar(new Fraccion(1,8))); // para crear una nueva fraccion
		System.out.println(f4.restar(f3));
		
		System.out.println("Primera fraccion "+f1);
		System.out.println("Segunda fraccion "+f2);

		// sumamos fracciones

		Fraccion suma=f1.sumar(f2);
		suma.simplificar();
		System.out.println(f1+" + "+f2+" = "+suma);

		// restamos fracciones

		Fraccion resta=f1.restar(f2);
		resta.simplificar();
		System.out.println(f1+" - "+f2+" = "+resta);
		
		// multiplicamos fracciones

		Fraccion multi=f1.multi(f2);
		multi.simplificar();
		System.out.println(f1+" * "+f2+" = "+multi);
		
		// dividimos fracciones

		Fraccion divi=f1.divi(f2);
		divi.simplificar();
		System.out.println(f1+" / "+f2+" = "+divi);


	}

}
