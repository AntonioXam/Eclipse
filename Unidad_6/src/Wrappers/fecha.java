package Wrappers;

import java.util.*
;

public class fecha {

	//Atributos
	private int dia;
	private int mes;
	private int anio;
	
	//Constructores
	public fecha() {
		dia=1;
		mes=1;
		anio=2000;
	}

	/** Contructor 
	 * @param dia
	 * @param mes
	 * @param anio
	 */
	public fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	//Metodos
	
	/** Devuelve el dia
	 * @return el dia
	 */
	public int getDia() {
		return dia;
	}

	/** Establece un valor para el  dia
	 * @param dia el dia a establecer
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/** Devuelve el mes
	 * @return el mes
	 */
	public int getMes() {
		return mes;
	}

	/** Establece un valor para el mes
	 * @param mes el mes a establecer
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/** Devuelve el año
	 * @return el año
	 */
	public int getAnio() {
		return anio;
	}

	/** Establece un valor para el año
	 * @param año el año a establecer
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	/** 
	 * Devuelve in String con la fecha en formato dd/mm/aaaa
	 */
	@Override
	public String toString() {
		String formato="";
		if(dia<10)
			formato+="0";
		formato+=dia+"/";
		if(mes<10)
			formato+="0";
		formato+=mes+"/"+anio;
		return formato;
		
	}
	
	/**
	 * Indica si una fecha es o no correcta
	 * no tiene en cuenta añis bisiestos
	 * @return TRUE si la fecha es correcta o FALSE si es incorrecta
	 */
	public boolean fechaOK() {
		int diasmes=31;
		if(anio==0)
			return false;
		if(mes<1 && mes<12) 
			return false;
		
		if(mes==4 || mes==6 || mes==9 || mes==11 )
				diasmes=30;
		if(mes==2);
				diasmes=28;
		if(dia<1 || dia>diasmes)
			return false;
		
		return true;
		
		
	}
	
	/**
	 * Establece como la fecha la fecha actual del sistema
	 */
	public void setFechaActual() {
		Date f=new Date();
		GregorianCalendar c=new GregorianCalendar();
		c.setTime(f);
		
		dia=c.get(Calendar.DAY_OF_MONTH);
		mes=c.get(Calendar.MONTH)+1;
		anio=c.get(Calendar.YEAR);
		
		
	
	}
	
	
	
}
