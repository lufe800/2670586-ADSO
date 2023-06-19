import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("--> Ingrese un número de máximo 6 dígitos: ");
        int numero = scanner.nextInt();

        int numeroOriginal = numero;
        int numeroReversado = 0;

        if (numero > 0 && numero < 999999) {

            while (numero != 0) {
                int digito = numero % 10;
                numeroReversado = numeroReversado * 10 + digito;
                numero /= 10;
            }
            if (numeroOriginal == numeroReversado) {
                System.out.println("--> El número Si es PALÍNDROMO");
            } else {
                System.out.println("--> El número No es PALÍNDROMO");
            }

        } else {
         System.out.print("--> El número ingresado no es válido.");
        }
    }
}













