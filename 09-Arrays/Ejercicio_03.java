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

        int maximo =  arreglo[0]; // debe estar en 0 para que minimo tenga un valor válido con el cual comparar otros elementos
        for(int i = 0; i < arreglo.length;i++){ //se itera para comparar el valor maximo con los demas valores
            if(arreglo[i] > maximo){ // si el elemento actual es mayor a maximo, entonces se almacena en la variable
                maximo = arreglo[i];
            }    
        }
        System.out.print("\nArreglo : "); //imprimir
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("{ " + arreglo[i] + " }");
        }    
        System.out.print("\n=> El valor máximo del arreglo es : "+maximo);
    }
}