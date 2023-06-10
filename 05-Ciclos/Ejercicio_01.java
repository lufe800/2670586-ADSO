import java.util.Scanner;
public class Ejercicio_01{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" => Ingrese cantidad de notas: ");
        double cantidad = entrada.nextDouble();
        
        double sumaNotas = 0;
        int contador = 1;

        while (contador <= cantidad ){
            System.out.print(" => Ingrese Nota: ");
            double notas = entrada.nextDouble();

            sumaNotas = sumaNotas + notas;
            contador = contador +1;
            
        }
        double promedio = sumaNotas / cantidad;
        System.out.println ("=> El promedio del estudiante es: "+promedio);


    }
}