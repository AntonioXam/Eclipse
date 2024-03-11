package clas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class horas {

	private int hora;
	private int minutos;
	private int segundos;




	public horas() {
		GregorianCalendar g=new GregorianCalendar();
		Date d=new Date();
		g.setTime(d);
		hora=g.get(Calendar.HOUR_OF_DAY);
		minutos=g.get(Calendar.MINUTE);
		segundos=g.get(Calendar.SECOND);

	}

	public horas(int horas, int minutos, int segundos) {
		this.hora = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	/**
	 * @return el horas
	 */
	public int getHoras() {
		return hora;
	}

	/**
	 * @param horas el horas a establecer
	 */
	public void setHoras(int horas) {
		this.hora = horas;
	}

	/**
	 * @return el minutos
	 */
	public int getMinutos() {
		return minutos;
	}

	/**
	 * @param minutos el minutos a establecer
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	/**
	 * @return el segundos
	 */
	public int getSegundos() {
		return segundos;
	}

	/**
	 * @param segundos el segundos a establecer
	 */
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	@Override
	public String toString() {
		String formato="";
		if(hora<10)
			formato+="0"+hora+":";
		else
			formato+=hora+":";
		if(minutos<10)
			formato+="0"+minutos+":";
		else
			formato+=minutos+":";
		if(segundos<10)
			formato+="0"+segundos;
		else
			formato+=segundos;

		return formato;
	}

	public boolean horaOk() {
		if(hora<=23 && hora>=0)
			if(minutos<=59 && minutos>=0)
				if(segundos<=59 && segundos>=0)
					return true;
		return false;
	}

	public void segundoDespues() {
		segundos++;
		if(segundos>59) {
			segundos=0;
			minutos++;
			if(minutos>59) {
				minutos=0;
				hora++;
				if(hora>23) {
					hora=0;
				}
			}
		}
	}

	public void minutoDespues() {

		minutos++;
		if(minutos>59) {
			minutos=0;
			hora++;
			if(hora>23) {
				hora=0;
			}
		}
	}


	public void horaDespues() {

		hora++;
		if(hora>23) {
			hora=0;
		}
	}

	public void segundoAntes() {
		segundos-=1;
		if(segundos<0) {
			segundos=59;
			minutos-=1;
			if(minutos<0) {
				minutos=59;
				hora-=1;
				if(hora<0) {
					hora=23;
				}
			}
		}
	}




}
