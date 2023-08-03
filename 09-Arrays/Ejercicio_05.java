import java.util.Scanner;
public class Ejercicio_05{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //Pedir número
        System.out.print(" => Ingrese un número entero: ");
		int numero = entrada.nextInt();

        //Crear arreglo con tamaño ingresado
        float arreglo[] = new float[numero];
        //Llenar arreglo con numero aleatorio
        System.out.print("\nArreglo : ");
        for (int i = 0; i < arreglo.length; i++) { 
            arreglo[i] = (float)(Math.random()*100); 
            System.out.print("{ "+arreglo[i]+ " }"); 
        }
       
        float promedio = 0;
        for( int i = 0; i < arreglo.length; i++){ // mientras el iterador sea menor al tamaño del arreglo y este lo recorra
            promedio += arreglo[i]; // se almacenan los elementos en la variable promedio (como en la suma)
        }
        promedio = promedio / arreglo.length; //promedio es dividido por el tamaño total del arreglo, que es igual a la cantidad de espacios ocupados
        System.out.print("\n=> El promedio de todos los elementos es : "+promedio);
    }
}