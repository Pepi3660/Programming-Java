/*
10. Implementar un programa en Java que genere un entero m al azar. El programa debe desplegar en pantalla el entero
 generado, y posteriormente debe calcular y desplegar la suma de todos los enteros existentes entre 1 y m.
 Ejemplo:
 Para m = 7, la suma solicitada es 28 (1+2+3+4+5+6+7)
 */

import java.util.Random;
import java.io.*;

public class Ejercicio9 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();
        
        int acum = 0, option, m;
        
        do
        {
           
            m = r.nextInt(1,1000);
            System.out.println(" " + m); 
            acum += m;
            
            System.out.println("Presione cualquier numero para continuar generando o -1 para salir");
            option = Integer.parseInt(s.readLine());
            
        }while(option != -1);
        
        System.out.println("Total calculado: " + acum);
        
    }
}
