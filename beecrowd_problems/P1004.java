import java.io.IOException;
import java.util.Scanner;

public class Problema1004 {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int a;
        int b;
        int prod;
        
        a = input.nextInt();
        b = input.nextInt();
        prod = a * b;
        
        System.out.println("PROD = " + prod);
    }
 
}