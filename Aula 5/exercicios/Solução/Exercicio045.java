package Lista_002;
import java.util.Scanner;
/*
    45. Escreva um programa em Java, que leia dois números e determine se o primeiro número é um múltiplo do segundo número.
 */
public class Exercicio045 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int x, y;
        
        System.out.println("Entre com o 1° Numero: ");
        x = entrada.nextInt();
        
        System.out.println("Entre com o 2° Numero: ");
        y = entrada.nextInt();
        
        if(x % y == 0)
        {
            System.out.println("\n" + x + " é multiplo de : " + y + ".");
        }
        else
        {
            System.out.println("\n" + x + " não é multiplo de: " + y + ".");
        }
    }
}
