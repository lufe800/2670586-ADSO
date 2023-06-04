import java.util.Scanner;

public class Ejercicio_08{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String letras = "";
        int unidad = 0;
        int decena = 0;
        int centena = 0;
        int mil = 0;

        System.out.print("Ingrese un número de máximo 9 dígitos: ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero > 999999999) {
            System.out.println("El número ingresado está fuera del rango valido");
        } else {
            if (numero == 0) {
                letras = "cero";
            }
            // aquí se validan los números del 1 al 19 
            if (numero <= 19) {

                if (numero == 1) {
                    letras = "uno";
                } else if (numero == 2) {
                    letras = "dos";
                } else if (numero == 3) {
                    letras = "tres";
                } else if (numero == 4) {
                    letras = "cuatro";
                } else if (numero == 5) {
                    letras = "cinco";
                } else if (numero == 6) {
                    letras = "seis";
                } else if (numero == 7) {
                    letras = "siete";
                } else if (numero == 8) {
                    letras = "ocho";
                } else if (numero == 9) {
                    letras = "nueve";
                } else if (numero == 10) {
                    letras = "diez";
                } else if (numero == 11) {
                    letras = "once";
                } else if (numero == 12) {
                    letras = "doce";
                } else if (numero == 13) {
                    letras = "trece";
                } else if (numero == 14) {
                    letras = "catorce";
                } else if (numero == 15) {
                    letras = "quince";
                } else if (numero == 16) {
                    letras = "dieciséis";
                } else if (numero == 17) {
                    letras = "diecisiete";
                } else if (numero == 18) {
                    letras = "dieciocho";
                } else if (numero == 19) {
                    letras = "diecinueve";
                }

                System.out.println("El número en letras es: " + letras);
                return;
            }
            //aqui se van a validar las decenas    
            if (numero <= 99) {

                decena = numero / 10;
                unidad = (numero % 10);

                System.out.println("Valor decena: " + decena);
                System.out.println("Valor unidad: " + unidad);

                if (decena == 2) {
                    letras = "veinti";

                } else if (decena == 3) {
                    letras = "treinta";

                } else if (decena == 4) {
                    letras = "cuarenta";

                } else if (decena == 5) {
                    letras = "cincuenta";

                } else if (decena == 6) {
                    letras = "sesenta";

                } else if (decena == 7) {
                    letras = "setenta";

                } else if (decena == 8) {
                    letras = "ochenta";

                } else if (decena == 9) {
                    letras = "noventa";
                }
                // letras = decenas;
                if (unidad > 0) {
                    if (unidad == 1) {
                        letras += " y " + "uno";
                    } else if (unidad == 2) {
                        letras += " y " + "dos";
                    } else if (unidad == 3) {
                        letras += " y " + "tres";
                    } else if (unidad == 4) {
                        letras += " y " + "cuatro";
                    } else if (unidad == 5) {
                        letras += " y " + "cinco";
                    } else if (unidad == 6) {
                        letras += " y " + "seis";
                    } else if (unidad == 7) {
                        letras += " y " + "siete";
                    } else if (unidad == 8) {
                        letras += " y " + "ocho";
                    } else if (unidad == 9) {
                        letras += " y " + "nueve";
                    }
                    //aquí se valida las centenas
                }

                System.out.println("El número en letras es: " + letras);
                return;
            }
            if (numero <= 999) {
                System.out.println("Entre por <= 999: " + numero);
                centena = numero / 100;
                decena = (numero % 100) / 10;
                unidad = (numero % 10);

                System.out.println("Centena: " + centena);
                System.out.println("Decena: " + decena);
                System.out.println("Unidad: " + unidad);

                if (centena == 1) {
                    letras += "cien";
                } else if (centena == 2) {
                    letras += "doscientos";
                } else if (centena == 3) {
                    letras += "trecientos";
                } else if (centena == 4) {
                    letras += "cuatrocientos";
                } else if (centena == 5) {
                    letras += "quinientos";
                } else if (centena == 6) {
                    letras += "seiscientos";
                } else if (centena == 7) {
                    letras += "setecientos";
                } else if (centena == 8) {
                    letras += "ochocientos";
                } else if (centena == 9) {
                    letras += "novecientos";
                }

                if (decena == 2) {
                    letras += " veinti";

                } else if (decena == 3) {
                    letras += " treinta";

                } else if (decena == 4) {
                    letras += " cuarenta";

                } else if (decena == 5) {
                    letras = " cincuenta";

                } else if (decena == 6) {
                    letras += " sesenta";

                } else if (decena == 7) {
                    letras += " setenta";

                } else if (decena == 8) {
                    letras += " ochenta";

                } else if (decena == 9) {
                    letras += " noventa";
                }

                if (unidad > 0) {
                    if (unidad == 1) {
                        letras += " y " + "uno";
                    } else if (unidad == 2) {
                        letras += " y " + "dos";
                    } else if (unidad == 3) {
                        letras += " y " + "tres";
                    } else if (unidad == 4) {
                        letras += " y " + "cuatro";
                    } else if (unidad == 5) {
                        letras += " y " + "cinco";
                    } else if (unidad == 6) {
                        letras += " y " + "seis";
                    } else if (unidad == 7) {
                        letras += " y " + "siete";
                    } else if (unidad == 8) {
                        letras += " y " + "ocho";
                    } else if (unidad == 9) {
                        letras += " y " + "nueve";
                    }
                }

                //aquí se valida las centenas

                System.out.println("El número en letras es: " + letras);
                return;
            }
            if (numero <= 9999) {
                mil = numero / 1000;
                centena = (numero % 1000)/100;
                decena = (numero % 100) / 10;
                unidad = (numero % 10);

                if (mil == 1) {
                    letras += "mil";
                } else if (mil == 2) {
                    letras += "dos mil";
                } else if (mil == 3) {
                    letras += "tres mil";
                } else if (mil == 4) {
                    letras += "cuatro mil";
                } else if (mil == 5) {
                    letras += "cinco mil";
                } else if (mil == 6) {
                    letras += "seis mil";
                } else if (mil == 7) {
                    letras += "siete mil";
                } else if (mil == 8) {
                    letras += "ocho mil";
                } else if (mil == 9) {
                    letras += "nueve mil";
                }else if (mil == 10) {
                    letras += "diez mil";
                }else if (mil == 11) {
                    letras += "once mil";
                }else if (mil == 12) {
                    letras += "doce mil";
                }else if (mil == 13) {
                    letras += "trece mil";
                }else if (mil == 14) {
                    letras += "catorce mil";
                }else if (mil == 15) {
                    letras += " quince mil";
                }else if (mil == 16) {
                    letras += "dieciséis mil";
                }else if (mil == 17) {
                    letras += "diecisiete mil";
                }else if (mil == 18) {
                    letras += "dieciocho mil";
                }else if (mil == 19) {
                    letras += "diecinueve mil";

                if (centena == 1) {
                    letras += "cien";
                } else if (centena == 2) {
                    letras += "doscientos";
                } else if (centena == 3) {
                    letras += "trecientos";
                } else if (centena == 4) {
                    letras += "cuatrocientos";
                } else if (centena == 5) {
                    letras += "quinientos";
                } else if (centena == 6) {
                    letras += "seiscientos";
                } else if (centena == 7) {
                    letras += "setecientos";
                } else if (centena == 8) {
                    letras += "ochocientos";
                } else if (centena == 9) {
                    letras += "novecientos";
                }

                if (decena == 2) {
                    letras += " veinti";
                } else if (decena == 3) {
                    letras += " treinta";
                } else if (decena == 4) {
                    letras += " cuarenta";
                } else if (decena == 5) {
                    letras = " cincuenta";
                } else if (decena == 6) {
                    letras += " sesenta";
                } else if (decena == 7) {
                    letras += " setenta";
                } else if (decena == 8) {
                    letras += " ochenta";
                } else if (decena == 9) {
                    letras += " noventa";
                }

                if (unidad > 0) {
                    if (unidad == 1) {
                        letras += " y " + "uno";
                    } else if (unidad == 2) {
                        letras += " y " + "dos";
                    } else if (unidad == 3) {
                        letras += " y " + "tres";
                    } else if (unidad == 4) {
                        letras += " y " + "cuatro";
                    } else if (unidad == 5) {
                        letras += " y " + "cinco";
                    } else if (unidad == 6) {
                        letras += " y " + "seis";
                    } else if (unidad == 7) {
                        letras += " y " + "siete";
                    } else if (unidad == 8) {
                        letras += " y " + "ocho";
                    } else if (unidad == 9) {
                        letras += " y " + "nueve";
                    }
                }
                System.out.println("El número en letras es: " + letras);
                return;

            }
        }   //if(numero <= 999999)
}  }
}