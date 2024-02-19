package resueltos;

public class CocheTest {

	public static void main(String[] args) {
		Coche lambo=new Coche();
		lambo.acelera(120);
		System.out.println("Menudo carro, va a "+lambo.getvelocidad());
		lambo.frena(50);
		System.out.println("Frena que esta la guardia civil, ahora va a "+lambo.getvelocidad());

	}

}
