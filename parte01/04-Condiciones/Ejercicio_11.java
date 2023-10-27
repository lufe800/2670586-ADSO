import java.util.Scanner;

public class Ejercicio_11{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número que desea verificar:  ");
        String cadena = entrada.nextLine();

        int numero = Integer.parseInt(cadena);

        if(numero % 2 == 0){
            
           System.out.println("El número es par."); 

        }else{
            System.out.println("El número es impar.");
        }


    }
}