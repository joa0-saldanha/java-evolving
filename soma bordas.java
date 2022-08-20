import java.util.Scanner;
import java.math.*;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    // FUNÇAO MATRIZ 
    int n = sc.nextInt();
    int m = sc.nextInt();
    float M[][] = new float[n][m];
    for (int i = 0; i < n; i++)
      for (int j = 0; j < m; j++)
        M[i][j] = sc.nextFloat();

    // variaveis
    float borda=0;

    // resolução
    for (int j=0; j<m; j++) {
      int i=0;
      float num = M[i][j];
      borda += num;
    }
    
    for (int i=1; i<n; i++) {
      int j=0;
      float num = M[i][j];
      borda += num;
    }

    for (int j=1; j<m; j++) {
      int i=n-1;
      float num = M[i][j];
      borda += num;
    }

    for (int i=1; i<n-1; i++) {
      int j=m-1;
      float num = M[i][j];
      borda += num;
    }

    System.out.printf("Borda = %.2f", borda);
  }
}






