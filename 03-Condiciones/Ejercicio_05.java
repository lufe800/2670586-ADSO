import java.util.Scanner;

public class Ejercicio_05{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Ingrese número uno: ");
        num1 = entrada.nextInt();

        System.out.print("Ingrese número dos: ");
        num2 = entrada.nextInt();

        System.out.print("Ingrese número tres: ");
        num3 = entrada.nextInt();

        if(num1 < num2 && num1 < num3){
            System.out.println("Los números se ingresaron en orden ascendente ");

        }else{
            System.out.println("Los números ingresados no están en orden ascendente");

        }
       

    }

}