import java.util.Scanner; 
import java.math.*;

public class Main {
    public static void main(String[] args) {
        // As duas seguintes instruções são úteis para leitura de dados do teclado
        // A variável sc seria um 'objeto' para ler inteiros, strings, etc.
        Scanner sc;
        sc = new Scanner(System.in);

        int n;     
        int soma = 0, fb0 = 0, fb1 = 1;
      
        n = sc.nextInt();

        while (soma<n) {
          soma = fb0 + fb1;
          fb0 = fb1;
          fb1 = soma;
        }

        if (soma == n) {
          System.out.println("Verdadeiro");
        } else {
          System.out.println("Falso");
        }
      
    }
}