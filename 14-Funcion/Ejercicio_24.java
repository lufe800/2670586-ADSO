public class Ejercicio_24{

    public static void main(String[]args){
        System.out.println("+------------------------------------+");
        System.out.println("+  FUNCIÓN ARREGLO PARES E IMPARES   +");
        System.out.println("+------------------------------------+");

        int[] arreglo1 ={5, 34, 8, 9, 12, 13, 25};
        paresImpares(arreglo1);

        int[] arreglo2 ={47,3,1,5,8,9,49,21,2};
        paresImpares(arreglo2);

        int[] arreglo3 ={6, 12, 24, 5,};
        paresImpares(arreglo3);

        int[] arreglo4 ={7, 4, 6, 35, 76, 63};
        paresImpares(arreglo4);

        int[] arreglo5 ={6,8,23,12,45,44,23,8};
        paresImpares(arreglo5);
    }

    public static void paresImpares(int[]arreglo){
        int cuentaPares = 0;
        int cuentaImpares = 0;

        for(int i=0; i < arreglo.length; i++){
            if(arreglo[i] % 2==0){
                cuentaPares++;
            }
            if(arreglo[i] % 2!=0){
                cuentaImpares++;
            }
        }
        System.out.println("Los números pares encontrados: "+cuentaPares);
        System.out.println("");
        System.out.println("Los números impares encontrados: "+cuentaImpares);    

    }
}