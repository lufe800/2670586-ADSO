public class Ejercicio_03{

    public static void main(String[]args){

        System.out.println("+-----------------------------+");
        System.out.println("+      FUNCIÓN MULTIPLICAR    +");
        System.out.println("+-----------------------------+");

        System.out.println("Multiplicación = "+multiplicar(5, 4));
        System.out.println("Multiplicación = "+multiplicar(3, 6));
        System.out.println("Multiplicación = "+multiplicar(34, 2));
        System.out.println("Multiplicación = "+multiplicar(4, 9));
        System.out.println("Multiplicación = "+multiplicar(8, 9));
    }

    public static int multiplicar(int a, int b){
        int resultado = (a*b);
        return resultado;  
    }


}