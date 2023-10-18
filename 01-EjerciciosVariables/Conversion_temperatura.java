import java.util.Scanner;

public class Conversion_temperatura{
    public static void main(String []args){
    Scanner entrada = new Scanner(System.in);
    double Celsius = 0;
    double Fahrenheit = 0;


    System.out.println("Ingrese la temperatura en grados Celsius: ");
    Celsius = entrada.nextFloat();
    
    Fahrenheit = ((Celsius * 9/5) + 32);
    System.out.println("La temperatura en grados Fahrenheit es: "+Fahrenheit);


}

    }   