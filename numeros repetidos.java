import java.util.Scanner; 
import java.math.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc;
      sc = new Scanner(System.in);

      int n = sc.nextInt();
      int V[] = new int[n]; 

      int i, j, k=0, l=0, vef=0;

      for (i=0;i<n;i++) {
        V[i] = sc.nextInt();
      }

      for (i=0;i<n;i++) {
        for(j=i+1;j<n;j++) {
          if(V[i] == V[j]) {
            k=i+1;
            l=j+1;
            System.out.printf("%d: (%d, %d) \n", V[i], k, l);
            vef++;
          }
        }
      }

      if (vef==0) {
        System.out.println("NAO HA NUMEROS REPETIDOS");
      }

      
      
      
    
      
    }
}