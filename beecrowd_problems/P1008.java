import java.io.IOException;
import java.util.Scanner; 

public class Problema1008 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int n,q;
        double v;
        n = input.nextInt();
        q = input.nextInt();
        v = input.nextDouble();
        
        System.out.printf("NUMBER = %d\n",n);
        System.out.printf("SALARY = U$ %.2f\n",q*v);
 
    }
 
}