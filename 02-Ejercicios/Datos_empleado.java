import java.util.Scanner;

public class Datos_empleado{
    public static void main(String []args){
        Scanner empleado = new Scanner(System.in);

        String nombre;
        int edad;
        double salario;

        System.out.println("Ingrese su nombre:");
        nombre = empleado.nextLine();

        System.out.println("Ingrese su edad:");
        edad = empleado.nextInt();

        System.out.println("Ingrese el monto de su salario:");
        salario = empleado.nextDouble();

        System.out.println("Los datos ingresados fueron: ");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("EDAD: "+edad+ " años");
        System.out.println("SALARIO: "+salario);



    }


 }

 
 
 
 
 
 