package empleadosClase;

public class empleadoTest {

	public static void main(String[] args) {

		Empleado arrayC[]=new Comercial[4];

		arrayC[0]=new Comercial();
		arrayC[1]=new Comercial("Antonio",34,1500,250);
		arrayC[2]=new Comercial("Pedro",25,1000,10);
		arrayC[3]=new Comercial("Adri",32,500,0);

		Empleado arrayR[]=new Repartidor[4];

		arrayR[0]=new Repartidor();
		arrayR[1]=new Repartidor("Anto",22,700,"zona 1");
		arrayR[2]=new Repartidor("Miguel",27,500,"zona 2");
		arrayR[3]=new Repartidor("Manuel",26,800,"zona 3");


		for (int i = 0; i < arrayC.length; i++) {
			System.out.print(arrayC[i].toString());
			if (arrayC[i].plus()) {
				System.out.print(" --> se le aplicó el plus.");
			}
		}
		System.out.println();
		
		for (int i = 0; i < arrayR.length; i++) {
			System.out.print(arrayR[i].toString());
			if (arrayR[i].plus()) {
				System.out.print(" --> se le aplicó el plus.");
			}
		}


	}

}
