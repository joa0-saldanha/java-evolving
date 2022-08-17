import java.util.Scanner; 
import java.math.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc;
      sc = new Scanner(System.in);

      int n, l=1, soma, j=0, m=0;
      n = sc.nextInt();
      
      if (n%2==0) {
        l = n;
      }
      else {
        while (l%2!=0) {
          n = sc.nextInt();
          l=n;
        }
      }   
      
      int V[] = new int[l];          
      
      for (int i=0;i<l;i++) {
        V[i] = sc.nextInt();
      }        

      System.out.print("[");
      
      while (j < l/2) {
        soma = V[m] + V[n-1];
        m++;
        n--;
        j++;
        System.out.print(soma);
        if (j < l/2) {
          System.out.print(", ");
        }
        else {
          System.out.print("]");
        }
      }
      
    }
}