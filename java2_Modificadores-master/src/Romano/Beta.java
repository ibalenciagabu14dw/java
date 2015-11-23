package Romano;

import Griego.*;

class Beta {
    void metodoAccesor() {
        Alpha a = new Alpha();
    	 // a.soyPrivado = 10; // ilegal ilegal porque solo se puede acceder a la propiedad desde la propia clase Alpha
         // a.metodoPrivado(); // ilegal porque solo se puede acceder al metodo desde la propia clase Alpha
    
    	//a.estoyProtegido = 10;    // ilegal porque es una propiedad protegida
    	//a.metodoProtegido();    // ilegal porque es un metodo protegido
    
        //a.estoyEmpaquetado=10;//ilegal porque esta en otro paquete
        //a.metodoEmpaquetado();//ilegal porque esta en otro paquete
        
    	a.soyPublico=10;//legal
        a.metodoPublico();//legal
    }
}