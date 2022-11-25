import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[10];
        
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int i;
        System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");
        for (i = 0; i < 10; i++) {
            numero[i] = sc.nextInt();
            if (numero[i] < minimo) {
                minimo = numero[i];
            }
            if (numero[i] > maximo) {
                maximo = numero[i];
            }
        }
        System.out.println();
        for (i = 0; i < 10; i++) {
            System.out.print(numero[i]);
            if (numero[i] == maximo) {
                System.out.print(" máximo");
            }
            if (numero[i] == minimo) {
                System.out.print(" mínimo");
            }
            System.out.println();
        }
        sc.close();
    }
}
