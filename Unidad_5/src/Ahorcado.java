
public class Ahorcado {

	
	public static String palabras() {
		
		String[] array={"MANDALORIANO","BABY YODA","SUSPENSO","VICTORVERDU","IMPRESORA","FILAMENTO","EXTRUSOR"};
		
		String palabraAleatoria=array[(int)(Math.random()*array.length)];
		
		return palabraAleatoria;
		
	}
	
	public static String cifrado(String palabra) {
		
		String cifrado="";
		for (int i = 0; i < palabras().length(); i++) {
			cifrado+="*";
			
		}
		return cifrado;
		
	}
	
	public static String descifrar(String palabra,char c) {
		return palabra;
		
	}
	
	public static void main(String[] args) {
		
		final int TOTAL_INTENTOS=10;
		int intentos=0;										
		String palabraAle=palabras();
		String palabraMotrar="";
		String cadena;
		char letra;
		boolean acerdad=false;
		
		System.out.println("---JUEGO DEL AHORCADO---\n\n");
		
		System.out.println(cifrado(palabras()));

	}

}
