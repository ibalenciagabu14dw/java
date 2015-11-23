
/*
 * Programa que pide dos números y un operador y muestra el resultado
 */
import java.util.*;
import java.io.*;
public class NumeroOperador
{
	public static void main(String[] args) throws IOException{
	//crea las A, B y resultado del tipo integer. Ademas le da el valor de 0 a resultado
        int A,B, Resultado = 0 ;
	//crea la variable operador del tipo char
        char operador;
	//crea la varaible calculado del tipo boolean
        boolean calculado = true;//true si se  realiza la operacion, false si no se ha hecho
	//crea la variable sc del tipo Scanner
        Scanner sc = new Scanner(System.in);
	//pide un numero
        System.out.print("Introduzca un numero entero:");
	//introduce en A el valor introducido por el teclado
        A = sc.nextInt();
	//pide otro numero
        System.out.print("Introduzca otro numero entero:");
	//introduce en B el valor introducido por el teclado
        B = sc.nextInt();
	//pide el operador
        System.out.print("Introduzca un operador (+,-,*,/):");
	//introduce en operador el operador introducido por el teclado
        operador = (char)System.in.read();
	//dependiendo del operador hace una operacion u otra
        switch (operador) 
	{
		case '-' : Resultado = A - B;//hace la resta
                           break;
                case '+' : Resultado = A + B;//hace la suma
                           break;
                case '*' : Resultado = A * B;//hace la multiplicacion
                           break;
                case '/' : if(B!=0)//hace la division si el segundo numero es diferente a 0
                              Resultado = A / B;
                           else
			   {//no se puede hacer la division
                           	System.out.println("\nNo se puede dividir por cero");
                           	//pone calculado a false porque no ha hecho la operacion   
				calculado = false;
		           }
                           break;
		//si no es un operador valido saca el mensaje
                default : System.out.println("\nOperador no valido");
			  //da el valor false a calculado
                          calculado = false;
                         
        }
        if(calculado){//si la operacion se ha realizado muestra el resultado
            System.out.println("\nEl resultado es: " + Resultado);
        }
    }
}

