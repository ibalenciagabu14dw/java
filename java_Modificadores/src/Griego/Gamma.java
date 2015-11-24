package Griego;

class Gamma {
    void metodoAccesor() {
        Alpha a = new Alpha();
        //  a.soyPrivado = 10; // ilegal ilegal porque solo se puede acceder a la propiedad desde la propia clase Alpha
        //  a.metodoPrivado(); // ilegal porque solo se puede acceder al metodo desde la propia clase Alpha
        a.estoyProtegido = 10;// legal
        a.metodoProtegido();// legal
        a.estoyEmpaquetado=10;//legal
        a.metodoEmpaquetado();//legal
        a.soyPublico=10;//legal
        a.metodoPublico();//legal
        
    }
}