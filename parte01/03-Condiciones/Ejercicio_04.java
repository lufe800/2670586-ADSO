import java.util.Scanner;

public class Ejercicio_04{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Ingrese número uno: ");
        num1 = entrada.nextInt();

        System.out.print("Ingrese número dos: ");
        num2 = entrada.nextInt();

        System.out.print("Ingrese número tres: ");
        num3 = entrada.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("El número mayor es: "+num1);
        }else if(num1 < num2 & num1 < num3){
            System.out.println("El número menor es: "+num1);
        }

        if(num2 > num1 && num2 > num3){
            System.out.println("El número mayor es: "+num2);
        }else if(num2 < num1 & num2 < num3){
            System.out.println("El número menor es: "+num2);
        
        }
        if(num3 > num1 && num3 > num2){
            System.out.println("El número mayor es: "+num3);
        }else if(num3 < num1 & num3 < num2){
            System.out.println("El número menor es: "+num3);
            
        }

    }

}