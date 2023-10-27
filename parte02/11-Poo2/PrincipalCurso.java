import java.util.Scanner;
public class PrincipalCurso{
    public static void main(String[] args){
        Scanner entradaNum = new Scanner(System.in);
        Scanner entradaText = new Scanner(System.in);

        Curso[] cursos = new Curso[100];
        int contaCursos = 0;

        int opcion = 0;

        while(opcion != 7){

            System.out.println("\n\n");
            System.out.println("+----------------------------------+");
            System.out.println("+         MENU DE CURSOS           +");
            System.out.println("+----------------------------------+");
            System.out.println("|                      Memoria: "+(100-contaCursos)+" |");
            System.out.println("|   1: Crear curso.                |");
            System.out.println("|   2: Listar todos los cursos.    |");
            System.out.println("|   3: Ver detalle de curso.       |");
            System.out.println("|   4: Editar información de curso.|");
            System.out.println("|   5: Agregar tema a un curso.    |");
            System.out.println("|   6: Eliminar curso.             |");
            System.out.println("|   7: Salir.                      |");
            System.out.println("+----------------------------------+");
            System.out.print("=> Ingrese una opción (1 al 7):");
            opcion = entradaNum.nextInt();

            if(opcion == 1){
                System.out.println("\n\n");
                System.out.println("+----------------------------+");
                System.out.println("+        CREAR CURSO         +");
                System.out.println("+----------------------------+");

                if(contaCursos < 99){

                    System.out.print(" => Ingrese código del curso: ");
                    int codigo = entradaNum.nextInt();

                    boolean codigoRepetido = false;
                    for(int i=0; i<cursos.length; i++){
                        if(cursos[i] != null && cursos[i].getCodigo() == codigo){
                            codigoRepetido = true;
                            break;
                        }
                    }
                    if(codigoRepetido){
                        System.out.print("El código ingresado ya se encuentra registrado.");
                    }else{
                        System.out.print(" => Ingrese nombre del curso: ");
                        String nombre = entradaText.nextLine();

                        System.out.print(" => Ingrese área de conocimiento: ");
                        String area = entradaText.nextLine();

                        System.out.print(" => Ingrese la duración en horas del curso: ");
                        int duracion = entradaNum.nextInt();

                        cursos[contaCursos] = new Curso(codigo, nombre, area, duracion);
                        contaCursos++;

                        System.out.print(" ");
                        System.out.print("¡El curso se ha creado correctamente!");
                    }
                }else{
                    System.out.print("No hay espacio suficiente en memoria para crear nuevos cursos.");
                }

            } 
            if(opcion == 2){
                System.out.println("\n\n");
                System.out.println("+------------------------------+");
                System.out.println("+       LISTA DE CURSOS        +");
                System.out.println("+------------------------------+");

                for(int i = 0; i<cursos.length; i++){
                    if(cursos[i] != null){
                        System.out.println((i+1)+ "=>"+ cursos[i].getInfoCurso());
                    }
                }
            }
            if(opcion == 3){
                System.out.println("\n\n");
                System.out.println("+----------------------------------+");
                System.out.println("+        VER DETALLE DEL CURSO     +");
                System.out.println("+----------------------------------+");

                System.out.print("=> Ingrese el código del curso: ");
                int codigo = entradaNum.nextInt();
                
                boolean codigoEncontrado = false;
                for(int i=0; i<cursos.length; i++){
                    if(cursos[i] != null && cursos[i].getCodigo() == codigo){
                        cursos[i].imprimir();
                        codigoEncontrado = true;
                        break;
                    }
                }
                if(!codigoEncontrado){
                    System.out.print(" ");
                    System.out.println("El curso con el código ingresado no existe.");
                }

            }
            if(opcion == 4){
                System.out.println("\n\n");
                System.out.println("+----------------------------------------+");
                System.out.println("+       EDITAR INFORMACIÓN DE CURSO      +");
                System.out.println("+----------------------------------------+");

                System.out.print(" => Ingrese el código del curso: ");
                int codigo = entradaNum.nextInt();

                boolean codigoEncontrado = false;
                for(int i=0; i<cursos.length; i++){
                    if(cursos[i] != null && cursos[i].getCodigo() == codigo){

                        System.out.print(" => Ingrese el nuevo nombre del curso: ");
                        String nombre = entradaText.nextLine();

                        System.out.print(" => Ingrese la nueva área del curso: ");
                        String area = entradaText.nextLine();

                        System.out.print(" => Ingrese la nueva duración del curso (en horas): ");
                        int duracion = entradaNum.nextInt();

                        cursos[i].editarInfoCurso(nombre, area, duracion);
                        System.out.print(" ");
                        System.out.print("¡La información se editó correctamente!");

                        codigoEncontrado = true;

                        break;
                    }
                }
                if(!codigoEncontrado){
                    System.out.println("El curso con el código ingresado no existe.");
                }
                

            }
            if(opcion == 5){
                System.out.println("\n\n");
                System.out.println("+---------------------------------+");
                System.out.println("+    AGREGAR TEMA A UN CURSO      +");
                System.out.println("+---------------------------------+");

                System.out.print(" => Ingrese el código del curso: ");
                int codigo = entradaNum.nextInt();

                boolean codigoEncontrado = false;
                for(int i=0; i<cursos.length; i++){
                    if(cursos[i] != null && cursos[i].getCodigo() == codigo){
                        System.out.print(" => Ingrese el tema a agregar: ");
                        String tema = entradaText.nextLine();

                        cursos[i].agregarTema(tema);
                        System.out.print(" ");
                        System.out.print("¡El tema se agregó correctamente!");

                        codigoEncontrado = true;
                        break;
                    }
                }
                if(!codigoEncontrado){
                    System.out.println("El curso con el código ingresado no existe.");
                }
                
            }
            if(opcion == 6){
                System.out.println("\n\n");
                System.out.println("+----------------------------+");
                System.out.println("+      ELIMINAR CURSO       +");
                System.out.println("+---------------------------+");

                System.out.print(" => Ingrese el código del curso: ");
                int codigo = entradaNum.nextInt();

                int codigoEncontrado = -1;
                for(int i=0; i<cursos.length; i++){
                    if(cursos[i] != null && cursos[i].getCodigo() == codigo){
                        codigoEncontrado = i;
                    }
                }
                if(codigoEncontrado != -1){
                    for(int i = codigoEncontrado; i<cursos.length-1; i++){
                        cursos[i] = cursos[i + 1];
                    }
                    cursos[cursos.length-1] = null;
                    contaCursos -= 1;
                    System.out.print("");
                    System.out.print("¡El curso se ha eliminado correctamente!");
                }
                else{
                    System.out.println("El curso con el código ingresado no existe."); 
                }
            }
            else if(opcion == 7){
                System.out.println();
                System.out.println("-----------------------");
                System.out.println("--------SALIENDO-------");
                System.out.println("-----------------------");
            
            }






        }
    }
}