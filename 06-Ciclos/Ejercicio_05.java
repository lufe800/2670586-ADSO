import java.util.Scanner;

public class Ejercicio_05{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int factorial= 1;
        String numAnterior= "",numPosterior="";

        System.out.print("--> Ingrese un número N: ");
        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++){
            factorial = factorial *i;
            numAnterior = String.valueOf(i);
            numPosterior += numAnterior +" x ";

            
        }
        System.out.println("Factorial: "+numPosterior+" = "+factorial);






    }
}