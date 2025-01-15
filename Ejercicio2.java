/*
 2. Implementar un programa en Java que genere tres valores enteros al azar y despliegue en la salida estándar el mayor
de ellos.

 */

import java.util.Random;

public class Ejercicio2 
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        
        int a = random.nextInt(100);
        int b =  random.nextInt(100);
        int c = random.nextInt(100);
        
        System.out.println("V A L O R E S");
        System.out.println("a = " + a + " " + "b = " + b + " " + "c = " + c);
        if(a > b && a > c) 
        {
            System.out.println("El mayor es a = " + a);
        }
        else if(b > a && b > c)
        {
            System.out.println("El mayor es b = " + b);
        }
        else
        {
            System.out.println("El mayor es c = " + c);
        }
    }
}
