package Ejerciciospropuesto;

public class FinanzasTest {

	public static void main(String[] args) {
		Finanzas f=new Finanzas();
		double midolares =50;
		double mieuros = f.dolartoeuros(midolares);
		System.out.println(midolares);
		System.out.println(mieuros);
		System.out.println(f.eurostodolar(mieuros));
				
	}

}
