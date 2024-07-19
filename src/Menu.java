import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Número par o impar");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Salida");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hola Mundo");
                    break;

                case 2:
                    System.out.print("Introduce el primer número: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    int num2 = scanner.nextInt();
                    int suma = num1 + num2;
                    System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
                    break;

                case 3:
                    System.out.print("Introduce un número: ");
                    int num = scanner.nextInt();
                    if (num % 2 == 0) {
                        System.out.println(num + " es un número par.");
                    } else {
                        System.out.println(num + " es un número impar.");
                    }
                    break;

                case 4:
                    System.out.print("Introduce un número para calcular su factorial: ");
                    int n = scanner.nextInt();
                    int factorial = 1;
                    for (int i = 1; i <= n; i++) {
                        factorial *= i;
                    }
                    System.out.println("El factorial de " + n + " es: " + factorial);
                    break;

                case 5:
                    System.out.print("Introduce un número para mostrar su tabla de multiplicar: ");
                    int numero = scanner.nextInt();
                    System.out.println("Tabla de multiplicar de " + numero + " en orden ascendente:");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " x " + i + " = " + (numero * i));
                    }
                    System.out.println("Tabla de multiplicar de " + numero + " en orden descendente:");
                    for (int i = 10; i >= 1; i--) {
                        System.out.println(numero + " x " + i + " = " + (numero * i));
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, por favor elige una opción del 1 al 6.");
            }
            System.out.println();
        } while (opcion != 6);

        scanner.close();
    }
}