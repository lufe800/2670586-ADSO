import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la altura de la pirámide: ");
        int altura = entrada.nextInt();

        
        for (int filas = altura; filas >= 1; filas--) {
            // Imprimir los espacios 
            for (int espacios = 1; espacios <= filas +2; espacios++) {
                System.out.print(" ");
            }

            // Imprimir x
            for (int equis = 1; equis <= (altura - filas + 1) * 2 - 1; equis++) {
                System.out.print("X");
            }

            System.out.println();
        }
    }
}