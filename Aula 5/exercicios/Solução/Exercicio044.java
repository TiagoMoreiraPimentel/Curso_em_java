package Lista_002;
import java.util.Scanner;
/*
    44. Escreva um programa para calcular a diferença exata entre x e 21. 
    Retorne três vezes a diferença absoluta se x for maior que 21.
 */
public class Exercicio044 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int x;
        System.out.println("Entre com o Valor de X: ");
        x = entrada.nextInt();
        
        if(x <= 21)
        {
            //Math.abs: Ele arrendonda o valor para cima
            System.out.print(Math.abs(x - 21));
        }
        else if( x >= 21 )
        {
            //Retorne três vezes a diferença absoluta
            System.out.print(Math.abs(x - 21) * 3);
        }
        
        System.out.println("\n");
            
    }
}
