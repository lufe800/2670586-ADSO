public class Ejercicio_02{

    public static void main(String[]args){

        System.out.println("+------------------------+");
        System.out.println("+      FUNCIÓN RESTAR    +");
        System.out.println("+------------------------+");

        System.out.println("Resta = "+restar(40, 5));
        System.out.println("Resta = "+restar(27, 6));
        System.out.println("Resta = "+restar(12, 6));
        System.out.println("Resta = "+restar(50, 25));
        int restica = restar(25, 10);
        System.out.println("=> Restica = "+restica);

    }

    public static int restar(int a, int b){
        int resultado = (a-b);
        return resultado;
      
    }
}