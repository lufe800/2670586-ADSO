import java.util.Scanner;
public class Ejercicio_01{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("--> Ingrese un número entre 1 y 6: ");
        int numero = entrada.nextInt();

        int aleatorio, producto;
        String num1= "", num2= "";

        if(numero > 0 && numero <=6){

            for(int i = 1; i <= numero; i++){
                
                aleatorio = (int)(Math.random() *9) + 0;                
                num1 = String.valueOf(aleatorio);
                num2 += num1;                
                
            }
            producto = Integer.parseInt(num2)*2;
            System.out.print("El número construído es: "+num2);
            System.out.print("\nEl producto es: "+ producto);

        }else{
          System.out.print("Número invalido, debe ingresar entre 1 y 6");
            
        }



    }


}