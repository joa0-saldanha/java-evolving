import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      float n = sc.nextInt();
      int contador=0;
      int div=0;

      if (n == 1 || n == 2) {
        if (n==1) {
          System.out.println("COMPOSTO");
        }
        else {
          System.out.println("PRIMO");
        }
      }
      else {
        for (int i=1; i<1000000; i++) {
          float num = n/i;
          if  (num == (int)num) {
            contador++;
          }
        }
        if (contador == 2) {
          System.out.println("PRIMO");
          }
        else {
          System.out.println("COMPOSTO");
        }
      }   
  }     
}