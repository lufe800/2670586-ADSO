import java.util.Scanner;
public class Ejercicio_12{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" => Ingrese un número entero N: ");
		int numero = entrada.nextInt();

        int arreglo[] = new int[numero];
        System.out.print("\nArreglo : ");
        for(int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random()*1000);
            System.out.print("{ "+arreglo[i]+ " }");
        }

        
    }
}