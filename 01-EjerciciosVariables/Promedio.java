import java.util.Scanner;

public class Promedio{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        float nota_1 = 0;
        float nota_2 = 0;
        float nota_3 = 0;
        float nota_4 = 0;
        float nota_5 = 0;
        float promedio = 0;

        System.out.println("Ingrese nota 1: ");
        nota_1 = entrada.nextFloat();

        System.out.println("Ingrese nota 2: ");
        nota_2 = entrada.nextFloat();

        System.out.println("Ingrese nota 3: ");
        nota_3 = entrada.nextFloat();

        System.out.println("Ingrese nota 4: ");
        nota_4 = entrada.nextFloat();

        System.out.println("Ingrese nota 5: ");
        nota_5 = entrada.nextFloat();

        promedio = (nota_1+nota_2+nota_3+nota_4+nota_5)/5;

        System.out.println("Su promedio es: "+promedio);

    }

}