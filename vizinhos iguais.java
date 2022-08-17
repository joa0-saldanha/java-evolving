import java.util.Scanner; 
import java.math.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc;
      sc = new Scanner(System.in);

      int n, i=1, num, num1=0, pos=0, pos1=0, vef=0, vef1=0;

      n = sc.nextInt();

      while (i <= n) {
        num = sc.nextInt();
        if (num == num1) {
          pos = i;
        }
        num1 = num;
        i++;
        if (pos == i-1) {
          pos1 = i;
          
          vef= pos-2;
          vef1= pos1-2;
          
          System.out.println("Pos " + vef + " e " + vef1);
        }

      
      }
    
      
    }
}