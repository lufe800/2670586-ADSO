import java.util.Scanner;
public class Ejercicio_03{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero:");
        int numero = entrada.nextInt();

        int arreglo[] = new int[numero];
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random()*100);
        }

        int maximo =  arreglo[0];
        for(int i = 0; i < arreglo.length;i++){
            if(arreglo[i] > maximo){
                maximo = arreglo[i];
            }    
        }
        System.out.print("\nArreglo : ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("{ " + arreglo[i] + " }");
        }    
        System.out.print("\n=> El valor máximo del arreglo es : "+maximo);
    }
}