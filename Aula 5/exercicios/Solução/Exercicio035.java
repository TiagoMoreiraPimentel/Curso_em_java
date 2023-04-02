package Lista_002;
import java.util.Random;
import java.util.Scanner;

/*
    35. Faça um Algoritmo em Java, que, será pedido um número entre 1 a 10 que será sorteado aleatoriamente. 
    Na sequência, verifique se o número informado corresponde ao sorteado pelo sistema.
 */

public class Exercicio035 {
    
    public static void main(String[] args)
    {
        Random random = new Random();
        int numeroSecreto =  random.nextInt(10) + 1;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println( "Estou pensando em um número\n" + 
                            "Entre (1 e 10). \nQual é o seu Palpite: ? ");
        
        int chute = entrada.nextInt();
        
        if(chute < 1 || chute > 10)
        {
            System.out.println("Bem, se vc não vai tentar, " + 
                                "Eu não estou jogando.");
        }
        else
        {
            if(chute == numeroSecreto)
                
                System.out.println("Oba! Vc ganhou!!");
            
            else
            {
                System.out.println("O numero foi: " + numeroSecreto);
                
                //Math.abs (Arrendonda o valor)
                if(Math.abs(chute - numeroSecreto) < 3)
                    System.out.println("Voce Perdeu por Pouco!");
                else
                    System.out.println("Voce estava Perto.");
                
                System.out.println("Mais sorte da próxima vez");
            }
        }
        
    }
    
}
