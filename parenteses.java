import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc;
        sc = new Scanner(System.in);

        while(sc.hasNext()){
            String descricao = sc.nextLine();

            int abre = 0;
            boolean falha = false;

            for(int i=0; i<descricao.length(); i++){
                char equacao = descricao.charAt(i);
                if(equacao == ')'){
                    if(abre == 0){
                        falha = true;
                        break;
                    }
                    abre--;
                }else if(equacao == '('){
                    abre++;
                }
            }
            if(falha || abre>0){
                System.out.println("Erro na parentizacao");
            }else{
                System.out.println("Parentizacao correta");
            }
        }
    }
}