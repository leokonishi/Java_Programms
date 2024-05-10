import java.io.IOException;
import java.util.Scanner; 

public class Problema1010 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int n,q;
        double v,t;
        
        n = input.nextInt();
        q = input.nextInt();
        v = input.nextDouble();
        t = q*v;
        
        n = input.nextInt();
        q = input.nextInt();
        v = input.nextDouble();
        t += q*v;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", t);
 
    }
 
}