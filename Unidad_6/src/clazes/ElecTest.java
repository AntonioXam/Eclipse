package clazes;

public class ElecTest {

	public static void main(String[] args) {
	
		Electrodomestico array[]=new Electrodomestico[5];
		
		array[0]=new Lavadora(200, 40, 'B', "azul", 7);
		array[1]=new Television(500, 30, 'E', "negro", 65);
		array[2]=new Lavadora();
		array[3]=new Television();
		array[4]=new Electrodomestico();
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		
		
	}

}
