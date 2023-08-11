import java.util.Scanner;
public class Ejercicio_09{
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

        int posicion = -1;
        for(int i= 0; i < arreglo.length; i++){
            if(arreglo[i] == numeroM){ 
                posicion = i;  
           
            }
            if(posicion == -1){
             System.out.print("");  
            } 
        }
        System.out.print("\n=> El número "+numeroM+ " se encuentra en la posición : "+posicion);
    }
}