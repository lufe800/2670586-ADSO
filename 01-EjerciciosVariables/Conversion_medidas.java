import java.util.Scanner;

public class Conversion_medidas{
    public static void main(String []args){
        Scanner medidas = new Scanner(System.in);

        double metros, centimetros, pulgadas, pies = 0;

        System.out.println("Ingrese la longitud en metros: ");
        metros = medidas.nextDouble();

        centimetros = metros * 100;
        pulgadas = metros * 39.37;
        pies = metros * 3.281;

        System.out.println("El resultado de la conversión es : "+centimetros+" centímetros "+pulgadas+" pulgadas "+pies+ " pies");






    }

    
}
