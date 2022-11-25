import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[10];
        
        
        System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");
        for (int i = 0; i < 8; i++) {
            numero[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 8; i++) {

            if (numero[i] % 2 == 0) {
                System.out.println(numero[i]+" par");
            }else {
                System.out.println(numero[i]+" impar");
            }
            
        }
        sc.close();
    }
}
