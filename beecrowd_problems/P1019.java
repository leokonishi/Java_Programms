import java.io.IOException;
import java.util.Scanner; 

public class Problema1019 {
 
    public static void main(String[] args) throws IOException {
        
        int N, hor,min,seg;
 
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        seg = N % 60;
        min = (N % 3600) / 60;
        hor = N / 3600;
        
        System.out.printf("%d:%d:%d\n", hor, min, seg);
        
        
 
    }

}
 