import java.io.IOException;
import java.util.Scanner; 

public class P1094 {
 
    public static void main(String[] args) throws IOException {
        
        int n, tr=0, ts=0,tc=0, quant;
        char tipo;
        
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        
        for(int i = 0; i < n; i++)
        {
            quant = input.nextInt();
            tipo = input.next().charAt(0);
            
            if (tipo == 'C') tc += quant;
            if (tipo == 'R') tr += quant;
            if (tipo == 'S') ts += quant;
        }
       int TOTAL = tc + ts + tr;
       System.out.printf("Total: %d cobaias\n", TOTAL);
       System.out.printf("Total de coelhos: %d\n", tc);
       System.out.printf("Total de ratos: %d\n", tr);
       System.out.printf("Total de sapos: %d\n", ts);
       System.out.printf("Percentual de coelhos: %.2f %%\n", ((double)tc/TOTAL*100));
       System.out.printf("Percentual de ratos: %.2f %%\n", ((double)tr/TOTAL*100));
       System.out.printf("Percentual de sapos: %.2f %%\n", ((double)ts/TOTAL*100));
       
       
 
    }
 
}