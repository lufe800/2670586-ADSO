public class Ejercicio_05{


    public static void main(String[]args){
        System.out.println("+----------------------------------+");
        System.out.println("+      FUNCIÓN 1 POTENCIA (FOR)    +");
        System.out.println("+----------------------------------+");


        System.out.println("Potencia: "+potencia(2,3));
        System.out.println("Potencia: "+potencia(6,2));
        System.out.println("Potencia: "+potencia(8,3));
        System.out.println("Potencia: "+potencia(9,4));


        System.out.println("+------------------------------------+");
        System.out.println("+      FUNCIÓN 2 POTENCIA (WHILE)    +");
        System.out.println("+------------------------------------+");

        System.out.println("Potencia: "+potencia2(5,3));
        System.out.println("Potencia: "+potencia2(6,4));
        System.out.println("Potencia: "+potencia2(12,3));
        System.out.println("Potencia: "+potencia2(7,2));
    }

    public static int potencia(int base, int exponente){
        int resultado = 1; //inicializado a 1 para que se pueda multiplicar
        for(int i=0; i<exponente; i++){
            resultado *= base;
        }
        return resultado;

    }

    public static int potencia2(int base, int exponente){
        int resultado = 1;
        int i = 0;

        while(i<exponente){
            resultado *=base;
            i++;
        }
        return resultado;
    }
}