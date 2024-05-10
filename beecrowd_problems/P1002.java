import java.io.IOException;
import java.util.Scanner;


public class P1002 {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double raio, n, area;
        
        raio = input.nextDouble();
        n = 3.14159;
        area = n*(raio*raio);
        
        System.out.printf("A=%.4f\n", area);
       
       
 
    }
 
}