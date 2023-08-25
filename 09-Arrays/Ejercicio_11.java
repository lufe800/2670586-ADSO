import java.util.Scanner;
public class Ejercicio_11{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" => Ingrese un número entero N: ");
		int numeroN = entrada.nextInt();

        System.out.print(" => Ingrese un número entero M: ");
		int numeroM = entrada.nextInt();

        int arregloA[] = new int[numeroN];
        System.out.print("\nArreglo 1 : ");
        for(int i = 0; i < arregloA.length; i++){
            arregloA[i] = (int)(Math.random()* numeroN);
            System.out.print("{ "+arregloA[i]+ " }");     
        }

        int arregloB[] = new int[numeroM];
        System.out.print("\nArreglo 2 : ");
        for(int i = 0; i < arregloB.length;i++){
            arregloB[i] = (int)(Math.random()*numeroM);
            System.out.print("{ "+arregloB[i]+ " }"); 
        }    

        int arregloC[] = new int[arregloA.length + arregloB.length]; // sumo las dos longitudes de los arreglos a y b en el arreglo c
        for(int i = 0; i < arregloA.length; i++){// copiar el arreglo a al arreglo c
            arregloC[i] = arregloA[i];
        }
        for(int i = 0; i < arregloB.length; i++){
            arregloC[arregloA.length + i] = arregloB[i]; // copio el arreglo b al c con longitud a
        }
        
        //ordenar de forma ascendente
        System.out.print("\nArreglo 3 : ");
        
        for(int i = 0; i < arregloC.length -1; i++){//recorre el arreglo, hasta poner en posición final al elemento mas grande
            for(int j = 0; j < arregloC.length -1-i; j++){// segunda pasada para eliminar posición de indice ya asignada
                if(arregloC[j] > arregloC[j + 1]){
                    int aux = arregloC[j];// comparación de elementos
                    arregloC[j] = arregloC[j + 1];
                    arregloC[j + 1] = aux;
                }

            }
        }
        for (int i = 0; i < arregloC.length-1; i++) {//-1 para que no excesa la longitud el arreglo
            System.out.print("{ "+arregloC[i+1]+ " }"); 
        } 
        
       
        
        

    }
}