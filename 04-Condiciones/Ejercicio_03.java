import java.util.Scanner;

public class Ejercicio_03{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        if(numero % 2 == 0){
            System.out.print("El número ingresado es par. ");

        }else{
            System.out.print("El número ingresado es impar. ");
        }


    }
}