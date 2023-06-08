import java.util.Scanner;

public class Ejercicio_09{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        int  horasTra, horaExtra;
        float tarifa, pagoExtra ;
        float salario = 0;

        System.out.println("Ingrese el total de horas trabajadas:");
        horasTra = entrada.nextInt();

        System.out.println("Ingrese la tarifa por hora trabajada: ");
        tarifa = entrada.nextFloat();

        if(horasTra > 40){
            horaExtra = horasTra - 40;
            pagoExtra = (tarifa * 50)/ 100;
            salario = (tarifa * 40) + (horaExtra * pagoExtra);

            System.out.println("El sueldo por "+horasTra+ " horas trabajadas es: "+(salario + tarifa) );

        }else if(horasTra <= 40){
            salario = horasTra * tarifa;
            System.out.println("El sueldo sin horas extras es : "+salario); 
        }else{
            System.out.println("Ingrese nuevamente valores.");
        }

    }
}