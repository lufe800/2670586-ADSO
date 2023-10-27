public class Ejercicio_23{

    public static void main(String[]args){

        System.out.println("+----------------------------+");
        System.out.println("+  FUNCIÓN INTERÉS COMPUESTO +");
        System.out.println("+----------------------------+");

        System.out.print("El monto a pagar con interés compuesto es: "+interesCompuesto(19000000, 5, 3));
    }

    public static double interesCompuesto(double capitalInicial, double tasaInteres, double periodoAnual){
        double periodoMensual = periodoAnual * 12;
        double montoFinal = capitalInicial * Math.pow(1 + (tasaInteres/100), periodoMensual);

        return montoFinal;
    }
}