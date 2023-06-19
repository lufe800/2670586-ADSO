import java.util.Scanner;
import java.util.Random;
public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("--> Ingrese un número N: ");
        int numero = entrada.nextInt();

        //int divisores = 0;
        //int primos = 0;
        int numActual, numAnterior;
        boolean esPrimo;
        for (int i = 1; i <= numero; i++) {
            //numero = (int)(Math.random);
            Random numAleatorio = new Random();
            numero = numAleatorio.nextInt();
            numActual = numero;
            if (numero % i == 0 || numero % i == 2) {
                esPrimo= true;
                numAnterior=numero;
            }else{
                return numAleatorio;
            }

            System.out.println("Primo " + i + " generado->" + numero);
        }

    }

}