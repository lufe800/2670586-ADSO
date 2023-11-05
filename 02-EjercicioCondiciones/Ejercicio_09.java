import java.util.Scanner;

public class Ejercicio_09{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        double horasTra, horaExtra;
        double tarifa, pagoExtra ;
        double salario = 0;

        System.out.println("Ingrese el total de horas trabajadas:");
        horasTra = entrada.nextDouble();

        System.out.println("Ingrese la tarifa por hora trabajada: ");
        tarifa = entrada.nextDouble();

        horaExtra = horasTra - 40;
        pagoExtra = (tarifa * 0.5);
        salario = horasTra * tarifa;


        if(horasTra <= 40){
            System.out.println("El salario sin horas extras es : "+salario);
        }else if(horasTra > 40){
            horaExtra = horaExtra * pagoExtra;
            salario = salario + horaExtra;
            System.out.println("El salario con horas extras es : "+salario );
            
        }

    }
}