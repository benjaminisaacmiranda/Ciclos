import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Seleccione el programa que desea ejecutar:");
            System.out.println("1. Suma de números naturales hasta n");
            System.out.println("2. Factorial de un número");
            System.out.println("3. Potencia de un número");
            System.out.println("4. Determinar si un número es primo");
            System.out.println("5. Determinar si un año es bisiesto (recursividad)");
            System.out.println("6. Determinar si un número es primo (recursividad)");
            System.out.println("7. Determinar si un año es bisiesto (ciclos)");
            System.out.println("8. Suma de dígitos pares de un número");
            System.out.println("9. Producto de dígitos de un número (recursividad)");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número: ");
                    int n1 = scanner.nextInt();
                    System.out.println("La suma de los números naturales hasta " + n1 + " es: " + ejercicios.ejercicio1(n1));
                    break;
                case 2:
                    System.out.print("Ingrese un número para calcular su factorial: ");
                    int n2 = scanner.nextInt();
                    System.out.println("El factorial de " + n2 + " es: " + ejercicios.ejercicio2(n2));
                    break;
                case 3:
                    System.out.print("Ingrese la base: ");
                    int base = scanner.nextInt();
                    System.out.print("Ingrese el exponente: ");
                    int exponente = scanner.nextInt();
                    System.out.println("El resultado de " + base + "^" + exponente + " es: " + ejercicios.ejercicio3(base, exponente));
                    break;
                 case 4:
                    System.out.print("Ingrese un número para determinar si es primo: ");
                    int n3 = scanner.nextInt();
                    System.out.println("¿Es primo? " + ejercicios.ejercicio4(n3));
                    break;
                case 5:
                    System.out.print("Ingrese un año para determinar si es bisiesto: ");
                    int anio1 = scanner.nextInt();
                    System.out.println("¿Es bisiesto? " + ejercicios.ejercicio5(anio1));
                    break;
                case 6:
                    System.out.print("Ingrese un número para determinar si es primo (recursividad): ");
                    int n4 = scanner.nextInt();
                    System.out.println("¿Es primo? " + ejercicios.ejercicio6(n4, 2));
                    break;
                case 7:
                    System.out.print("Ingrese un año para determinar si es bisiesto (ciclos): ");
                    int anoo = scanner.nextInt();
                    System.out.println("¿Es bisiesto? " + ejercicios.ejercicio7(anoo));
                    break;
                case 8:
                    System.out.print("Ingrese un número para calcular la suma de sus dígitos pares: ");
                    int n5 = scanner.nextInt();
                    System.out.println("La suma de los dígitos pares de " + n5 + " es: " + ejercicios.ejercicio8(n5));
                    break;
                case 9:
                    System.out.print("Ingrese un número para calcular el producto de sus dígitos: ");
                    int n6 = scanner.nextInt();
                    System.out.println("El producto de los dígitos de " + n6 + " es: " + ejercicios.ejercicio9(n6));
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                }
            } while (opcion != 0);
            scanner.close();
        }
    }