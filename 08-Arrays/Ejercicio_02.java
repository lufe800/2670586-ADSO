import java.util.Scanner;
public class Ejercicio_02{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print(" => Ingrese un número : ");
		int numero = entrada.nextInt();

        int arreglo[] = new int[numero];
        int contPrimos = 0;
        int primo = 2;
    
        while(contPrimos < numero){
            // verificar si el numero es primo
            int divisores = 0;
            for(int i = 1; i <= primo;i++){
                if(primo % i == 0){
                    divisores++;
                }
            }
            //Si es primo...
            if(divisores == 2){
              // se almacena el numero en el arreglo
              arreglo[contPrimos] = primo;
              //Aumentamos contPrimos
              contPrimos+= 1;

            }
            //Aumentar primo
            primo++;
        }
            //Imprimir arreglo
        System.out.print("Lista de Primos Generada: ");
        for(int i=0; i<numero; i++){
            System.out.print("{ "+arreglo[i]+ " }");
        }
        
    }
}