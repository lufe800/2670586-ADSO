import java.util.Scanner;
public class Ejercicio_10{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" => Ingrese un número entero N: ");
		int numero = entrada.nextInt();

        int arregloA[] = new int[numero]; // creo el arreglo con datos entregados por usuario
        // llenar arreglo con datos aleatorios
        System.out.print("\nArreglo 1 : ");
        for(int i = 0; i < arregloA.length; i++){
            arregloA[i] = (int)(Math.random()*numero);
            System.out.print("{ "+arregloA[i]+ " }"); 
        }

        int arregloB[] = new int[arregloA.length];
        // pasar datos de un arreglo al otro
        System.out.print("\nArreglo 2 : ");
        for(int i = 0; i < arregloA.length;i++){
            arregloB[i] = (int)(Math.random()*arregloA[i]);// gerar datos nuevos con random
            System.out.print("{ "+arregloB[i]+ " }");
            
        }


    }
}