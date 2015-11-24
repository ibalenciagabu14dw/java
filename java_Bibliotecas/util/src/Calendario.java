import java.util.Calendar;
//import java.util.GregorianCalendar;
public abstract class Calendario 
{

	public static void main(String[] args) 
	{

     Calendar calendario = Calendar.getInstance();

// Muestra en pantalla la fecha actual
		System.out.println("La fecha de hoy es: " + calendario.get(calendario.YEAR) + "/" + calendario.get(calendario.MONTH) + "/" + calendario.get(calendario.DAY_OF_MONTH));
		
		// Muestra en pantalla la hora actual
		System.out.println("La hora actual es: " + calendario.get(calendario.HOUR_OF_DAY) + ":" + calendario.get(calendario.MINUTE) + ":" + calendario.get(calendario.SECOND));
	}

    
}
