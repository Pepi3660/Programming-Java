/*
12. Implementar un programa en Java que genere dos enteros a y b al azar. a entre 1 y 10, b entre 20 y 50. El programa debe
 desplegar en pantalla los valores generados y además debe desplegar todos los múltiplos de a que existan entre 1 y b.
 Ejemplo:
 Para a = 4, b = 37, se debe desplegar: 4, 8, 12, 16, 20, 24, 28, 32, 36
*/

import java.util.Random;

public class Ejercicio11 
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        
        int a = random.nextInt(10) + 1; 
        int b = random.nextInt(31) + 20;  

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        
        System.out.print("Múltiplos de " + a + " entre 1 y " + b + ": ");
        
        for (int i = a; i <= b; i += a) 
        {
            System.out.print(i + " ");
        }
    }
}
