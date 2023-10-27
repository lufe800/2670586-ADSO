import java.util.Scanner;
public class Ejercicio_01{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print(" => Ingrese un número : ");
		int n = entrada.nextInt();

        int impares [] = new int[n];

        int contador = 1;

             //Crear ciclo para llenar el arreglo
            for(int i = 0; i < impares.length; i++){ 
               impares[i] = contador;
               contador += 2;

            }
            //Ciclo para imprimir el arreglo
            for(int i= 0; i< impares.length;i++){
                System.out.print("{ "+impares[i]+ " }");
            }
            

    }
}