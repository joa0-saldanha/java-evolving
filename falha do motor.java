import java.util.Scanner; 
import java.math.*;

public class Main {
    public static void main(String[] args) {
        // As duas seguintes instruções são úteis para leitura de dados do teclado
        // A variável sc seria um 'objeto' para ler inteiros, strings, etc.
      Scanner sc;
      sc = new Scanner(System.in);

      int x,i,n,m=0,r=0, r1=0;

      x = sc.nextInt();
      i = 1;

      while (i <= x) {
          n = sc.nextInt();
          if (n < m && r1 < 1) {
            r = i;
            r1++;
          }
          m = n;
          i++;
      }

      if (r != 0) {
        System.out.println(r);
      } else {
        System.out.println("0");
      }
 
      
           
    }
}