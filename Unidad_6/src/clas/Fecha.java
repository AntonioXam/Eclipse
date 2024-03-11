package clas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {
	
	//Atributos

	private int day;
	private int month;
	private int year;
	
	
	//Constructores
	
	/**
	 * Contructor que establece la fecha a la de hoy
	 */
	public Fecha() {
		Date f=new Date();
		GregorianCalendar c=new GregorianCalendar();
		c.setTime(f);
		
		day=c.get(Calendar.DAY_OF_MONTH);
		month=c.get(Calendar.MONTH)+1;
		year=c.get(Calendar.YEAR);
	
	}


	/**Consctructor que recibe dia mes y año
	 * @param day
	 * @param month
	 * @param year
	 */
	public Fecha(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}


	/** Devuelve el day(dia)
	 * @return el day
	 */
	public int getDay() {
		return day;
	}


	/** Establece un valor para el day
	 * @param day el day a establecer
	 */
	public void setDay(int day) {
		this.day = day;
	}


	/** Devuelve month(mes)
	 * @return el month
	 */
	public int getMonth() {
		return month;
	}


	/** Establece un valor para month(mes)
	 * @param month el month a establecer
	 */
	public void setMonth(int month) {
		this.month = month;
	}


	/** Devuevle year(año)
	 * @return el year
	 */
	public int getYear() {
		return year;
	}


	/** Establece un valor para year8año)
	 * @param year el year a establecer
	 */
	public void setYear(int year) {
		this.year = year;
	}


	/**
	 *  Sobreescribe el toString y lo renombra cambiando el numero de mes por un String mes
	 */
	@Override
	public String toString() {
		String mes="";
		switch (month) {
		case 1: 
			mes+="Enero";
			break;
		case 2: 
			mes+= "Febrero";
			break;
		case 3: 
			mes+= "Marzo";
			break;
		case 4: 
			mes+= "Abril";
			break;
		case 5: 
			mes+= "Mayo";
			break;
		case 6: 
			mes+= "Junio";
			break;
		case 7: 
			mes+= "Julio";
			break;
		case 8: 
			mes+= "Agosto";
			break;
		case 9: 
			mes+= "Septiembre";
			break;
		case 10: 
			mes+= "Octubre";
			break;
		case 11: 
			mes+= "Noviembre";
			break;
		case 12: 
			mes+= "Diciembre";
			break;
		default:
			mes+= "¿¿??";
		
		
		}
		return day + " de " + mes + " de " + year;
	}
	
	
	/**
	 * Metodo que comprueba si el año es bisiesto
	 * @return
	 */
	public boolean esBisiesto() {
		if((year%4==0 && year%100 !=0) || (year%400==0))
			return true;
		return false;
	}
	
	/**
	 * Metodo que comprueba si la fecha es correcta
	 * Devuelve TRUE si es correcta o FALSE si es incorrecta
	 * @return
	 */
	public boolean isValid() {
		int diasmes=31;
		if(year==0)
			return false;
		if(month<1 || month>12) 
			return false;
		
		if(month==4 || month==6 || month==9 || month==11 )
				diasmes=30;
		if(month==2)
				diasmes=28;
		if(month==2 && esBisiesto())
				diasmes=29;
		if(day<1 || day>diasmes)
			return false;
		
		
		return true;
		
		
	}
	
	
	

}
