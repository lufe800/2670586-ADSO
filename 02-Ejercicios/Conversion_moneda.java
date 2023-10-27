import java.util.Scanner;

public class Conversion_moneda{
    public static void main(String []args){
        Scanner moneda = new Scanner(System.in);

        double usd = 4.524;
        double eur = 4.884; 
        double jpy = 32.67;
        double gbp = 5.624;
        double cop = 0;

        System.out.println("Ingrese el valor en COP a convertir:");
        cop = moneda.nextDouble();

        usd = cop/usd;
        eur = cop/eur;
        jpy = cop/jpy;
        gbp = cop/gbp;


        System.out.println("La conversión de COP a otras monedas es:");
        System.out.println("USD: "+usd);
        System.out.println("EUR: "+eur);
        System.out.println("JPY: "+jpy);
        System.out.println("GBP: "+gbp);




        


    }
   

}
