import java.io.IOException;
import java.util.Scanner; 

public class P1180 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int[] x = new int[n];
        int menorv=0, posicao=0;
        
        for(int i=0; i<n; i++)
        {
            x[i] = ler.nextInt();
            
            if(i==0) {menorv = x[i]; posicao = i;}
            
            else
            if(x[i]<menorv) {menorv = x[i]; posicao = i;}
        }
        System.out.printf("Menor valor: %d\n", menorv);
        System.out.printf("Posicao: %d\n", posicao);
        
        
 
    }
 
}