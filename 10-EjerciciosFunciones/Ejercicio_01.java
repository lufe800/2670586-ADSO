public class Ejercicio_01{

    public static void main(String[]args){

        System.out.println("+-----------------------+");
        System.out.println("+      FUNCIÓN SUMAR    +");
        System.out.println("+-----------------------+");

        System.out.println("Suma = "+sumar(4, 15));
        System.out.println("Suma = "+sumar(3, 5));
        System.out.println("Suma = "+sumar(10, 2));
        System.out.println("Suma = "+sumar(4, 4));
        System.out.println("Suma = "+sumar(6, 7));

    }

    public static int sumar(int a, int b){
        int resultado = (a+b);
        return resultado;   
    }
}