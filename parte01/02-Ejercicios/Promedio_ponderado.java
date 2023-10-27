import java.util.Scanner;

public class Promedio_ponderado{
    public static void main(String []args){
        Scanner pondera = new Scanner(System.in);

        float nota_1, nota_2, nota_3 = 0;
        float cre_1, cre_2, cre_3 = 0;
        float pp = 0;

        System.out.println("Ingrese nota 1: ");
        nota_1 = pondera.nextFloat();

        System.out.println("Ingrese crédito 1: ");
        cre_1 = pondera.nextFloat();

        System.out.println("Ingrese nota 2: ");
        nota_2 = pondera.nextFloat();

        System.out.println("Ingrese crédito 2: ");
        cre_2 = pondera.nextFloat();

        System.out.println("Ingrese nota 3: ");
        nota_3 = pondera.nextFloat();
        
        System.out.println("Ingrese crédito 3: ");
        cre_3 = pondera.nextFloat();
        
        pp = ((nota_1 * cre_1)+ (nota_2 * cre_2) + (nota_3 * cre_3)) / (cre_1 + cre_2 + cre_3);

        System.out.println("El promedio ponderado es: "+pp);
        
    
    }
}