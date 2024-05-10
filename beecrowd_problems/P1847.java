import java.io.IOException;
import java.util.Scanner;

public class P1847 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        if (B < A && C >= B) System.out.println(":)");
        else if (B > A && C <= B) System.out.println(":(");
        else if (B > A && C > B && (C - B) < (B - A)) System.out.println(":(");
        else if (B > A && C > B && (C - B) >= (B - A)) System.out.println(":)");
        else if (B < A && C < B && (B - C) < (A - B)) System.out.println(":)");
        else if (B < A && C < B && (B - C) >= (A - B)) System.out.println(":(");
        else if (B == A && C > B) System.out.println(":)");
        else if (B == A && C < B) System.out.println(":(");
        else System.out.println(":(");
        
    }
    
}