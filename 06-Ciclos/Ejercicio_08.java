import java.util.Scanner;
public class Ejercicio_08{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("--> Ingrese un número N: ");
        int n = entrada.nextInt();

        if(n % 2 == 0){
            int contador = 0;
            int division = 0;
            int divisores= 0;
            int i = 0;

            for(int filas=1; filas <= n; filas++){
                for(int columnas=1; columnas <= n; columnas++){
                    if(contador%2 ==0){
                        for(i=1; contador < n; i++){
                            for(division = 1; division <= i/2; division++){
                                if(i % division == 0){
                                    divisores += 2;
                                }
                            }
                        }
                        if(divisores == 2){
                            contador++;
                            System.out.print("["+division+"]");
                        } 
                                  
                    }else{
                        
                        for(i=1; contador<n; i++){
                            for(division = 1; division <= i/2; division++){
                                if(i % division == 0){
                                    divisores += 2;
                                }
                            }
                        }
                        if(divisores > 2){
                            contador++;
                            System.out.print("["+(((division<10)? "00":((division<100)? "0":""))+division)+"]");
                        }
                        
                    }
                    contador = contador + 1;
                }
                System.out.println("");
            }   

        }else{
        System.out.print("Número inválido.");    
        }
    }
}