public class Ejercicio_15{

    public static void main(String[]args){
        System.out.println("+----------------------+");
        System.out.println("+  FUNCIÓN FIBONACCI   +");
        System.out.println("+----------------------+");

        int enesimo = 10;

        int resultado = fibonacci(enesimo);
        System.out.println("El Fibonacci en posición " +enesimo+ " es: " + resultado);
    }

    public static int fibonacci(int enesimo){
        if(enesimo<=1){
            return enesimo;
        }

        int actual = 0;
        int anterior = 1;
        int fibonacci = 0;

        for(int i= 2; i<= enesimo; i++){
            fibonacci = actual + anterior; 
            actual = anterior;
            anterior = fibonacci;    
        } 
        return fibonacci;
    }
}