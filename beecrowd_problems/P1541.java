import java.io.IOException;
import java.util.Scanner;

public class P1541 {
	
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double A, B, C, lado;

        while ((A = input.nextInt()) != 0) {
        	B = input.nextInt();
            C = input.nextInt();
            lado = Math.sqrt((((A * B) / C) * 100.0));
        	System.out.println((int)lado);
        }
    }
}