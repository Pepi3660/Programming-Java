/*
 3. Implementar un programa en Java que genere dos valores enteros al azar llamados a y b. El programa debe desplegar
los valores de a y b y luego calcular y desplegar en pantalla el cociente y el resto de dividir a entre b. Antes de hacer
los cálculos, se debe chequear que b sea distinto de cero. En caso contrario, se debe desplegar un mensaje
de error indicando que no es posible resolver el problema.
 */

import java.util.Random;
import java.io.*;

public class Ejercicio3 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader save = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int option;
        
        do
        {
            int a = random.nextInt(100);
            int b = random.nextInt(100);

            System.out.println("V A L O R E S");
            System.out.println("a = " + a + " " + "b = " + b);

            if(b == 0)
            {
                System.out.println("El valor de b debe ser diferente de cero!");
            }
            else
            {
                int cociente = a / b;
                System.out.println("El cociente de " + a + "/" + b + " = " + cociente);
            }
            
            System.out.println("Desea continuar?(presione cualquier tecla/ presione -1 para salir)");
            option = Integer.parseInt(save.readLine());
            
        }while(option != -1);    
       
    } 
}
