import java.util.Scanner;
public class Ejercicio_06{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" => Ingrese un número entero N: ");
		int numeroN = entrada.nextInt();

        System.out.print(" => Ingrese un número entero M: ");
		int numeroM = entrada.nextInt();

        int arreglo[] = new int[numeroN];
        System.out.print("\nArreglo : ");
        for(int i= 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random()*10);
            System.out.print("{ "+arreglo[i]+ " }"); 
        }
          int contador = 0;
        for(int i= 0; i < arreglo.length; i++){
            if(arreglo[i] == numeroM){
                contador++;
                
            }
        }
        System.out.print("\n=> Las repeticiones del número "+numeroM+ " son : "+contador);
    }
}