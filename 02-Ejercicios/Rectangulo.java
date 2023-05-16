import java.util.Scanner;

public class Rectangulo{
    public static void main(String []args){
        Scanner area = new Scanner(System.in);

        float alto, ancho, a = 0;

         System.out.println("Ingrese la altura: ");
        alto = area.nextFloat();

        System.out.println("Ingrese el ancho: ");
        ancho = area.nextFloat();

        a = (alto * ancho);
        
        System.out.println("El área del rectángulo es: "+a);


    }
}