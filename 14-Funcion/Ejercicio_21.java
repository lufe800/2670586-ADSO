public class Ejercicio_21{

    public static void main(String[]args){
        System.out.println("+-----------------------------------------+");
        System.out.println("+  FUNCIÓN CONVERTIR CELSIUS A FAHRENHEIT +");
        System.out.println("+-----------------------------------------+");

        double celsius = 39;
        System.out.println(" Grados celsius "+celsius+ " a fahrenheint: "+temperatura(celsius));
        System.out.println("");

        celsius = 25.6;
        System.out.println(" Grados celsius "+celsius+ " a fahrenheint: "+temperatura(celsius));
        System.out.println("");

        celsius = 40;
        System.out.println(" Grados celsius "+celsius+ " a fahrenheint: "+temperatura(celsius));
        System.out.println("");

        celsius = 3;
        System.out.println(" Grados celsius "+celsius+ " a fahrenheint: "+temperatura(celsius));
        System.out.println("");

        celsius = 35;
        System.out.println(" Grados celsius "+celsius+ " a fahrenheint: "+temperatura(celsius));
        System.out.println("");
    }

    public static double temperatura(double celsius){
        double fahrenheit =(celsius * 9/5) + 32;
        return fahrenheit;
    }
}