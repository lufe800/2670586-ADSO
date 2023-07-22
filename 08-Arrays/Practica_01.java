import java.util.Scanner;
public class Practica_01 {
    	public static void main(String[] args){

            Scanner entrada = new Scanner(System.in);

            // crear arreglo
            //int edades [] = new int [10];
            //int estatura [] = { 180, 150, 120, 110, 140 }; // 5 espacios de memoria, esta no se usa por difucultad para ingresar múltiples datos

            //edades[0] = 25; // extraer datos;
            //edades[0] = 26; // reemplazar datos.



           // System.out.print("Ingrese edad del cliente 0: ");
            //edades[0]= entrada.nextInt();

           

            System.out.print(" => Ingrese un número N: ");
		    int n = entrada.nextInt();

            //Crear arreglo
            int pares [] = new int[n];

            //Crear ciclo para llenar el arreglo
            for(int i = 0; i < pares.length; i++){ 
               pares[i] = (i+1) * 2;

            }
            //Ciclo para imprimir el arreglo
            for(int i= 0; i< pares.length;i++){
                System.out.print("{ "+pares[i]+ " }");
            }



           



        



        }
}