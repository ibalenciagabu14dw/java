
/*
 * Programa que pide un número de mes y muestra el nombre correspondiente
 */
import java.util.*;
public class NumeroMes
{
	public static void main(String[] args)
	{
		//crea la variable mes del tipo integer
        	int mes;
		//cre la variable sc del tipo Scanner
        	Scanner sc = new Scanner(System.in);
		//pide el numero de mes
        	System.out.print("Introduzca un numero de mes: ");
		//recoge en mes lo introducido por el teclado
        	mes = sc.nextInt();
		//depende del numero que haya introducido sacara su mensaje correspondiente
        	switch (mes)
        	{
        	        case 1: System.out.println("ENERO");//ha introducido el 1
        	                   break;
        	        case 2: System.out.println("FEBRERO");//ha introducido el 2
        	                   break;
        	        case 3: System.out.println("MARZO");//ha introducido el 3
        	                   break;
        	        case 4: System.out.println("ABRIL");//ha introducido el 4
        	                   break;
        	        case 5: System.out.println("MAYO");//ha introducido el 5
        	                   break;
        	        case 6: System.out.println("JUNIO");//ha introducido el 6
        	                   break;
        	        case 7: System.out.println("JULIO");//ha introducido el 7
        	                   break;
        	        case 8: System.out.println("AGOSTO");//ha introducido el 8
        	                   break;
        	        case 9: System.out.println("SEPTIEMBRE");//ha introducido el 9
        	                   break;
        	        case 10: System.out.println("OCTUBRE");//ha introducido el 10
        	                     break;
        	        case 11: System.out.println("NOVIEMBRE");//ha introducido el 11
        	                     break;
        	        case 12: System.out.println("DICIEMBRE");//ha introducido el 12
        	                     break;
        	        default : System.out.println("Mes no válido");//el mes introducido no es valido
		}
	}
}

