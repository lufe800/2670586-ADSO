import java.util.Scanner;

public class Ejercicio_05{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("=>Ingrese el año que desee calcular: ");
        int year = entrada.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.print("El año  "+year+" es año bisiesto");
        }else{
            System.out.print("El año  "+year+" no es año bisiesto");
        }
    }
}