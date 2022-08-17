import java.util.Scanner; 
import java.math.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc;
      sc = new Scanner(System.in);

      int n = sc.nextInt();
      int V[] = new int[n];      

      int i,l,k=0,m=0;
      

      for (i=0;i<n;i++) {
        V[i] = sc.nextInt();
      }      

      l=n;  

      if (V[0] > V[n-1]) {
        System.out.print("[");
        while (k<l) {
          System.out.print(V[n-1]);
          n--;        
          k++;
          if (k == l) {
            System.out.print("]");
          }
          else {
            System.out.print(", ");
          }
        }
      }

      else {
        System.out.print("[");
        while(m<n) {          
          System.out.print(V[m]);
          m++;
          if (m==n) {
            System.out.print("]");
          } 
          else {
            System.out.print(", ");
          }
        }
      }
    }
}