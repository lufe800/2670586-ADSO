import java.util.Scanner;

public class Ejercicio_08{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

       
        System.out.println("Ingrese base ");
        float base = entrada.nextFloat();

        System.out.println("Ingrese altura ");
        float altura = entrada.nextFloat();


        if (base >= 0 && altura >= 0){
            
           float area = (base * altura) / 2;

            System.out.println("El área del triángulo es : "+area);
        }else{
            System.out.println("Ingrese valores validos. ");
        }

        

    }
       
}