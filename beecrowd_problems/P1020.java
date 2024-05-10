import java.io.IOException;
import java.util.Scanner; 

public class Problema1020 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        
        int anos = total / 365;
        int meses = total % 365;
        int dias = meses % 30;
        
        meses = meses / 30;
        
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
 
}