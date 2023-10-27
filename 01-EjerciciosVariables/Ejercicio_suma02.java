import java.util.Scanner;

public class Ejercicio_suma02{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        int num_1 = 0;       
        int num_2 = 0;
        int resultado = 0;

         System.out.println("Ingrese primer numero: ");
        num_1 =  entrada.nextInt();

        System.out.println("Ingrese segundo numero: ");
        num_2 = entrada.nextInt();

        resultado = num_1+num_2;

        System.out.println("num_1: "+num_1);
        System.out.println("num_2: " +num_2);
        System.out.println("El resultado de la suma es: "+resultado);


    }

}