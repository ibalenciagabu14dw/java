public class Main {
	public static void main (String [ ] Args) {
	        Escuela escuela1 = new Escuela ();
	        escuela1.setId(1);
	        escuela1.setNombre("Zubiri");
	        escuela1.setDireccion("Sagues");
	        escuela1.setAlumnos(1000);
	        escuela1.setDirector("Pepa");
	        
	        System.out.print("****ESCUELA*****");
	        System.out.print("\nID:" + escuela1.getId());
	        System.out.print("\nNOMBRE:" + escuela1.getNombre());
	        System.out.print("\nDIRECCION:" + escuela1.getDireccion());
	        System.out.print("\nALUMNOS:" + escuela1.getAlumnos());
	        System.out.print("\nDIRECTOR:" + escuela1.getDirector());
	        
	        Playa playa1 = new Playa();
	        playa1.setId(1);
	        playa1.setNombre("Zurriola");
	        playa1.setDireccion("Zurriola");
	        playa1.setLargura(3000);
	        playa1.setColor("Rojo");
	        
	        System.out.print("\n****PLAYA*****");
	        System.out.print("\nID:" + playa1.getId());
	        System.out.print("\nNOMBRE:" + playa1.getNombre());
	        System.out.print("\nDIRECCION:" + playa1.getDireccion());
	        System.out.print("\nLARGURA:" + playa1.getLargura() + "m");
	        System.out.print("\nBANDERA:" + playa1.getColor() + "m");
	}
}
