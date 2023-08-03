import java.util.Scanner;
public class Ejercicio_05{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = entrada.nextInt();

        int arreglo[] = new int [numero];
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = i;
        }

        System.out.print("Ingrese número de movimientos: ");
        int movimientos = entrada.nextInt();

        System.out.print("\nArreglo : ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("{ "+arreglo[i]+ " }");
        }
        System.out.print("\nNúmero de movimientos : "+movimientos);

        int aux = arreglo[0];
        for(int i = 1; i < movimientos; i++){
           arreglo[0] = arreglo[i];
           for(int j = movimientos; j > arreglo.length-1; j--){
            arreglo[j+1] = arreglo[j];
           }
           arreglo[arreglo.length - 1]= aux;
            //System.out.print("\nMovimiento "+i+" :");
            for(i = 0; i < arreglo.length;i++){
                System.out.print("\nMovimiento "+i+" :"+ " { "+arreglo[i]+" }");
            }
        }

    }
 }