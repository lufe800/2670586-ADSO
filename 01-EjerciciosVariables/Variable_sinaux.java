import java.util.Scanner;

public class Variable_sinaux{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        int num_1 = 0;
        int num_2 = 0;

        System.out.println("Ingrese primer numero: ");
        num_1 =  entrada.nextInt();

        System.out.println("Ingrese segundo numero: ");
        num_2 = entrada.nextInt();

        System.out.println("Los numeros ingresados son: número 1= "+num_1+" número 2= "+num_2);

        num_1 = num_1 + num_2;
        num_2 = num_1 - num_2;
        num_1 = num_1 - num_2;

        System.out.println("Los numeros intercambiados son: número 1="+num_1+" número 2= "+num_2);

    }

    
}