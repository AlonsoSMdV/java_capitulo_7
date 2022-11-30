import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[12];
        for (int i = 0; i < 12; i++) {
        n[i] = (int) (Math.random() * 201);
        }
        System.out.println("Array original:");
        System.out.print("\n|Índice ");
        for (int i = 0; i < 12; i++) {
        System.out.printf("|%4d ", i);
        }
        System.out.print("\n|Valor  ");
        for (int i = 0; i < 12; i++) {
        System.out.printf("|%4d ", n[i]);
        }
        System.out.print("\n\nIntroduzca el número que quiere insertar: ");
        int numero = sc.nextInt();
        System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
        int posicion = sc.nextInt();
        for (int i = 11; i > posicion; i--) {
        n[i] = n[i - 1];
        }
        n[posicion] = numero;
        System.out.println("\nArray resultado:");
        System.out.print("\n|Índice ");
        for (int i = 0; i < 12; i++) {
        System.out.printf("|%4d ", i);
        }
        System.out.print("\n|Valor  ");
        for (int i = 0; i < 12; i++) {
        System.out.printf("|%4d ", n[i]);
        }
        
        sc.close();
    }
}
