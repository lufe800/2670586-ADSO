import java.util.Scanner;

public class Ejercicio_01{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        if(numero >= 0){
           System.out.print("El número" +numero+ "es positivo.");
        }else{
            System.out.print("El número ingresado es negativo.");
        }
    }
}