import java.util.Scanner;
public class Ejercicio_04{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero:");
        int numero = entrada.nextInt();

        int arreglo[] = new int[numero];
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random()*100);
        }

        int minimo =  arreglo[0];
        for(int i = 0; i < arreglo.length;i++){
            if(arreglo[i] < minimo){// busca valor mínimo
                minimo = arreglo[i];
            }    
        }
        System.out.print("\nArreglo : ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("{ " + arreglo[i] + " }");
        }    
        System.out.print("\n=> El valor mínimo del arreglo es : "+minimo);
    }
}