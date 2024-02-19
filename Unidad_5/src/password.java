import java.util.Scanner;

public class password {

	public static void visual() {

		System.out.println(" --------------------------------------------------------------------------");
		System.out.println("|  Fortaleza de un passsword:                                              |");
		System.out.println("|  ---> Debil: si contienes menos de 8 carácteres                          |");
		System.out.println("|  ---> Moderada: si contiene, al menos 8 carácteres                       |");
		System.out.println("|  ---> Fuerte: si contiene como minimo 8 carácteres y                     |");
		System.out.println("|               cumple con dos de las siguientes condiciones:              |");
		System.out.println("|                   - 1 minuscula                                          |");
		System.out.println("|                   - 1 mayuscula                                          |");
		System.out.println("|                   - 1 numero ( del 0 al 9)                               |");
		System.out.println("|                   - 1 caracter especial                                  |");
		System.out.println("|  ---> Excelente:si contiene como minimo 8 carácteres y                   |");
		System.out.println("|                 cumple, al menos, con tres de las condiciones anteriores |");
		System.out.println(" --------------------------------------------------------------------------");

	}



	public static boolean esminus(char c) {
		if(c>='a' && c<='z')
			return true;

		return false;

	}

	public static boolean esmayus(char c) {
		if(c>='A' && c<='Z')
			return true;
		return false;

	}
	public static boolean esnum(char c) {

		if(c>=0 && c<=9)
			return true;

		return false;


	}



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			int contamMin,contaMay,contaNum,contaEsp;
			contamMin=contaMay=contaNum=contaEsp=0;
			visual();
			System.out.println();

			String contra;

			do {
				System.out.print("\nIntroduce un password: ");	
				contra=sc.nextLine().trim();
				if (contra.length()>8)
					System.out.println("La contraseña es demasiado extensa."
							+ "");
				
			} while (contra.length()>8);





			for (int i = 0; i < contra.length(); i++) {
				char c=contra.charAt(i);

				if(esminus(c))
					contamMin++;
				else if(esmayus(c))
					contaMay++;
				else if(esnum(c))
					contaNum++;
				else 
					contaEsp++;

			}

			int suma=0;
			if(contamMin>=1) suma++;
			if(contaMay>=1) suma++;
			if(contaNum>=1) suma++;
			if(contaEsp>=1) suma++;

			System.out.print("---> Fortaleza del password: ");
			if(contra.length()>=8) {
				if(suma>=3)
					System.out.println("Excelente");
				else if (suma==2)
					System.out.println("Fuerte");
				else if (suma==1)
					System.out.println("Moderada");

			}   else
				System.out.println("Débil");





		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}

		sc.close();







	}

}
