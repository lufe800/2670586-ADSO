import java.util.Scanner;

public class Ejercicio_05{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        int actual = 0;
        int posterior = 1;
        int fibonacci = 0;

        for(int i= 2; i<= numero; i++){
            actual = posterior;
            posterior = fibonacci;
            fibonacci = actual + posterior;
          System.out.print(fibonacci+",");
        }
        

    }


}