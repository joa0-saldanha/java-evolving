import java.util.Scanner; 
import java.math.*;

public class Main {
    public static void main(String[] args) {
        // As duas seguintes instruções são úteis para leitura de dados do teclado
        // A variável sc seria um 'objeto' para ler inteiros, strings, etc.
        Scanner sc;
        sc = new Scanner(System.in);
        
        long num = sc.nextLong();

        int count = 0;

        while (num > 0) {
          num = num/10;
          count++;
        }

        System.out.println(count);
      
    }
}