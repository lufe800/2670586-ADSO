import java.util.Scanner;
public class Ejercicio_02{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor total financiado: ");
        float valor_total = entrada.nextFloat();

        System.out.print("Ingrese cuotas pagadas: ");
        int cuotas_pagadas = entrada.nextInt();

        System.out.print("Ingrese el valor de las cuotas: ");
        float valor_cuotas = entrada.nextFloat();

        float intereses= (cuotas_pagadas * valor_cuotas) - valor_total;
        float total_interes = (intereses * 100 ) / valor_total;

        System.out.print("El interes total pagado es: "+total_interes+"%");

    }
}