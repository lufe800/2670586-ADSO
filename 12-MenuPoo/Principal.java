import java.util.Scanner;
public class Principal{ 

    public static void main(String[]args){
        Scanner entrada_numero = new Scanner(System.in);
        Scanner entrada_texto = new Scanner(System.in);

        Persona listaPersonas[] = new Persona [99];
        int indicePersonas = 0;

       int opcion = 0;

       while(opcion != 11){
            System.out.println("\n\n");
            System.out.println("+---------------------------------+");
            System.out.println("+         MENU DE PERSONAS        +");
            System.out.println("+---------------------------------+");
            System.out.println("|                      Memoria: "+(99-indicePersonas)+" |");
            System.out.println("|   1: Registrar Persona.          |");
            System.out.println("|   2: Ver lista de Persona.       |");
            System.out.println("|   3: Editar Persona.             |");
            System.out.println("|   4: Eliminar Persona.           |");
            System.out.println("|   5: Persona con mayor edad.     |");
            System.out.println("|   6: Persona con menor edad.     |");
            System.out.println("|   7: Persona más alta.           |");
            System.out.println("|   8: Persona más baja.           |");
            System.out.println("|   9: Promedio de edades.         |");
            System.out.println("|   10: Promedio de altura.        |");
            System.out.println("|   11: Salir.                     |");
            System.out.println("+---------------------------------+");
            System.out.print("=> Ingrese una opción (1 al 5):");
            opcion = entrada_numero.nextInt();

            if(opcion == 1){
                System.out.println("\n\n");
                System.out.println("+------------------------------+");
                System.out.println("+      REGISTRAR PERSONA       +");
                System.out.println("+------------------------------+");


                System.out.print(" => Ingrese la cédula: ");
                int cedula = entrada_numero.nextInt();

                boolean comprobarCedula = false;
                for(int i = 0; i < listaPersonas.length; i++){
                    if(listaPersonas[i] != null && listaPersonas[i].getCedula() == cedula){
                        comprobarCedula = true;
                        break;
                    }
                }
                if(comprobarCedula){
                    System.out.print("La cédula ingresada ya se encuentra registrada. ");
                }else {
                    System.out.print(" => Ingrese nombres: ");
                    String nombres = entrada_texto.nextLine();

                    System.out.print(" => Ingrese apellidos: ");
                    String apellidos = entrada_texto.nextLine();

                    System.out.print(" => Ingrese la edad: ");
                    int edad = entrada_numero.nextInt();

                    System.out.print(" => Ingrese la altura: ");
                    int altura = entrada_numero.nextInt();

                    System.out.print(" => Ingrese la peso: ");
                    double peso = entrada_numero.nextDouble();

                    Persona temporal = new Persona(cedula, nombres, apellidos, edad, altura, peso);
                    listaPersonas [indicePersonas] = temporal;
                    indicePersonas += 1;

                }

            }
           
            if(opcion == 2){
                System.out.println("\n\n");
                System.out.println("+------------------------------+");
                System.out.println("+      LISTA DE PERSONAS       +");
                System.out.println("+------------------------------+");
                for(int i = 0; i < listaPersonas.length; i++){
                    if(listaPersonas[i] != null){
                      System.out.println( (i+1) + " => "+ listaPersonas[i].getInfoInLine() ); // método pre definido en la clase 
                    }

                }
            }

            if(opcion == 3){
                //solicitar cedula
                System.out.println("\n\n");
                System.out.println("+------------------------------+");
                System.out.println("+      EDITAR PERSONA          +");
                System.out.println("+------------------------------+");
                System.out.println("=> Ingrese cedula: ");
                int cedula = entrada_numero.nextInt();

                int indiceEncontrado = -1;
                for(int i = 0; i < listaPersonas.length; i++){
                    if(listaPersonas[i] != null && listaPersonas[i].getCedula() == cedula)
                    indiceEncontrado = i;
                }

                if (indiceEncontrado != -1) {
                    System.out.print(" => Ingrese nombres: ");
                    String nombres = entrada_texto.nextLine();

                    System.out.print(" => Ingrese apellidos: ");
                    String apellidos = entrada_texto.nextLine();

                    System.out.print(" => Ingrese la edad: ");
                    int edad = entrada_numero.nextInt();

                    System.out.print(" => Ingrese la altura: ");
                    int altura = entrada_numero.nextInt();

                    System.out.print(" => Ingrese la peso: ");
                    double peso = entrada_numero.nextDouble();

                    Persona temporal = new Persona(cedula, nombres, apellidos, edad, altura, peso);
                    listaPersonas[indiceEncontrado] = temporal;


                }else{
                    System.out.println("+-----------------------------------------+");
                    System.out.println("+ La cedula "+cedula+" no corresponde     +");
                    System.out.println("+ a un usuario del sistema.               +");
                    System.out.println("+-----------------------------------------+");

                }
                
            }

            if(opcion == 4){
                System.out.println("\n\n");
                System.out.println("+--------------------------------+");
                System.out.println("+      ELIMINAR PERSONA          +");
                System.out.println("+--------------------------------+");
                System.out.println("=> Ingrese cedula: ");
                int cedula = entrada_numero.nextInt();

                int indiceEncontrado = -1;
                for(int i = 0; i < listaPersonas.length; i++){
                    if(listaPersonas[i] != null && listaPersonas[i].getCedula() == cedula)
                    indiceEncontrado = i;
                }
                // Validar si existe la cedula
                if(indiceEncontrado != -1){
                    for( int i = indiceEncontrado; i<listaPersonas.length-1; i++){
                        listaPersonas[i] = listaPersonas[i + 1];
                    }
                    listaPersonas[ listaPersonas.length-1 ] = null;
                    indicePersonas -= 1;

                    System.out.println("+-------------------------------------+");
                    System.out.println("+     PERSONA ELIMINADA CON EXITO     +");
                    System.out.println("+-------------------------------------+");


                } else {
                    System.out.println("+-----------------------------------------+");
                    System.out.println("+ La cedula "+cedula+" no corresponde     +");
                    System.out.println("+ a un usuario del sistema.               +");
                    System.out.println("+-----------------------------------------+");
                }
            }

            if(opcion == 5){
                System.out.println("\n\n");
                System.out.println("+-------------------------------+");
                System.out.println("+  PERSONA CON MAYOR EDAD       +");
                System.out.println("+-------------------------------+");

                Persona mayorEdad = listaPersonas[0];
                for(int i = 1; i < listaPersonas.length; i++){
                    if(listaPersonas[i] != null && listaPersonas[i].getEdad() > mayorEdad.getEdad()){
                        mayorEdad = listaPersonas[i];
                    }
                }
                if(mayorEdad != null){
                    System.out.println("La persona con mayor edad es:");
                    System.out.println(mayorEdad.getInfoInLine());
                }else{
                    System.out.println("No se encontró ninguna persona registrada.");
                }

            }

            if(opcion == 6){
                System.out.println("\n\n");
                System.out.println("+-------------------------------+");
                System.out.println("+  PERSONA CON MENOR EDAD       +");
                System.out.println("+-------------------------------+");

                Persona menorEdad = listaPersonas[0];
                for(int i = 1; i < listaPersonas.length; i++){
                    if(listaPersonas[i] != null && listaPersonas[i].getEdad() < menorEdad.getEdad()){
                        menorEdad = listaPersonas[i];
                    }
                }
                if(menorEdad != null){
                    System.out.println("La persona con menor edad es:");
                    System.out.println(menorEdad.getInfoInLine());
                }else{
                    System.out.println("No se encontró ninguna persona registrada.");
                }    
            }

            if(opcion == 7){
                System.out.println("\n\n");
                System.out.println("+-------------------------------+");
                System.out.println("+       PERSONA MÁS ALTA        +");
                System.out.println("+-------------------------------+");

                Persona masAlta = listaPersonas[0];
                for(int i = 1; i < listaPersonas.length; i++){
                    if(listaPersonas[i] != null && listaPersonas[i].getAltura() > masAlta.getAltura()){
                        masAlta = listaPersonas[i];
                    }
                }
                if(masAlta != null){
                    System.out.println("La persona más alta es:");
                    System.out.println(masAlta.getInfoInLine());
                }else{
                    System.out.println("No se encontró ninguna persona registrada.");
                } 
                
            }

            if(opcion == 8){
                System.out.println("\n\n");
                System.out.println("+-------------------------------+");
                System.out.println("+       PERSONA MÁS BAJA        +");
                System.out.println("+-------------------------------+");

                Persona masBaja = listaPersonas[0];
                for(int i = 1; i < listaPersonas.length; i++){
                    if(listaPersonas[i] != null && listaPersonas[i].getAltura() < masBaja.getAltura()){
                        masBaja = listaPersonas[i];
                    }
                }
                if(masBaja != null){
                    System.out.println("La persona más baja es:");
                    System.out.println(masBaja.getInfoInLine());
                }else{
                    System.out.println("No se encontró ninguna persona registrada.");
                } 
                
            }

            if(opcion == 9){
                System.out.println("\n\n");
                System.out.println("+-------------------------------+");
                System.out.println("+      PROMEDIO DE EDADES       +");
                System.out.println("+-------------------------------+");

                int sumaEdades = 0;
                int contaEdades = 0;
                for(int i = 0; i < listaPersonas.length; i++){
                    if(listaPersonas[i] != null){
                        sumaEdades += listaPersonas[i].getEdad();
                        contaEdades++;
                    }   
                }
                if(contaEdades > 0){
                    double promEdades = sumaEdades / contaEdades;
                    System.out.println("El promedio de edades es: " + promEdades);

                }else {
                    System.out.println("No se encontró ninguna persona registrada.");
                }
                
            }

            if(opcion == 10){
                System.out.println("\n\n");
                System.out.println("+-------------------------------+");
                System.out.println("+     PROMEDIO DE ALTURA        +");
                System.out.println("+-------------------------------+");

                int sumaAltura = 0;
                int contaAltura = 0;
                for(int i = 0; i < listaPersonas.length; i++){
                    if(listaPersonas[i] != null){
                        sumaAltura += listaPersonas[i].getAltura();
                        contaAltura++;
                    }   
                }
                if(contaAltura > 0){
                    double promAltura = sumaAltura / contaAltura;
                    System.out.println("El promedio de altura es : " + promAltura);

                }else {
                    System.out.println("No se encontró ninguna persona registrada.");
                }
  
            }

            if(opcion == 11){
                System.out.println();
                System.out.println("-----------------------");
                System.out.println("--------SALIENDO-------");
                System.out.println("-----------------------");
            }
       }





           
			
            

       




    }
}