import java.util.Scanner;
public class Ejercicio_07{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int num1, num2, num3, i = 2;
        int mcm = 1;

        System.out.print("--> Ingresar numero uno: ");
        num1 = entrada.nextInt();

        System.out.print("--> Ingresar numero dos: ");
        num2 = entrada.nextInt();

        System.out.print("--> Ingresar numero tres: ");
        num3 = entrada.nextInt();

        while(i <= num1 || i <= num2 || i <= num3){
            if(num1 % i == 0 || num2 % i == 0 || num3 %  i== 0){
                if(num1 % i == 0){
                    num1 = num1 / i;
                }
                if(num2 % i == 0){
                    num2 = num2 / i;
                }
                if(num3 % i == 0){
                    num3 = num3 / i;
                }
                mcm = mcm * i;
            }else{
               i++;
            }
            
        }
        
        System.out.print("--> El MCM de los números ingresados es: "+mcm); 




    }
}