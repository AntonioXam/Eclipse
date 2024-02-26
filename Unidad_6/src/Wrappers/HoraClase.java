package Wrappers;



import java.util.*;

public class HoraClase {

	public static void main(String[] args) {


		Date d=new Date();
		GregorianCalendar c=new GregorianCalendar();

		c.setTime(d);
		int h=c.get(c.HOUR_OF_DAY);
		int m=c.get(c.MINUTE);
		int s=c.get(c.SECOND);

		System.out.print(h+":");
		if(m<10)
			System.out.print("0");
		System.out.print(m+":");
		if(s<10)
			System.out.print("0");
		System.out.print(s);



	}

}
