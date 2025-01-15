/*
5. Dada la siguiente tabla:
Nota Calificación
0-3 Reprobado
4-7 Aceptable
8-11 Bueno
12 Excelente

 Dada una nota, se desea emitir por pantalla la calificación correspondiente.
 ¿Puede resolverse de dos maneras distintas, con estructuras de control diferentes? En caso afirmativo, implemente dos
 programas en Java que lo resuelvan. La nota será generada al azar y emitida por pantalla antes de la calificación
 correspondiente
 */

import java.util.Random;
import java.io.*;

public class Ejercicio4 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader save = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int option;
        
        do
        {
            int nota = random.nextInt(12);

            if(nota >= 0 && nota <= 3)
            {
               System.out.println("Su nota es de: " + nota + " Calificación: Reprobado");
            }
            else if(nota >= 4 && nota <= 7)
            {
               System.out.println("Su nota es de: " + nota + " Calificación: Aceptable");
            }
            else if(nota >= 8 && nota <= 11)
            {
                 System.out.println("Su nota es de: " + nota + " Calificación: Bueno");
            }
            else if (nota == 12)
            {
                 System.out.println("Su nota es de: " + nota + " Calificación: Excelente");
            }
          
            System.out.println("Presione -1 para salir o cualquier tecla para continuar");
            option = Integer.parseInt(save.readLine());
            
        }while(option != -1);
    }
}
