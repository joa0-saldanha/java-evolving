import java.util.Scanner; 
import java.math.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      
    Scanner sc;
    sc = new Scanner(System.in);

    String str = sc.nextLine();
    String[] split= str.split("");

    String revers = "";
    for (int i = split.length-1; i>=0; i--)
    {
      revers += split[i];
    }
      
    if (revers.toLowerCase().equals(str.toLowerCase())) {
      System.out.println("PALINDROMO");
    }
    else {
      System.out.println("NAO EH PALINDROMO");
    }
    
      
      
  }
}