public class Ejemplo_01{

    public static void main(String[]args){

        System.out.println("---PROBANDO FUNCIONES---");


        String listadoPersonas [] = new String[5];
        
        listadoPersonas


        // int listado [] = new int [10];


        // imprimirArreglo(listado);

        // listado = llenarArreglo(listado);

        // imprimirArreglo(listado);


        // System.out.println("Suma = "+ sumar(5,3));
        // System.out.println("Suma = "+ sumar(3,2));
        // System.out.println("Suma = "+ sumar(-3,20));
        // System.out.println("Suma = "+ sumar(100,-50));

        // // int juanito = sumar(4,4);
        // // System.out.println("Juanito = "+juanito);

        // // if(sumar(-5,12) >= 0){
        // //     System.out.println("El resultado es positivo");
        // // }else{
        // //     System.out.println("El resultado es negativo");
        // // }


        // System.out.println("---PROBANDO FUNCIONES---");
        // System.out.println("Division = "+ division(20,2));
        // System.out.println("Suma = "+ division(5,3));
        // System.out.println("Suma = "+ division(3,2));
        // System.out.println("Suma = "+ division(-3,20));
        // System.out.println("Suma = "+ division(100,-50));

        // saludar();
        // saludarEnLoop(5);

        // imprimirTabla(5, 10);
        
    }


    public  static int sumar(int a, int b){
        int resultado = (a + b);

        return resultado;
    }

    public static float division(float a, float b){
        float resultado = (a/b);

        return resultado;
    }

    public static void saludar(){
        System.out.println("+----------------------+");
        System.out.println("+       HOLA MUNDO     +");
        System.out.println("+----------------------+");
    }
    
    public static void saludarEnLoop(int veces){
        for(int i = 0; i < veces; i++){
            System.out.println("Saludar");
        }
    }

    public static void imprimirTabla(int tabla, int multiplo){
        for (int i=0; i<multiplo; i++){
            int resultado = tabla *i;
            System.out.println(tabla+ "x"+i+" = "+resultado);
        }
    }

    public static void imprimirArreglo(int [] arreglo){
        for(int i=0; i<arreglo.length; i++){
            System.out.print("["+arreglo[i]+"]");
        }

        System.out.println("");

    }

    public static int[] llenarArreglo(int [] arreglo){
        for(int i=0; i<arreglo.length;i++){
            int aleatorio = (int)(Math.random()*100);
            arreglo[i] = aleatorio;
        }
        return arreglo;
    }

    public static String[] restablecerArreglo(String[] arreglo){
        for (int i = 0; i <arreglo.length; i++){
            arreglo[i] = "Ninguno.";
        }
        return arreglo;
    }

    public static void imprimirArreglo(String [] arreglo){
        for(int i=0; i<arreglo.length; i++){
            System.out.print("["+arreglo[i]+"]");
        }

        System.out.println("");

    }

}