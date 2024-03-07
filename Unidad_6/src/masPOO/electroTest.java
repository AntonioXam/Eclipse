package masPOO;

public class electroTest {

	public static void main(String[] args) {
		
		// Creamos un array de Electrodomesticos
		Electrodomestico arrayElectro[]= new Electrodomestico[5];
		
		arrayElectro[0]=new Electrodomestico(200,60,'C',"verde");
		arrayElectro[1]=new Lavadora(250,30);
		arrayElectro[2]=new Television(500,80,'E',"negro",65);
		arrayElectro[3]=new Electrodomestico();
		arrayElectro[4]=new Television(250,70);
		
		double precioTotal=0;
		
		for (int i = 0; i < arrayElectro.length; i++) {
			System.out.println(arrayElectro[i]);
			precioTotal+=arrayElectro[i].precioFinal();
		}

		System.out.println("\nPrecio de todos los electrodomesticos= "+precioTotal);
	}

}
