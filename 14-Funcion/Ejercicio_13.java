public class Ejercicio_13{

    public static void main(String[]args){
        System.out.println("+--------------------------------+");
        System.out.println("+  FUNCIÓN ARREGLO ASCENDENTE   +");
        System.out.println("+--------------------------------+");

        int[] ascendente = {5,4,3,2,1};
        arregloAscendente(ascendente);

        int[] ascendente1 = {3,8,5,9,11,0,4};
        arregloAscendente(ascendente1);

        
        int[] ascendente2 = {1,0,5,10,9,6,7};
        arregloAscendente(ascendente2);

        int[] ascendente3 = {37,22,30,33,24,6,8};
        arregloAscendente(ascendente3);

        int[] ascendente4 = {9,8,7,6,5,4,3,2,1,0};
        arregloAscendente(ascendente4);

    }

    public static void arregloAscendente(int[] ascendente){
        
        for(int i=0; i<ascendente.length-1; i++){  //recorre arreglo - 1 posicion de longitud
            for(int j=0; j<ascendente.length-1-i; j++){ //recorre arreglo y compara valores hasta el indice
                if(ascendente[j] > ascendente[j+1]){ // si valor es mayor a valor siguiente
                    int aux = ascendente[j];
                    ascendente[j] = ascendente[j+1]; //intercambio de valores
                    ascendente[j+1] = aux;
                }
            }
        }
        System.out.print("\nAscendente: ");
        for (int i = 0; i < ascendente.length; i++) {
            System.out.print("{ "+ascendente[i]+ " }");
        }
    }
}