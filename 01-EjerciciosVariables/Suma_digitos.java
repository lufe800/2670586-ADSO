import java.util.Scanner;

public class Suma_digitos{
    public static void main(String []args){
        Scanner sumad = new Scanner(System.in);

        int suma, num, cifra;
        

        System.out.println("Ingrese el número entero de 5 digitos");
        num = sumad.nextInt();
        suma = 0;

        while (num > 0){

        cifra = num % 10;
        suma = suma + cifra;
        num /= 10;

        System.out.println("La suma de los digitos es : "+suma);

        }


    }


}