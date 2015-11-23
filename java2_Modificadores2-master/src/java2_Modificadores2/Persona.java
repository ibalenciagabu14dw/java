package java2_Modificadores2;

public class Persona {
	//Atributo estatico de la clase, es la misma variable para cada instancia, ocupa un unico lugar en memoria
    private  static int nPersonas;
    //Cada instancia incrementa este atributo
    public Persona() {
        nPersonas++;
    }
    //Metodo estatico que retorna un atributo estatico
    public static final int getNPersonas() {
        return nPersonas;
    }
}
