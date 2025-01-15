/*
 6. Considere el estado de una botella:
Capacidad Estado
0 - 0.3 Vacía
0.4 - 0.7 Media
0.8 - 1 Llena
 Dada una capacidad, se desea emitir por pantalla el estado correspondiente. ¿Puede resolverse de dos maneras distintas,
 con estructuras de control diferentes? En caso afirmativo, implemente dos programas en Java que lo resuelvan.
 La capacidad de la botella será generada al azar y emitida por pantalla antes del estado correspondiente.
 */

import java.util.Random;

class Botella
{
    Random r = new Random();
        
    double estado;
    
    public Botella()
    {
        estado = r.nextDouble(0.8);
    }
    
    public void mostrarEstado()
    {
        System.out.println("DETALLES DE LA BOTELLA: ");
        
        if(estado >= 0 && estado <= 0.3)
        {
            System.out.println("Estado = " + estado + " Capacidad: Vacía");
        }
        else if(estado >= 0.4 && estado <= 0.7)
        {
           System.out.println("Estado = " + estado + " Capacidad: Media");
        }
        else if(estado >= 0.8)
        {
            System.out.println("Estado = " + estado + " Capacidad: Llena");
        }
    }
}


public class Ejercicio5 
{
    public static void main(String[] args) 
    {
        Botella b = new Botella();
        
        b.mostrarEstado();
    }
}
