import java.util.Scanner;

public class Ejercicio_07{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número de cinco dígitos: ");
        int numero = entrada.nextInt();

        if(numero > 99999){
            int d1 = numero % 10;
            int d2 = (numero % 100) / 10;
            int d3 = (numero % 1000) /100;
            int d4 = (numero % 10000) /1000;
            int d5 = numero / 10000;

            if(d1 == d5 && d4 == d2){
                System.out.print("El número ingresado es palíndromo. ");
            }else{
                System.out.print("El número ingresado no es palíndromo. ");
            }

        }else{
            System.out.print("El número ingresado es mayor a cinco dígitos. ");
        }
            


    }
}