package Ejerciciospropu;

public class Persona {

	private String nombre;
	private int edad;
	private char sexo;
	private double peso;
	private double altura;
	
	
	public Persona() {
		this.nombre="";
		this.edad=0;
		this.sexo='H';
		this.peso=0;
		this.altura=0;
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso=0;
		this.altura=0;
		
		
	}
	
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad el edad a establecer
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return el sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo el sexo a establecer
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return el peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso el peso a establecer
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return el altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura el altura a establecer
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int calcularIMC() {
		
		double pesoActual=peso/(Math.pow(altura, 2));
		
		if (pesoActual>=20  && pesoActual<=25) {
			return 1;
			
		} else {
			if (pesoActual<20) {
				return -1;
			}
			return 1;
		}
	}
	
	public boolean esMayordeEdad() {
		if (edad>=18) {
			return true;
		}
		return false;
		
	}

	@Override
	public String toString() {
		String sexo;
		if (this.sexo== 'H' || this.sexo== 'h') {
			sexo="Hombre";
			
		} else {
			sexo="Mujer";
		}
		return "\nInformación de la persona: \n" + "Nombre: " + nombre + "\n"
		+ "Edad: " + edad + " años\n" + "Sexo: " + sexo + "\n"
		+ "Peso: " + peso + " kg\n" + "Altura: " + altura + " metros\n";
	}
	
	
	
	
	
}
