package polimorfismo;

public class test {

	public static void main(String[] args) {
		Persona p1;
		p1= new Empleado();
		p1.setNombre("Antonio Ibañez");
		((Empleado)p1).setSueldoBase(100);      
		
		
		Empleado e1;
		e1= new Encargado();
		e1.setSueldoBase(500);
		e1.setNombre("Pedro Sandoval");
		System.out.println(e1.getSueldoBase());

	}

}
