public class Ejercicio_04{


    public static void main(String[]args){

        System.out.println("+-----------------------------+");
        System.out.println("+      FUNCIÓN 1 DIVISIÓN     +");
        System.out.println("+-----------------------------+");

        float[] division = new float[10];
        dividir(division);

        for(int i=0; i<division.length; i++){
            System.out.println(division[i]+ " ");
        }

        System.out.println("+-----------------------------+");
        System.out.println("+      FUNCIÓN 2 DIVISIÓN     +");
        System.out.println("+-----------------------------+");


        System.out.println("División = "+dividir2(20, 4));
        System.out.println("División = "+dividir2(46, 2));
        System.out.println("División = "+dividir2(15, 3));
        System.out.println("División = "+dividir2(12, 2));

    }

    public static void dividir(float[]array){
        int i= 0;
        for(i=0; i<array.length; i++){
        array[i] = (float)i/4;
        }
    }

    public static int dividir2(int a, int b){
        int resultado = (a/b);

        return resultado;
    }
    
}