import java.util.Scanner;

public class Ejercicio_04{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        float nota_1 = 0;
        float nota_2 = 0;
        float nota_3 = 0;
        

        System.out.println("Ingrese nota 1: ");
        nota_1 = entrada.nextFloat();

        System.out.println("Ingrese nota 2: ");
        nota_2 = entrada.nextFloat();

        System.out.println("Ingrese nota 3: ");
        nota_3 = entrada.nextFloat();

        float promedio = (nota_1+nota_2+nota_3)/3;

        if(promedio >= 7){
            System.out.println("Su promedio es: "+promedio+ " ¡APROBADO!" );
        }else{
            System.out.println("Su promedio es: "+promedio+ "¡REPROBADO!" );
        }


    }

}