import java.util.Scanner;
public class Ejercicio_07{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número impar: ");
        int n = entrada.nextInt();

            for(int filas = 1; filas <=((n-1)/2)+1; filas++){
                for(int espacios = 1;espacios <= n-filas; espacios++){
                System.out.print(" ");
                }
                for(int equis = 1; equis <=(filas*2)-1; equis++){
                System.out.print("X");
                }
                System.out.println("");

            }
            for(int filas = (n-1)/2; filas >= 1; filas--){
                for(int espacios = 1; espacios <= n-filas; espacios++){
                System.out.print(" ");
                }
                for(int equis = 1; equis<=(2*filas)-1; equis++){
                System.out.print("X");
                }
                System.out.println("");
            }

    }
}