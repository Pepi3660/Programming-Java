/*
8. Implementar un programa en Java que genere un entero n al azar entre 1 y 9. El programa debe desplegar en pantalla
 todos los enteros múltiplos de n que existan entre 1 y 50.
 Ejemplo: Para n = 8, el programa debe desplegar: 8,16,24,32,40,48.
 */

import java.util.Random;

public class Ejercicio7 
{
    public static void main(String[] args) 
    {
        Random r = new Random();
        
        int n = r.nextInt(1, 9);
        
        System.out.println("Multiplos de : " + n);
        for(int i = 1; i <= 50; i++)
        { 
            if(i % n == 0)
            {
                System.out.print(" " + i);
            }
        }       
    }
}
