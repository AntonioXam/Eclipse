package polimorfismo;

public class hijo extends padre {
	private int dato;
	
	public void m() {
		System.out.println("Método clase hijo");
		super.dato=10;
		dato=20;
		
	}
	
	public void getDato() {
		System.out.println(super.dato);
		
	}
	
	public void mostrar() {
		this.m();
		m();
		super.m();
		
	}

}
