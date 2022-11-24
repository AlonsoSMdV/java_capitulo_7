import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("Introduzca una serie de numeros y el ordenador los colocará en orden inverso:");
        for(int i = 0; i < 10; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("En orden inverso quedaría así:");
        for(int i = 9; i >= 0; i--){
            System.out.println(num[i]+" ");
        }
        sc.close();
    }
}
