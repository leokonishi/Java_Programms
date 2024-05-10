import java.io.IOException;
 

public class P1095 {
 
    public static void main(String[] args) throws IOException {
 
        for (int i = 1, j=60; j>=0; j-=5,i+=3)
        System.out.printf("I=%d J=%d\n",i,j);
 
    }
 
}