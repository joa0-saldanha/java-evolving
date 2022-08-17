import java.util.Scanner; 
import java.math.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int linhas, colunas, i, j;
        Scanner sc;
        sc = new Scanner(System.in);

        linhas = sc.nextInt();
        colunas = linhas;

        i = 1;

        while (i <= linhas) {
          j = 1; 
          while (j <= colunas) {     
            System.out.printf("o");   
            j++;
            if (j <= colunas) {
              System.out.printf("*");
              j++;
            }
          }        
          
          System.out.println("");

          i++;

          if (i <= linhas) {
            j = 1; 
            while (j <= colunas) {     
              System.out.printf("*");   
              j++;
              if (j <= colunas) {
                System.out.printf("o");
                j++;
              }
            }        
          
            System.out.println("");

            i++;
          }      
        }            
    }
}