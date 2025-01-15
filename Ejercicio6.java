/*
 7. Un restaurante que sólo trabaja viernes, sábados y domingos sirve el siguiente menú de comidas dependiendo del día y
 hora de la semana, según la siguiente tabla:

Día y Hora Comida
Viernes Antes de 16 hs Pollo
Viernes Luego de 16 hs Ensaladas
Sábado Antes de 12 hs Carnes
Sábado Entre 12 y 20 hs Minutas
Sábado Luego de 20 hs Copetín
Domingo Todo el día Pastas


 Se desea implementar un programa en Java que, dados un día y una hora, emita un mensaje indicando cuál es el menú
 que corresponde servir. El día de la semana será representado mediante un valor entero (entre 1 y 7) generado al azar.
 La hora será representada mediante un valor real (entre 0 y 24) generado al azar. En caso de que el día de la semana no
 corresponda a ninguno de los presentados en la tabla, se debe emitir un mensaje que diga "Gracias, vuelva otro día".
 Antes de emitir la comida correspondiente, se debe previamente desplegar el día y hora generados.
 */

import java.util.Random;

public class Ejercicio6 
{
    public static void main(String[] args)
    {
        Random r = new Random();
        
        int dia = r.nextInt(1,7);
        double hora = r.nextDouble(0.0, 24.0);
        
        switch(dia)
        {
            case 1: System.out.println("GRACIAS, VUELVA OTRO DÍA");
                   break;
            case 2: System.out.println("GRACIAS, VUELVA OTRO DÍA");
                   break;
            case 3: System.out.println("GRACIAS, VUELVA OTRO DÍA");
                   break;
            case 4: System.out.println("GRACIAS, VUELVA OTRO DÍA");
                   break;
            case 5: System.out.println("M E N U , V I E R N E S , H O R A : " + hora);
                    if(hora < 16)
                    {
                        System.out.println("Pollo");
                    }
                    else if(hora > 16 && hora <= 24)
                    {
                        System.out.println("Ensaladas");
                    }
                    break;
            case 6: System.out.println("M E N U , S A B A D O , H O R A : " + hora);
                    if(hora < 12)
                    {
                        System.out.println("Carnes");
                    }
                    else if(hora >= 12 && hora <= 20)
                    {
                        System.out.println("Minutas");
                    }
                    else if(hora > 20 && hora <= 24)
                    {
                        System.out.println("Copetin");
                    }
                   break;
            case 7:System.out.println("M E N U , D O M I N G O , H O R A : " + hora);
                   System.out.println("Pastas");
                   break;
            default: System.out.println("GRACIAS, VUELVA OTRO DÍA");
                     break;
        }

    }
}
