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
    int soma=0, maior=0;
    int d=0, e=0, c=0, b=0;

    // Resolução
    for (int i=0; i<n; i++) {
      for (int j=0; j<n; j++) {
        int num= M[i][j];
        for (int k=j+1; k<n; k++) {
          int nun=M[i][k];
          soma += nun;
        }
        for (int l=j-1; l>=0; l--) {
          int nun=M[i][l];
          soma += nun;
        }
        for (int x=i+1; x<n; x++) {
          int nun=M[x][j];
          soma += nun;
        }
        for (int y=i-1; y>=0; y--) {
          int nun=M[y][j];
          soma += nun;
        }
        if (soma>maior) {
          maior=soma;
        }
        soma=0;
      }
    }
    System.out.println(maior);
  }
}






