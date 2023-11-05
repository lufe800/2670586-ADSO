import java.util.Scanner;

public class Ejercicio_02{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Ingresa un número de tres dígitos: ");
        numero = entrada.nextInt();

        if (numero>=100 && numero <=999){
            if(numero%2 == 0){
                System.out.println("El número "+ numero +" es par");
            }else{
                System.out.println("El número "+ numero + " es impar");
            }
        }else{
            System.out.println("El número ingresado no es valido");
        }

    }
    
}