public class Ejercicio02 {
    
    public static void main(String[] args){
        char[] caracter = new char[9];
        caracter[0] = 'a';
        caracter[1] = 'x';
        caracter[4] = '@';
        caracter[6] = ' ';
        caracter[8] = 'Q';
        for(int i = 0; i < 9; i++){
            System.out.println("simbolo["+ i +"]: "+caracter[i]);
        }
    }
}
