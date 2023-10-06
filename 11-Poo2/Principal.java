public class Principal{

    public static void main (String[] args){

        Perro perro_01 = new Perro(" Pecas"," María", 108, " Boxer", 30.5, 40);
        Perro perro_02 = new Perro(" Samantha"," Oscar ", 2, " Weimaraner", 4.5, 90);

        System.out.println("El nombre del perro 01 es:" +perro_01.getNombre());
        System.out.println("El nombre del perro 01 es:" +perro_02.getNombre());

        perro_01.comer(800);

        perro_01.imprimirDetalle();
        //perro_02.imprimirDetalle();






        // Clases:Definen nuevos tipos de datos, una clase
        //          es una plantilla que usará para crear Objetos/Variables
        //          archivos con extension.java

        // Atributos: Son datos propios de la clase definida.
        //              o una caracteristica.
        //              Los atributos son variables globales

        // Metodos:Las acciones que puede realizar un objeto
        //          perteneciente a esa clase. Esos metodos se respresentan
        //          como funciones.



    }
}