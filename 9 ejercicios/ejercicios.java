import java.util.Scanner;
public class ejercicios {
    Scanner scanner = new Scanner(System.in);

    public static int ejercicio1(int n) {
        int i = 0;
        int suma = 0;
        while (i == 0) {
            suma = suma + n;
            n = n - 1;
            if (n == i) {
                System.out.println(suma);
                i = 1;
            }
        }
        return suma;
    }
            
    public static int ejercicio2(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * ejercicio2(n - 1);
    }

    public static int ejercicio3(int base, int exponente) {
        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    public static boolean ejercicio4 (int n) {
        if (n<=1) {
            return false; 
        }
        for (int i = 2; i * i <= n; i++){
            if (n % 1 == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean ejercicio5 (int ano) {
        if (ano % 400 == 0)
        return true;
        if (ano % 100 == 0)
        return false;
        if (ano % 4 == 0)
            return true;
        return false;
    }
    public static boolean ejercicio6 (int n, int divisor) {
        if (n <= 2)
            return (n == 2);
        if (n % divisor == 0)
            return false;
        if (divisor * divisor > n)
            return true;
        return ejercicio6 (n, divisor + 1);
    }
    public static boolean ejercicio7 (int anno) {
        if (anno % 400 == 0)
            return true;
        if (anno % 100 == 0)
            return false;
        if (anno % 4 == 0)
            return true;
        return false;
    }
    public static int ejercicio8(int n) {
        int suma = 0;
        while (n != 0) {
            int digito = n % 10;
            if (digito % 2 == 0)
                suma += digito;
            n /= 10;
        }
        return suma;
    }
    public static int ejercicio9 (int n) {
        if (n < 10)
            return n;
        return (n % 10) * ejercicio9 (n / 10);
    }

}

 