import java.util.Scanner;

public class Calculo_imc{
    public static void main(String []args){
        Scanner indice = new Scanner(System.in);

        double imc_cal, peso, altura;

        System.out.println("Ingrese su peso");
        peso = indice.nextDouble();

        System.out.println("Ingrese su altura");
        altura = indice.nextFloat();

        imc_cal = (peso / Math.pow(altura,2));

        System.out.println("Su índice de masa corporal es: "+imc_cal);




    }
}