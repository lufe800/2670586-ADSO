public class Ejercicio_17{

    public static void main(String[]args){
        System.out.println("+------------------------+");
        System.out.println("+  FUNCIÓN SUMA DíGITOS  +");
        System.out.println("+------------------------+");

        System.out.println("");
        int numero = 12345;
        int suma= sumaDigitos(numero);
        System.out.print("La suma de los dígitos "+numero+ " es: "+suma);


        System.out.println("");
        int numero1 = 822341;
        suma= sumaDigitos(numero1);
        System.out.print("La suma de los dígitos "+numero1+ " es: "+suma);

        System.out.println("");
        int numero2 = 6754;
        suma= sumaDigitos(numero2);
        System.out.print("La suma de los dígitos "+numero2+ " es: "+suma);

        System.out.println("");
        int numero3 = 83568;
        suma= sumaDigitos(numero3);
        System.out.print("La suma de los dígitos "+numero3+ " es: "+suma);
    }

    public static int sumaDigitos(int numero){
        int contador = 0;
        int suma = 0;
        while(numero > 0){
            int digito = numero % 10;
            suma += digito;
            numero /= 10;
            contador++;

        }
        return suma;
    }
}