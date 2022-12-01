import java.util.Scanner;
public class EjercicioBidimensional08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIntroduzca la posición del alfil, por ejemplo d5: ");
        String posicionAlfil = sc.nextLine();
        int columnaAlfil = (int)(posicionAlfil.charAt(0)) - 96;
        int filaAlfil = (int)(posicionAlfil.charAt(1)) - 48;
        System.out.println("El alfil puede moverse a las siguientes posiciones:");
        for(int fila = 8; fila >= 1; fila--) {
            for(int columna = 1; columna <= 8; columna++) {
                if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna)) && (! ((filaAlfil == fila) && (columnaAlfil == columna)))) {
                    System.out.print((char)(columna + 96) + "" + fila + " ");
                }
            }
        }
        sc.close();
    }    
}
        
