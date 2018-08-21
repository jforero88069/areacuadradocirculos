
/**
 * Write a description of here.
 * Este programa permite transformar hallar el area del circulo que no esta inscrito en el cuadrado interno
 * @autores ean grupo de trabajo Juan Forero
 * @version 20082018
 */
 

import java.util.Scanner;
import java.lang.Math.*;
/** 
 * 
 * 
 */
public class datos 
{
    static double Radio;
    static double Area;
    
    public static void main(String[] args)
    {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Escriba el radio del circulo");
       Radio=teclado.nextDouble();
       Area=(3.14159265359*(Radio*Radio))-((Radio*2)*(Radio*2))/2;
       System.out.println(Area+" es igual al area del circulo pi r^2-area del cuadrado  dos veces el radio al cuadrado dividido 2"); ;
    }
}



/**Fuentes:
 * 
 * /
 */

