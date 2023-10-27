import java.util.Scanner;


public class Ejercicio_04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opcion = 0;

		while (opcion != 4) {
			System.out.println("----------Bienvenido-----------");
			System.out.println("|                             |");
			System.out.println("| 1. Docente.                 |");
			System.out.println("| 2. Estudiante.              |");
			System.out.println("| 3. Salir.                   |");
			System.out.println("|                             |");
			System.out.println("-------------------------------");
			System.out.println("=> Ingrese una opción: ");
			opcion = entrada.nextInt();

			if (opcion == 1) {
				System.out.println("--------CALCULAR PROMEDIO--------");
				System.out.print(" => Ingrese cantidad de notas: ");
				double cantidad = entrada.nextDouble();

				double sumaNotas = 0;
				int contador = 1;

				while (contador <= cantidad) {
					System.out.print(" => Ingrese Nota: ");
					double notas = entrada.nextDouble();

					sumaNotas = sumaNotas + notas;
					contador = contador + 1;

				}

				double promedio = sumaNotas / cantidad;
				System.out.println("=> El promedio del estudiante es: " + promedio);

			} else if (opcion == 2) {
				System.out.println("--------CALCULAR PROMEDIO PONDERADO--------");
				System.out.print(" => Ingrese cantidad de notas: ");
				double cantidad = entrada.nextDouble();

				double sumaNotas = 0;
				double sumaCreditos = 0;
				int contador = 1;

				while (contador <= cantidad) {
					System.out.print(" => Ingrese Nota " + contador + ": ");
					double notas = entrada.nextDouble();
					System.out.print(" => Ingrese Creditos " + contador + ": ");
					double creditos = entrada.nextDouble();

					sumaNotas = sumaNotas + (notas * creditos);
					sumaCreditos = sumaCreditos + creditos;

					contador = contador + 1;

				}

				System.out.println("Total creditos: " + sumaCreditos);
				double promedio = sumaNotas / sumaCreditos;
				System.out.println("El promedio ponderado es: " + promedio);
			} else if (opcion == 3) {
				System.out.println("Salir");

			} else {
				System.out.println();
			}

			opcion = opcion + 1;
		}

	}
}