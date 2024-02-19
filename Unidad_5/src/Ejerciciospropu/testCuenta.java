package Ejerciciospropu;

public class testCuenta {

	public static void main(String[] args) {
	
		
		Cuenta C=new Cuenta("Mi cuenta");
		
		System.out.println(C);
		C.ingresar(100);
		System.out.println(C);
		C.ingresar(-100);
		System.out.println(C);
		C.retirar(50);
		System.out.println(C);
		C.retirar(60);
		System.out.println(C);
		

	}

}


