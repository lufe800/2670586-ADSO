import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        NumberFormat tipo_moneda = NumberFormat.getCurrencyInstance();
        DecimalFormat formato = new DecimalFormat("#.0");

        System.out.println("");
        System.out.println("||----------RUTA DEL RECORRIDO----------||");
        System.out.println("||                                      ||");
        System.out.println("||      1-Apía                          ||");
        System.out.println("||      2-Balboa                        ||");
        System.out.println("||      3-Belén de Umbría               ||");
        System.out.println("||      4-Dosquebradas                  ||");
        System.out.println("||      5-Guática                       ||");
        System.out.println("||      6-La Celia                      ||");
        System.out.println("||      7-La Virginia                   ||");
        System.out.println("||      8-Marsella                      ||");
        System.out.println("||      9-Mistrató                      ||");
        System.out.println("||     10-Pereira                       ||");
        System.out.println("||     11-Pueblo Rico                   ||");
        System.out.println("||     12-Quinchía                      ||");
        System.out.println("||     13-Santa Rosa de Cabal           ||");
        System.out.println("||     14-Santuario                     ||");
        System.out.println("||--------------------------------------||");
        System.out.println("");

        System.out.print("Elija la ciudad de origen (numero): ");
        int ciudad_origen = entrada.nextInt();

        System.out.print("Ingrese la cantidad de paradas: ");
        int paradas = entrada.nextInt();

        int ciudad_parada = 0;
        double contador_kilometros = 0.0;

        if (ciudad_origen >= 1 && ciudad_origen <= 14) {

            for (int i = 1; i <= paradas; i++) {
                System.out.print("Elija la ciudad " + i + " de destino (numero): ");
                ciudad_parada = entrada.nextInt();

                double kilometros_recorridos = 0.0;

                switch (ciudad_origen) {
                    case 1:
                        switch (ciudad_parada) {
                            case 1:
                                kilometros_recorridos = 5.0;
                                break;
                            case 2:
                                kilometros_recorridos = 39.8;
                                break;
                            case 3:
                                kilometros_recorridos = 39.5;
                                break;
                            case 4:
                                kilometros_recorridos = 6.8;
                                break;
                            case 5:
                                kilometros_recorridos = 47.3;
                                break;
                            case 6:
                                kilometros_recorridos = 69.7;
                                break;
                            case 7:
                                kilometros_recorridos = 88.2;
                                break;
                            case 8:
                                kilometros_recorridos = 51.6;
                                break;
                            case 9:
                                kilometros_recorridos = 61.5;
                                break;
                            case 10:
                                kilometros_recorridos = 47.9;
                                break;
                            case 11:
                                kilometros_recorridos = 100.3;
                                break;
                            case 12:
                                kilometros_recorridos = 119.8;
                                break;
                            case 13:
                                kilometros_recorridos = 19.1;
                                break;
                            case 14:
                                kilometros_recorridos = 91.7;
                                break;
                        }
                        break;
                    case 2:
                        switch (ciudad_parada) {
                            case 1:
                                kilometros_recorridos = 39.8;
                                break;
                            case 2:
                                kilometros_recorridos = 5.0;
                                break;
                            case 3:
                                kilometros_recorridos = 56.9;
                                break;
                            case 4:
                                kilometros_recorridos = 44.5;
                                break;
                            case 5:
                                kilometros_recorridos = 18.1;
                                break;
                            case 6:
                                kilometros_recorridos = 50.4;
                                break;
                            case 7:
                                kilometros_recorridos = 69.0;
                                break;
                            case 8:
                                kilometros_recorridos = 32.4;
                                break;
                            case 9:
                                kilometros_recorridos = 42.4;
                                break;
                            case 10:
                                kilometros_recorridos = 28.9;
                                break;
                            case 11:
                                kilometros_recorridos = 81.3;
                                break;
                            case 12:
                                kilometros_recorridos = 100.8;
                                break;
                            case 13:
                                kilometros_recorridos = 10.1;
                                break;
                            case 14:
                                kilometros_recorridos = 82.7;
                                break;
                        }
                        break;
                    case 3:
                        switch (ciudad_parada) {
                            case 1:
                                kilometros_recorridos = 39.5;
                                break;
                            case 2:
                                kilometros_recorridos = 56.9;
                                break;
                            case 3:
                                kilometros_recorridos = 5.0;
                                break;
                            case 4:
                                kilometros_recorridos = 46.3;
                                break;
                            case 5:
                                kilometros_recorridos = 23.8;
                                break;
                            case 6:
                                kilometros_recorridos = 56.2;
                                break;
                            case 7:
                                kilometros_recorridos = 74.8;
                                break;
                            case 8:
                                kilometros_recorridos = 38.2;
                                break;
                            case 9:
                                kilometros_recorridos = 48.1;
                                break;
                            case 10:
                                kilometros_recorridos = 34.5;
                                break;
                            case 11:
                                kilometros_recorridos = 86.9;
                                break;
                            case 12:
                                kilometros_recorridos = 106.4;
                                break;
                            case 13:
                                kilometros_recorridos = 15.7;
                                break;
                            case 14:
                                kilometros_recorridos = 88.3;
                                break;
                        }
                        break;
                    case 4:
                        switch (ciudad_parada) {
                            case 1:
                                kilometros_recorridos = 6.8;
                                break;
                            case 2:
                                kilometros_recorridos = 44.5;
                                break;
                            case 3:
                                kilometros_recorridos = 46.3;
                                break;
                            case 4:
                                kilometros_recorridos = 5.0;
                                break;
                            case 5:
                                kilometros_recorridos = 33.6;
                                break;
                            case 6:
                                kilometros_recorridos = 19.2;
                                break;
                            case 7:
                                kilometros_recorridos = 18.5;
                                break;
                            case 8:
                                kilometros_recorridos = 15.1;
                                break;
                            case 9:
                                kilometros_recorridos = 25.0;
                                break;
                            case 10:
                                kilometros_recorridos = 11.4;
                                break;
                            case 11:
                                kilometros_recorridos = 64.1;
                                break;
                            case 12:
                                kilometros_recorridos = 83.6;
                                break;
                            case 13:
                                kilometros_recorridos = 6.7;
                                break;
                            case 14:
                                kilometros_recorridos = 78.3;
                                break;
                        }
                        break;
                    case 5:
                        switch (ciudad_parada) {
                            case 1:
                                kilometros_recorridos = 47.3;
                                break;
                            case 2:
                                kilometros_recorridos = 18.1;
                                break;
                            case 3:
                                kilometros_recorridos = 23.8;
                                break;
                            case 4:
                                kilometros_recorridos = 33.6;
                                break;
                            case 5:
                                kilometros_recorridos = 5.0;
                                break;
                            case 6:
                                kilometros_recorridos = 32.4;
                                break;
                            case 7:
                                kilometros_recorridos = 51.0;
                                break;
                            case 8:
                                kilometros_recorridos = 14.4;
                                break;
                            case 9:
                                kilometros_recorridos = 24.3;
                                break;
                            case 10:
                                kilometros_recorridos = 10.7;
                                break;
                            case 11:
                                kilometros_recorridos = 63.1;
                                break;
                            case 12:
                                kilometros_recorridos = 82.6;
                                break;
                            case 13:
                                kilometros_recorridos = 7.9;
                                break;
                            case 14:
                                kilometros_recorridos = 74.5;
                                break;
                        }
                        break;
                    case 6:
                        switch (ciudad_parada) {
                            case 1:
                                kilometros_recorridos = 69.7;
                                break;
                            case 2:
                                kilometros_recorridos = 50.4;
                                break;
                            case 3:
                                kilometros_recorridos = 56.2;
                                break;
                            case 4:
                                kilometros_recorridos = 19.2;
                                break;
                            case 5:
                                kilometros_recorridos = 32.4;
                                break;
                            case 6:
                                kilometros_recorridos = 5.0;
                                break;
                            case 7:
                                kilometros_recorridos = 29.6;
                                break;
                            case 8:
                                kilometros_recorridos = 18.8;
                                break;
                            case 9:
                                kilometros_recorridos = 36.1;
                                break;
                            case 10:
                                kilometros_recorridos = 22.5;
                                break;
                            case 11:
                                kilometros_recorridos = 75.0;
                                break;
                            case 12:
                                kilometros_recorridos = 94.5;
                                break;
                            case 13:
                                kilometros_recorridos = 3.8;
                                break;
                            case 14:
                                kilometros_recorridos = 66.4;
                                break;
                        }
                        break;
                    case 7:
                        switch (ciudad_parada) {
                            case 1:
                                kilometros_recorridos = 88.2;
                                break;
                            case 2:
                                kilometros_recorridos = 69.0;
                                break;
                            case 3:
                                kilometros_recorridos = 74.8;
                                break;
                            case 4:
                                kilometros_recorridos = 18.5;
                                break;
                            case 5:
                                kilometros_recorridos = 51.0;
                                break;
                            case 6:
                                kilometros_recorridos = 29.6;
                                break;
                            case 7:
                                kilometros_recorridos = 5.0;
                                break;
                            case 8:
                                kilometros_recorridos = 48.4;
                                break;
                            case 9:
                                kilometros_recorridos = 55.7;
                                break;
                            case 10:
                                kilometros_recorridos = 42.1;
                                break;
                            case 11:
                                kilometros_recorridos = 94.5;
                                break;
                            case 12:
                                kilometros_recorridos = 114.0;
                                break;
                            case 13:
                                kilometros_recorridos = 23.3;
                                break;
                            case 14:
                                kilometros_recorridos = 95.9;
                                break;
                        }
                        break;
                    case 8:
                        switch (ciudad_parada) {
                            case 1:
                                kilometros_recorridos = 51.6;
                                break;
                            case 2:
                                kilometros_recorridos = 32.4;
                                break;
                            case 3:
                                kilometros_recorridos = 38.2;
                                break;
                            case 4:
                                kilometros_recorridos = 15.1;
                                break;
                            case 5:
                                kilometros_recorridos = 14.4;
                                break;
                            case 6:
                                kilometros_recorridos = 18.8;
                                break;
                            case 7:
                                kilometros_recorridos = 48.4;
                                break;
                            case 8:
                                kilometros_recorridos = 5.0;
                                break;
                            case 9:
                                kilometros_recorridos = 20.0;
                                break;
                            case 10:
                                kilometros_recorridos = 6.4;
                                break;
                            case 11:
                                kilometros_recorridos = 59.1;
                                break;
                            case 12:
                                kilometros_recorridos = 78.6;
                                break;
                            case 13:
                                kilometros_recorridos = 11.9;
                                break;
                            case 14:
                                kilometros_recorridos = 69.5;
                                break;
                        }
                        break;
                    case 9:
                        switch (ciudad_parada) {
                            case 1:
                                kilometros_recorridos = 61.5;
                                break;
                            case 2:
                                kilometros_recorridos = 42.4;
                                break;
                            case 3:
                                kilometros_recorridos = 48.1;
                                break;
                            case 4:
                                kilometros_recorridos = 25.0;
                                break;
                            case 5:
                                kilometros_recorridos = 24.3;
                                break;
                            case 6:
                                kilometros_recorridos = 36.1;
                                break;
                            case 7:
                                kilometros_recorridos = 55.7;
                                break;
                            case 8:
                                kilometros_recorridos = 20.0;
                                break;
                            case 9:
                                kilometros_recorridos = 5.0;
                                break;
                            case 10:
                                kilometros_recorridos = 13.6;
                                break;
                            case 11:
                                kilometros_recorridos = 66.3;
                                break;
                            case 12:
                                kilometros_recorridos = 85.8;
                                break;
                            case 13:
                                kilometros_recorridos = 5.1;
                                break;
                            case 14:
                                kilometros_recorridos = 77.7;
                                break;
                        }
                        break;
                    case 10:
                        switch (ciudad_parada) {
                            case 1:
                                kilometros_recorridos = 47.9;
                                break;
                            case 2:
                                kilometros_recorridos = 28.9;
                                break;
                            case 3:
                                kilometros_recorridos = 34.5;
                                break;
                            case 4:
                                kilometros_recorridos = 11.4;
                                break;
                            case 5:
                                kilometros_recorridos = 10.7;
                                break;
                            case 6:
                                kilometros_recorridos = 22.5;
                                break;
                            case 7:
                                kilometros_recorridos = 42.1;
                                break;
                            case 8:
                                kilometros_recorridos = 6.4;
                                break;
                            case 9:
                                kilometros_recorridos = 13.6;
                                break;
                            case 10:
                                kilometros_recorridos = 5.0;
                                break;
                            case 11:
                                kilometros_recorridos = 57.7;
                                break;
                            case 12:
                                kilometros_recorridos = 77.2;
                                break;
                            case 13:
                                kilometros_recorridos = 8.5;
                                break;
                            case 14:
                                kilometros_recorridos = 68.1;
                                break;
                        }
                        break;
                    case 11:
                        switch (ciudad_parada) {
                            case 1:
                                kilometros_recorridos = 100.3;
                                break;
                            case 2:
                                kilometros_recorridos = 81.3;
                                break;
                            case 3:
                                kilometros_recorridos = 86.9;
                                break;
                            case 4:
                                kilometros_recorridos = 64.1;
                                break;
                            case 5:
                                kilometros_recorridos = 63.1;
                                break;
                            case 6:
                                kilometros_recorridos = 75.0;
                                break;
                            case 7:
                                kilometros_recorridos = 94.5;
                                break;
                            case 8:
                                kilometros_recorridos = 59.1;
                                break;
                            case 9:
                                kilometros_recorridos = 66.3;
                                break;
                            case 10:
                                kilometros_recorridos = 57.7;
                                break;
                            case 11:
                                kilometros_recorridos = 5.0;
                                break;
                            case 12:
                                kilometros_recorridos = 19.5;
                                break;
                            case 13:
                                kilometros_recorridos = 94.0;
                                break;
                            case 14:
                                kilometros_recorridos = 17.4;
                                break;
                        }
                        break;
                    case 12:
                        switch (ciudad_parada) {
                            case 1:
                                kilometros_recorridos = 119.8;
                                break;
                            case 2:
                                kilometros_recorridos = 100.8;
                                break;
                            case 3:
                                kilometros_recorridos = 106.4;
                                break;
                            case 4:
                                kilometros_recorridos = 83.6;
                                break;
                            case 5:
                                kilometros_recorridos = 82.6;
                                break;
                            case 6:
                                kilometros_recorridos = 94.5;
                                break;
                            case 7:
                                kilometros_recorridos = 114.0;
                                break;
                            case 8:
                                kilometros_recorridos = 78.6;
                                break;
                            case 9:
                                kilometros_recorridos = 85.8;
                                break;
                            case 10:
                                kilometros_recorridos = 77.2;
                                break;
                            case 11:
                                kilometros_recorridos = 19.5;
                                break;
                            case 12:
                                kilometros_recorridos = 5.0;
                                break;
                            case 13:
                                kilometros_recorridos = 113.5;
                                break;
                            case 14:
                                kilometros_recorridos = 36.9;
                                break;
                        }
                        break;
                    case 13:
                        switch (ciudad_parada) {
                            case 1:
                                kilometros_recorridos = 19.1;
                                break;
                            case 2:
                                kilometros_recorridos = 10.1;
                                break;
                            case 3:
                                kilometros_recorridos = 15.7;
                                break;
                            case 4:
                                kilometros_recorridos = 6.7;
                                break;
                            case 5:
                                kilometros_recorridos = 7.9;
                                break;
                            case 6:
                                kilometros_recorridos = 3.8;
                                break;
                            case 7:
                                kilometros_recorridos = 23.3;
                                break;
                            case 8:
                                kilometros_recorridos = 11.9;
                                break;
                            case 9:
                                kilometros_recorridos = 5.1;
                                break;
                            case 10:
                                kilometros_recorridos = 8.5;
                                break;
                            case 11:
                                kilometros_recorridos = 94.0;
                                break;
                            case 12:
                                kilometros_recorridos = 113.5;
                                break;
                            case 13:
                                kilometros_recorridos = 5.0;
                                break;
                            case 14:
                                kilometros_recorridos = 89.0;
                                break;
                        }
                        break;
                    case 14:
                        switch (ciudad_parada) {
                            case 1:
                                kilometros_recorridos = 91.7;
                                break;
                            case 2:
                                kilometros_recorridos = 82.7;
                                break;
                            case 3:
                                kilometros_recorridos = 88.3;
                                break;
                            case 4:
                                kilometros_recorridos = 78.3;
                                break;
                            case 5:
                                kilometros_recorridos = 74.5;
                                break;
                            case 6:
                                kilometros_recorridos = 66.4;
                                break;
                            case 7:
                                kilometros_recorridos = 95.9;
                                break;
                            case 8:
                                kilometros_recorridos = 69.5;
                                break;
                            case 9:
                                kilometros_recorridos = 77.7;
                                break;
                            case 10:
                                kilometros_recorridos = 68.1;
                                break;
                            case 11:
                                kilometros_recorridos = 17.4;
                                break;
                            case 12:
                                kilometros_recorridos = 36.9;
                                break;
                            case 13:
                                kilometros_recorridos = 89.0;
                                break;
                            case 14:
                                kilometros_recorridos = 5.0;
                                break;
                        }
                        break;
                }

                contador_kilometros += kilometros_recorridos;
                ciudad_origen = ciudad_parada;
            }

            System.out.println("");
            System.out.println("El recorrido total es de " + formato.format(contador_kilometros) + " kilómetros");
            System.out.println("");
            System.out.println("El costo del recorrido es de " + tipo_moneda.format(contador_kilometros * 35000) + " pesos");
        } else {
            System.out.println("La ciudad de origen ingresada no es válida");
        }
    }
}
