package Ejerciciospropu;

public class Libro {

	//Atritbutos
	
	private String ISBN;
	private String titulo;
	private String autor;
	private int numpaginas;
	/**
	 * @param iSBN
	 * @param titulo
	 * @param autor
	 * @param numpaginas
	 */
	public Libro(String iSBN, String titulo, String autor, int numpaginas) {
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numpaginas = numpaginas;
	}
	/**
	 * @return el iSBN
	 */
	public String getISBN() {
		return ISBN;
	}
	/**
	 * @param iSBN el iSBN a establecer
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	/**
	 * @return el titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo el titulo a establecer
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return el autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor el autor a establecer
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return el numpaginas
	 */
	public int getNumpaginas() {
		return numpaginas;
	}
	/**
	 * @param numpaginas el numpaginas a establecer
	 */
	public void setNumpaginas(int numpaginas) {
		this.numpaginas = numpaginas;
	}
	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN " + ISBN + " creado por el autor " +
				autor + " tiene " + numpaginas + " páginas";
	}

	
			
			
		
	}
	

