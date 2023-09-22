public class Ejercicio_09{

    public static void main(String[]args){
        System.out.println("+--------------------------------+");
        System.out.println("+     FUNCIÓN ARREGLO MENOR      +");
        System.out.println("+--------------------------------+");

        int[] numeros = {5,4,3,2,1};
        arreglo(numeros); 

        int[] numeros2 = {2,7,3,8,0};
        arreglo(numeros2); 
    }

    public static void arreglo(int[] numeros){
        int menor = numeros[0];
        for(int i=1; i<numeros.length; i++){
            if(numeros[i]<menor){
                menor = numeros[i];
            }
        }
        System.out.println("El número menor es: " + menor);
    }
}