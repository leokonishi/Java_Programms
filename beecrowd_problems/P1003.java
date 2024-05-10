import java.io.IOException;
import java.util.Scanner; 

public class Problema1003 {
 
    public static void main(String[] args) throws IOException {
 
        int a,b,soma;
        Scanner input = new Scanner (System.in);
        
        a = input.nextInt();
        b = input.nextInt();
        soma = a + b;
        
        System.out.println("SOMA = " + soma);
 
    }
 