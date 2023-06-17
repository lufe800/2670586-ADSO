import java.util.Scanner;
public class Ejercicio_09{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int numero;
        int divisores = 0;



        System.out.print("--> Ingrese un numero: ");
        numero = entrada.nextInt();

        for(int i = 1; i<=numero; i++){

            if(numero % i == 0){
                divisores = divisores + 1;
            }


        }
        if (divisores == 2){
            System.out.print("El numero ingresado es primo");

        }else{
           System.out.print("El numero ingresado no es primo"); 
        }




    }
}