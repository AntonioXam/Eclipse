package Wrappers;



import java.util.Calendar;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Edad2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        // Obtener la fecha actual usando GregorianCalendar directamente
        GregorianCalendar hoy = new GregorianCalendar();
        
        int dhoy = hoy.get(Calendar.DAY_OF_MONTH);
        // Corrección: Calendar.MONTH comienza desde 0, por lo tanto, se suma 1 para el mes actual
        int mhoy = hoy.get(Calendar.MONTH) + 1;
        int ahoy = hoy.get(Calendar.YEAR);
        
    
        System.out.println("Fecha de hoy: "+dhoy+"/"+mhoy+"/"+ahoy );
        
        try {
            System.out.println("Dime tu fecha de nacimiento:");
            System.out.print("Dia: ");
            int dia = sc.nextInt();
            System.out.print("Mes: ");
            int mes = sc.nextInt();
            System.out.print("Año: ");
            int año = sc.nextInt();
            
           
            int edad = ahoy - año;
            // Si el mes actual es menor que el mes de nacimiento o si es el mismo mes pero el día actual es menor, restar 1
            if (mes > mhoy || (mes == mhoy && dia > dhoy)) {
                edad--;
            }
            
            System.out.println("Tienes " + edad + " años");
            
        } catch (Exception e) {
            
            System.out.println("ERROR! Has introducido un valor no válido: ");
        
           
            sc.close();
        }
    }
}
