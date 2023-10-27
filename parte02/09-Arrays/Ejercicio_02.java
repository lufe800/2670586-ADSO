import java.util.Scanner;
public class Ejercicio_02{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero:");
        int numero = entrada.nextInt();

        int arreglo[] = new int[numero];
        System.out.print("\nArreglo : ");
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random()*20);
            System.out.print("{ "+arreglo[i]+ " }");
        }

        int multiplicar = 1;
        for(int i = 0; i < arreglo.length;i++){
            multiplicar *= arreglo[i];
        }
        System.out.print("\n=> El resultado de la multiplicación es : "+multiplicar);
    }
}