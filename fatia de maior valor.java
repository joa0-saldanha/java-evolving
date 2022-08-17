import java.util.Scanner; 
import java.math.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    

    int i,j,k, maior, soma;
    int n = sc.nextInt();
    int V[] = new int[n];

    for (i=0; i<n; i++) {
      V[i] = sc.nextInt();
    }
    maior = V[0];

    for(i=0; i<n; i++) {
      for (j=1; j<n; j++) {
        soma=0;
        for(k=i; k<=j; k++) {
          soma += V[k];
        }
        if (maior<soma) {
          maior=soma;
        }
      }
    }

    System.out.println(maior);
  }
}