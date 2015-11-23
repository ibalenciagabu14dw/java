package java2_Modificadores2;

public class Main {
	 public static void main(String[] args) {
	        //Se crean instancias
	        Persona p1 = new Persona();
	        Persona p2 = new Persona();
	        Persona p3 = new Persona();
	        //Accedemos al metodo estatico para ver el numero
	        //de instancias de tipo Persona creadas
	        System.out.println("Hemos instanciado " + Persona.getNPersonas() + " personas");
	        System.out.println("El número de días de la semana son: " + Constantes.DIAS_SEMANA);
	        System.out.println("El número de días que tiene un año son: " + Constantes.DIAS_AÑO); 
	    }
}
