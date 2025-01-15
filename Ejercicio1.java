/*
1. Implementar un programa en Java que genere dos valores enteros al azar y despliegue en la salida estándar el mayor
de ellos.
 */
import java.util.Random;

public class Ejercicio1 
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        int a, b;
        
        a = random.nextInt(100);
        b = random.nextInt(100);
        
        if(a > b)
            System.out.println("El mayor es: " + a);
        else
            System.out.println("El mayor es " + b);
                  
    }
}
