import java.util.Scanner;

public class Perimetro_area{
    public static void main(String []args){
        Scanner circulo = new Scanner(System.in);

        double p, radio, a;

        System.out.println("Ingrese el radio: ");
        radio = circulo.nextDouble();

        p = (2 * 3.14 * radio);
        a = (3.14 * Math.pow(radio , 2));


        System.out.println("El perímetro del círculo es: "+p+ " El área del círculo es: "+a);



    }
}