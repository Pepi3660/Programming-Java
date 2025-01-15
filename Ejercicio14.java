/*
 15. Implementar un programa en Java que genere al azar una secuencia de letras minúsculas, desplegándolas en pantalla. El
 programa debe contar la cantidad total de letras vocales generadas. El procesamiento debe finalizar cuando se genere la
 letra z o cuando se hayan generado 10 letras, lo que ocurra primero. Al final, se debe desplegar la cantidad total de letras
 vocales generadas. Para generar una letra minúscula al azar, hacer:
 letra = (char) ((Math.random() * 26) + 'a');
 Ejemplos:
 Si la secuencia generada es: f, e, t, a, s, e, m, z entonces se debe desplegar un 3. Nótese que en este caso la secuencia finalizó
 porque se generó la letra z en el octavo lugar de la secuencia. Si la secuencia generada es: h, t, a, u, n, o, p, e, i, w entonces
 se debe desplegar un 5. Nótese que en este caso la secuencia finalizó porque generaron 10 letras antes de que se generase
 la z.
 */

public class Ejercicio14 
{
    public static void main(String[] args) 
    {
        int contadorVocales = 0 , contadorLetras = 0;  
        char letra;

        while (contadorLetras < 10) 
        {
            letra = (char) ((Math.random() * 26) + 'a');
            contadorLetras++;
            
            System.out.print(letra + ", ");

            if (esVocal(letra)) {
                contadorVocales++;
            }

            if (letra == 'z') {
                break;
            }
        }
        System.out.println("\nCantidad total de vocales generadas: " + contadorVocales);
    }

    public static boolean esVocal(char letra) 
    {
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}