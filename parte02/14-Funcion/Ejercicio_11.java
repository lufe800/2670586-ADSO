public class Ejercicio_11{


    public static void main(String[]args){
        System.out.println("+-------------------------+");
        System.out.println("+    FUNCIÓN FACTORIAL    +");
        System.out.println("+-------------------------+");

        int factorial = factoriales(5);
        System.out.println("=> FACTORIAL:"+factorial);

        factorial = factoriales(8);
        System.out.println("=> FACTORIAL:"+factorial);
    }

    public static int factoriales(int numero){
        int factorial = 1;
        for(int i=1; i<=numero; i++){
            factorial *= i;   
        }
        return factorial;
    }
}