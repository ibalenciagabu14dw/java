import java.util.Hashtable;
import java.util.Enumeration;
public class Main 
{
	public static void main (String[] args) 
	{
		//creamos el hashtable de taxi
		Hashtable<Integer,Taxi> htaxi=new Hashtable<Integer,Taxi>();
		//crear el objeto taxi
		Taxi taxi = new Taxi();
		//asignar valores al taxi1
		taxi.setMatricula("CDG3581");
		taxi.setCompania("vallina");
		taxi.setCoste(7.54);
		taxi.setLicencia(196);
		taxi.setAntiguedad(15);
		//asignar el taxi introducido al hashtable
		htaxi.put(101,taxi);
		//asignar valores al taxi2
		taxi.setMatricula("SS1957JL");
		taxi.setCompania("donostia");
		taxi.setCoste(4.10);
		taxi.setLicencia(19);
		taxi.setAntiguedad(3);
		//asignar el taxi introducido al hashtable
		htaxi.put(102,taxi);
		
		//mostrar los datos
		//creamos un objeto de la clase Enumeration para poder leer los datos de tipo transporte taxi y autobus
		Enumeration<Integer> clavetaxi = htaxi.keys();
		System.out.println("*********TAXIS*********");
		while (clavetaxi.hasMoreElements()) 
		{
			Object clave = clavetaxi.nextElement();
			Object contenedor = htaxi.get(clave);
			
			System.out.println("\nMATRICULA: " + ((Transporte) contenedor).getMatricula());
			System.out.println("COMPANIA: " + ((Transporte) contenedor).getCompania());
			System.out.println("PRECIO: " + ((Transporte) contenedor).getCoste());
			System.out.println("LICENCIA: " + ((Taxi) contenedor).getLicencia());
			System.out.println("ANTIGUEDAD: " + ((Taxi) contenedor).getAntiguedad());
		}
				
		Hashtable<Integer,Autobus> hbus=new Hashtable<Integer,Autobus>();

		Autobus autobus = new Autobus();
		//asignar valores a autobus1
		autobus.setMatricula("CDG3581");
		autobus.setCompania("Lurraldebus");
		autobus.setCoste(7.54);
		autobus.setAsientos(196);
		autobus.setCiudadSalida("Donostia");
		autobus.setCiudadDestino("Bilbo");
		//asignar el autobus introducido al hashtable
		hbus.put(101,autobus);
		//asignar valores a autobus2
		autobus.setMatricula("SS1957JL");
		autobus.setCompania("Pesa");
		autobus.setCoste(4.10);
		autobus.setAsientos(19);
		autobus.setCiudadSalida("Donostia");
		autobus.setCiudadDestino("Pamplona");
		//asignar el autobus introducido al hashtable
		hbus.put(102,autobus);	
		
		//mostrar los datos
		//creamos un objeto de la clase Enumeration para poder leer los datos de tipo transporte taxi y autobus
		Enumeration<Integer> clavebus = hbus.keys();
		System.out.println("*********AUTOBUSES*********");
		while (clavebus.hasMoreElements()) 
		{
			Object clave = clavebus.nextElement();
			Object contenedor = hbus.get(clave);
			
			System.out.println("\nMATRICULA: " + ((Transporte) contenedor).getMatricula());
			System.out.println("COMPANIA: " + ((Transporte) contenedor).getCompania());
			System.out.println("PRECIO: " + ((Transporte) contenedor).getCoste());
			System.out.println("ASIENTOS: " + ((Autobus) contenedor).getAsientos());
			System.out.println("SALIDA: " + ((Autobus) contenedor).getCiudadSalida());
			System.out.println("LLEGADA: " + ((Autobus) contenedor).getCiudadDestino());
		}
	}
}