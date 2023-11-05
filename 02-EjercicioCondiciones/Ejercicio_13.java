import java.util.Scanner;

public class Ejercicio_13{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número de cuatro cifras:");
        int numero = entrada.nextInt();

        if(numero % 2 == 0 && numero % 3== 0 && numero % 5 ==0 ){
            System.out.println("El número es divisible por 2, 3 y 5");
        }else{
            System.out.println("El número  no es divisible por 2, 3 y 5");
        }
        
    }
}