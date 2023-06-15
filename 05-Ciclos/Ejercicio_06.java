import java.util.Scanner;

public class Ejercicio_06{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        
        
        System.out.print("--> Ingresar la posición del n-esimo Fibonacci: ");
        int numero = entrada.nextInt();

        int actual = 0;
        int anterior = 1;
        int fibonacci = 0;
        if(numero > 1 && numero <= 99){

        }else{
        System.out.println("Ingrese un número del 1 al 100");
        }

        for(int i= 2; i<= numero - 1 ; i++){
            fibonacci = actual + anterior; 
            actual = anterior;
            anterior = fibonacci;    
        }   
        System.out.print("--> El n-esimo número Fibonacci es: "+fibonacci);

       


    }


}