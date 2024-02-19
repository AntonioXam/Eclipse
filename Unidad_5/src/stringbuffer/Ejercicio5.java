package stringbuffer;

import java.util.Scanner;

public class Ejercicio5 {

	
	private static boolean esvocal(char c) {
		
		if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ) 
			return true;
		if (c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U') 
		return true;
		
		
		return false;
	}
	
	private static boolean esconsonante(char c) {
		
		if (esvocal(c)) 
			return false;
		
		if(c>='B' && c<='Z')
			return true;
		if(c>='b' && c<='z')
			return true;
		
		return false;
		
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		try {
			
			
	
		System.out.print("Introduce una cadena de caracteres: ");
			String cadena=sc.nextLine().trim();
			
			
			 sc.close();
			 
			 
			 int vocales=0;
			 int espacios=0;
			 int consonantes=0;
			 
			 for (int i = 0; i < cadena.length(); i++) {
				 char c=cadena.charAt(i);
				 if(esvocal(c))
					 vocales++;
				 if(esconsonante(c))
					 consonantes++;
				 if(c==' ')
					 espacios++;
				
			}
			
			 
	
			 System.out.println("Vocales: "+vocales+" Espacios: "+espacios+" Consonantes: "+consonantes);
			
			
		} catch (Exception e) {
			System.out.println("ERROR!. Has introducido un valor no válido.");
		}
	   
	
	    
	
	     
	}

}
