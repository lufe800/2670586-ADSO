import java.util.Scanner;
public class Ejercicio_01{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero:");
        int numero = entrada.nextInt();

        String arreglo[] = new String[numero];
        
        for(int i = 0; i < numero; i++){
            System.out.print("Ingrese un nombre: ");
            arreglo[i] = entrada.next();
            
        }
        System.out.println(" ");
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("El nombre ingresado es : "+arreglo[i]);
        }   
        
    }
}