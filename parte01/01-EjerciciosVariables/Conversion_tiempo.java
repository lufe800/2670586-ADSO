import java.util.Scanner;

public class Conversion_tiempo{
    public static void main(String []args){
        Scanner time = new Scanner(System.in);

        int t, horas, minutos, segundos = 0;

        System.out.println("Ingrese los segundos a convertir : ");
        t= time.nextInt();

        horas = t / 3600;
        minutos = (t - (3600 * horas) )/ 60;
        segundos = t- ((horas * 3600) + (minutos * 60));

        System.out.println("La conversión equivale a: "+horas+"h "+minutos+"m "+segundos+"s");


    }
}