import java.lang.Math;

public class Ejercicio_02 {
    public static void main(String[] args) {

        String fechaAux = "", fechaFinal = "";
        //Se calcula ramdon para el año
        int year = (int)(Math.random() * 9999) + 1;
        int mes, dias;
        if ((year % 4 == 0) && (year % 400 == 0) || (year % 100 != 0)) {
            mes = (int)(Math.random() * 12) + 1;
            if (mes == 2) {
                dias = (int)(Math.random() * 29) + 1;
            }else{
                dias = (int)(Math.random() * 30) + 1;
            }

            fechaAux = String.valueOf(dias);
            fechaFinal += dias+"/";
            fechaAux = String.valueOf(mes);
            fechaFinal += mes+"/";
            fechaAux = String.valueOf(year);
            fechaFinal += year;

            System.out.print("Fecha generada: "+fechaFinal);

        } else{
            mes = (int)(Math.random() * 12) + 1;
            if (mes == 2) {
                dias = (int)(Math.random() * 28) + 1;
            }else{
                dias = (int)(Math.random() * 30) + 1;
            }

            fechaAux = String.valueOf(dias);
            fechaFinal += dias+"/";
            fechaAux = String.valueOf(mes);
            fechaFinal += mes+"/";
            fechaAux = String.valueOf(year);
            fechaFinal += year;

            System.out.print("Fecha generada: "+fechaFinal);
        }

    } 
}

