package Griego;

public class Alpha {
    private int soyPrivado;
    protected int estoyProtegido;
    int estoyEmpaquetado;
    public int soyPublico;
    
    //private
    private void metodoPrivado() 
    {
        System.out.println("metodoPrivado");
    }
    //protected
    protected void metodoProtegido() 
    {
    	System.out.println("metodoProtegido");
    }
    //default
    void metodoEmpaquetado() 
    {
        System.out.println("metodoEmpaquetado");
    }
    //public
    public void metodoPublico() {
        System.out.println("metodoPublico");
    }
}