package Wrappers;

import java.util.*
;

public class Fecha {

	//Atributos
	private int dia;
	private int mes;
	private int anio;
	
	//Constructores
	public Fecha() {
		dia=1;
		mes=1;
		anio=2000;
	}

	/** Contructor 
	 * @param dia
	 * @param mes
	 * @param anio
	 */
	public Fecha(int dia, int mes, int anio) {
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
		if(mes<1 || mes<12) 
			return false;
		
		if(mes==4 || mes==6 || mes==9 || mes==11 )
				diasmes=30;
		if(mes==2)
				diasmes=28;
		if(mes==2 && esBisiesto())
				diasmes=29;
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
	
	public boolean esBisiesto() {
		if((anio%4==0 && anio%100 !=0) || (anio%400==0))
			return true;
		return false;
	}
	
	public  int diasMes(int mes) {
		int diasmes=31;
		if (mes<1 || mes>12) {
			diasmes=0;
		}
		if (mes==4 || mes==6 || mes==9 || mes==11) {
			diasmes=30;
		}if (mes==2) {
			
			diasmes=28;
		}
		if(mes==2 && esBisiesto()) {
			diasmes=29;
		}
		return diasmes;
		
	}
	public  int contarDias() {
		int suma=0;
		for (int i = 1; i < mes; i++) {
			suma+=diasMes(i);
		}
		suma+=dia;
		if(mes==2 && esBisiesto())
			suma++;
		return suma;
		
	}
	
	 public void incrementarDia() {
	        // Incrementa el día directamente
	        dia++;

	        // Verifica si el día excede el último día del mes actual
	        if (dia > diasMes(mes)) {
	            dia = 1; // Reinicia el día a 1
	            mes++; // Incrementa el mes
	            if (mes > 12) { // Si el mes excede diciembre, incrementa el año y reinicia mes a enero
	                mes = 1;
	                anio++;
	            }
	        }
	    }

	 
	 
	 public boolean esAntesQue(Fecha otraFecha) {
		    if (this.anio < otraFecha.anio) return true;
		    if (this.anio > otraFecha.anio) return false;
		    // Los años son iguales, comparamos los meses
		    if (this.mes < otraFecha.mes) return true;
		    if (this.mes > otraFecha.mes) return false;
		    // Los meses son iguales, comparamos los días
		    return this.dia < otraFecha.dia;
		}

		public boolean esDespuesQue(Fecha otraFecha) {
		    if (this.anio > otraFecha.anio) return true;
		    if (this.anio < otraFecha.anio) return false;
		    // Los años son iguales, comparamos los meses
		    if (this.mes > otraFecha.mes) return true;
		    if (this.mes < otraFecha.mes) return false;
		    // Los meses son iguales, comparamos los días
		    return this.dia > otraFecha.dia;
		}
	
}
