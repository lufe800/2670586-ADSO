import java.util.Scanner;
public class Ejercicio_08{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero:");
        int numero = entrada.nextInt();

        int arreglo[] = new int[numero]; // crear un arreglo general
        int pares[] = new int[arreglo.length]; // crear arreglo de pares
        int impares[] = new int[arreglo.length]; // crear arreglo de impares

        int contaPares = 0; // esta variable me ayuda a almacenar los pares
        int contaImpares = 0; //Almacena los impares
        

        System.out.print("\nArreglo : "); // llenar arreglo con random * 100
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random()*100);
            System.out.print("{ "+arreglo[i]+ " }");
        }

        for(int i = 0; i < arreglo.length; i++){
            if (arreglo[i] % 2 == 0){ // válidar si es par o impar
                pares[contaPares] = arreglo[i]; // se asigna al contador de pares para que se almacenen los valores hallados
                contaPares++;
            }else{
                impares[contaImpares] = arreglo[i]; // se guardan los impares
                contaImpares++;
            }
        }
        System.out.print("\nNúmeros Pares : "); // imprimir
        for(int i = 0; i < contaPares; i++){
            System.out.print("{ "+pares[i] + " }");
        }

        System.out.print("\nNúmeros Impares : ");
        for(int i = 0; i < contaImpares; i++){
            System.out.print("{ "+impares[i] + " }");
        }
    }
}