import java.util.Scanner;
public class Ejercicio_01{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //Pedir número
        System.out.print(" => Ingrese un número entero: ");
		int numero = entrada.nextInt();

        //Crear arreglo con tamaño ingresado
        int arreglo[] = new int[numero];
        //Llenar arreglo con numero aleatorio
        System.out.print("\nArreglo : ");
        for (int i = 0; i < arreglo.length; i++) { // i recorre cada elemento del arreglo hasta llegar a su tamaño
            arreglo[i] = (int)(Math.random()*100); //el elemento del arreglo [i] se llena con numeros aleatorios del 0 al 99 y los convierte en enteros con (int)
            System.out.print("{ "+arreglo[i]+ " }"); //se imprime el arreglo generado con aleatorios
        }
       
        int suma = 0; // se crea la variable suma para almacenar la suma acumulada de elementos
        for( int i = 0; i < arreglo.length; i++){ // mientras el iterador sea menor al tamaño del arreglo y este lo recorra
            suma+= arreglo[i]; //sumar cada elemento con arreglo
        }
        System.out.print("\n=> El resultado de la suma es : "+suma);
    }
}