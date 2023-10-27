import java.util.Scanner;
public class Ejercicio_03 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("--> Ingrese un número N: ");
    int n = entrada.nextInt();
    
    int contador = 0;
    for(int i=2; contador<n; i++){ 
      
      int divisores = 0;
      for(int division = 1; division <= i/2; division++){
        if(i % division == 0){
          divisores += 2;
        }
      }
      
      if(divisores == 2){
        contador++;
        System.out.print("\nPrimo "+contador +" generado: "+i);
      }
      
    } 

  }
}