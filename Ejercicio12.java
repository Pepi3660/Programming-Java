/*
 3. Implementar un programa en Java que genere una secuencia de enteros al azar entre 0 y 10. El programa debe ir
 desplegando cada entero en pantalla junto con un mensaje que diga si es par o no lo es. Además, el programa debe ir
 sumando todos los valores impares que se vayan generando. El procesamiento debe detenerse en el momento en que la
 suma supere el valor 25.
 Al finalizar, el programa debe desplegar en pantalla la suma calculada.

 Ejemplo:
 Una posible ejecución sería la siguiente:
 7 – impar
 2 – par
 4 – par
 3 – impar
 9 – impar
 6 – par
 1 – impar
 3 – impar
 8 – par
 5 – impar
 El procesamiento se detuvo en el 5 porque en ese instante la suma de todos los impares generados superó a 25
 (7+3+9+1+3+5=28)
*/

import java.util.Random;

public class Ejercicio12 
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        int sumaImpares = 0;  
        
        while (sumaImpares <= 25) 
        {
            int num = random.nextInt(11);  // Generar un número aleatorio entre 0 y 10
            
            if (num % 2 == 0) {
                System.out.println(num + " – par");
            }
            else 
            {
                System.out.println(num + " – impar");
                sumaImpares += num;  // Sumar el número impar
            }
            
            if (sumaImpares > 25) {
                System.out.println("El procesamiento se detuvo porque la suma de los impares superó 25.");
                break;  // Detener el bucle
            }
        }

        System.out.println("Suma total de impares: " + sumaImpares);
    }
}
