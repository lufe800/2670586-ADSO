import java.util.Scanner;

public class Ejercicio_02{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número de 4 dígitos: ");
        int numero = entrada.nextInt();

        if(numero >= 0 && numero <= 9999 ){

            int d1 = (numero / 1000) % 10;
            int d2 = (numero / 100) % 10;
            int d3 = (numero / 10) % 10;
            int d4 = numero % 10;

            if(d1 >= d2 && d1 >= d3 && d1 >= d4 ){
                System.out.print("El número máximo es: "+d1);

            }else if(d2 >= d1 && d2 >= d3 && d2 >= d4){
                System.out.print("El número máximo es: "+d2);

            }else if(d3 >= d1 && d3 >= d2 && d3 >=d4){
                System.out.print("El número máximo es: "+d3);

            }else if(d4 >= d1 && d4 >= d2 && d4 >=d3){
                 System.out.print("El número máximo es: "+d4);
            }
      
        
        }else{
            System.out.print("El número no es valido.");
        }



    }
}