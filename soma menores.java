import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner teclado;
        teclado = new Scanner(System.in);
		
		int n = teclado.nextInt();
		int M[][] = new int[n][n];
		int menor = 9999999, soma = 0;
	
        for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
			M[i][j] = teclado.nextInt();
            }
        }
		
		
		for(int i=0; i<n; i++){
			menor = 9999999;
			for(int j=0; j<n; j++){
        	 if(M[j][i] < menor){
			 	menor = M[j][i];
			 }
		}
	    soma = soma + menor;
            
			}
			
			System.out.print(soma);
		
    }
}