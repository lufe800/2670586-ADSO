import java.util.Scanner;
public class Ejercicio_04{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" => Ingrese un número entero : ");
		int numero = entrada.nextInt();

        int descendente [] = new int[numero];

        for(int i=0; i < descendente.length; i++){
            descendente[i] = i;
        }

        for (int i = numero; i < descendente.length-1; i++) {
            for(int j = 0; j < descendente.length-1-i; i++){
                if(descendente[i] < descendente[i+1]){
                    int aux = descendente[i];
                    descendente[i] = descendente[i+1];
                    descendente[i+1] = aux;
                }
            }
        }
           
        System.out.print("\nDescendente : ");
        for (int i = descendente.length-1; i >= 0; i--) {
            System.out.print("{ "+descendente[i]+ " }");
        }     
          

    }
}