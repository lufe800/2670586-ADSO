import java.util.Scanner;

public class Interes{
    public static void main(String []args){
        Scanner in_compuesto = new Scanner(System.in);

        double tasa_inter, inver_inicial, monto_final = 0;
        int periodos = 0;

        System.out.println("Ingrese el monto de inversión inicial:");
        inver_inicial = in_compuesto.nextDouble();
        System.out.println("Ingrese la tasa de interés:");
        tasa_inter = in_compuesto.nextDouble();
        System.out.println("Ingrese la cantidad de periodos:");
        periodos = in_compuesto.nextInt();

        monto_final = inver_inicial * Math.pow((1+tasa_inter / 100),periodos);

         System.out.println("El monto final es: "+monto_final);
        
        tasa_inter = monto_final - inver_inicial;

        System.out.println("La tasa de interés es de: "+tasa_inter);

    }
    
}