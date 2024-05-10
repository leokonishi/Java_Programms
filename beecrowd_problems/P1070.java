import java.io.IOException;
import java.util.Scanner; 

public class P1070 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        
        if(x%2==0)
           x++;
        for(int i=0; i<6; i++, x+=2)
        System.out.println(x);
        }
    }
 