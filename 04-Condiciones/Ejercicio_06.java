import java.util.Scanner;

public class Ejercicio_06{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();

        if(edad >= 18){
          System.out.print("Usted es mayor de edad, puede votar.");  

        }else{
            System.out.print("Usted es menor de edad, no puede votar.");
        }
    }
}