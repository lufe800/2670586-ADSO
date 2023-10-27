import java.util.Scanner;

public class Cadenas{
    public static void main(String []args){
        Scanner palabras = new Scanner(System.in);

        String palabr_1, palabr_2, palabras_unidas;

        System.out.println("Ingrese la primer palabra: ");
        palabr_1 = palabras.nextLine();

        System.out.println("Ingrese la segunda palabra: ");
        palabr_2 = palabras.nextLine();

        palabras_unidas = palabr_1 + " " + palabr_2;

        System.out.println("Las dos palabras unidas son: "+palabras_unidas);


      
    }
}