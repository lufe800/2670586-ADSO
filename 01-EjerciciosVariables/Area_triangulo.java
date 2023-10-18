import java.util.Scanner;

public class Area_triangulo{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        float base = 0;
        float altura = 0;
        float area = 0;

        System.out.println("Ingrese la base del triángulo: ");
        base = entrada.nextFloat();

        System.out.println("Ingrese la altura del triángulo: ");
        altura = entrada.nextFloat();

        area = (base*altura)/2;

        System.out.println("El área del triángulo es: "+area);



        



    }
}