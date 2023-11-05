import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el día de nacimiento: ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese el mes de nacimiento: ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese el año de nacimiento: ");
        int anio = entrada.nextInt();

        System.out.print("Ingrese día actual: ");
        int diaActual = entrada.nextInt();

        System.out.print("Ingrese mes actual: ");
        int mesActual = entrada.nextInt();

        System.out.print("Ingrese el año actual: ");
        int anioActual = entrada.nextInt();

        int edad = anioActual - anio;
        
        // Comprobar si es mayor de edad
        if (edad > 18) {
            System.out.println("Es mayor de edad");
        } if (edad == 18) {
            if (mes < mesActual && dia < diaActual) {
                System.out.println("Es menor de edad");
            } else if (mes == mesActual) {
                if (dia == diaActual || diaActual > dia) {
                    System.out.println("Es mayor de edad");
                } else {
                    System.out.println("Es menor de edad");
                }
            } else {
                System.out.println("Es menor de edad");
            }
        } else {
            System.out.println("Es menor de edad");
        }
    }
}