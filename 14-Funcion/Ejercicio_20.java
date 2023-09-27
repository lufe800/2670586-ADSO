public class Ejercicio_20{


    public static void main(String[]args){
        System.out.println("+-----------------------------+");
        System.out.println("+  FUNCIÓN ÁREA DE TRIÁNGULO  +");
        System.out.println("+-----------------------------+");

        double base = 7;
        double altura = 9;
        System.out.println("Área del triángulo con base "+base+ " y altura "+altura+ " es: "+areaTriangulo(base, altura));
        System.out.println("");

        base = 2.4;
        altura = 5.8;
        System.out.println("Área del triángulo con base "+base+ " y altura "+altura+ " es: "+areaTriangulo(base, altura));
        System.out.println("");

        base = 6;
        altura = 9;
        System.out.println("Área del triángulo con base "+base+ " y altura "+altura+ " es: "+areaTriangulo(base, altura));
        System.out.println("");

        base = 8.4;
        altura = 11;
        System.out.println("Área del triángulo con base "+base+ " y altura "+altura+ " es: "+areaTriangulo(base, altura));
        System.out.println("");

        base = 4.5;
        altura = 5.8;
        System.out.println("Área del triángulo con base "+base+ " y altura "+altura+ " es: "+areaTriangulo(base, altura));
        System.out.println("");
    }

    public static double areaTriangulo(double base, double altura){
        double area = (base * altura)/2;
        return area;
    }
}