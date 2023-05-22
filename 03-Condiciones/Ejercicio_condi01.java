import java.util.Scanner;

public class Ejercicio_condi01{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;

        System.out.println("¡Hola! Ingresa tu nombre y edad");
        System.out.print("NOMBRE: ");
        nombre = entrada.nextLine();
            
        System.out.print("EDAD: ");
        edad = entrada.nextInt();

        if (edad <= 17){
            System.out.println("Eres menor de edad, recibe un auxilio de $ 800.000");

        }else if(edad <= -1 && edad >= 100){
            System.out.println("El valor ingresado está fuera del rango ,ingresa tu edad nuevamente");
            
        }else{
            System.out.println("Eres mayor de edad, paga impuesto de $ 200.000");
        }

    }

}