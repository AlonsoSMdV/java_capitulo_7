import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[15];
        for(int i = 0; i < 15;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("\nArray normal");
        System.out.print("Indice |");
        for(int i = 0; i < 15; i++){
            System.out.printf("%4d |",i);
        }
        System.out.print("\nValor  |");

        for(int i = 0; i < 15; i++){
            System.out.printf("%4d |",num[i]);
        }
        int ultimo = num[14];
        for(int i = 14; i >= 1;i--){
            num[i] = num[i-1];
        }
        num[0]= ultimo;
        System.out.println("\nArray rotado");
        System.out.print("Indice |");
        for(int i = 0; i < 15; i++){
            System.out.printf("%4d |",i);
        }
        System.out.print("\nValor  |");

        for(int i = 0; i < 15; i++){
            System.out.printf("%4d |",num[i]);
        }
        sc.close();
    }
}
