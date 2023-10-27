public class Ejercicio_08{


    public static void main(String[]args){
        System.out.println("+--------------------------------+");
        System.out.println("+     FUNCIÓN IMPRIMIR ARREGLO   +");
        System.out.println("+--------------------------------+");

        int[] numeros = {5,4,3,2,1};
        arreglo(numeros);

        int[] numeros2 = {6,7,8,9,10};
        arreglo(numeros2);

        int[] numeros3 = {10,34,1,9,0};
        arreglo(numeros3);

    }

    public static void arreglo(int[]numeros){
        System.out.println("");
        for(int i=0; i<numeros.length; i++){
            System.out.print("{ "+numeros[i]+ " }");
        }
    }
}