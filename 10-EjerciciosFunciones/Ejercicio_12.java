public class Ejercicio_12{

    public static void main(String[]args){
        System.out.println("+----------------------+");
        System.out.println("+    FUNCIÓN PRIMO     +");
        System.out.println("+----------------------+");

        int numero = 17;
        boolean numPrimo = numPrimo(numero);

        if(numPrimo){
            System.out.println("=> "+numero + " Es primo.");
        }else{
            System.out.println("=> "+numero + " No es primo.");
        }

        System.out.println("");

        numero = 1;
        numPrimo = numPrimo(numero);

        if(numPrimo){
            System.out.println("=> "+numero + " Es primo.");
        }else{
            System.out.println("=> "+numero + " No es primo.");
        }

        System.out.println("");

        numero = 4;
        numPrimo = numPrimo(numero);

        if(numPrimo){
            System.out.println("=> "+numero + " Es primo.");
        }else{
            System.out.println("=> "+numero + " No es primo.");
        }

    }

    public static boolean numPrimo(int numero){

        if(numero <= 1){
            return false;
        }
        for(int i=2; i<numero; i++){
            if(numero % i == 0){
                return false;
            }
        }

        return true;
    }
}