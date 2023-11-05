import java.util.Scanner;
public class Ejercicio_07{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero:");
        int numero = entrada.nextInt();

        int arreglo[] = new int[numero];

        System.out.print("\nArreglo : ");
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random()*100);
            System.out.print("{ "+arreglo[i]+ " }");
        }

        for (int i = numero; i < arreglo.length-1; i++){ // recorre el arreglo desde el primero hasta el penultimo ya que el ultimo es el que cambia
            for(int j = 0; j < arreglo.length-1-i; i++){// recorre todo, pero se detiene una posición antes en cada vuelta (-1-i)
                if(arreglo[i] < arreglo[i+1]){ // itera, compara y cambia el orden de los elementos con aux
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[i+1];
                    arreglo[i+1] = aux;
                }
            }
        }

        System.out.print("\nEl número invertido es : "); // imprimir
        for (int i = arreglo.length-1; i >= 0; i--) {
            System.out.print("{ "+arreglo[i]+ " }");
        } 
    }
}