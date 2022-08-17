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


    // RESOLUÇÃO
    int num=0, menor1=0, menor2=0, menor3=0, menor=0;
    int j=0, k=0;


    // linha superior
    for (int i=0; i<n; i++) {
      if (i==0) {
        menor1=99999999;
      }
      num = M[j][i];
      if (num < menor1) {
        menor1 = num;
      }
    }

    // diagonal 
    int z=n;
    menor2= 99999999;
    int x=0, y=n;
    while (z>0) {
      num=M[x][y-1];
      if (num<menor2) {
        menor2=num;
      }
      x++;
      y--;      
      z--;
    }

    // linha inferior
    j=n-1;
    for (int i=0; i<n; i++) {
      if (i==0) {
        menor3= 999999999;
      }
      num = M[j][i];
      if (num < menor3) {
        menor3 = num;
      }
    }

    if (menor1<menor2) {
      if (menor1<menor3) {
        menor = menor1;
      }
      else {
        menor = menor3;
      }
    }

    else {
      if(menor2<menor3) {
        menor = menor2;
      }
      else {
        menor = menor3;
      }
    }

    System.out.println(menor);
    

    
  }
}
  