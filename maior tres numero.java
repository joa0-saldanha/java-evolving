import java.util.Scanner; 
import java.math.*;

public class Main {
    public static void main(String[] args) {
        // As duas seguintes instruções são úteis para leitura de dados do teclado
        // A variável sc seria um 'objeto' para ler inteiros, strings, etc.
        Scanner sc;
        sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int a = num1 + num2;
        int b = num2 - num1;
        int c = (a + Math.abs(b))/2;

        int a1 = num3 + c;
        int b1 = c - num3;
        int c1 = (a1 + Math.abs(b1))/2;

        System.out.println(c1);  
        
    }
}