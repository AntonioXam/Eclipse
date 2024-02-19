package Ejerciciospropuesto;

public class Consumo {

	double Kms;
	double litros;
	double vmed;
	double pgas;
	
	Consumo(){
	 Kms=litros=vmed=0;
	 pgas=1.39;
	}
	
	public double getTiempo() {
		return Kms/vmed;
		
	}
	
	public double cosumoMedio() {
		return (litros*100)/Kms;
		
	}
	
	public double consumoEuros() {
		return litros*pgas;
	}

	public void setKms(double k) {
		Kms=k;
		
	}
	
	
}
