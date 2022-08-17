import java.util.Scanner; 
import java.math.*;

public class Main {
    public static void main(String[] args) {
        // As duas seguintes instruções são úteis para leitura de dados do teclado
        // A variável sc seria um 'objeto' para ler inteiros, strings, etc.
        Scanner sc;
        sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        int f = 0;

        while (f <= b) {
          System.out.println(a + " x " + f + " = " + a*f);
          f++;
        }
        
    }
}