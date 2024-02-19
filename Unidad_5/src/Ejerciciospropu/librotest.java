package Ejerciciospropu;

public class librotest {

	public static void main(String[] args) {
		
		Libro libor1=new Libro("12312412","Titulo1","autor1",30);
		Libro libor2=new Libro("12312412","Titulo2","autor1",60);
		Libro libor3=new Libro("12312412","Titulo3","autor1",80);
		Libro libor4=new Libro("12312412","Titulo4","autor1",200);
		
		System.out.println(libor1.toString());
		System.out.println(libor4.toString());
		
		
		libor1.setNumpaginas(70);
		
		if (libor1.getNumpaginas()>libor2.getNumpaginas()) {
			System.out.println(libor1.getTitulo()+" tiene mas paginas que "+libor2.getTitulo());
			
		} else {
			System.out.println(libor2.getTitulo()+" tiene mas paginas que "+libor1.getTitulo());
		}

	}

}
