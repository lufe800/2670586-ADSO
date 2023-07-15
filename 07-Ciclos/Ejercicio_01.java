import java.util.Scanner;
import java.text.NumberFormat;

public class Ejercicio_01 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int opcion = 0;
    int contador = 0;
    int pagoIgual = 0;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    while (opcion != 5) {
      System.out.print("--> Ingrese un sueldo total: ");
      int sueldoTotal = entrada.nextInt();

      System.out.print("--> Ingrese cantidad de pagos: ");
      int pagos = entrada.nextInt();

      System.out.println("----------FORMAS DE PAGO------------");
      System.out.println(" 1. Pagos de igual valor. ");
      System.out.println(" 2. Primer pago diferente. ");
      System.out.println(" 3. Último pago diferente. ");
      System.out.println(" 4. Primer y Último pago diferente. ");
      System.out.println("--> Ingrese forma de pago");
      opcion = entrada.nextInt();
      System.out.println();
      System.out.println("-----------SUS PAGOS SERÁN----------");

      if (opcion == 1) {
        while (contador < pagos) {
          pagoIgual = (sueldoTotal / pagos);
          contador = contador + 1;
          System.out.println("Mes " + contador + ": " + "$ " + pagoIgual);
        }
      } else if (opcion == 2) {
        int resto = 0;
        int p1Diferente = 0;

        int pagoInicial = sueldoTotal / 2;
        String montoCuotas = formatter.format(pagoInicial);
        resto = sueldoTotal - pagoInicial;
        System.out.println("Primer mes 1: " + montoCuotas);

        for (int i = 2; i <= pagos; i++) {
          p1Diferente = resto / (pagos - 1);
          montoCuotas = formatter.format(p1Diferente);
          System.out.println("Mes " + i + ": " + montoCuotas);
        }
      } else if (opcion == 3) {

        int p2Diferente = sueldoTotal / 2;
        int pagoFinal = sueldoTotal - p2Diferente;
        p2Diferente = pagoFinal / (pagos - 1);
        contador = 1;
        while (contador < pagos) {
          String montoCuotas = formatter.format(p2Diferente);
          System.out.println("Mes " + contador + ": " + "$ " + montoCuotas);
          contador++;
        }
        String montoCuotas = formatter.format(pagoFinal);
        System.out.println("Último mes " + contador + ": " + "$ " + montoCuotas);

      } else if (opcion == 4) {

        int contAux = 2;

        double sueldoTot = Double.valueOf(sueldoTotal);
        double pagoInicial = sueldoTot * 0.3;
        double pagoFinal = sueldoTot * 0.2;

        double pagoIntermedio = (sueldoTot - pagoInicial - pagoFinal) / (pagos - 2); // Pagos intermedios

        String cuotas = "Pago Mes 1: " + formatter.format(pagoInicial) + "\n";
        System.out.println(cuotas);
        String cuotafinal = "Pago Mes " + pagos + ": " + formatter.format(pagoFinal) + "\n";

        for (int j = 0; j < pagos - 2; j++) {
          cuotas = "Pago Mes " + contAux + ": " + formatter.format(pagoIntermedio) + "\n";
          System.out.println(cuotas);
          contAux++;
        }

        System.out.println(cuotafinal);
      }

    }

  }

}