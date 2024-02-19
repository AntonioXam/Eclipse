package pruebascasa;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int altura=0;
		
		try {
			do {
				System.out.print("Introduce un numero entero: ");
				altura = sc.nextInt();
			
				//Indicamos que la altura introducida no está comprendido
				if(altura<3) {
					System.out.println("--> No puedes introducir un valor menor que 3.\n");
				}else if(altura>10){
					System.out.println("--> No puedes introducir un valor mayor que 10.\n");
					
				//si lo está, hacemos funcionar el programa
				}else {
					
					//La altura introducida en letras
					String letras="";
					switch(altura) {
						case 3: letras="TRES";break;
						case 4: letras="CUATRO";break;
						case 5: letras="CINCO";break;
						case 6: letras="SEIS";break;
						case 7: letras="SIETE";break;
						case 8: letras="OCHO";break;
						case 9: letras="NUEVE";break;
						case 10: letras="DIEZ";break;
					}
					
					System.out.print("\n--> "+letras);
					
					
					//Indicamos si la altura el par o no
					if(altura%2==0) {
						System.out.println("\n--> uuhh! has elegido un numero par! Magistral.");
					}else {
						System.out.println("\n--> El numero es impar. Menudo inútil.");
					}
					
					
					//Comprobamos si la altura es numero primo o no
					boolean flag=true;
					for(int i = 2; i<=altura/2; i++) {
						if(altura%i==0) {
							flag=false;
						}
					}
					
					//Mostramos si la altura es numero primo ono
					if(flag) {
						System.out.println("--> El numero es primo, menudo autentico maquina");
					}else {
						System.out.println("--> No es primo... pero tu si.");
					}
					
					
					//Calculamos y mostramos el factorial de altura
					int resultado=1;
					for(int i=altura; i>=1; i--) {
						resultado *= i;
					}
					System.out.println("--> El factorial es: "+resultado);
					
					//Calculamos y mostramos el mayor divisor de altura
					int mayord=1;
					for(int i=1; i<=altura/2; i++) {
						if(altura%i==0) {
							mayord=i;
						}
					}
					
					System.out.println("--> El mayor divisor es: "+mayord+"\n");
				}
				
				
			}while (altura<3 || altura>10);
		} catch(Exception e) {
			System.out.println("Error en la toma de datos, no has introducido un numero. Sinverguenza.");
		}
		
		sc.close();
		
		
		//PIRÁMIDE NORMAL
		for(int i=1; i<=altura; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		//EXTRAAAAAAAA!!!
		for(int i=1; i<=altura; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		//PIRÁMIDE NORMAL INVERTIDA
		for(int i=altura; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		System.out.println();
		
		
		//UNIÓN DE AMBAS PIRÁMIDES
		for(int i=1; i<=altura; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=altura-1; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		/***********************************************************************
		 ***********************************************************************
		 ***********************************************************************
		 ***********************************************************************/
		
		//PIRÁMIDE CON ESPACIOS
		for(int i=1; i<=altura; i++) {
			for(int m=altura; m>i; m--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		System.out.println();
		
		//PIRÁMIDE CON ESPACIOS INVERTIDA
		for(int i=altura; i>=1; i--) {
			for(int m=altura; m>i; m--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		//UNIÓN DE AMBAS PIRÁMIDES
		for(int i=1; i<=altura; i++) {
			for(int m=altura; m>i; m--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		for(int i=altura-1; i>=1; i--) {
			for(int m=altura; m>i; m--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		/***********************************************************************
		 ***********************************************************************
		 ***********************************************************************
		 ***********************************************************************/
		
		//ARBOL NAVIDAD
		for(int i=1; i<=altura; i++) {
			for(int m=altura; m>i; m--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		System.out.println();
		
		//ARBOL NAVIDAD INVERTIDO
		for(int i=altura; i>=1; i--) {
			for(int m=altura; m>i; m--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		System.out.println();
		
		//UNIÓN DE AMBOS ARBOLES
		for(int i=1; i<=altura; i++) {
			for(int m=altura; m>i; m--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		for(int i=altura-1; i>=1; i--) {
			for(int m=altura; m>i; m--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}