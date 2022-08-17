import java.util.Scanner; 
import java.math.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int linhas, colunas, i, j;
        Scanner sc;
        sc = new Scanner(System.in);

        linhas = sc.nextInt();
        colunas = sc.nextInt();

        i = 1;

        while (i <= linhas) {
          j = 1; 
          while (j <= colunas) {
            if (i == 1 || j == 1 || i==linhas || j==colunas) {
              System.out.printf("*");
            }
            else {
              System.out.printf(" ");
            }
            
            j++;
            if (j == colunas) {
            }
          }
          System.out.println("");
          
          i++;
        }            
    }
}