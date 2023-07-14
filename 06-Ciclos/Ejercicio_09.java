import java.util.Scanner;
public class Ejercicio_09{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("--> Ingrese un número entero N: ");
        int n = entrada.nextInt();

        int digito = 0;
        int sumador = 0;
        int numero = n;
        
        System.out.println();
        System.out.println("Raíz dígital: ");
        while(n != 0){
            digito = n % 10;
            n = n / 10;
            sumador = sumador + digito;

            if(n == 0 && sumador > 9){
                n = sumador;
                sumador = 0;    
            }   
            
        } 
        System.out.print(digito+" + "+digito+ " = "+sumador);  
        System.out.print("\nLa raíz dígital de " +numero+" es: "+sumador);
        

    }
}