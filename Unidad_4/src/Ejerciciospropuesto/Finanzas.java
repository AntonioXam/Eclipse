package Ejerciciospropuesto;

public class Finanzas {
	
	double cambio;
	
	 Finanzas() {
		cambio=1.36;
	}
	 
	 Finanzas(double c) {
		 cambio=c;
	 }
	
	 public double dolartoeuros(double dol) {
		return dol/cambio;
	}
	 
	 public double eurostodolar(double eur) {
		return eur*cambio;
	}
	 
	
	}
	

