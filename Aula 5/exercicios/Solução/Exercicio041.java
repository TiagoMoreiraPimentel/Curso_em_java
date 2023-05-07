package Lista_002;
import java.util.Scanner;
/*
    41. Escreva um programa em Java, que leia dois números e divida um pelo outro. 
    Especifique "Divisão não é possível" se isso não for possível
 */
public class Exercicio041 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int a, b;
        float c;
        
        System.out.print("\nEntre com 1° Valor: ");
        a = entrada.nextInt();
        System.out.print("\nEntre com 2° Valor: ");
        b = entrada.nextInt();
        
        if(b != 0)
        {
            //Conversão explicita de tipo de dados
            c = (float)a / (float)b; //(cast) tipagem de dados
            
            System.out.printf("\n%d/%d = %.1f\n", a, b, c);
            
        }
        else
        {
            System.out.println("\nDivisão não é possivel!! ");
        }
    }
    
}
