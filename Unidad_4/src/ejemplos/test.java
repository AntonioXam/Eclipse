package ejemplos;

public class test {

	public static void main(String[] args) {
		pajaro p1,p2;
		p1= new pajaro();
		p2=new pajaro(3,'a');
		
		System.out.println("Primer pájaro: ");
		p1.printedad();
		p1.printcolor();
		
		System.out.println("\nSegundo pájaro: ");
		p2.printedad();
		p2.printcolor();
		

	}

}
