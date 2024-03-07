package serieVideojuegos;

public class test {

	public static void main(String[] args) {

		Serie listaSeries[] = new Serie[3];
		Videojuego listaVideojuegos[] = new Videojuego[3];
		// Creamos un objeto en cada posición del array
		listaSeries[0] = new Serie();
		listaSeries[1] = new Serie("Juego de tronos", "George R. R. Martin");
		listaSeries[2] = new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan");
		listaVideojuegos[0] = new Videojuego();
		listaVideojuegos[1] = new Videojuego("Assasins Creed", "Ubisoft");
		listaVideojuegos[2] = new Videojuego("SuperMario 3DS",30,"Plataforma","Nintendo");

		// Entregramos algunos videojuegos y series
		listaSeries[1].entregar();
		listaVideojuegos[1].entregar();
		listaVideojuegos[2].entregar();

		// Para poder contar los entregables que hay disponibles y prestados,
		// utilizaremos los siguientes contadores
		int disponibles=0;
		int prestados=0;
		// Mostramos información sobre las series
		System.out.println("SERIES: ");
		for (int i=0; i< listaSeries.length; i++) {
			if (listaSeries[i].isPrestado()) {
				System.out.println(listaSeries[i].toString() + "--> PRESTADO. ");
				prestados++;
			} else {
				System.out.println(listaSeries[i].toString() + "--> DISPONIBLE. ");
				disponibles++;
			}
		}
		// Mostramos información sobre los videojuegos
		System.out.println("\nVIDEOJUEGOS: ");
		for (int i=0; i< listaVideojuegos.length; i++) {
			if (listaVideojuegos[i].isPrestado()) {
				System.out.println(listaVideojuegos[i].toString()+" --> PRESTADO. ");
				prestados++;
			} else {
				System.out.println(listaVideojuegos[i].toString()+"--> DISPONIBLE.");
				disponibles++;
			}
		}
		// Mostramos el número de entregables que están disponibles y que están prestados
		System.out.println("\nTotal disponibles: " + disponibles);
		System.out.println("Total prestados: " + prestados);
	}



}


