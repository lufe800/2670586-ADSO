public class Ejercicio_10{

    public static void main(String[]args){
        System.out.println("+--------------------------------+");
        System.out.println("+    FUNCIÓN ARREGLO PROMEDIO    +");
        System.out.println("+--------------------------------+");

        float[] numeros = {4,3,2,4,3};
        arreglo(numeros);

        float[] numeros2 = {2,4,3,3};
        arreglo(numeros2);
    }

    public static void arreglo(float[] numeros){
        float valor = 0;
        for(int i=0; i<numeros.length; i++){
            valor += numeros[i]; 
        }
        float promedio = (valor / numeros.length);
        System.out.println("=> Promedio: " +promedio);
    }
}