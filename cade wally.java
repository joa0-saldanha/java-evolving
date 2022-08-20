import java.util.Scanner;
import java.math.*;
import java.util.ArrayList;

public class Main {
      static int limitar (int indice, int limite) {
        if (indice<=-1) {
            return limite-1;
        }
        if (indice>=limite) {
            return 0;
        }
        return indice;
    }
            
    static void acharWally (int M[][]) {
        int i, j, wi=-1, wj=-1;
        int n = M.length;
        int m = M[0].length;
        
        for (i=0; i<n && wi==-1; i=i+1) {
            for (j=0; j<m && wj==-1; j=j+1) {
                if (M[i][j]==1111 && 
                        M[i][limitar(j-1, m)]==0 && 
                        M[i][limitar(j+1, m)]==0 && 
                        M[limitar(i-1, n)][j]==4 && 
                        M[limitar(i+1, n)][j]==8 ) {
                    wi = i;
                    wj = j;
                }
            }
        }
        
        if (wi!=-1){
            System.out.println(wi+" "+wj);
        }
        else {
            System.out.println("WALLY NAO ESTA!");
        }
    }


    public static void main(String[] args) 
    {
        // Leitura dos elementos da matriz
        int i, j;
        Scanner Entrada = new Scanner(System.in);
        int n = Entrada.nextInt();
        int m = Entrada.nextInt();
        int M[][]= new int[n][m];
        
        for(i=0; i<n; i=i+1) {
            for(j=0; j<m; j=j+1) {
                M[i][j] = Entrada.nextInt();
            }
        }
        
        // Processamento principal
        acharWally(M);
    }
}








