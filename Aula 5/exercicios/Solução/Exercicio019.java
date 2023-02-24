package Lista_002;
import java.util.Scanner;
/*
    19. Faça um algoritmo que leia um número e mostre uma mensagem indicando se este número é par 
    ou ímpar e se é positivo ou negativo.
 */
public class Exercicio019 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o Numero");
        int numero = entrada.nextInt();
        
        //1° Validacao
        if(numero % 2 == 0)
        {
            System.out.println("Par");
        }
        else
        {
            System.out.println("Impar");
        }
        
        //Numeros maiores que 0 são positivos
        //Nuneros menores que 0 são negativos
        //numero 0 Neutro
        
        //2° Validação
        if(numero > 0)
        {
            System.out.println("Positivo");
        }
        else if(numero < 0)
        {
            System.out.println("Negativo");
        }
        else
        {
            System.out.println("Neutro");
        }
    }
    
}
