package tiendaShell;

import java.util.Date;
import java.util.GregorianCalendar;

public class Peueba {

	public static void main(String[] args) {
		Date calendar = new Date();
		System.out.println(calendar.toString());
		System.out.println(calendar.getDate());
		System.out.println(calendar.getMonth());
		System.out.println(calendar.getYear());
		GregorianCalendar calendario= new GregorianCalendar();
		System.out.println(calendario.toString());
		System.out.println(calendario.DATE);
		
		
	}

}
