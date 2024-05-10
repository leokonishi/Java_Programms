import java.io.IOException;
import java.util.Scanner; 

public class P1073 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for(int i=2; i<=n; i+=2)
        System.out.printf("%d^2 = %d\n",i,i*i);
    }
 
}