public class Ejercicio_14{

    public static void main(String[]args){
        System.out.println("+-------------------------------+");
        System.out.println("+  FUNCIÓN ARREGLO ASCENDENTE   +");
        System.out.println("+-------------------------------+");

        int[] ascendente = {5,4,3,2,1};
        verificarArregloAscendente(ascendente);

        int[] ascendente1 = {3,8,5,9,11,0,4};
        verificarArregloAscendente(ascendente1);

        
        int[] ascendente2 = {1,0,5,10,9,6,7};
        verificarArregloAscendente(ascendente2);

        int[] ascendente3 = {37,22,30,33,24,6,8};
        verificarArregloAscendente(ascendente3);

        int[] ascendente4 = {9,8,7,6,5,4,3,2,1,0};
        verificarArregloAscendente(ascendente4);

    }

    public static void verificarArregloAscendente(int[] ascendente){

        boolean ordenado = false;
        for(int i=0; i<ascendente.length-1; i++){  
            for(int j=0; j<ascendente.length-1-i; j++){ 
                if(ascendente[j] > ascendente[j+1]){ 
                    int aux = ascendente[j];
                    ascendente[j] = ascendente[j+1]; 
                    ascendente[j+1] = aux;
                    ordenado = true;
                }
                
            }
        }
        System.out.print("\nAscendente: ");
        for (int i = 0; i < ascendente.length; i++) {
            System.out.print("{ "+ascendente[i]+ " }");
        }
        System.out.println("\n¿El arreglo está ordenado de forma ascendente? " + ordenado);
    }
}