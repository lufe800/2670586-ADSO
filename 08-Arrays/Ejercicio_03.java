import java.util.Scanner;

public class Ejercicio_03{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" => Ingrese un número entero : ");
		int n = entrada.nextInt();

        int posicion [] = new int[n];

        for(int i=0; i < posicion.length; i++){
            posicion[i] = i+1;
        }
        System.out.print(" => Ingrese una posición : ");
		int posi = entrada.nextInt();

        System.out.print("\nArreglo : ");
        for (int i = 0; i < posicion.length; i++) {
            System.out.print("{ "+posicion[i]+ " }");
        }
        System.out.print("\nPosición : "+posi);

        System.out.print("\nAntihorario : ");
        for(int i = posi; i >= 0; i--) {
                System.out.print("{ "+posicion[i]+" }");
            } 
        for (int i = posicion.length-1 ; i > posi; i--) {
            System.out.print("{ "+posicion[i]+ " }");
       }     
 
}   }
    
