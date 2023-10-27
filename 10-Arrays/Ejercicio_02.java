import java.util.Scanner;
public class Ejercicio_02{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero:");
        int numero = entrada.nextInt();

        String arreglo[] = new String[numero];
        
        for(int i = 0; i < numero; i++){
            System.out.print("Ingrese un nombre: ");
            arreglo[i] = entrada.next();
            
        }
        System.out.println(" ");
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("El nombre ingresado es : "+arreglo[i]);
        } 
        System.out.println("");

        String buscaNombres = ("");
        System.out.print("Ingrese un nombre para encontrar posición: ");
        buscaNombres = entrada.next();

        for(int i = 0; i < arreglo.length;i++){
            if(buscaNombres.equalsIgnoreCase(arreglo[i])){
                System.out.println("El nombre se encuentra en la posición : "+(i + 1));
        
            }
            
        } 
        
    }
}