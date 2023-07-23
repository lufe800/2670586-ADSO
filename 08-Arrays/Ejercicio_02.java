import java.util.Scanner;
public class Ejercicio_02{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print(" => Ingrese un número : ");
		int numero = entrada.nextInt();

        int primos[] = new int[numero];
    
        for(int i = 0; i < primos.length; i++){
            primos[i] = i;
            int contador = 0;

            for(int j = 2; j < primos[i];j++){
                if(primos[i] % j == 0){
                    contador++;
                }
            }
            if(contador == 0 && primos[i] > 1){
                System.out.print("{ "+primos[i]+ " }");
            }
        }

       
    }
}