public class Ejercicio_07{


    public static void main(String[]args){
        System.out.println("+----------------------------------+");
        System.out.println("+     FUNCIÓN ARREGLO ALEATORIO    +");
        System.out.println("+----------------------------------+");

        int[] numeros = new int[10];
        arreglo(numeros);

        System.out.print("ARREGLO 1: ");
        for(int i=0; i<numeros.length; i++){
            System.out.print("{ "+numeros[i]+ " }");
        }

        System.out.println("");

        int[] numeros2 = new int[15];
        arreglo(numeros2);

        System.out.print("ARREGLO 2: ");
        for(int i=0; i<numeros2.length; i++){
            System.out.print("{ "+numeros2[i]+ " }");
        }

        System.out.println("");

        int[] numeros3 = new int[4];
        arreglo(numeros3);

        System.out.print("ARREGLO 3: ");
        for(int i=0; i<numeros3.length; i++){
            System.out.print("{ "+numeros3[i]+ " }");
        }

        System.out.println("");

        int[] numeros4 = new int[7];
        arreglo(numeros4);

        System.out.print("ARREGLO 4: ");
        for(int i=0; i<numeros4.length; i++){
            System.out.print("{ "+numeros4[i]+ " }");
        }

        System.out.println("");

        int[] numeros5 = new int[8];
        arreglo(numeros5);

        System.out.print("ARREGLO 5: ");
        for(int i=0; i<numeros5.length; i++){
            System.out.print("{ "+numeros5[i]+ " }");
        }
    }



    

    public static void arreglo(int[]numeros){
        for(int i=0; i<numeros.length;i++){
            numeros[i] = (int)(Math.random()*100);
        }
    } 
}