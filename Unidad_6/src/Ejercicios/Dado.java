package Ejercicios;

public class Dado extends Sorteo {
 
	Dado(){
		posibilidades=6;
	}
	
	public String lanzar() {
		int aleatorio=(int)(Math.random()*posibilidades+1);
		String resultado="";
		switch (aleatorio) {
		case 1:resultado="Uno";break;
		case 2:resultado="Dos";break;
		case 3:resultado="Tres";break;
		case 4:resultado="Cuatro";break;
		case 5:resultado="Cinco";break;
		case 6:resultado="Seis";break;
		
		}
		return resultado;
	}

}
