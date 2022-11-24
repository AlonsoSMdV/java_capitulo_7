import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] n = new int[100];
        for(int i = 0 ;i < 100; i++){
            n[i] = (int)(Math.random()*21);
            System.out.print(n[i]+" ");
        }
        System.out.println();
        System.out.print("Que número desea sustituir: ");
        int buscado = sc.nextInt();
        System.out.print("Por cual: ");
        int sustituido = sc.nextInt();
        for(int i = 0 ;i < 100; i++){
            if(n[i]==buscado){
                n[i] = sustituido;
                System.out.printf("\"%d\" ",n[i]);
            }else{
                System.out.printf("%d ",n[i]);
            }
        }
        sc.close();
    }
}
