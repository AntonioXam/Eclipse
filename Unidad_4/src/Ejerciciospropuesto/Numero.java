package Ejerciciospropuesto;

public class Numero {
	
	int dato;
	
	
	Numero(){
		dato=0;
	}
	
	Numero(int num){
		dato=num;
	}
	
	public void suma(int num ) {
		dato = dato+num;
	}
	
	public void resta(int num) {
		dato = dato-num;
		
	}

	public int getValor() {
		return dato;
	}

	public int getdoble() {
		return dato*2;
	}
	
	public int gettriple() {
		return dato*3;
	}
	
	public int setNumero(int num) {
		return dato=num;
	}
	

}
