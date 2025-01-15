/*
 11. Implementar un programa en Java que genere tres números enteros al azar (llamados día, mes, año). Estos tres números
 enteros representarán una fecha. El entero día debe ser generado entre 1 y 31. El entero mes debe ser generado entre 1 y
 12. El entero año debe ser generado entre 1900 y 2100. Una vez generados los tres valores, el programa debe desplegar los
 valores generados y determinar si representan una fecha válida o no. Para este ejercicio se consideran bisiestos los años que
 son múltiplos de cuatro.
 Ejemplos:
 día = 10, mes = 10, año = 1977 es una fecha válida.
 día = 30, mes = 2, año = 2004 no es una fecha válida.
 */

import java.util.Random;

public class Ejercicio10 
{

    public static void main(String[] args) 
    {
        Random random = new Random();

        int dia = random.nextInt(31) + 1;  // Día entre 1 y 31
        int mes = random.nextInt(12) + 1;  // Mes entre 1 y 12
        int año = random.nextInt(2100 - 1900 + 1) + 1900;  // Año entre 1900 y 2100

        System.out.println("Fecha generada: " + dia + "/" + mes + "/" + año);

        if (esFechaValida(dia, mes, año)) {
            System.out.println("La fecha es válida.");
        } 
        else {
            System.out.println("La fecha no es válida.");
        }
    }

    public static boolean esFechaValida(int dia, int mes, int año) 
    {
        if (mes < 1 || mes > 12) {
            return false;
        }

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes == 2 && esBisiesto(año)) {
            diasPorMes[1] = 29;
        }

        return dia >= 1 && dia <= diasPorMes[mes - 1];
    }

    public static boolean esBisiesto(int año) 
    {
        return año % 4 == 0;
    }
}
