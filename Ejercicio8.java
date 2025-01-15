/*
9. Se desea Implementar un programa en Java que genere una secuencia de enteros al azar entre 0 y 10. El programa debe
 desplegar en pantalla todos aquellos enteros generados que sean pares. Además, el programa debe ir contando la cantidad
 de enteros pares que se vayan generando.

 No se sabe cuántos elementos va a tener la secuencia, pero se debe detener el procesamiento descrito cuando se genere
 el número cero. Al finalizar, se debe desplegar en pantalla la cantidad total de números pares generados.
 a. Resolverlo considerando al cero como un número par.
 b. Resolverlo no considerando al cero como un número par.
 */

import java.util.Random;
import java.io.*;


public class Ejercicio8 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();
         
        int n;
        int continuar;
        int contP = 0;
        int contN = 0;
        
        do
        {
            n = r.nextInt(0, 10);
        
            System.out.println("num: " + n);
            if(n % 2 == 0)
            {
                contP++;
            }
            
            if(n == 0)
            {
                break;
            }
            contN++;
            
            System.out.println("Presione -1 para salir u cualquier numero para continuar generando numeros");
            continuar = Integer.parseInt(s.readLine());
            
        }while(continuar != -1);
        
        System.out.println("Cantidad total de numeros procesados: " + contN);
        System.out.println("Cantidad total de numeros pares: " + contP);
    }
}
