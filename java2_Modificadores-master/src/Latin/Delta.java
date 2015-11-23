package Latin;

import Griego.*;
//subclase de Alpha que esta en el paquete Latin
class Delta extends Alpha {
    void metodoAccesor(Alpha a, Delta d) {
    	//  a.soyPrivado = 10; // ilegal ilegal porque solo se puede acceder a la propiedad desde la propia clase Alpha
        //  a.metodoPrivado(); // ilegal porque solo se puede acceder al metodo desde la propia clase Alpha
    
    	//a.estoyProtegido = 10;    // ilegal porque es una propiedad protegida
    	//a.metodoProtegido();    // ilegal porque es un metodo protegido
    
        //a.estoyEmpaquetado=10;//ilegal porque esta en otro paquete
        //a.metodoEmpaquetado();//ilegal porque esta en otro paquete
        
    	a.soyPublico=10;//legal
        a.metodoPublico();//legal
        
        //d.soyPrivado = 10; // ilegal ilegal porque solo se puede acceder a la propiedad desde la propia clase Alpha
        //d.metodoPrivado(); // ilegal porque solo se puede acceder al metodo desde la propia clase Alpha
        d.estoyProtegido = 10;// legal
        d.metodoProtegido();// legal
        //d.estoyEmpaquetado=10;//ilegal poruqe pertenece a otro paquete
        //d.metodoEmpaquetado();//legal porque pertenece a otro paquete
        d.soyPublico=10;//legal
        d.metodoPublico();//legal
    }
}