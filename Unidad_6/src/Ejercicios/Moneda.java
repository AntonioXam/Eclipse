package Ejercicios;

public class Moneda extends Sorteo{

	
	public Moneda() {
		posibilidades=2;
	}
	
	public String lanzar() {
		int aleatorio=(int)(Math.random()*posibilidades+1);
		if(aleatorio==1)
			return "Cara";
		return "Cruz";
	}

}
