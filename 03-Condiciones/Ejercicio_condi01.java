import java.util.Scanner;

public class Ejercicio_condi01{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;

        System.out.println("¡Hola! Ingresa tu nombre y edad");
        System.out.println("NOMBRE: ");
        nombre = entrada.nextLine();
            
        System.out.println("EDAD: ");
        edad = entrada.nextInt();

        if (edad < 17){
            System.out.println("Usted recibe una auxilio de $ 800.000");

        }else{
            System.out.println("Usted recibe una auxilio de $ 200.000");

        }
    }

}