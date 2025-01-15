/*

14. Implementar un programa en Java que genere dos enteros a y b al azar, ambos entre 1 y 30. El programa debe desplegar los
 valores generados y posteriormente debe calcular la potencia de ab.
 Ejemplo:
 Para a = 5, b = 3, el programa debe calcular 125
*/

import java.util.Random;

public class Ejercicio13 
{
    public static void main(String[] args) 
    {
        Random random = new Random();

        int a = random.nextInt(30) + 1;
        int b = random.nextInt(30) + 1;

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);

        long resultado = (long) Math.pow(a, b);

        System.out.println(a + " elevado a la " + b + " es igual a: " + resultado);
    }
}
