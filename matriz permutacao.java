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

    // Variaveis
    int temp=0, vef=0;

    // Resolução
    for (int j=0; j<n; j++) {
      for (int i=0; i<n; i++) {
        if (M[i][j] != 0) { 
          temp += 1;
        }
      }
      if (temp==1) {
        vef+=1;
      }
      temp=0;
    }
  
    if (vef == n & n != 1) {
      System.out.printf("SIM");
    }
  
    else {
      System.out.printf("NAO");
    }
  }
}






