import java.util.Scanner;
import java.math.*;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    // FUNÇAO MATRIZ 
    int n = sc.nextInt();
    int M[][] = new int[n][n];
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        M[i][j] = sc.nextInt();


    // resolução
    int pri=0, ult=0, solo=0, soma=0;
    int meio = ((n-1)/2);
    int j=0, k=n-1, i=1;

    if (n==1) {
      int um = M[0][0];
      System.out.println("X = " + um);
    }

    else {
      while (i<n) {
        if (j<meio && k>meio) {
          pri=M[j][j];
          ult=M[j][k];
        }
        if (j>meio && k<meio) {
          pri=M[j][k];
          ult=M[j][j];
        }
        
        soma=soma+pri;
        soma=soma+ult;
        j++;
        k--;
      
        if (j==meio && k==meio) {
          solo=M[j][k];
          soma=soma+solo;
          j++;
          k--; 
        }
        i++;
      }
      System.out.println("X = " + soma);  
      }
    }
}
  