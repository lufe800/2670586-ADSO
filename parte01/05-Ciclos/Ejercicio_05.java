import java.util.Scanner;

public class Ejercicio_05{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        int actual = 0;
        int anterior = 1;
        int fibonacci = 0;

        System.out.print(actual+","+anterior);

        for(int i= 3; i<= numero; i++){
            fibonacci = actual + anterior; 
            actual = anterior;
            anterior = fibonacci;
             
          System.out.print(","+fibonacci);
        }
        

    }


}