package PruebasCasa;

import java.util.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class Tiempo {
	//Atributos
	private int hora;
	private int minutos;
	private int segundos;

	//Constructores

	/**
	 * 	Constructor.
	 * @param hora
	 * @param minutos
	 * @param segundos
	 */
	public Tiempo(int hora, int minutos, int segundos) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	/**
	 * Constructor por defecto. 
	 */
	public Tiempo() {
		hora=0;
		minutos=0;
		segundos=0;
	}

	//Guetters y Setters.

	/**
	 * Devuelve la hora. 
	 * @return hora - int.
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * Establece una nueva hora.
	 * @param hora - int.
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}

	/**
	 * Devuelve los minutos contenidos en una hora.
	 * @return minutos - int.
	 */
	public int getMinutos() {
		return minutos;
	}

	/**
	 * Establece un nuevo valor para minutos.
	 * @param minutos - int.
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	/**
	 * Devuelve los segundos.
	 * @return segundos - int.
	 */
	public int getSegundos() {
		return segundos;
	}

	/**
	 * Establece un nuevo valor para segundos.
	 * @param segundos - int.
	 */
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	//toString.
	/**
	 * Método que devuelve la hora.
	 */
	@Override
	public String toString() {
		String formato="";

		if (hora<10) {
			formato+="0";
		}
		formato+=hora+":";
		if (minutos<10) {
			formato+="0";
		}
		formato+=minutos+":";
		if (segundos<10) {
			formato+="0";

		}
		formato+=segundos;

		return formato;
	}

	/**
	 * Método que comprueba si la hora es correcta o no.
	 * @return TRUE si la hora es correcta, FALSE en caso contrario.
	 */
	public boolean horaOK() {
		if (hora<=24 && hora>=0) {
			if (minutos<=59 && minutos>=0) {
				if (segundos<=59 && segundos>=0) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Metodo que muestra la hora actual
	 */
	public void horaActual() {
		Date f=new Date();
		GregorianCalendar c=new GregorianCalendar();
		c.setTime(f);
		hora=c.get(Calendar.HOUR_OF_DAY);
		minutos=c.get(Calendar.MINUTE);
		segundos=c.get(Calendar.SECOND);
	}







}
