import java.util.Scanner;
public class Ejercicio_07{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número impar: ");
        int n = entrada.nextInt();

            for(int i = 0; i < n; i++){
                for(int j = n-1-i; j >=0; j--){
                System.out.print(" ");
                }
                for(int j = 0; j <= i; j++){
                System.out.print("X ");
                }
                System.out.println("");

            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j <= i; j++){
                System.out.print(" ");
                }
                for(int j = n-1-i; j >=0; j--){
                System.out.print("X ");
                }
                System.out.println("");
            }







    }
}