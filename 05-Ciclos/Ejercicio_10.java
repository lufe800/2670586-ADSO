import java.util.Scanner;
public class Ejercicio_10{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("|-------------------------------------------|");
        System.out.print("--> Ingrese un número del 1 al 11: ");
        int n = entrada.nextInt();


        int division = 1;
        int contador = 0;

        if(n <= 11){

            System.out.println("--> Los números primos encontrados son: ");
            for(int i =1; contador < (n*n); i++){

                int divisores = 0;
                for(int j = 1; j <= division; j++){

                    if(division % j == 0){
                        divisores += 1;
                    }
                }
                if(divisores == 2){
                    if(division < 100 && division > 9){
                      System.out.print("[0");   
                    }else if (division <9){
                      System.out.print("[00");  
                    }else{
                      System.out.print("[");
                    }

                    System.out.print(division+"]");
                    contador++;
                    division++;

                    if(contador % n == 0){
                        System.out.println();
                    }
                }else{
                    division = division + 1;
                }

            }

        }else{
            System.out.println("El número ingresado no es valido");
        }
    }
}