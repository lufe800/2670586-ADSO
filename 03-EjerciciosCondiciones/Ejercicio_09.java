import java.util.Scanner;

public class Ejercicio_09{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print(" => Ingrese número de fecha con el siguiente formato: (ddmmaaaa) ");
		int date = entrada.nextInt();

        if(date >= 01010001 && date <= 31123000){

            int d1 = (date / 10000000)%10;
            int d2 = (date / 1000000)%10;
            int d3 = (date / 100000)%10;
            int d4 = (date / 10000)%10;
            int d5 = (date / 1000)%10;
            int d6 = (date / 100)%10;
            int d7 = (date / 10)%10;
            int d8 = date % 10;

            //Validar dítos uno y dos

            if(d1 == 0){
                System.out.print("");
            if(d2 == 1){
                System.out.print("PRIMERO DE ");
            }else if(d2 == 2){
                System.out.print("DOS DE ");
            }else if(d2 == 3){
                System.out.print("TRES DE ");
            }else if(d2 == 4){
                System.out.print("CUATRO DE ");
            }else if(d2 == 5){
                System.out.print("CINCO DE ");
            }else if(d2 == 6){
                System.out.print("SEIS DE ");
            }else if(d2 == 7){
                System.out.print("SIETE DE ");
            }else if(d2 == 8){
                System.out.print("OCHO DE ");
            }else if(d2 == 9){
                System.out.print("NUEVE DE ");
            }

            }if(d1 == 1){
                if(d2 == 0){
                    System.out.print("DIEZ DE ");
                }else if(d2 == 1){
                    System.out.print("ONCE DE ");
                }else if(d2 == 2){
                    System.out.print("DOCE DE ");
                }else if(d2 == 3){
                    System.out.print("TRECE DE ");
                }else if(d2 == 4){
                    System.out.print("CATORCE DE ");
                }else if(d2 == 5){
                    System.out.print("QUINCE DE ");
                }else if(d2 == 6){
                    System.out.print("DIECISEIS DE ");
                }else if(d2 == 7){
                    System.out.print("DIECISIETE DE ");
                }else if(d2 == 8){
                    System.out.print("DIECIOCHO DE ");
                }else if(d2 == 9){
                    System.out.print("DIECINUEVE DE ");
                }
            }if(d1 == 2){
                if(d2 == 0){
                    System.out.print("VEINTE DE ");
                }else if(d2 == 1){
                    System.out.print("VEINTIUNO DE "); 
                }else if(d2 == 2){
                    System.out.print("VEINTIDOS DE ");
                }else if(d2 == 3){
                    System.out.print("VEINTITRES DE ");
                }else if(d2 == 4){
                    System.out.print("VEINTICUATRO DE ");
                }else if(d2 == 5){
                    System.out.print("VEINTICINCO DE ");
                }else if(d2 == 6){
                    System.out.print("VEINTISEIS DE ");
                }else if(d2 == 7){
                    System.out.print("VEINTISIETE DE ");
                }else if(d2 == 8){
                    System.out.print("VEINTIOCHO DE ");
                }else if(d2 == 9){
                    System.out.print("VEINTINUEVE DE ");
                }
            }if(d1 == 3){
                if(d2 == 0){
                    System.out.print("TREINTA DE ");
                }else if(d2 == 1){
                    System.out.print("TREINTA Y UNO DE ");
                }
            }
            // Validar dígitos tres y cuatro

            if(d3 == 0){
                System.out.print("");
                if(d4 == 1){
                    System.out.print("ENERO DE ");
                }else if(d4 == 2){
                    System.out.print("FEBRERO DE ");
                }else if(d4 == 3){
                    System.out.print("MARZO DE ");   
                }else if(d4 == 4){
                    System.out.print("ABRIL DE ");
                }else if(d4 == 5){
                    System.out.print("MAYO DE ");
                }else if(d4 == 6){
                    System.out.print("JUNIO DE ");
                }else if(d4 == 7){
                    System.out.print("JULIO DE ");
                }else if(d4 == 8){
                    System.out.print("AGOSTO DE ");
                }else if(d4 == 9){
                    System.out.print("SEPTIEMBRE DE ");
                }
            }if(d3 == 1){
                if(d4 == 0){
                    System.out.print("OCTUBRE DE ");
                }else if(d4 == 1){
                    System.out.print("NOVIEMBRE DE ");
                }else if(d4 == 2){
                    System.out.print("DICIEMBRE DE ");
                }
            }
            // Validar dígito cinco
            if(d5 != 1 && d5 != 2 && d5 != 3){
                System.out.println("¡Error! el rango para milenios es de 1000, 2000 y 3000, ingrese número valido ");
            }else if(d5 == 1){
                System.out.print("MIL ");
            }else if(d5 == 2){
                System.out.print("DOS MIL ");
            }else if(d5 == 3){
                System.out.print("TRES MIL ");
            }
            // Validar dígitos seis

            if(d6 == 0){
                System.out.print("");
            }else if(d6 == 1){
                if(d7 == 0 && d8 == 0){
                    System.out.print("CIEN ");
                }else{
                    System.out.print("CIENTO ");
                }
                
            }else if(d6 == 2){
                System.out.print("DOSCIENTOS ");
            }else if(d6 == 3){
                System.out.print("TRESCIENTOS ");
            }else if(d6 == 4){
                System.out.print("CUATROCIENTOS ");
            }else if(d6 == 5){
                System.out.print("QUINIENTOS ");
            }else if(d6 == 6){
                System.out.print("SEISCIENTOS ");
            }else if(d6 == 7){
                System.out.print("SETECIENTOS ");
            }else if(d6 == 8){
                System.out.print("OCHOCIENTOS ");
            }else if(d6 == 9){
                System.out.print("NOVECIENTOS ");
            }

            // Validar dígito siete
            if(d7 == 0){
                System.out.print("");
            }else if(d7 == 1){
                if(d8 == 0){
                    System.out.print("DIEZ ");
                }else if(d8 == 1){
                    System.out.print("ONCE  ");
                }else if(d8 == 2){
                    System.out.print("DOCE ");
                }else if(d8 == 3){
                    System.out.print("TRECE ");
                }else if(d8 == 4){
                    System.out.print("CATORCE ");
                }else if(d8 == 5){
                    System.out.print("QUINCE ");
                }else if(d8 == 6){
                    System.out.print("DIECISEIS ");
                }else if(d8 == 7){
                    System.out.print("DIECISIETE ");
                }else if(d8== 8){
                    System.out.print("DIECIOCHO ");
                }else if(d8 == 9){
                    System.out.print("DIECINUEVE ");
                }
            }else if(d7==2){
				if (d8==0) {
					System.out.print("VEINTE ");
				}else{
					System.out.print("VEINTI ");
				}
			}else if(d7==3){
				if (d8==0) {
					System.out.print("TREINTA ");
				}else{
					System.out.print("TREINTA Y ");
				}
            }else if(d7==4){
				if (d8==0) {
					System.out.print("CUARENTA ");
				}else{
					System.out.print("CUARENTA Y ");
				}
            }else if(d7==5){
				if (d8==0) {
					System.out.print("CINCUENTA ");
				}else{
					System.out.print("CINCUENTA Y ");
				}
            }else if(d7==6){
				if (d8==0) {
					System.out.print("SESENTA ");
				}else{
					System.out.print("SESENTA Y ");
				}
            }else if(d7==7){
				if (d8==0) {
					System.out.print("SETENTA ");
				}else{
					System.out.print("SETENTA Y ");
				}
            }else if(d7==8){
				if (d8==0) {
					System.out.print("OCHENTA ");
				}else{
					System.out.print("OCHENTA Y ");
				}
            }else if(d7==9){
				if (d8==0) {
					System.out.print("NOVENTA ");
				}else{
					System.out.print("NOVENTA Y ");
				}
            }

            //Validar dígito 8

            if(d7 != 1){
                if(d8 == 0){
                    System.out.print(""); 
                }else if(d8 == 1){
                    System.out.print("UNO");
                }else if(d8 == 2){
                    System.out.print("DOS");
                }else if(d8 == 3){
                    System.out.print("TRES");
                }else if(d8 == 4){
                    System.out.print("CUATRO");
                }else if(d8 == 5){
                    System.out.print("CINCO");
                }else if(d8 == 6){
                    System.out.print("SEIS");
                }else if(d8 == 7){
                    System.out.print("SIETE");
                }else if(d8 == 8){
                    System.out.print("OCHO");
                }else if(d8 == 9){
                    System.out.print("NUEVE");
                }
            }


        }else{
        System.out.println(" => El número ingresado no tiene formato fecha. ");
       
        
        

    


    

            



        


       

    }
}
}