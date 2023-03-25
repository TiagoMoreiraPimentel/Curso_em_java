package Lista_002;
import java.util.Scanner;

 /*
    29. Escreva um programa para inserir três números e um caractere. 
    Encontre e imprima a soma dos números se o caractere fornecido 
    for 's' e o produto dos números se o caractere fornecido for 'p'. 
    O programa exibe uma mensagem "caractere inválido" 
    se o usuário inserir um alfabeto diferente de 's' ou 'p'.
 */

public class Exercicio029 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int x, y, z;
        System.out.println("Entre com o Primeiro N°: ");
        x = entrada.nextInt();
        System.out.println("Entre com o Segundo N°: ");
        y = entrada.nextInt();
        System.out.println("Entre com o Terceiro N°: ");
        z = entrada.nextInt();
        
        System.out.println("Entre com 's' para a Soma ou 'p' para o Produto dos valores");
        char ans = entrada.next().charAt(0);
        
        if(ans == 's')
        {
            System.out.println("Soma dos tres numeros são: " + ( x + y + z));
        }else if(ans == 'p')
        {
            System.out.println("Produto dos Três numeros são: " + ( x * y * z));
        }
        else//tratamento de erro
        {
            System.out.println("Caractere Inválido!");
        }
    }
    
}
