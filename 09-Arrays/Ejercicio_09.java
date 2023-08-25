import java.util.Scanner;
public class Ejercicio_09{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" ");
        System.out.print(" => Ingrese un número entero N: ");
		int numeroN = entrada.nextInt();

        System.out.print(" => Ingrese un número entero M: ");
		int numeroM = entrada.nextInt();

        int arreglo[] = new int[numeroN];
        System.out.print("\nArreglo : ");
        //llenar el array con numeros aleatorios
        for(int i= 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random()*10);
            System.out.print("{ "+arreglo[i]+ " }"); 
        }

        int posicion = -1;
        //buscar el numero  m 
        int arrPos[] =  new int[arreglo.length];
       
        for(int i= 0; i < arreglo.length; i++){
            if(arreglo[i] == numeroM){ 
                posicion = i;  
                arrPos[i] = posicion;
           
            }
            if(posicion == -1){
             System.out.print("");  
            } 
        }
        //impresion del arreglo con las posiciones
        for(int i = 0; i < arrPos.length;i++){
            if(arrPos[i]!=0){
                System.out.println("Número buscado : "+numeroM+" posición: "+arrPos[i]);
            }
        }

        System.out.print("\n=> El número "+numeroM+ " se encuentra en la posición : "+posicion);
    }
}