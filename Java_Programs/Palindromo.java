import java.util.Scanner;
import java.io.PrintStream;

public class Palindromo {
    
    public static void main(String[] args) {
        PrintStream saida = System.out;
        
        Scanner scan = new Scanner(System.in);
        
        saida.print("\nInforme a palavra:\t");
        String nome = scan.nextLine();
        
        nome = nome.toUpperCase();
        nome = nome.replaceAll("", "");             
        System.out.println(nome);
        String contrario = "";

        for(int i = (nome.length() -1); i >= 0; i--)
        {
            contrario = contrario + nome.charAt(i);
        }

        if (contrario.toUpperCase().equals(nome.toUpperCase())) 
        {
            saida.println("\nEssa palavra é um palíndromo.\t");
        }
        else
        {
            saida.println("\nEssa palavra não é um palíndromo.\t");
        }
            
        }

    }