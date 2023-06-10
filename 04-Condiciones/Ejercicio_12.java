import java.util.Scanner;

public class Ejercicio_12{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

     System.out.println("Ingrese el valor inicial del producto:  ");
        float precio_ini = entrada.nextFloat();

     System.out.println("Ingrese el porcentaje de descuento:  ");
        float porcentaje_des= entrada.nextFloat();

        float porcentaje = (porcentaje_des/100);
            porcentaje = (precio_ini * porcentaje);
        float descuento = (precio_ini - porcentaje);

        if(porcentaje_des >= 0 && porcentaje_des <= 100){
            System.out.println("El valor del producto con descuento es: $"+descuento);
             
        }else{
            System.out.println("El producto no tiene descuento.");   
        }
       
         

    }
}