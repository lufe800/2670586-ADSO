public class Ejercicio_19{

    public static void main(String[]args){
        System.out.println("+----------------------------+");
        System.out.println("+  FUNCIÓN ÁREA DE CIRCULO   +");
        System.out.println("+----------------------------+");

        double radio = 7;
        System.out.println("Área del circulo con radio "+radio+ " es: "+areaCirculo(radio));
        System.out.println("");

        radio = 6;
        System.out.println("Área del circulo con radio "+radio+ " es: "+areaCirculo(radio));
        System.out.println("");

        radio = 13;
        System.out.println("Área del circulo con radio "+radio+ " es: "+areaCirculo(radio));
        System.out.println("");

        radio = 8;
        System.out.println("Área del circulo con radio "+radio+ " es: "+areaCirculo(radio));
        System.out.println("");

        radio = 13.6;
        System.out.println("Área del circulo con radio "+radio+ " es: "+areaCirculo(radio));
        System.out.println("");
        
    }

    
    public static double areaCirculo(double radio){
        double area = 3.1415 * radio * radio;
        return area;

    }
}