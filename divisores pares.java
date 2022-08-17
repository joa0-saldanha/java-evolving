import java.util.Scanner; 
import java.math.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
      Scanner sc;
      sc = new Scanner(System.in);

      float num, i, div;
      int count;

      num = sc.nextFloat();
      i = 0;
      count = 0;

      while (i < 10000) {
        div = num/i;
        if (div == (int)div & i%2 == 0) {
          count++;          
        }
        i++;      
      }
      
      System.out.println(count);
        
        
        
    }
}