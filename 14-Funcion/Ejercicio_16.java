public class Ejercicio_16{

    public static void main(String[]args){
        System.out.println("+--------------------------+");
        System.out.println("+  FUNCIÓN CUENTA DíGITOS  +");
        System.out.println("+--------------------------+");

        System.out.println("");
        int numero = 27689;
        digitos(numero);

        System.out.println("");
        int numero2 = 256789;
        digitos(numero2);

        System.out.println("");
        int numero3 = 459022;
        digitos(numero3);

        System.out.println("");
        int numero4 = 10968881;
        digitos(numero4);

        System.out.println("");
        int numero5 = 3406459;
        digitos(numero5);

    }

    public static void digitos(int numero){
        int cuentaDigitos= 0;
        int numInicial= numero;

    
        while(numero > 0){
            numero /= 10;
            cuentaDigitos++;
        }
        System.out.print("El número "+numInicial+ " tiene "+cuentaDigitos+ " dígitos.");
    }
}