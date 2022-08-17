import java.util.Scanner; 
import java.math.*;

public class Main {
    public static void main(String[] args) {
        // As duas seguintes instruções são úteis para leitura de dados do teclado
        // A variável sc seria um 'objeto' para ler inteiros, strings, etc.
        int dez, cen, uni, num;
        Scanner sc;
        sc = new Scanner(System.in);
        
        num = sc.nextInt();  
        
        if (num >= 100) {
          
          uni = num%10;
          num = (num - uni)/10;
          dez = num % 10;
          num = (num - dez)/10;
          cen = num;        
          if (cen != 0) {
            System.out.println(cen + " centenas");
            
          }
          
          if (dez != 0) {
            System.out.println("");
            System.out.println("e");
            System.out.println("");
            System.out.println(dez + " dezenas");
            
          }

          if (uni != 0) {
            System.out.println("");
            System.out.println("e");
            System.out.println("");
            System.out.println(uni + " unidades");
          }
        
        } else if (num >= 10 && num < 100) {
          uni = num%10;
          num = (num - uni)/10;
          dez = num % 10;
          
          System.out.println(dez + " dezenas");           

          if (uni != 0) {
            System.out.println("");
            System.out.println("e");
            System.out.println("");
            System.out.println(uni + " unidades");
          }
          
        } else {
              System.out.printf("%d unidades.",num);
        }
          
        

        
        
    }
}