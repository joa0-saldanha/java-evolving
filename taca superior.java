import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc;
        sc = new Scanner(System.in);

        int n = sc.nextInt();
        float M[][] = new float[n][n];
        float soma = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                M[i][j] = sc.nextFloat();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=i; j<n-i; j++){
                soma += M[i][j];
            }
        }
        System.out.printf("Resultado = %.2f", soma);
    }
}