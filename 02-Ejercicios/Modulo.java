import java.util.Scanner;

public class Modulo{
    public static void main(String []args){
        Scanner mod = new Scanner(System.in);

        int num_1 = 0;
        int num_2 = 0;
        int resultado = 0;

        System.out.println("Ingrese el primer número: ");
        num_1 =  mod.nextInt();

        System.out.println("Ingrese el segundo número: ");
        num_2 = mod.nextInt();

        resultado = (num_1 / num_2);

        System.out.println ("El resultado de la división es: " +resultado+ "  El residuo de la división es: "+(num_1 % num_2));

    }
}