public class Ejercicio18 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] menores = new int[10];
        int[] mayores = new int[10];
        int cuentaMenores = 0;
        int cuentaMayores = 0;
        for (int i = 0; i < 10; i++) {
        a[i] = (int) (Math.random() * 201);
        if (a[i] <= 100) {
        menores[cuentaMenores++] = a[i];
        } else {
        mayores[cuentaMayores++] = a[i];
        }
        }
        System.out.println("\nArray original:");

        System.out.print("│ Índice ");
        for (int i = 0; i < 10; i++) {
        System.out.printf("│%4d ", i);
        }
        System.out.println("│");

        System.out.print("│ Valor  ");
        for (int i = 0; i < 10; i++) {
        System.out.printf("│%4d ", a[i]);
        }
        System.out.println("│");

        int[] resultado = new int[10];
        int menoresColocados = 0;
        int mayoresColocados = 0;
        int j = 0;
        do {
        if (menoresColocados < cuentaMenores) {
        resultado[j++] = menores[menoresColocados++];
        }
        if (mayoresColocados < cuentaMayores) {
        resultado[j++] = mayores[mayoresColocados++];
        }
        } while (j < 10);
        System.out.println("\nArray resultado:");

        System.out.print("│ Índice ");
        for (int i = 0; i < 10; i++) {
        System.out.printf("│%4d ", i);
        }
        System.out.println("│");

        System.out.print("│ Valor  ");
        for (int i = 0; i < 10; i++) {
        System.out.printf("│%4d ", resultado[i]);
        }
        System.out.println("│");
        
    }
}
