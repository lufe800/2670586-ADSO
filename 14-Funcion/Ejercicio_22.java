public class Ejercicio_22{

    public static void main(String[]args){
        System.out.println("+--------------------------------------------+");
        System.out.println("+  FUNCIÓN LLENAR ARREGLO CON NÚMEROS PRIMOS +");
        System.out.println("+--------------------------------------------+");

        
        System.out.println("");
        int numero1 = 10;
        arregloPrimos(numero1);

        
        System.out.println("");
        int numero2 = 5;
        arregloPrimos(numero2);

        System.out.println("");
        int numero3 = 8;
        arregloPrimos(numero3);

        
        System.out.println("");
        int numero4 = 6;
        arregloPrimos(numero4);

    }

    public static void arregloPrimos(int numero){

        int[] arreglo = new int[numero];

        int contaPrimos = 0;
        int primo = (int) (Math.random()*1000);

        while(contaPrimos < numero){
            int divisores = 0;
            for(int i = 1; i<=primo; i++){
                if(primo % i==0){
                    divisores++;
                }
            }

            if(divisores == 2){
                arreglo[contaPrimos] = primo;
                contaPrimos += 1;
            }
            primo++;
        }

        System.out.print("Lista de Primos Generada: ");
        for(int i=0; i<numero; i++){
            System.out.print("{ "+arreglo[i]+ " }");
        }



    }
}