import java.util.Scanner; 
import java.math.*;

public class Main {
    public static void main(String[] args) {
        // As duas seguintes instruções são úteis para leitura de dados do teclado
        // A variável sc seria um 'objeto' para ler inteiros, strings, etc.
        float a, b, c, f;
        Scanner sc;
        sc = new Scanner(System.in);

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        f = a + ((a * b) / 100);

        if (c <= f) {
          System.out.println("compro");
        }  else {
              System.out.println("passo");
        }
        

        
        
    }
}