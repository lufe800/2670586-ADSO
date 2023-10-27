import java.util.Scanner;
public class Ejercicio_06{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        int numero, opcion, num1, num2, num3, num4, num5, num6;


        System.out.println("Ingrese un número de 6 dígitos");
        numero = entrada.nextInt();

        if(numero >= 100000 && numero <= 999999){

            System.out.println("//---------------------------------------------------------//");
            System.out.println("     Menú:                                                   ");
            System.out.println("     1.Primer Dígito.   2.Segundo Dígito   3.Tercer Dígito.  ");
            System.out.println("     4.Cuarto Dígito.   5.Quinto Dígito    6.Sexto Dígito.   ");
            System.out.println("//---------------------------------------------------------//");


                System.out.println("Ingrese una opción: ");
                opcion = entrada.nextInt();

                if(opcion == 1){
                    num1 = numero % 10;
                    System.out.print("El primer número es: "+num1);

                }else if(opcion == 2){
                    num2 = (numero % 100)/10;
                    System.out.print("El segundo número es: "+num2);

                }else if(opcion == 3){
                    num3 = (numero % 1000)/100;
                    System.out.print("El tercer número es: "+num3);

                }else if(opcion == 4){
                    num4 =(numero % 10000)/1000 ;
                    System.out.print("El cuarto número es: "+num4);
                
                }else if(opcion == 5){
                    num5 = (numero % 100000)/10000;
                    System.out.print("El quinto número es: "+num5);

                }else if (opcion == 6){
                    num6 = (numero / 100000);
                    System.out.print("El sexto número es: "+num6);


                }
        }else{
            System.out.print("Los números ingresados están fuera del rango");
        }

    }
}