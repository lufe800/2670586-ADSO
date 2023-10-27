import java.util.Scanner;
public class Principal{ //clases abstractas

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        //Persona persona_01 = new Persona(1093218, "Luisa", "Agudelo", 33, 173, 70);

        //System.out.println("Atributo Cédula:"+ persona_01.cedula);
        //System.out.println("Método Cédula:"+ persona_01.getCedula() );

        // Persona persona_01 = new Persona(1093218, "Luisa", "Agudelo", 33, 173, 70);
        // Persona persona_02 = new Persona(134256, "Emmanuel", "Botero", 8, 166, 56);
        

        // persona_01.imprimirEstado();
        // persona_02.imprimirEstado();

        // persona_01.actividadFisica(80);
        // persona_02.actividadFisica(30);

        // persona_01.imprimirEstado();
        // persona_02.imprimirEstado();

        Persona personas[] = new Persona[2];
        int minutosEntrenados[] = new int[2];
        
        for (int i = 0; i < 2; i++) {

            System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");
            
            System.out.print("Cédula: ");
            int cedula = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Nombres: ");
            String nombres = scanner.nextLine();

            System.out.print("Apellidos: ");
            String apellidos = scanner.nextLine();
            
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            
            System.out.print("Estatura: ");
            int altura = scanner.nextInt();
            
            System.out.print("Peso: ");
            double peso = scanner.nextDouble();

            System.out.print("Minutos entrenados: ");
            int minutos = scanner.nextInt();

            
            personas[i] = new Persona(cedula, nombres, apellidos, edad, altura, peso);
            minutosEntrenados[i] = minutos;

        }

        for (int i = 0; i < personas.length; i++) {
            personas[i].imprimirEstado();
            
            
        }

        for (int i = 0; i < minutosEntrenados.length; i++) {
            personas[i].actividadFisica(minutosEntrenados[i]);
            
        }
       



    }
}