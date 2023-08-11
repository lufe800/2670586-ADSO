import java.util.Scanner;

public class Ejercicio_03{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String clientes[] = new String[10]; // array que contiene la cantidad de clientes

        int clienteFinal = -1; // contador de clientes---- esto está rarito
        int opcion = 0;

        while(opcion != 5){

            int memoria = clientes.length - (clienteFinal + 1); // variable que almacena registros de cliente y descuenta de los 100
            System.out.println("");
            System.out.println(" Memoria disponible: "+memoria+" Registros");
            System.out.println("");

            System.out.println("-------------------------------");
            System.out.println("1: Registrar cliente          |");
            System.out.println("2: Ver lista de clientes      |");
            System.out.println("3: Editar cliente             |");
            System.out.println("4: Eliminar cliente           |");
            System.out.println("5: Salir                      |");
            System.out.println("-------------------------------");
            System.out.println("=> Ingrese una opción: ");
			opcion = entrada.nextInt();

            if(opcion == 1){
                int comprobar = 0;
                if(clienteFinal == 10){
                    System.out.println("No hay memoria suficiente.");
                } else {
                    System.out.print("Ingrese un nombre para registrar: ");
                    String nombre = entrada.next();

                    for(int i = 0; i < clientes.length; i++){       //Está incompleto
                        if(nombre.equalsIgnoreCase(clientes[i])){
                            System.out.println("El nombre ya está registrado en la posición: "+(i+1));
                            //clienteFinal--;
                            //break; 
                        }
                    }
                    clienteFinal++;
                    clientes[clienteFinal] = nombre;
                    System.out.println("El nombre ha sido registrado correctamente.");
                }
            }
            else if(opcion == 2){
                if(clienteFinal == -1) {
                    System.out.println("No hay clientes registrados.");
                } else {
                    System.out.println("Listado de clientes:");
                    System.out.println("");
                    for(int i = 0; i < clienteFinal; i++) {
                        System.out.println((i + 1) + ": " + clientes[i]);
                    }
                }

            }else if(opcion == 3){

               String editaNombre = ("");
               System.out.println("Ingrese el nombre que desea editar: ");
               editaNombre = entrada.next();

               for(int i = 0; i < clientes.length; i++){
                    if(editaNombre.equalsIgnoreCase(clientes[i])){

                        System.out.println("Ingrese el nuevo nombre: ");
                        String nombreNuevo = entrada.next();

                        for(int j = 0; j < clienteFinal; j++){
                            if(nombreNuevo.equalsIgnoreCase(clientes[j])){
                                System.out.println("El nombre ingresado ya existe, ingrese otro. "); 
                                return;

                            }else{
                                clientes[i] = nombreNuevo;
                                System.out.println("El nombre ha sido editado correctamente."); 
                                break;
                            }
                        }
                        break;
                    }                 
                }

               
            }else if(opcion == 4){
                System.out.print("Ingrese el nombre que desea eliminar: ");
                String buscaNombre = entrada.next();

                int eliminar = -1;
                for(int i = 0; i < clientes.length; i++){
                    if(clientes[i].equalsIgnoreCase(buscaNombre)){
                        eliminar = i;
                        break;
                    }
                }
                if(eliminar != -1){
                    for(int i = eliminar; i < clientes.length-1; i++){
                        clientes[i] = clientes[i+1];
                    }
                    clienteFinal--;
                    System.out.print("El nombre ha sido eliminado correctamente.");
                }else{
                    System.out.print("No hay clientes registrados con ese nombre.");
                }

            }else if(opcion == 5){
                System.out.println("Salir.");
            }
            
            

        }
        
    }
}
