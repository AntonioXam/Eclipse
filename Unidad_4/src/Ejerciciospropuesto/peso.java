package Ejerciciospropuesto;

public class peso {

	double pesokilogramos;
	
	peso(double p,String medida){
		p=pesokilogramos;
		if (medida == "Lb") 
			p=p/getLibras();
		if (medida == "Li") 
			p=p/getLingotes();
		if (medida == "Oz") 
			p=p/getOnzas();
		if (medida == "P") 
			p=p/getPeniques();
		if (medida == "G"); 
			p=p/1000;
		if (medida == "Q") 
			p=p/getQuintales();	
			
	}
	

		
		public double getLibras() {
			return pesokilogramos/0.453;

			}
		
			public double getLingotes() {
			return pesokilogramos/14.59;

			}
			
			public double getOnzas() {
			return pesokilogramos/0.02835;

			}
			
			public double getPeniques() {
			return pesokilogramos/0.00155;

			}
			
			public double getQuintales() {
			return pesokilogramos/43.3;

			}
			
			public double getPeso(String medida) {
				if (medida == "Lb") // Libras
				return getLibras();
				if (medida == "Li") // Lingotes
				return getLingotes();
				if (medida == "Oz") // Onzas
				return getOnzas();
				if (medida == "P") // Peniques
				return getPeniques();
				if (medida == "K") // Kilogramos
				return pesokilogramos;
				if (medida == "G") // Gramos
				return pesokilogramos*1000;
				if (medida == "Q") // Quintales
				return getQuintales();
				return 0;
				}
}
