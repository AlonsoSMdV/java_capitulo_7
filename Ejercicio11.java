import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        int[] primo = new int[10];
        int[] NoPrimo = new int[10];
        int primos = 0;
        int NoPrimos = 0;
        boolean esPrimo = false;
        for (int i = 0; i < 10; i++) {
            n[i] = sc.nextInt();
            esPrimo = true;
            for (int j = 2; j < n[i] - 1; j++) {
            if (n[i] % j == 0) {
            
            esPrimo = false;
            }
            }
            if (esPrimo) {
                primo[primos++] = n[i];
            } else {
                NoPrimo[NoPrimos++] = n[i];
            }
        }
        System.out.println("Array original:");
        for (int i = 0; i < 10; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < primos; i++) {
            n[i] = primo[i];
        }
        for (int i = primos; i < primos + NoPrimos; i++) {
            n[i] = NoPrimo[i - primos];
        }
        System.out.println("Array con los pares al principio:");
        for (int i = 0; i < 10; i++) {
            System.out.print(n[i] + " ");
        }
        sc.close();
    }
}