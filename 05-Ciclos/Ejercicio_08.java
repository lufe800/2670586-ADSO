import java.util.Scanner;
public class Ejercicio_08{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int numero;
        int i = 1;

        System.out.print("--> Ingrese un número de máximo 6 dígitos: ");
        numero = entrada.nextInt();

        if(numero <= 0 && numero > 999999){
           
           int d1 = (numero % 100000)/10;
           int d2 = (numero % 10000)/10;
           int d3 = (numero % 1000)/10;
           int d4 = (numero % 100)/10;
           int d5 = (numero % 10)/10;
           int d6 = numero % 10;

           System.out.println("El dígito 01 es: "+d1);
           System.out.println("El dígito 02 es: "+d2);
           System.out.println("El dígito 03 es: "+d3);
           System.out.println("El dígito 04 es: "+d4);
           System.out.println("El dígito 05 es: "+d5);
           System.out.println("El dígito 06 es: "+d6);

        }else{
            System.out.print("El número ingresado no es valido."); 
        }
        
        
        
    }
}