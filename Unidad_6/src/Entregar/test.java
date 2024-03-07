package Entregar;

public class test {

	public static void main(String[] args) {
		
		Serie s1=new Serie("Breaking Bad",5,"Thriller","Vince Gilligen");
		Serie s2=new Serie();
		System.out.println(s1);
		System.out.println(s2);
		
		Videojuego v1=new Videojuego("DOOM",40,"Acción","Bethesda");
		Videojuego v2=new Videojuego();
		System.out.println(v1);
		System.out.println(v2);
	}

}
