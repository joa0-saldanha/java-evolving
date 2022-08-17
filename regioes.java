import java.util.Scanner; 
import java.math.*;

public class Main {
    public static void main(String[] args) {
        // As duas seguintes instruções são úteis para leitura de dados do teclado
        // A variável sc seria um 'objeto' para ler inteiros, strings, etc.
        Scanner sc;
        sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = (n+1);
        int b = (n*a)/2;
        int result = b + 1;

        System.out.println(result);
          
        
        
        
    }
}