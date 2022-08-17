import java.util.Scanner; 
import java.math.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {   
    
      Scanner sc = new Scanner(System.in);

      // entradas 
      String R = sc.nextLine();
      String W = sc.nextLine();      

      // dados das entradas
      String D = "D";
      int k=0;
      
      // rotaçao

      System.out.println("Vetor: " + W);
      
      String S[] = W.split(" ");
      int L = S.length;
      int i=0, l=0;

      
      if (L>1) {
        if (R.equals(D)) {
          while (k<L-1) {
            System.out.print("Rotacao " + (k+1) + ": ");
            while (i<L) {
              l++;
              String Z = S[l];
              System.out.print(Z + " ");
              i++;
              if (l==L-1) {
                l=-1;
              }
            }
            System.out.println("");
            k++;
            i=0;
            l++;
          }
        }
  
        else {
          l=L-1;
          while (k<L-1) {
            System.out.print("Rotacao " + (k+1) + ": ");
              while (i<L) {
                String Z = S[l];
                System.out.print(Z + " ");
                if (l==L-1) {
                l=-1;      
                };
                l++;
                i++;
              }
            System.out.println("");
            k++;
            i=0;
            l--;
          }
        }
      }
      else {
        System.out.println("NENHUMA ROTACAO POSSIVEL");
      }
  }
}