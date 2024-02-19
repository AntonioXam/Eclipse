package ejemplos;

public class pajaro {
	
	// atributos y propiedades
	private int edad;
	private char color;
	
	// Metodos de la clase
	/**
	 *  constructor de la calse
	 * @param e
	 */
	
	pajaro() {
		color= 'v';
		edad=0;
	}
	
	pajaro(int e,char c) {
		edad=e;
		color=c;
		
	}
	public void setedad(int  e) {
		edad=e;
		
	}
	
	public void printedad() {
		System.out.println("Edad: "+edad);
		
	}
	
	public void setcolor(char c) {
		color=c;
		
	}
	
	// colores de los pajaros
	public void printcolor() {
		switch (color) {
		case 'v':System.out.println("Verde");break;
		case 'a':System.out.println("Amarillo");break;
		case 'g':System.out.println("Gris");break;
		case 'n':System.out.println("Negro");break;
		case 'b':System.out.println("Blanco");break;
		default:System.out.println("Color no establecido");
		}
		
	}
	
	
	

}
