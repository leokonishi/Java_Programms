import java.io.IOException;
import java.util.Scanner; 

public class P1037 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        
        double n = input.nextDouble();
        
        if (n<0)
        System.out.println("Fora de intervalo");
        
        else
        if (n<=25.0)
        System.out.println("Intervalo [0,25]");
        
        else
        if (n<=50.0)
        System.out.println("Intervalo (25,50]");
        
        else
        if (n<=75.0)
        System.out.println("Intervalo (50,75]");
        
        else
        if (n<=100.0)
        System.out.println("Intervalo (75,100]");
        
        else
        if (n>100.0)
        System.out.println("Fora de intervalo");
 
    }
 
}