import java.util.Scanner;
public class Ejercicio_06{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int factorial= 2;
        String numAnterior= "",numPosterior="";

        System.out.print("--> Ingrese un número N: ");
        int n = entrada.nextInt();

        System.out.print("--> Ingrese un número M: ");
        int m = entrada.nextInt();

        for(int i = n; i <= m; i++){
            factorial = factorial *i;
            numAnterior = String.valueOf(i);
            numPosterior += numAnterior+ " x ";

            
         System.out.print("\nFactorial de: "+i);
         System.out.println("\n"+numPosterior+" = "+factorial);   
        }
        
        




    }
}