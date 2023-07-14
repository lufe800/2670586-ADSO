import java.util.Scanner;
public class Ejercicio_09{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("--> Ingrese un número entero N: ");
        int n = entrada.nextInt();

        int digito = 0;
        int sumador = 0;
        int numero = n;
        int sumaTotal = 0;
        int sumaDos = 0;
                 
        String numeroCadena = String.valueOf(n); 
        String numerosString = "", stringTotal= "";
        System.out.println();
        System.out.println("Raíz dígital: ");
        while(n != 0){
            digito = n % 10;
            n = n / 10;
            sumador = sumador + digito;            
            if(n == 0 && sumador > 9){
                n = sumador;
                sumador = 0;                    
            }   

        } 
        for(int i = 0; i < numeroCadena.length(); i++) {
            int digits = Character.getNumericValue(numeroCadena.charAt(i));
            sumaTotal += digits;
            stringTotal = String.valueOf(sumaTotal);
            numerosString += String.valueOf(digits) +" + "; 
        }

        int digito_1 = Character.getNumericValue(numeroCadena.charAt(0));
        int digito_2 = Character.getNumericValue(numeroCadena.charAt(numeroCadena.length()-1));
        sumaDos = digito_1 + digito_2;
        String res = String.valueOf(digito_1) +" + " + String.valueOf(digito_2) +" = "+ String.valueOf(sumaDos);

        System.out.println(numerosString + " = "+ stringTotal);
        System.out.println(res);
        System.out.print("\nLa raíz dígital de " +numero+" es: "+sumador);
        
        

    }
}