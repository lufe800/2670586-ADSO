import java.util.Scanner;

public class Descuento{
    public static void main(String []args){
        Scanner rebaja = new Scanner(System.in);


        float precio_inicial = 0;
        float porcentaje = 0;
        float descuento = 0;
        float precio_final =0;

        System.out.println("Ingrese el valor inicial del producto");
        precio_inicial = rebaja.nextFloat();

        System.out.println("Ingrese el porcentaje del descuento");
        descuento = rebaja.nextFloat();

        porcentaje = (descuento / 100);
        porcentaje = (precio_inicial * porcentaje);
        precio_final = (precio_inicial - porcentaje);

        System.out.println("El precio final del producto con descuento es: "+precio_final+ " pesos");





    }
}