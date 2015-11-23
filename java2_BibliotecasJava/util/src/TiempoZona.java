//import java.util.Calendar;
import java.util.TimeZone;
//import java.util.GregorianCalendar;
public abstract class TiempoZona 
{

	public static void main(String[] args) 
	{
		
		//Recogemos la zona horaria del host
		TimeZone tz = TimeZone.getDefault();
				
		System.out.println("tu zona horaria es " + tz.getDisplayName());
		System.out.println("zona horaria " + tz.getID());
		//introducimos una nueva zona horaria y la mostramos
		//tz.setID(Europe/Paris);
		//System.out.println("zona horaria " + tz.getID());		
	}

}