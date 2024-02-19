package stringbuffer;

public class ejemplo1 {

	public static void main(String[] args) {
		
		//ejemplo string
		String nombre1="Rocky Balboa";
		
		nombre1.toUpperCase(); //Poner en mayusculas
		
		System.out.println(nombre1);
		System.out.println(nombre1.toUpperCase());
		nombre1=nombre1.toUpperCase();
		System.out.println(nombre1);
		
		//Ejemplos con StringBuffer
		StringBuffer nombre2=new StringBuffer("Apollo Creed");
		System.out.println(nombre2);
		nombre2.reverse(); // guardar el string al reves
		System.out.println(nombre2);
		
		String nombre3=nombre2.reverse().toString().toUpperCase(); //String aplicando 3 metodos
		System.out.println(nombre3);
		
		StringBuffer nombre4=new StringBuffer(nombre3.substring(7).toLowerCase()); //substring para empezar desde una letra indicada + lowercase para pasar a minusculas
		System.out.println(nombre4);
		
		nombre4.insert(nombre4.length(), nombre3);
		
		System.out.println(nombre4);
		
	
		
		

	}

}
