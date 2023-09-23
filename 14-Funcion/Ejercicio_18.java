public class Ejercicio_18{

    public static void main(String[]args){
        System.out.println("+----------------------------+");
        System.out.println("+  FUNCIÓN NUMERO INVERSO    +");
        System.out.println("+----------------------------+");

        System.out.println("");
        int numero = 12345;
        int inverso = numInverso(numero);
        System.out.print("El inverso del número "+numero+ " es: "+inverso);


        System.out.println("");
        int numero1 = 822341;
        inverso = numInverso(numero1);
        System.out.print("El inverso del número "+numero1+ " es: "+inverso);

        System.out.println("");
        int numero2 = 6754;
        inverso = numInverso(numero2);
        System.out.print("El inverso del número "+numero2+ " es: "+inverso);

        System.out.println("");
        int numero3 = 83568;
        inverso = numInverso(numero3);
        System.out.print("El inverso del número "+numero3+ " es: "+inverso);
    }

    public static int numInverso(int numero){
        int contador = 0;
        int inverso= 0;
        while(numero>0){
            int digito = numero % 10;
            inverso = inverso * 10 + digito;
            numero /= 10;
        }
        return inverso;
    }
}