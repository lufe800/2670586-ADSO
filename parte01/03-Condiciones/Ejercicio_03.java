import java.util.Scanner;

public class Ejercicio_03{
    public static void main(String []args){
        Scanner cartesiano = new Scanner(System.in);

        int punto_x, punto_y;


        System.out.println("Ingresando coordenada en el Plano Cartesiano");
        System.out.print("->INGRESAR EL VALOR DE X: ");
        punto_x = cartesiano.nextInt();
        System.out.print("->INGRESAR EL VALOR DE Y: ");
        punto_y = cartesiano.nextInt();

        if(punto_x == 0 && punto_y == 0){ 
            System.out.print("La coordenada ingresada se encuentra en el origen");

        }else if(punto_x > 0 && punto_y > 0 ){ 
            System.out.print("La coordenada ingresada se encuentra en el primer cuadrante");


        }else if(punto_x < 0 && punto_y > 0 ){ 
            System.out.print("La coordenada ingresada se encuentra en el segundo cuadrante");


        }else if(punto_x < 0 && punto_y < 0 ){
            System.out.print("La coordenada ingresada se encuentra en el tercer cuadrante");


        }else if(punto_x > 0 && punto_y < 0 ){
            System.out.print("La coordenada ingresada se encuentra en el cuarto cuadrante");

        }else if(punto_x == 0 && punto_y > 0){ 
            System.out.print("La coordenada ingresada se encuentra en el eje Y positivo");

        }else if(punto_x > 0 && punto_y == 0){ 
            System.out.print("La coordenada ingresada se encuentra en el eje X positivo");

        }else if(punto_x == 0 && punto_y < 0){ 
            System.out.print("La coordenada ingresada se encuentra en el eje Y negativo");
        
        }else if(punto_x < 0 && punto_y == 0){ 
            System.out.print("La coordenada ingresada se encuentra en el eje X negativo");
        }

    }
}