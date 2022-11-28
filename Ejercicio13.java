import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[100];
        int maximo = 0;
        int minimo = 100;
        for (int i = 0; i < 100; i++) {
            n[i] = (int)(Math.random() * 501);
            if (n[i] < minimo) {
                minimo = n[i];
            }
            if (n[i] > maximo) {
                maximo = n[i];
            }
        }
        for (int elemento : n) {
            System.out.print(elemento + " ");
        }
        System.out.print("\n\n¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
        int opcion = sc.nextInt();
        int destacar; 
        if (opcion == 1) {
            destacar = minimo;
        } else {
            destacar = maximo;
        }  
        System.out.println();
        for (int elemento : n) {
            if (elemento == destacar) {
                System.out.print(" **" + elemento + "** ");
            } else {
                System.out.print(elemento + " ");
            }
        }
        sc.close();
    }
}