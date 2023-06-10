import java.util.Scanner;
public class Ejercicio_02{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" => Ingrese cantidad de notas: ");
        double cantidad = entrada.nextDouble();
        
        double  sumaNotas = 0;
        double  sumaCreditos = 0;
        int contador = 1;

        while (contador <= cantidad ){
            System.out.print(" => Ingrese Nota "+contador+": ");
            double notas = entrada.nextDouble();
            System.out.print(" => Ingrese Creditos "+contador+ ": ");
            double creditos = entrada.nextDouble();
            
            sumaNotas = sumaNotas + (notas * creditos);
            sumaCreditos = sumaCreditos + creditos;

            contador = contador + 1;
           
        }
        System.out.println("Total creditos: "+ sumaCreditos);
        double promedio = sumaNotas / sumaCreditos;
        System.out.println ("El promedio ponderado es: "+promedio);

    }
}